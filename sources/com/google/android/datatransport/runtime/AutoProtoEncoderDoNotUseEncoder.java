package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics;
import com.google.android.datatransport.runtime.firebase.transport.StorageMetrics;
import com.google.android.datatransport.runtime.firebase.transport.TimeWindow;
import java.io.IOException;
import java.util.HashMap;
import q5.d;
import q5.e;
import q5.f;

/* JADX INFO: loaded from: classes.dex */
public final class AutoProtoEncoderDoNotUseEncoder implements r5.a {
    public static final int CODEGEN_VERSION = 2;
    public static final r5.a CONFIG = new AutoProtoEncoderDoNotUseEncoder();

    public static final class ClientMetricsEncoder implements e<ClientMetrics> {
        private static final d APPNAMESPACE_DESCRIPTOR;
        private static final d GLOBALMETRICS_DESCRIPTOR;
        public static final ClientMetricsEncoder INSTANCE = new ClientMetricsEncoder();
        private static final d LOGSOURCEMETRICS_DESCRIPTOR;
        private static final d WINDOW_DESCRIPTOR;

        static {
            t5.a aVar = new t5.a();
            aVar.f35679a = 1;
            t5.d dVarA = aVar.a();
            HashMap map = new HashMap();
            map.put(dVarA.annotationType(), dVarA);
            WINDOW_DESCRIPTOR = new d("window", a.a(map), null);
            t5.a aVar2 = new t5.a();
            aVar2.f35679a = 2;
            t5.d dVarA2 = aVar2.a();
            HashMap map2 = new HashMap();
            map2.put(dVarA2.annotationType(), dVarA2);
            LOGSOURCEMETRICS_DESCRIPTOR = new d("logSourceMetrics", a.a(map2), null);
            t5.a aVar3 = new t5.a();
            aVar3.f35679a = 3;
            t5.d dVarA3 = aVar3.a();
            HashMap map3 = new HashMap();
            map3.put(dVarA3.annotationType(), dVarA3);
            GLOBALMETRICS_DESCRIPTOR = new d("globalMetrics", a.a(map3), null);
            t5.a aVar4 = new t5.a();
            aVar4.f35679a = 4;
            t5.d dVarA4 = aVar4.a();
            HashMap map4 = new HashMap();
            map4.put(dVarA4.annotationType(), dVarA4);
            APPNAMESPACE_DESCRIPTOR = new d("appNamespace", a.a(map4), null);
        }

        private ClientMetricsEncoder() {
        }

        @Override // q5.b
        public void encode(ClientMetrics clientMetrics, f fVar) throws IOException {
            fVar.a(WINDOW_DESCRIPTOR, clientMetrics.getWindowInternal());
            fVar.a(LOGSOURCEMETRICS_DESCRIPTOR, clientMetrics.getLogSourceMetricsList());
            fVar.a(GLOBALMETRICS_DESCRIPTOR, clientMetrics.getGlobalMetricsInternal());
            fVar.a(APPNAMESPACE_DESCRIPTOR, clientMetrics.getAppNamespace());
        }
    }

    public static final class GlobalMetricsEncoder implements e<GlobalMetrics> {
        public static final GlobalMetricsEncoder INSTANCE = new GlobalMetricsEncoder();
        private static final d STORAGEMETRICS_DESCRIPTOR;

        static {
            t5.a aVar = new t5.a();
            aVar.f35679a = 1;
            t5.d dVarA = aVar.a();
            HashMap map = new HashMap();
            map.put(dVarA.annotationType(), dVarA);
            STORAGEMETRICS_DESCRIPTOR = new d("storageMetrics", a.a(map), null);
        }

        private GlobalMetricsEncoder() {
        }

        @Override // q5.b
        public void encode(GlobalMetrics globalMetrics, f fVar) throws IOException {
            fVar.a(STORAGEMETRICS_DESCRIPTOR, globalMetrics.getStorageMetricsInternal());
        }
    }

    public static final class LogEventDroppedEncoder implements e<LogEventDropped> {
        private static final d EVENTSDROPPEDCOUNT_DESCRIPTOR;
        public static final LogEventDroppedEncoder INSTANCE = new LogEventDroppedEncoder();
        private static final d REASON_DESCRIPTOR;

        static {
            t5.a aVar = new t5.a();
            aVar.f35679a = 1;
            t5.d dVarA = aVar.a();
            HashMap map = new HashMap();
            map.put(dVarA.annotationType(), dVarA);
            EVENTSDROPPEDCOUNT_DESCRIPTOR = new d("eventsDroppedCount", a.a(map), null);
            t5.a aVar2 = new t5.a();
            aVar2.f35679a = 3;
            t5.d dVarA2 = aVar2.a();
            HashMap map2 = new HashMap();
            map2.put(dVarA2.annotationType(), dVarA2);
            REASON_DESCRIPTOR = new d("reason", a.a(map2), null);
        }

        private LogEventDroppedEncoder() {
        }

        @Override // q5.b
        public void encode(LogEventDropped logEventDropped, f fVar) throws IOException {
            fVar.c(EVENTSDROPPEDCOUNT_DESCRIPTOR, logEventDropped.getEventsDroppedCount());
            fVar.a(REASON_DESCRIPTOR, logEventDropped.getReason());
        }
    }

    public static final class LogSourceMetricsEncoder implements e<LogSourceMetrics> {
        public static final LogSourceMetricsEncoder INSTANCE = new LogSourceMetricsEncoder();
        private static final d LOGEVENTDROPPED_DESCRIPTOR;
        private static final d LOGSOURCE_DESCRIPTOR;

