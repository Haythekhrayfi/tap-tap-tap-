package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.t8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1976t8 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final HashSet<Integer> f17427o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReentrantReadWriteLock f17428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lock f17429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lock f17430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C2056w8 f17431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f17432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f17433f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<ContentValues> f17434g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Context f17435h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C1624f4 f17436i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AtomicLong f17437j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List<Ub> f17438k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final C1951s8 f17439l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile ao<Vi.b, Object> f17440m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final bo<Vi.b, Object> f17441n;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.t8$a */
    public class a extends C2046vn {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C1624f4 f17442b;

        public a(C1624f4 c1624f4) {
            this.f17442b = c1624f4;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ArrayList arrayList;
            while (c()) {
                try {
                    synchronized (this) {
                        try {
                            if (C1976t8.a(C1976t8.this)) {
                                wait();
                            }
                            synchronized (C1976t8.this.f17433f) {
                                arrayList = new ArrayList(C1976t8.this.f17434g);
                                C1976t8.this.f17434g.clear();
                            }
                            C1976t8.this.a(arrayList);
                            synchronized (this) {
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(Integer.valueOf(C1976t8.this.a((ContentValues) it.next())));
                                }
                                Iterator it2 = C1976t8.this.f17438k.iterator();
                                while (it2.hasNext()) {
                                    ((Ub) it2.next()).a(arrayList2);
                                }
                                this.f17442b.l().c();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (Throwable unused) {
                    d();
                }
            }
        }
    }

    static {
        HashSet<Integer> hashSet = new HashSet<>();
        f17427o = hashSet;
        hashSet.add(Integer.valueOf(EnumC1745k1.EVENT_TYPE_INIT.b()));
        hashSet.add(Integer.valueOf(EnumC1745k1.EVENT_TYPE_START.b()));
    }

    public C1976t8(C1624f4 c1624f4, C2056w8 c2056w8, C1951s8 c1951s8) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f17428a = reentrantReadWriteLock;
        this.f17429b = reentrantReadWriteLock.readLock();
        this.f17430c = reentrantReadWriteLock.writeLock();
        this.f17433f = new Object();
        this.f17434g = new ArrayList(3);
        AtomicLong atomicLong = new AtomicLong();
        this.f17437j = atomicLong;
        this.f17438k = new ArrayList();
        this.f17441n = new bo<>();
        this.f17431d = c2056w8;
        this.f17435h = c1624f4.g();
        this.f17436i = c1624f4;
        this.f17439l = c1951s8;
        atomicLong.set(d());
        a aVar = new a(c1624f4);
        this.f17432e = aVar;
        aVar.setName(a(c1624f4));
        a(c1624f4.v());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(ContentValues contentValues) {
        return contentValues.getAsInteger("type").intValue();
    }

    private int a(SQLiteDatabase sQLiteDatabase) {
        try {
            return this.f17439l.a(sQLiteDatabase, "reports", String.format("%1$s IN (SELECT %1$s FROM %2$s ORDER BY CASE WHEN %3$s IN (%4$s) THEN 2 WHEN %3$s IN (%5$s) THEN 1 ELSE 0 END, %6$s LIMIT (SELECT count() FROM %2$s) / %7$s)", FacebookMediationAdapter.KEY_ID, "reports", "type", TextUtils.join(", ", J0.f14266i), TextUtils.join(", ", J0.f14267j), FacebookMediationAdapter.KEY_ID, 10), C1951s8.b.DB_OVERFLOW, this.f17436i.e().a(), true).f17286b;
        } catch (Throwable th) {
            ((Nh) Oh.a()).reportError("deleteExcessiveReports exception", th);
            return 0;
        }
    }

    private static String a(InterfaceC1723j4 interfaceC1723j4) {
        StringBuilder sbA = defpackage.a.a("DatabaseWorker [");
        sbA.append(((C1624f4) interfaceC1723j4).e().c());
        sbA.append("]");
        return sbA.toString();
    }

    private static String a(String str, Map<String, String> map) {
        StringBuilder sb2 = new StringBuilder(str);
        for (String str2 : map.keySet()) {
            sb2.append(sb2.length() > 0 ? " AND " : "");
            sb2.append(str2 + " = ? ");
        }
        if (TextUtils.isEmpty(sb2.toString())) {
            return null;
        }
        return sb2.toString();
    }

    private void a(ContentValues contentValues, String str) {
        Integer asInteger = contentValues.getAsInteger("type");
        if (J0.c(asInteger != null ? asInteger.intValue() : -1)) {
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append(": ");
            String asString = contentValues.getAsString("name");
            int i10 = O2.f14603a;
            if (asString == null) {
                asString = "";
            }
            sb2.append(asString);
            String asString2 = contentValues.getAsString("value");
            String str2 = asString2 != null ? asString2 : "";
            if (J0.e(a(contentValues)) && !TextUtils.isEmpty(str2)) {
                sb2.append(" with value ");
                sb2.append(str2);
            }
            this.f17436i.q().b(sb2.toString());
        }
    }

    private void a(Qi qi) {
        Vi.a aVar = null;
        Vi.a aVar2 = (!qi.f().f17351p || qi.Q() == null) ? null : qi.Q().f15320b;
        if (qi.f().f17351p && qi.Q() != null) {
            aVar = qi.Q().f15319a;
        }
        EnumMap enumMap = new EnumMap(Vi.b.class);
        enumMap.put(Vi.b.WIFI, aVar2 == null ? new co() : new io(new ho(new lo(), new mo()), new Nm(), aVar2.f15321a, aVar2.f15322b));
        enumMap.put(Vi.b.CELL, aVar == null ? new co() : new io(new ho(new Yn.a(), new Zn()), new Nm(), aVar.f15321a, aVar.f15322b));
        this.f17440m = new ao<>(enumMap);
    }

    public static boolean a(C1976t8 c1976t8) {
        boolean zIsEmpty;
        synchronized (c1976t8.f17433f) {
            zIsEmpty = c1976t8.f17434g.isEmpty();
        }
        return zIsEmpty;
    }

    private static String[] a(String[] strArr, Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(strArr));
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private long d() {
        long jA;
        this.f17429b.lock();
        try {
            SQLiteDatabase readableDatabase = this.f17431d.getReadableDatabase();
            jA = readableDatabase != null ? C1694i.a(readableDatabase, "reports") : 0L;
        } catch (Throwable unused) {
        }
        this.f17429b.unlock();
        return jA;
    }

    public int a(long j10) {
        this.f17430c.lock();
        int iDelete = 0;
        try {
            int i10 = O8.f14612a;
            SQLiteDatabase writableDatabase = this.f17431d.getWritableDatabase();
            if (writableDatabase != null) {
                iDelete = writableDatabase.delete("sessions", O8.e.f14628d, new String[]{String.valueOf(j10)});
            }
        } catch (Throwable unused) {
        }
        this.f17430c.unlock();
        return iDelete;
    }

    public long a(Set<Integer> set) {
        this.f17429b.lock();
        Cursor cursorRawQuery = null;
        long j10 = 0;
        try {
            SQLiteDatabase readableDatabase = this.f17431d.getReadableDatabase();
            if (readableDatabase != null) {
                StringBuilder sb2 = new StringBuilder("SELECT count() FROM reports");
                if (!set.isEmpty()) {
                    sb2.append(" WHERE ");
                }
                int i10 = 0;
                for (Integer num : set) {
                    if (i10 > 0) {
                        sb2.append(" OR ");
                    }
                    sb2.append("type == " + num);
                    i10++;
                }
                cursorRawQuery = readableDatabase.rawQuery(sb2.toString(), null);
                if (cursorRawQuery.moveToFirst()) {
                    j10 = cursorRawQuery.getLong(0);
                }
            }
        } catch (Throwable unused) {
        }
        U2.a(cursorRawQuery);
        this.f17429b.unlock();
        return j10;
    }

    public ContentValues a(long j10, EnumC2129z6 enumC2129z6) {
        ContentValues contentValues = new ContentValues();
        this.f17429b.lock();
        Cursor cursorRawQuery = null;
        try {
            SQLiteDatabase readableDatabase = this.f17431d.getReadableDatabase();
            if (readableDatabase != null) {
                cursorRawQuery = readableDatabase.rawQuery(String.format(Locale.US, "SELECT report_request_parameters FROM sessions WHERE id = %s AND type = %s ORDER BY id DESC LIMIT 1", Long.valueOf(j10), Integer.valueOf(enumC2129z6.a())), null);
                if (cursorRawQuery.moveToNext()) {
                    ContentValues contentValues2 = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(cursorRawQuery, contentValues2);
                    contentValues = contentValues2;
                }
            }
        } catch (Throwable unused) {
        }
        U2.a(cursorRawQuery);
        this.f17429b.unlock();
        return contentValues;
    }

    public Cursor a(Map<String, String> map) {
        Cursor cursorQuery;
        this.f17429b.lock();
        try {
            SQLiteDatabase readableDatabase = this.f17431d.getReadableDatabase();
            cursorQuery = readableDatabase != null ? readableDatabase.query("sessions", null, a("id >= ?", map), a(new String[]{Long.toString(0L)}, map), null, null, "id ASC", null) : null;
        } catch (Throwable unused) {
        }
        this.f17429b.unlock();
        return cursorQuery;
    }

    public void a() {
        SQLiteDatabase writableDatabase;
        try {
            this.f17430c.lock();
            if (this.f17437j.get() > this.f17436i.m().K() && (writableDatabase = this.f17431d.getWritableDatabase()) != null) {
                this.f17437j.addAndGet(-a(writableDatabase));
            }
        } catch (Throwable unused) {
        }
        this.f17430c.unlock();
    }

    public void a(long j10, int i10, int i11, boolean z10) throws SQLiteException {
        List<ContentValues> list;
        if (i11 <= 0) {
            return;
        }
        this.f17430c.lock();
        try {
            String str = String.format(Locale.US, "%1$s = %2$s AND %3$s = %4$s AND %5$s <= (SELECT %5$s FROM %6$s WHERE %1$s = %2$s AND %3$s = %4$s ORDER BY %5$s ASC LIMIT %7$s, 1)", "session_id", Long.toString(j10), "session_type", Integer.toString(i10), FacebookMediationAdapter.KEY_ID, "reports", Integer.toString(i11 - 1));
            SQLiteDatabase writableDatabase = this.f17431d.getWritableDatabase();
            if (writableDatabase != null) {
                C1951s8.a aVarA = this.f17439l.a(writableDatabase, "reports", str, C1951s8.b.BAD_REQUEST, this.f17436i.e().a(), z10);
                if (aVarA.f17285a != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<ContentValues> it = aVarA.f17285a.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(a(it.next())));
                    }
                    Iterator<Ub> it2 = this.f17438k.iterator();
                    while (it2.hasNext()) {
                        it2.next().b(arrayList);
                    }
                }
                if (this.f17436i.q().c() && (list = aVarA.f17285a) != null) {
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        a(list.get(i12), "Event removed from db");
                    }
                }
                this.f17437j.addAndGet(-aVarA.f17286b);
            }
        } catch (Throwable unused) {
        }
        this.f17430c.unlock();
    }

    public void a(long j10, EnumC2129z6 enumC2129z6, long j11) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(FacebookMediationAdapter.KEY_ID, Long.valueOf(j10));
        contentValues.put("start_time", Long.valueOf(j11));
        contentValues.put("server_time_offset", Long.valueOf(Lm.c().a()));
        contentValues.put("obtained_before_first_sync", Boolean.valueOf(Lm.c().e()));
        contentValues.put("type", Integer.valueOf(enumC2129z6.a()));
        new C1894q0(this.f17435h).a(this.f17436i.m()).a(contentValues).a();
        this.f17430c.lock();
        try {
            SQLiteDatabase writableDatabase = this.f17431d.getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.insertOrThrow("sessions", null, contentValues);
            }
        } catch (Throwable unused) {
        }
        this.f17430c.unlock();
    }

    public void a(Ub ub2) {
        this.f17438k.add(ub2);
    }

    public void a(C1742jn c1742jn, int i10, C2054w6 c2054w6, A.a aVar, C1699i4 c1699i4) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("number", Long.valueOf(c2054w6.a()));
        contentValues.put("global_number", Integer.valueOf(J0.d(i10) ? c1699i4.a() : 0));
        contentValues.put("number_of_type", Integer.valueOf(c1699i4.a(i10)));
        contentValues.put("time", Long.valueOf(c2054w6.b()));
        contentValues.put("session_id", Long.valueOf(c2054w6.c()));
        contentValues.put("session_type", Integer.valueOf(c2054w6.d().a()));
        new C1894q0(this.f17435h).a(this.f17436i.m()).a(contentValues).a(c1742jn, aVar, f17427o.contains(Integer.valueOf(i10)) ? this.f17441n : this.f17440m);
        synchronized (this.f17433f) {
            this.f17434g.add(contentValues);
        }
        synchronized (this.f17432e) {
            this.f17432e.notifyAll();
        }
    }

    public void a(List<ContentValues> list) {
        SQLiteDatabase writableDatabase;
        if (list.isEmpty()) {
            return;
        }
        this.f17430c.lock();
        SQLiteDatabase sQLiteDatabase = null;
        try {
            writableDatabase = this.f17431d.getWritableDatabase();
            if (writableDatabase != null) {
                try {
                    writableDatabase.beginTransaction();
                    for (ContentValues contentValues : list) {
                        writableDatabase.insertOrThrow("reports", null, contentValues);
                        this.f17437j.incrementAndGet();
                        a(contentValues, "Event saved to db");
                    }
                    writableDatabase.setTransactionSuccessful();
                    this.f17437j.get();
                } catch (Throwable unused) {
                    sQLiteDatabase = writableDatabase;
                    writableDatabase = sQLiteDatabase;
                }
            }
        } catch (Throwable unused2) {
        }
        U2.a(writableDatabase);
        this.f17430c.unlock();
    }

    public Cursor b(long j10, EnumC2129z6 enumC2129z6) throws SQLiteException {
        Cursor cursorQuery;
        this.f17429b.lock();
        try {
            SQLiteDatabase readableDatabase = this.f17431d.getReadableDatabase();
            cursorQuery = readableDatabase != null ? readableDatabase.query("reports", null, "session_id = ? AND session_type = ?", new String[]{Long.toString(j10), Integer.toString(enumC2129z6.a())}, null, null, "number ASC", null) : null;
        } catch (Throwable unused) {
        }
        this.f17429b.unlock();
        return cursorQuery;
    }

    public List<ContentValues> b() {
        ArrayList arrayList = new ArrayList();
        this.f17429b.lock();
        Cursor cursorRawQuery = null;
        try {
            try {
                SQLiteDatabase readableDatabase = this.f17431d.getReadableDatabase();
                if (readableDatabase != null) {
                    cursorRawQuery = readableDatabase.rawQuery(O8.e.f14627c, null);
                    while (cursorRawQuery.moveToNext()) {
                        ContentValues contentValues = new ContentValues();
                        DatabaseUtils.cursorRowToContentValues(cursorRawQuery, contentValues);
                        arrayList.add(contentValues);
                    }
                }
            } catch (Throwable unused) {
                arrayList = new ArrayList();
            }
            return arrayList;
        } finally {
            U2.a(cursorRawQuery);
            this.f17429b.unlock();
        }
    }

    public void b(Qi qi) {
        a(qi);
    }

    public long c() {
        this.f17429b.lock();
        try {
            return this.f17437j.get();
        } finally {
            this.f17429b.unlock();
        }
    }

    public void e() {
        this.f17432e.start();
    }
}
