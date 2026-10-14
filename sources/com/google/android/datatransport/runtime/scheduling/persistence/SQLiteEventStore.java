package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import ch.qos.logback.core.CoreConstants;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.EncodedPayload;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics;
import com.google.android.datatransport.runtime.firebase.transport.StorageMetrics;
import com.google.android.datatransport.runtime.firebase.transport.TimeWindow;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class SQLiteEventStore implements EventStore, SynchronizationGuard, ClientHealthMetricsStore {
    private static final int LOCK_RETRY_BACK_OFF_MILLIS = 50;
    private static final String LOG_TAG = "SQLiteEventStore";
    public static final int MAX_RETRIES = 16;
    private static final Encoding PROTOBUF_ENCODING = Encoding.of("proto");
    private final EventStoreConfig config;
    private final Clock monotonicClock;
    private final ic.a<String> packageName;
    private final SchemaManager schemaManager;
    private final Clock wallClock;

    public interface Function<T, U> {
        U apply(T t10);
    }

    public static class Metadata {
        public final String key;
        public final String value;

        private Metadata(String str, String str2) {
            this.key = str;
            this.value = str2;
        }
    }

    public interface Producer<T> {
        T produce();
    }

    public SQLiteEventStore(@WallTime Clock clock, @Monotonic Clock clock2, EventStoreConfig eventStoreConfig, SchemaManager schemaManager, ic.a<String> aVar) {
        this.schemaManager = schemaManager;
        this.wallClock = clock;
        this.monotonicClock = clock2;
        this.config = eventStoreConfig;
        this.packageName = aVar;
    }

    private LogEventDropped.Reason convertToReason(int i10) {
        LogEventDropped.Reason reason = LogEventDropped.Reason.REASON_UNKNOWN;
        if (i10 == reason.getNumber()) {
            return reason;
        }
        LogEventDropped.Reason reason2 = LogEventDropped.Reason.MESSAGE_TOO_OLD;
        if (i10 == reason2.getNumber()) {
            return reason2;
        }
        LogEventDropped.Reason reason3 = LogEventDropped.Reason.CACHE_FULL;
        if (i10 == reason3.getNumber()) {
            return reason3;
        }
        LogEventDropped.Reason reason4 = LogEventDropped.Reason.PAYLOAD_TOO_BIG;
        if (i10 == reason4.getNumber()) {
            return reason4;
        }
        LogEventDropped.Reason reason5 = LogEventDropped.Reason.MAX_RETRIES_REACHED;
        if (i10 == reason5.getNumber()) {
            return reason5;
        }
        LogEventDropped.Reason reason6 = LogEventDropped.Reason.INVALID_PAYLOD;
        if (i10 == reason6.getNumber()) {
            return reason6;
        }
        LogEventDropped.Reason reason7 = LogEventDropped.Reason.SERVER_ERROR;
        if (i10 == reason7.getNumber()) {
            return reason7;
        }
        Logging.d(LOG_TAG, "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i10));
        return reason;
    }

    private void ensureBeginTransaction(SQLiteDatabase sQLiteDatabase) {
        retryIfDbLocked(new j(sQLiteDatabase), h.f11694f);
    }

    private long ensureTransportContext(SQLiteDatabase sQLiteDatabase, TransportContext transportContext) {
        Long transportContextId = getTransportContextId(sQLiteDatabase, transportContext);
        if (transportContextId != null) {
            return transportContextId.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", transportContext.getBackendName());
        contentValues.put("priority", Integer.valueOf(PriorityMapping.toInt(transportContext.getPriority())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (transportContext.getExtras() != null) {
            contentValues.put("extras", Base64.encodeToString(transportContext.getExtras(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    private GlobalMetrics getGlobalMetrics() {
        return GlobalMetrics.newBuilder().setStorageMetrics(StorageMetrics.newBuilder().setCurrentCacheSizeBytes(getByteSize()).setMaxCacheSizeBytes(EventStoreConfig.DEFAULT.getMaxStorageSizeInBytes()).build()).build();
    }

    private long getPageCount() {
        return getDb().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    private long getPageSize() {
        return getDb().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    private TimeWindow getTimeWindow() {
        return (TimeWindow) inTransaction(new a(this.wallClock.getTime(), 1));
    }

    private Long getTransportContextId(SQLiteDatabase sQLiteDatabase, TransportContext transportContext) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(transportContext.getBackendName(), String.valueOf(PriorityMapping.toInt(transportContext.getPriority()))));
        if (transportContext.getExtras() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(transportContext.getExtras(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        return (Long) tryWithCursor(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), i.f11699e);
    }

    private boolean isStorageAtLimit() {
        return getPageCount() * getPageSize() >= this.config.getMaxStorageSizeInBytes();
    }

    private List<PersistedEvent> join(List<PersistedEvent> list, Map<Long, Set<Metadata>> map) {
        ListIterator<PersistedEvent> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            PersistedEvent next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.getId()))) {
                EventInternal.Builder builder = next.getEvent().toBuilder();
                for (Metadata metadata : map.get(Long.valueOf(next.getId()))) {
                    builder.addMetadata(metadata.key, metadata.value);
                }
                listIterator.set(PersistedEvent.create(next.getId(), next.getTransportContext(), builder.build()));
            }
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$cleanUp$11(Cursor cursor) {
        while (cursor.moveToNext()) {
            recordLogEventDropped(cursor.getInt(0), LogEventDropped.Reason.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$cleanUp$12(long j10, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j10)};
        tryWithCursor(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new c(this, 0));
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$clearDb$13(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete("events", null, new String[0]);
        sQLiteDatabase.delete("transport_contexts", null, new String[0]);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$ensureBeginTransaction$24(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$ensureBeginTransaction$25(Throwable th) {
        throw new SynchronizationException("Timed out while trying to acquire the lock.", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SQLiteDatabase lambda$getDb$0(Throwable th) {
        throw new SynchronizationException("Timed out while trying to open db.", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long lambda$getNextCallTime$5(Cursor cursor) {
        return Long.valueOf(cursor.moveToNext() ? cursor.getLong(0) : 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TimeWindow lambda$getTimeWindow$21(long j10, Cursor cursor) {
        cursor.moveToNext();
        return TimeWindow.newBuilder().setStartMs(cursor.getLong(0)).setEndMs(j10).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TimeWindow lambda$getTimeWindow$22(long j10, SQLiteDatabase sQLiteDatabase) {
        return (TimeWindow) tryWithCursor(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new a(j10, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long lambda$getTransportContextId$2(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$hasPendingEventsFor$6(TransportContext transportContext, SQLiteDatabase sQLiteDatabase) {
        Long transportContextId = getTransportContextId(sQLiteDatabase, transportContext);
        return transportContextId == null ? Boolean.FALSE : (Boolean) tryWithCursor(getDb().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{transportContextId.toString()}), h.f11691c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$loadActiveContexts$10(SQLiteDatabase sQLiteDatabase) {
        return (List) tryWithCursor(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), i.f11697c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$loadActiveContexts$9(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(TransportContext.builder().setBackendName(cursor.getString(1)).setPriority(PriorityMapping.valueOf(cursor.getInt(2))).setExtras(maybeBase64Decode(cursor.getString(3))).build());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List lambda$loadBatch$8(TransportContext transportContext, SQLiteDatabase sQLiteDatabase) {
        List<PersistedEvent> listLoadEvents = loadEvents(sQLiteDatabase, transportContext, this.config.getLoadBatchSize());
        for (Priority priority : Priority.values()) {
            if (priority != transportContext.getPriority()) {
                int loadBatchSize = this.config.getLoadBatchSize() - listLoadEvents.size();
                if (loadBatchSize <= 0) {
                    break;
                }
                listLoadEvents.addAll(loadEvents(sQLiteDatabase, transportContext.withPriority(priority), loadBatchSize));
            }
        }
        return join(listLoadEvents, loadMetadata(sQLiteDatabase, listLoadEvents));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ClientMetrics lambda$loadClientMetrics$19(Map map, ClientMetrics.Builder builder, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            LogEventDropped.Reason reasonConvertToReason = convertToReason(cursor.getInt(1));
            long j10 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(LogEventDropped.newBuilder().setReason(reasonConvertToReason).setEventsDroppedCount(j10).build());
        }
        populateLogSourcesMetrics(builder, map);
        builder.setWindow(getTimeWindow());
        builder.setGlobalMetrics(getGlobalMetrics());
        builder.setAppNamespace(this.packageName.get());
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ClientMetrics lambda$loadClientMetrics$20(String str, Map map, ClientMetrics.Builder builder, SQLiteDatabase sQLiteDatabase) {
        return (ClientMetrics) tryWithCursor(sQLiteDatabase.rawQuery(str, new String[0]), new e(this, map, builder));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$loadEvents$14(List list, TransportContext transportContext, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j10 = cursor.getLong(0);
            boolean z10 = cursor.getInt(7) != 0;
            EventInternal.Builder uptimeMillis = EventInternal.builder().setTransportName(cursor.getString(1)).setEventMillis(cursor.getLong(2)).setUptimeMillis(cursor.getLong(3));
            uptimeMillis.setEncodedPayload(z10 ? new EncodedPayload(toEncoding(cursor.getString(4)), cursor.getBlob(5)) : new EncodedPayload(toEncoding(cursor.getString(4)), readPayload(j10)));
            if (!cursor.isNull(6)) {
                uptimeMillis.setCode(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(PersistedEvent.create(j10, transportContext, uptimeMillis.build()));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$loadMetadata$16(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j10 = cursor.getLong(0);
            Set hashSet = (Set) map.get(Long.valueOf(j10));
            if (hashSet == null) {
                hashSet = new HashSet();
                map.put(Long.valueOf(j10), hashSet);
            }
            hashSet.add(new Metadata(cursor.getString(1), cursor.getString(2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long lambda$persist$1(EventInternal eventInternal, TransportContext transportContext, SQLiteDatabase sQLiteDatabase) {
        if (isStorageAtLimit()) {
            recordLogEventDropped(1L, LogEventDropped.Reason.CACHE_FULL, eventInternal.getTransportName());
            return -1L;
        }
        long jEnsureTransportContext = ensureTransportContext(sQLiteDatabase, transportContext);
        int maxBlobByteSizePerRow = this.config.getMaxBlobByteSizePerRow();
        byte[] bytes = eventInternal.getEncodedPayload().getBytes();
        boolean z10 = bytes.length <= maxBlobByteSizePerRow;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(jEnsureTransportContext));
        contentValues.put("transport_name", eventInternal.getTransportName());
        contentValues.put("timestamp_ms", Long.valueOf(eventInternal.getEventMillis()));
        contentValues.put("uptime_ms", Long.valueOf(eventInternal.getUptimeMillis()));
        contentValues.put("payload_encoding", eventInternal.getEncodedPayload().getEncoding().getName());
        contentValues.put("code", eventInternal.getCode());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z10));
        contentValues.put("payload", z10 ? bytes : new byte[0]);
        long jInsert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z10) {
            int iCeil = (int) Math.ceil(((double) bytes.length) / ((double) maxBlobByteSizePerRow));
            for (int i10 = 1; i10 <= iCeil; i10++) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bytes, (i10 - 1) * maxBlobByteSizePerRow, Math.min(i10 * maxBlobByteSizePerRow, bytes.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(jInsert));
                contentValues2.put("sequence_num", Integer.valueOf(i10));
                contentValues2.put("bytes", bArrCopyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry<String, String> entry : eventInternal.getMetadata().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(jInsert));
            contentValues3.put("name", entry.getKey());
            contentValues3.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(jInsert);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] lambda$readPayload$15(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int length = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            length += blob.length;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            byte[] bArr2 = (byte[]) arrayList.get(i10);
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$recordFailure$3(Cursor cursor) {
        while (cursor.moveToNext()) {
            recordLogEventDropped(cursor.getInt(0), LogEventDropped.Reason.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$recordFailure$4(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        tryWithCursor(sQLiteDatabase.rawQuery(str2, null), new c(this, 1));
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$recordLogEventDropped$17(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$recordLogEventDropped$18(String str, LogEventDropped.Reason reason, long j10, SQLiteDatabase sQLiteDatabase) {
        if (((Boolean) tryWithCursor(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(reason.getNumber())}), i.f11696b)).booleanValue()) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j10 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(reason.getNumber())});
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(reason.getNumber()));
            contentValues.put("events_dropped_count", Long.valueOf(j10));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$recordNextCallTime$7(long j10, TransportContext transportContext, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j10));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{transportContext.getBackendName(), String.valueOf(PriorityMapping.toInt(transportContext.getPriority()))}) < 1) {
            contentValues.put("backend_name", transportContext.getBackendName());
            contentValues.put("priority", Integer.valueOf(PriorityMapping.toInt(transportContext.getPriority())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$resetClientMetrics$23(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.wallClock.getTime()).execute();
        return null;
    }

    private List<PersistedEvent> loadEvents(SQLiteDatabase sQLiteDatabase, TransportContext transportContext, int i10) {
        ArrayList arrayList = new ArrayList();
        Long transportContextId = getTransportContextId(sQLiteDatabase, transportContext);
        if (transportContextId == null) {
            return arrayList;
        }
        tryWithCursor(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{transportContextId.toString()}, null, null, null, String.valueOf(i10)), new e(this, arrayList, transportContext));
        return arrayList;
    }

    private Map<Long, Set<Metadata>> loadMetadata(SQLiteDatabase sQLiteDatabase, List<PersistedEvent> list) {
        HashMap map = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(list.get(i10).getId());
            if (i10 < list.size() - 1) {
                sb2.append(CoreConstants.COMMA_CHAR);
            }
        }
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        tryWithCursor(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null), new j(map));
        return map;
    }

    private static byte[] maybeBase64Decode(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    private void populateLogSourcesMetrics(ClientMetrics.Builder builder, Map<String, List<LogEventDropped>> map) {
        for (Map.Entry<String, List<LogEventDropped>> entry : map.entrySet()) {
            builder.addLogSourceMetrics(LogSourceMetrics.newBuilder().setLogSource(entry.getKey()).setLogEventDroppedList(entry.getValue()).build());
        }
    }

    private byte[] readPayload(long j10) {
        return (byte[]) tryWithCursor(getDb().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num"), h.f11690b);
    }

    private <T> T retryIfDbLocked(Producer<T> producer, Function<Throwable, T> function) {
        long time = this.monotonicClock.getTime();
        while (true) {
            try {
                return producer.produce();
            } catch (SQLiteDatabaseLockedException e10) {
                if (this.monotonicClock.getTime() >= ((long) this.config.getCriticalSectionEnterTimeoutMs()) + time) {
                    return function.apply(e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    private static Encoding toEncoding(String str) {
        return str == null ? PROTOBUF_ENCODING : Encoding.of(str);
    }

    private static String toIdList(Iterable<PersistedEvent> iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator<PersistedEvent> it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().getId());
            if (it.hasNext()) {
                sb2.append(CoreConstants.COMMA_CHAR);
            }
        }
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb2.toString();
    }

    public static <T> T tryWithCursor(Cursor cursor, Function<Cursor, T> function) {
        try {
            return function.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public int cleanUp() {
        return ((Integer) inTransaction(new b(this, this.wallClock.getTime() - this.config.getEventCleanUpAge()))).intValue();
    }

    public void clearDb() {
        inTransaction(i.f11700f);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.schemaManager.close();
    }

    public long getByteSize() {
        return getPageCount() * getPageSize();
    }

    public SQLiteDatabase getDb() {
        SchemaManager schemaManager = this.schemaManager;
        Objects.requireNonNull(schemaManager);
        return (SQLiteDatabase) retryIfDbLocked(new j(schemaManager), i.f11698d);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public long getNextCallTime(TransportContext transportContext) {
        return ((Long) tryWithCursor(getDb().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{transportContext.getBackendName(), String.valueOf(PriorityMapping.toInt(transportContext.getPriority()))}), h.f11693e)).longValue();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public boolean hasPendingEventsFor(TransportContext transportContext) {
        return ((Boolean) inTransaction(new d(this, transportContext, 0))).booleanValue();
    }

    public <T> T inTransaction(Function<SQLiteDatabase, T> function) {
        SQLiteDatabase db2 = getDb();
        db2.beginTransaction();
        try {
            T tApply = function.apply(db2);
            db2.setTransactionSuccessful();
            return tApply;
        } finally {
            db2.endTransaction();
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public Iterable<TransportContext> loadActiveContexts() {
        return (Iterable) inTransaction(h.f11692d);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public Iterable<PersistedEvent> loadBatch(TransportContext transportContext) {
        return (Iterable) inTransaction(new d(this, transportContext, 1));
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore
    public ClientMetrics loadClientMetrics() {
        final ClientMetrics.Builder builderNewBuilder = ClientMetrics.newBuilder();
        final HashMap map = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (ClientMetrics) inTransaction(new Function(str, map, builderNewBuilder) { // from class: com.google.android.datatransport.runtime.scheduling.persistence.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Map f11685b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ClientMetrics.Builder f11686c;

            {
                this.f11685b = map;
                this.f11686c = builderNewBuilder;
            }

            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                return this.f11684a.lambda$loadClientMetrics$20("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", this.f11685b, this.f11686c, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public PersistedEvent persist(TransportContext transportContext, EventInternal eventInternal) {
        Logging.d(LOG_TAG, "Storing event with priority=%s, name=%s for destination %s", transportContext.getPriority(), eventInternal.getTransportName(), transportContext.getBackendName());
        long jLongValue = ((Long) inTransaction(new e(this, eventInternal, transportContext))).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return PersistedEvent.create(jLongValue, transportContext, eventInternal);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public void recordFailure(Iterable<PersistedEvent> iterable) {
        if (iterable.iterator().hasNext()) {
            StringBuilder sbA = defpackage.a.a("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ");
            sbA.append(toIdList(iterable));
            inTransaction(new e(this, sbA.toString(), "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name"));
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore
    public void recordLogEventDropped(final long j10, final LogEventDropped.Reason reason, final String str) {
        inTransaction(new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.g
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                return SQLiteEventStore.lambda$recordLogEventDropped$18(str, reason, j10, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public void recordNextCallTime(TransportContext transportContext, long j10) {
        inTransaction(new b(j10, transportContext));
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public void recordSuccess(Iterable<PersistedEvent> iterable) {
        if (iterable.iterator().hasNext()) {
            StringBuilder sbA = defpackage.a.a("DELETE FROM events WHERE _id in ");
            sbA.append(toIdList(iterable));
            getDb().compileStatement(sbA.toString()).execute();
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore
    public void resetClientMetrics() {
        inTransaction(new c(this, 2));
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard
    public <T> T runCriticalSection(SynchronizationGuard.CriticalSection<T> criticalSection) {
        SQLiteDatabase db2 = getDb();
        ensureBeginTransaction(db2);
        try {
            T tExecute = criticalSection.execute();
            db2.setTransactionSuccessful();
            return tExecute;
        } finally {
            db2.endTransaction();
        }
    }
}