        static {
            t5.a aVar = new t5.a();
            aVar.f35679a = 1;
            t5.d dVarA = aVar.a();
            HashMap map = new HashMap();
            map.put(dVarA.annotationType(), dVarA);
            LOGSOURCE_DESCRIPTOR = new d("logSource", a.a(map), null);
            t5.a aVar2 = new t5.a();
            aVar2.f35679a = 2;
            t5.d dVarA2 = aVar2.a();
            HashMap map2 = new HashMap();
            map2.put(dVarA2.annotationType(), dVarA2);
            LOGEVENTDROPPED_DESCRIPTOR = new d("logEventDropped", a.a(map2), null);
        }

        private LogSourceMetricsEncoder() {
        }

        @Override // q5.b
        public void encode(LogSourceMetrics logSourceMetrics, f fVar) throws IOException {
            fVar.a(LOGSOURCE_DESCRIPTOR, logSourceMetrics.getLogSource());
            fVar.a(LOGEVENTDROPPED_DESCRIPTOR, logSourceMetrics.getLogEventDroppedList());
        }
    }

    public static final class ProtoEncoderDoNotUseEncoder implements e<ProtoEncoderDoNotUse> {
        public static final ProtoEncoderDoNotUseEncoder INSTANCE = new ProtoEncoderDoNotUseEncoder();
        private static final d CLIENTMETRICS_DESCRIPTOR = d.a("clientMetrics");

        private ProtoEncoderDoNotUseEncoder() {
        }

        @Override // q5.b
        public void encode(ProtoEncoderDoNotUse protoEncoderDoNotUse, f fVar) throws IOException {
            fVar.a(CLIENTMETRICS_DESCRIPTOR, protoEncoderDoNotUse.getClientMetrics());
        }
    }

    public static final class StorageMetricsEncoder implements e<StorageMetrics> {
        private static final d CURRENTCACHESIZEBYTES_DESCRIPTOR;
        public static final StorageMetricsEncoder INSTANCE = new StorageMetricsEncoder();
        private static final d MAXCACHESIZEBYTES_DESCRIPTOR;

        static {
            t5.a aVar = new t5.a();
            aVar.f35679a = 1;
            t5.d dVarA = aVar.a();
            HashMap map = new HashMap();
            map.put(dVarA.annotationType(), dVarA);
            CURRENTCACHESIZEBYTES_DESCRIPTOR = new d("currentCacheSizeBytes", a.a(map), null);
            t5.a aVar2 = new t5.a();
            aVar2.f35679a = 2;
            t5.d dVarA2 = aVar2.a();
            HashMap map2 = new HashMap();
            map2.put(dVarA2.annotationType(), dVarA2);
            MAXCACHESIZEBYTES_DESCRIPTOR = new d("maxCacheSizeBytes", a.a(map2), null);
        }

        private StorageMetricsEncoder() {
        }

        @Override // q5.b
        public void encode(StorageMetrics storageMetrics, f fVar) throws IOException {
            fVar.c(CURRENTCACHESIZEBYTES_DESCRIPTOR, storageMetrics.getCurrentCacheSizeBytes());
            fVar.c(MAXCACHESIZEBYTES_DESCRIPTOR, storageMetrics.getMaxCacheSizeBytes());
        }
    }

    public static final class TimeWindowEncoder implements e<TimeWindow> {
        private static final d ENDMS_DESCRIPTOR;
        public static final TimeWindowEncoder INSTANCE = new TimeWindowEncoder();
        private static final d STARTMS_DESCRIPTOR;

        static {
            t5.a aVar = new t5.a();
            aVar.f35679a = 1;
            t5.d dVarA = aVar.a();
            HashMap map = new HashMap();
            map.put(dVarA.annotationType(), dVarA);
            STARTMS_DESCRIPTOR = new d("startMs", a.a(map), null);
            t5.a aVar2 = new t5.a();
            aVar2.f35679a = 2;
            t5.d dVarA2 = aVar2.a();
            HashMap map2 = new HashMap();
            map2.put(dVarA2.annotationType(), dVarA2);
            ENDMS_DESCRIPTOR = new d("endMs", a.a(map2), null);
        }

        private TimeWindowEncoder() {
        }

        @Override // q5.b
        public void encode(TimeWindow timeWindow, f fVar) throws IOException {
            fVar.c(STARTMS_DESCRIPTOR, timeWindow.getStartMs());
            fVar.c(ENDMS_DESCRIPTOR, timeWindow.getEndMs());
        }
    }

    private AutoProtoEncoderDoNotUseEncoder() {
    }

    @Override // r5.a
    public void configure(r5.b<?> bVar) {
        bVar.a(ProtoEncoderDoNotUse.class, ProtoEncoderDoNotUseEncoder.INSTANCE);
        bVar.a(ClientMetrics.class, ClientMetricsEncoder.INSTANCE);
        bVar.a(TimeWindow.class, TimeWindowEncoder.INSTANCE);
        bVar.a(LogSourceMetrics.class, LogSourceMetricsEncoder.INSTANCE);
        bVar.a(LogEventDropped.class, LogEventDroppedEncoder.INSTANCE);
        bVar.a(GlobalMetrics.class, GlobalMetricsEncoder.INSTANCE);
        bVar.a(StorageMetrics.class, StorageMetricsEncoder.INSTANCE);
    }
}
