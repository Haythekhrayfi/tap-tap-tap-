package com.google.android.datatransport.cct.internal;

import com.applovin.sdk.AppLovinEventTypes;
import java.io.IOException;
import q5.d;
import q5.e;
import q5.f;
import r5.a;
import r5.b;

/* JADX INFO: loaded from: classes.dex */
public final class AutoBatchedLogRequestEncoder implements a {
    public static final int CODEGEN_VERSION = 2;
    public static final a CONFIG = new AutoBatchedLogRequestEncoder();

    public static final class AndroidClientInfoEncoder implements e<AndroidClientInfo> {
        public static final AndroidClientInfoEncoder INSTANCE = new AndroidClientInfoEncoder();
        private static final d SDKVERSION_DESCRIPTOR = d.a("sdkVersion");
        private static final d MODEL_DESCRIPTOR = d.a("model");
        private static final d HARDWARE_DESCRIPTOR = d.a("hardware");
        private static final d DEVICE_DESCRIPTOR = d.a("device");
        private static final d PRODUCT_DESCRIPTOR = d.a(AppLovinEventTypes.USER_VIEWED_PRODUCT);
        private static final d OSBUILD_DESCRIPTOR = d.a("osBuild");
        private static final d MANUFACTURER_DESCRIPTOR = d.a("manufacturer");
        private static final d FINGERPRINT_DESCRIPTOR = d.a("fingerprint");
        private static final d LOCALE_DESCRIPTOR = d.a("locale");
        private static final d COUNTRY_DESCRIPTOR = d.a("country");
        private static final d MCCMNC_DESCRIPTOR = d.a("mccMnc");
        private static final d APPLICATIONBUILD_DESCRIPTOR = d.a("applicationBuild");

        private AndroidClientInfoEncoder() {
        }

        @Override // q5.b
        public void encode(AndroidClientInfo androidClientInfo, f fVar) throws IOException {
            fVar.a(SDKVERSION_DESCRIPTOR, androidClientInfo.getSdkVersion());
            fVar.a(MODEL_DESCRIPTOR, androidClientInfo.getModel());
            fVar.a(HARDWARE_DESCRIPTOR, androidClientInfo.getHardware());
            fVar.a(DEVICE_DESCRIPTOR, androidClientInfo.getDevice());
            fVar.a(PRODUCT_DESCRIPTOR, androidClientInfo.getProduct());
            fVar.a(OSBUILD_DESCRIPTOR, androidClientInfo.getOsBuild());
            fVar.a(MANUFACTURER_DESCRIPTOR, androidClientInfo.getManufacturer());
            fVar.a(FINGERPRINT_DESCRIPTOR, androidClientInfo.getFingerprint());
            fVar.a(LOCALE_DESCRIPTOR, androidClientInfo.getLocale());
            fVar.a(COUNTRY_DESCRIPTOR, androidClientInfo.getCountry());
            fVar.a(MCCMNC_DESCRIPTOR, androidClientInfo.getMccMnc());
            fVar.a(APPLICATIONBUILD_DESCRIPTOR, androidClientInfo.getApplicationBuild());
        }
    }

    public static final class BatchedLogRequestEncoder implements e<BatchedLogRequest> {
        public static final BatchedLogRequestEncoder INSTANCE = new BatchedLogRequestEncoder();
        private static final d LOGREQUEST_DESCRIPTOR = d.a("logRequest");

        private BatchedLogRequestEncoder() {
        }

        @Override // q5.b
        public void encode(BatchedLogRequest batchedLogRequest, f fVar) throws IOException {
            fVar.a(LOGREQUEST_DESCRIPTOR, batchedLogRequest.getLogRequests());
        }
    }

    public static final class ClientInfoEncoder implements e<ClientInfo> {
        public static final ClientInfoEncoder INSTANCE = new ClientInfoEncoder();
        private static final d CLIENTTYPE_DESCRIPTOR = d.a("clientType");
        private static final d ANDROIDCLIENTINFO_DESCRIPTOR = d.a("androidClientInfo");

        private ClientInfoEncoder() {
        }

        @Override // q5.b
        public void encode(ClientInfo clientInfo, f fVar) throws IOException {
            fVar.a(CLIENTTYPE_DESCRIPTOR, clientInfo.getClientType());
            fVar.a(ANDROIDCLIENTINFO_DESCRIPTOR, clientInfo.getAndroidClientInfo());
        }
    }

    public static final class LogEventEncoder implements e<LogEvent> {
        public static final LogEventEncoder INSTANCE = new LogEventEncoder();
        private static final d EVENTTIMEMS_DESCRIPTOR = d.a("eventTimeMs");
        private static final d EVENTCODE_DESCRIPTOR = d.a("eventCode");
        private static final d EVENTUPTIMEMS_DESCRIPTOR = d.a("eventUptimeMs");
        private static final d SOURCEEXTENSION_DESCRIPTOR = d.a("sourceExtension");
        private static final d SOURCEEXTENSIONJSONPROTO3_DESCRIPTOR = d.a("sourceExtensionJsonProto3");
        private static final d TIMEZONEOFFSETSECONDS_DESCRIPTOR = d.a("timezoneOffsetSeconds");
        private static final d NETWORKCONNECTIONINFO_DESCRIPTOR = d.a("networkConnectionInfo");

