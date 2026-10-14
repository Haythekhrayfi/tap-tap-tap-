package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import i.f;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class AutoValue_SchedulerConfig_ConfigValue extends SchedulerConfig.ConfigValue {
    private final long delta;
    private final Set<SchedulerConfig.Flag> flags;
    private final long maxAllowedDelay;

    public static final class Builder extends SchedulerConfig.ConfigValue.Builder {
        private Long delta;
        private Set<SchedulerConfig.Flag> flags;
        private Long maxAllowedDelay;

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder
        public SchedulerConfig.ConfigValue build() {
            String strA = this.delta == null ? " delta" : "";
            if (this.maxAllowedDelay == null) {
                strA = f.a(strA, " maxAllowedDelay");
            }
            if (this.flags == null) {
                strA = f.a(strA, " flags");
            }
            if (strA.isEmpty()) {
                return new AutoValue_SchedulerConfig_ConfigValue(this.delta.longValue(), this.maxAllowedDelay.longValue(), this.flags);
            }
            throw new IllegalStateException(f.a("Missing required properties:", strA));
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder
        public SchedulerConfig.ConfigValue.Builder setDelta(long j10) {
            this.delta = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder
        public SchedulerConfig.ConfigValue.Builder setFlags(Set<SchedulerConfig.Flag> set) {
            Objects.requireNonNull(set, "Null flags");
            this.flags = set;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder
        public SchedulerConfig.ConfigValue.Builder setMaxAllowedDelay(long j10) {
            this.maxAllowedDelay = Long.valueOf(j10);
            return this;
        }
    }

    private AutoValue_SchedulerConfig_ConfigValue(long j10, long j11, Set<SchedulerConfig.Flag> set) {
        this.delta = j10;
        this.maxAllowedDelay = j11;
        this.flags = set;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig.ConfigValue)) {
            return false;
        }
        SchedulerConfig.ConfigValue configValue = (SchedulerConfig.ConfigValue) obj;
        return this.delta == configValue.getDelta() && this.maxAllowedDelay == configValue.getMaxAllowedDelay() && this.flags.equals(configValue.getFlags());
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue
    public long getDelta() {
        return this.delta;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue
    public Set<SchedulerConfig.Flag> getFlags() {
        return this.flags;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue
    public long getMaxAllowedDelay() {
        return this.maxAllowedDelay;
    }

    public int hashCode() {
        long j10 = this.delta;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.maxAllowedDelay;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.flags.hashCode();
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("ConfigValue{delta=");
        sbA.append(this.delta);
        sbA.append(", maxAllowedDelay=");
        sbA.append(this.maxAllowedDelay);
        sbA.append(", flags=");
        sbA.append(this.flags);
        sbA.append("}");
        return sbA.toString();
    }
}
