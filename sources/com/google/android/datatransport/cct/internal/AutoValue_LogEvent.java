package com.google.android.datatransport.cct.internal;

import defpackage.a;
import i.f;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class AutoValue_LogEvent extends LogEvent {
    private final Integer eventCode;
    private final long eventTimeMs;
    private final long eventUptimeMs;
    private final NetworkConnectionInfo networkConnectionInfo;
    private final byte[] sourceExtension;
    private final String sourceExtensionJsonProto3;
    private final long timezoneOffsetSeconds;

    public static final class Builder extends LogEvent.Builder {
        private Integer eventCode;
        private Long eventTimeMs;
        private Long eventUptimeMs;
        private NetworkConnectionInfo networkConnectionInfo;
        private byte[] sourceExtension;
        private String sourceExtensionJsonProto3;
        private Long timezoneOffsetSeconds;

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public LogEvent build() {
            String strA = this.eventTimeMs == null ? " eventTimeMs" : "";
            if (this.eventUptimeMs == null) {
                strA = f.a(strA, " eventUptimeMs");
            }
            if (this.timezoneOffsetSeconds == null) {
                strA = f.a(strA, " timezoneOffsetSeconds");
            }
            if (strA.isEmpty()) {
                return new AutoValue_LogEvent(this.eventTimeMs.longValue(), this.eventCode, this.eventUptimeMs.longValue(), this.sourceExtension, this.sourceExtensionJsonProto3, this.timezoneOffsetSeconds.longValue(), this.networkConnectionInfo);
            }
            throw new IllegalStateException(f.a("Missing required properties:", strA));
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public LogEvent.Builder setEventCode(Integer num) {
            this.eventCode = num;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public LogEvent.Builder setEventTimeMs(long j10) {
            this.eventTimeMs = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public LogEvent.Builder setEventUptimeMs(long j10) {
            this.eventUptimeMs = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public LogEvent.Builder setNetworkConnectionInfo(NetworkConnectionInfo networkConnectionInfo) {
            this.networkConnectionInfo = networkConnectionInfo;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public LogEvent.Builder setSourceExtension(byte[] bArr) {
            this.sourceExtension = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public LogEvent.Builder setSourceExtensionJsonProto3(String str) {
            this.sourceExtensionJsonProto3 = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public LogEvent.Builder setTimezoneOffsetSeconds(long j10) {
            this.timezoneOffsetSeconds = Long.valueOf(j10);
            return this;
        }
    }

    private AutoValue_LogEvent(long j10, Integer num, long j11, byte[] bArr, String str, long j12, NetworkConnectionInfo networkConnectionInfo) {
        this.eventTimeMs = j10;
        this.eventCode = num;
        this.eventUptimeMs = j11;
        this.sourceExtension = bArr;
        this.sourceExtensionJsonProto3 = str;
        this.timezoneOffsetSeconds = j12;
        this.networkConnectionInfo = networkConnectionInfo;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LogEvent)) {
            return false;
        }
        LogEvent logEvent = (LogEvent) obj;
        if (this.eventTimeMs == logEvent.getEventTimeMs() && ((num = this.eventCode) != null ? num.equals(logEvent.getEventCode()) : logEvent.getEventCode() == null) && this.eventUptimeMs == logEvent.getEventUptimeMs()) {
            if (Arrays.equals(this.sourceExtension, logEvent instanceof AutoValue_LogEvent ? ((AutoValue_LogEvent) logEvent).sourceExtension : logEvent.getSourceExtension()) && ((str = this.sourceExtensionJsonProto3) != null ? str.equals(logEvent.getSourceExtensionJsonProto3()) : logEvent.getSourceExtensionJsonProto3() == null) && this.timezoneOffsetSeconds == logEvent.getTimezoneOffsetSeconds()) {
                NetworkConnectionInfo networkConnectionInfo = this.networkConnectionInfo;
                NetworkConnectionInfo networkConnectionInfo2 = logEvent.getNetworkConnectionInfo();
                if (networkConnectionInfo == null) {
                    if (networkConnectionInfo2 == null) {
                        return true;
                    }
                } else if (networkConnectionInfo.equals(networkConnectionInfo2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public Integer getEventCode() {
        return this.eventCode;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public long getEventTimeMs() {
        return this.eventTimeMs;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public long getEventUptimeMs() {
        return this.eventUptimeMs;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public NetworkConnectionInfo getNetworkConnectionInfo() {
        return this.networkConnectionInfo;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public byte[] getSourceExtension() {
        return this.sourceExtension;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public String getSourceExtensionJsonProto3() {
        return this.sourceExtensionJsonProto3;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public long getTimezoneOffsetSeconds() {
        return this.timezoneOffsetSeconds;
    }

    public int hashCode() {
        long j10 = this.eventTimeMs;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.eventCode;
        int iHashCode = num == null ? 0 : num.hashCode();
        long j11 = this.eventUptimeMs;
        int iHashCode2 = (((((i10 ^ iHashCode) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.sourceExtension)) * 1000003;
        String str = this.sourceExtensionJsonProto3;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        long j12 = this.timezoneOffsetSeconds;
        int i11 = (((iHashCode2 ^ iHashCode3) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        NetworkConnectionInfo networkConnectionInfo = this.networkConnectionInfo;
        return i11 ^ (networkConnectionInfo != null ? networkConnectionInfo.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbA = a.a("LogEvent{eventTimeMs=");
        sbA.append(this.eventTimeMs);
        sbA.append(", eventCode=");
        sbA.append(this.eventCode);
        sbA.append(", eventUptimeMs=");
        sbA.append(this.eventUptimeMs);
        sbA.append(", sourceExtension=");
        sbA.append(Arrays.toString(this.sourceExtension));
        sbA.append(", sourceExtensionJsonProto3=");
        sbA.append(this.sourceExtensionJsonProto3);
        sbA.append(", timezoneOffsetSeconds=");
        sbA.append(this.timezoneOffsetSeconds);
        sbA.append(", networkConnectionInfo=");
        sbA.append(this.networkConnectionInfo);
        sbA.append("}");
        return sbA.toString();
    }
}