        private LogEventEncoder() {
        }

        @Override // q5.b
        public void encode(LogEvent logEvent, f fVar) throws IOException {
            fVar.c(EVENTTIMEMS_DESCRIPTOR, logEvent.getEventTimeMs());
            fVar.a(EVENTCODE_DESCRIPTOR, logEvent.getEventCode());
            fVar.c(EVENTUPTIMEMS_DESCRIPTOR, logEvent.getEventUptimeMs());
            fVar.a(SOURCEEXTENSION_DESCRIPTOR, logEvent.getSourceExtension());
            fVar.a(SOURCEEXTENSIONJSONPROTO3_DESCRIPTOR, logEvent.getSourceExtensionJsonProto3());
            fVar.c(TIMEZONEOFFSETSECONDS_DESCRIPTOR, logEvent.getTimezoneOffsetSeconds());
            fVar.a(NETWORKCONNECTIONINFO_DESCRIPTOR, logEvent.getNetworkConnectionInfo());
        }
    }

    public static final class LogRequestEncoder implements e<LogRequest> {
        public static final LogRequestEncoder INSTANCE = new LogRequestEncoder();
        private static final d REQUESTTIMEMS_DESCRIPTOR = d.a("requestTimeMs");
        private static final d REQUESTUPTIMEMS_DESCRIPTOR = d.a("requestUptimeMs");
        private static final d CLIENTINFO_DESCRIPTOR = d.a("clientInfo");
        private static final d LOGSOURCE_DESCRIPTOR = d.a("logSource");
        private static final d LOGSOURCENAME_DESCRIPTOR = d.a("logSourceName");
        private static final d LOGEVENT_DESCRIPTOR = d.a("logEvent");
        private static final d QOSTIER_DESCRIPTOR = d.a("qosTier");

        private LogRequestEncoder() {
        }

        @Override // q5.b
        public void encode(LogRequest logRequest, f fVar) throws IOException {
            fVar.c(REQUESTTIMEMS_DESCRIPTOR, logRequest.getRequestTimeMs());
            fVar.c(REQUESTUPTIMEMS_DESCRIPTOR, logRequest.getRequestUptimeMs());
            fVar.a(CLIENTINFO_DESCRIPTOR, logRequest.getClientInfo());
            fVar.a(LOGSOURCE_DESCRIPTOR, logRequest.getLogSource());
            fVar.a(LOGSOURCENAME_DESCRIPTOR, logRequest.getLogSourceName());
            fVar.a(LOGEVENT_DESCRIPTOR, logRequest.getLogEvents());
            fVar.a(QOSTIER_DESCRIPTOR, logRequest.getQosTier());
        }
    }

    public static final class NetworkConnectionInfoEncoder implements e<NetworkConnectionInfo> {
        public static final NetworkConnectionInfoEncoder INSTANCE = new NetworkConnectionInfoEncoder();
        private static final d NETWORKTYPE_DESCRIPTOR = d.a("networkType");
        private static final d MOBILESUBTYPE_DESCRIPTOR = d.a("mobileSubtype");

        private NetworkConnectionInfoEncoder() {
        }

        @Override // q5.b
        public void encode(NetworkConnectionInfo networkConnectionInfo, f fVar) throws IOException {
            fVar.a(NETWORKTYPE_DESCRIPTOR, networkConnectionInfo.getNetworkType());
            fVar.a(MOBILESUBTYPE_DESCRIPTOR, networkConnectionInfo.getMobileSubtype());
        }
    }

    private AutoBatchedLogRequestEncoder() {
    }

    @Override // r5.a
    public void configure(b<?> bVar) {
        BatchedLogRequestEncoder batchedLogRequestEncoder = BatchedLogRequestEncoder.INSTANCE;
        bVar.a(BatchedLogRequest.class, batchedLogRequestEncoder);
        bVar.a(AutoValue_BatchedLogRequest.class, batchedLogRequestEncoder);
        LogRequestEncoder logRequestEncoder = LogRequestEncoder.INSTANCE;
        bVar.a(LogRequest.class, logRequestEncoder);
        bVar.a(AutoValue_LogRequest.class, logRequestEncoder);
        ClientInfoEncoder clientInfoEncoder = ClientInfoEncoder.INSTANCE;
        bVar.a(ClientInfo.class, clientInfoEncoder);
        bVar.a(AutoValue_ClientInfo.class, clientInfoEncoder);
        AndroidClientInfoEncoder androidClientInfoEncoder = AndroidClientInfoEncoder.INSTANCE;
        bVar.a(AndroidClientInfo.class, androidClientInfoEncoder);
        bVar.a(AutoValue_AndroidClientInfo.class, androidClientInfoEncoder);
        LogEventEncoder logEventEncoder = LogEventEncoder.INSTANCE;
        bVar.a(LogEvent.class, logEventEncoder);
        bVar.a(AutoValue_LogEvent.class, logEventEncoder);
        NetworkConnectionInfoEncoder networkConnectionInfoEncoder = NetworkConnectionInfoEncoder.INSTANCE;
        bVar.a(NetworkConnectionInfo.class, networkConnectionInfoEncoder);
        bVar.a(AutoValue_NetworkConnectionInfo.class, networkConnectionInfoEncoder);
    }
}
