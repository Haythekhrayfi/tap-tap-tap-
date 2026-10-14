package com.google.android.datatransport.runtime;

import i.f;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class AutoValue_EventInternal extends EventInternal {
    private final Map<String, String> autoMetadata;
    private final Integer code;
    private final EncodedPayload encodedPayload;
    private final long eventMillis;
    private final String transportName;
    private final long uptimeMillis;

    public static final class Builder extends EventInternal.Builder {
        private Map<String, String> autoMetadata;
        private Integer code;
        private EncodedPayload encodedPayload;
        private Long eventMillis;
        private String transportName;
        private Long uptimeMillis;

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal build() {
            String strA = this.transportName == null ? " transportName" : "";
            if (this.encodedPayload == null) {
                strA = f.a(strA, " encodedPayload");
            }
            if (this.eventMillis == null) {
                strA = f.a(strA, " eventMillis");
            }
            if (this.uptimeMillis == null) {
                strA = f.a(strA, " uptimeMillis");
            }
            if (this.autoMetadata == null) {
                strA = f.a(strA, " autoMetadata");
            }
            if (strA.isEmpty()) {
                return new AutoValue_EventInternal(this.transportName, this.code, this.encodedPayload, this.eventMillis.longValue(), this.uptimeMillis.longValue(), this.autoMetadata);
            }
            throw new IllegalStateException(f.a("Missing required properties:", strA));
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public Map<String, String> getAutoMetadata() {
            Map<String, String> map = this.autoMetadata;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setAutoMetadata(Map<String, String> map) {
            Objects.requireNonNull(map, "Null autoMetadata");
            this.autoMetadata = map;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setCode(Integer num) {
            this.code = num;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setEncodedPayload(EncodedPayload encodedPayload) {
            Objects.requireNonNull(encodedPayload, "Null encodedPayload");
            this.encodedPayload = encodedPayload;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setEventMillis(long j10) {
            this.eventMillis = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setTransportName(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.transportName = str;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setUptimeMillis(long j10) {
            this.uptimeMillis = Long.valueOf(j10);
            return this;
        }
    }

    private AutoValue_EventInternal(String str, Integer num, EncodedPayload encodedPayload, long j10, long j11, Map<String, String> map) {
        this.transportName = str;
        this.code = num;
        this.encodedPayload = encodedPayload;
        this.eventMillis = j10;
        this.uptimeMillis = j11;
        this.autoMetadata = map;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EventInternal)) {
            return false;
        }
        EventInternal eventInternal = (EventInternal) obj;
        return this.transportName.equals(eventInternal.getTransportName()) && ((num = this.code) != null ? num.equals(eventInternal.getCode()) : eventInternal.getCode() == null) && this.encodedPayload.equals(eventInternal.getEncodedPayload()) && this.eventMillis == eventInternal.getEventMillis() && this.uptimeMillis == eventInternal.getUptimeMillis() && this.autoMetadata.equals(eventInternal.getAutoMetadata());
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public Map<String, String> getAutoMetadata() {
        return this.autoMetadata;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public Integer getCode() {
        return this.code;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public EncodedPayload getEncodedPayload() {
        return this.encodedPayload;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public long getEventMillis() {
        return this.eventMillis;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public String getTransportName() {
        return this.transportName;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public long getUptimeMillis() {
        return this.uptimeMillis;
    }

    public int hashCode() {
        int iHashCode = (this.transportName.hashCode() ^ 1000003) * 1000003;
        Integer num = this.code;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.encodedPayload.hashCode()) * 1000003;
        long j10 = this.eventMillis;
        int i10 = (iHashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.uptimeMillis;
        return ((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.autoMetadata.hashCode();
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("EventInternal{transportName=");
        sbA.append(this.transportName);
        sbA.append(", code=");
        sbA.append(this.code);
        sbA.append(", encodedPayload=");
        sbA.append(this.encodedPayload);
        sbA.append(", eventMillis=");
        sbA.append(this.eventMillis);
        sbA.append(", uptimeMillis=");
        sbA.append(this.uptimeMillis);
        sbA.append(", autoMetadata=");
        sbA.append(this.autoMetadata);
        sbA.append("}");
        return sbA.toString();
    }
}
