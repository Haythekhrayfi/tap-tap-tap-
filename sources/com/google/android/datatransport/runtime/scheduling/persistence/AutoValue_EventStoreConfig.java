package com.google.android.datatransport.runtime.scheduling.persistence;

/* JADX INFO: loaded from: classes.dex */
final class AutoValue_EventStoreConfig extends EventStoreConfig {
    private final int criticalSectionEnterTimeoutMs;
    private final long eventCleanUpAge;
    private final int loadBatchSize;
    private final int maxBlobByteSizePerRow;
    private final long maxStorageSizeInBytes;

    public static final class Builder extends EventStoreConfig.Builder {
        private Integer criticalSectionEnterTimeoutMs;
        private Long eventCleanUpAge;
        private Integer loadBatchSize;
        private Integer maxBlobByteSizePerRow;
        private Long maxStorageSizeInBytes;

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        public EventStoreConfig build() {
            String strA = this.maxStorageSizeInBytes == null ? " maxStorageSizeInBytes" : "";
            if (this.loadBatchSize == null) {
                strA = i.f.a(strA, " loadBatchSize");
            }
            if (this.criticalSectionEnterTimeoutMs == null) {
                strA = i.f.a(strA, " criticalSectionEnterTimeoutMs");
            }
            if (this.eventCleanUpAge == null) {
                strA = i.f.a(strA, " eventCleanUpAge");
            }
            if (this.maxBlobByteSizePerRow == null) {
                strA = i.f.a(strA, " maxBlobByteSizePerRow");
            }
            if (strA.isEmpty()) {
                return new AutoValue_EventStoreConfig(this.maxStorageSizeInBytes.longValue(), this.loadBatchSize.intValue(), this.criticalSectionEnterTimeoutMs.intValue(), this.eventCleanUpAge.longValue(), this.maxBlobByteSizePerRow.intValue());
            }
            throw new IllegalStateException(i.f.a("Missing required properties:", strA));
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        public EventStoreConfig.Builder setCriticalSectionEnterTimeoutMs(int i10) {
            this.criticalSectionEnterTimeoutMs = Integer.valueOf(i10);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        public EventStoreConfig.Builder setEventCleanUpAge(long j10) {
            this.eventCleanUpAge = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        public EventStoreConfig.Builder setLoadBatchSize(int i10) {
            this.loadBatchSize = Integer.valueOf(i10);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        public EventStoreConfig.Builder setMaxBlobByteSizePerRow(int i10) {
            this.maxBlobByteSizePerRow = Integer.valueOf(i10);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        public EventStoreConfig.Builder setMaxStorageSizeInBytes(long j10) {
            this.maxStorageSizeInBytes = Long.valueOf(j10);
            return this;
        }
    }

    private AutoValue_EventStoreConfig(long j10, int i10, int i11, long j11, int i12) {
        this.maxStorageSizeInBytes = j10;
        this.loadBatchSize = i10;
        this.criticalSectionEnterTimeoutMs = i11;
        this.eventCleanUpAge = j11;
        this.maxBlobByteSizePerRow = i12;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EventStoreConfig)) {
            return false;
        }
        EventStoreConfig eventStoreConfig = (EventStoreConfig) obj;
        return this.maxStorageSizeInBytes == eventStoreConfig.getMaxStorageSizeInBytes() && this.loadBatchSize == eventStoreConfig.getLoadBatchSize() && this.criticalSectionEnterTimeoutMs == eventStoreConfig.getCriticalSectionEnterTimeoutMs() && this.eventCleanUpAge == eventStoreConfig.getEventCleanUpAge() && this.maxBlobByteSizePerRow == eventStoreConfig.getMaxBlobByteSizePerRow();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    public int getCriticalSectionEnterTimeoutMs() {
        return this.criticalSectionEnterTimeoutMs;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    public long getEventCleanUpAge() {
        return this.eventCleanUpAge;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    public int getLoadBatchSize() {
        return this.loadBatchSize;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    public int getMaxBlobByteSizePerRow() {
        return this.maxBlobByteSizePerRow;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    public long getMaxStorageSizeInBytes() {
        return this.maxStorageSizeInBytes;
    }

    public int hashCode() {
        long j10 = this.maxStorageSizeInBytes;
        int i10 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.loadBatchSize) * 1000003) ^ this.criticalSectionEnterTimeoutMs) * 1000003;
        long j11 = this.eventCleanUpAge;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.maxBlobByteSizePerRow;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("EventStoreConfig{maxStorageSizeInBytes=");
        sbA.append(this.maxStorageSizeInBytes);
        sbA.append(", loadBatchSize=");
        sbA.append(this.loadBatchSize);
        sbA.append(", criticalSectionEnterTimeoutMs=");
        sbA.append(this.criticalSectionEnterTimeoutMs);
        sbA.append(", eventCleanUpAge=");
        sbA.append(this.eventCleanUpAge);
        sbA.append(", maxBlobByteSizePerRow=");
        return android.support.v4.media.b.a(sbA, this.maxBlobByteSizePerRow, "}");
    }
}
