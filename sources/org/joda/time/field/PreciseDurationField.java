package org.joda.time.field;

import org.joda.time.DurationFieldType;

/* JADX INFO: loaded from: classes3.dex */
public class PreciseDurationField extends BaseDurationField {
    private static final long serialVersionUID = -8346152187724495365L;
    private final long iUnitMillis;

    public PreciseDurationField(DurationFieldType durationFieldType, long j10) {
        super(durationFieldType);
        this.iUnitMillis = j10;
    }

    @Override // org.joda.time.DurationField
    public long add(long j10, int i10) {
        return FieldUtils.safeAdd(j10, ((long) i10) * this.iUnitMillis);
    }

    @Override // org.joda.time.DurationField
    public long add(long j10, long j11) {
        return FieldUtils.safeAdd(j10, FieldUtils.safeMultiply(j11, this.iUnitMillis));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreciseDurationField)) {
            return false;
        }
        PreciseDurationField preciseDurationField = (PreciseDurationField) obj;
        return getType() == preciseDurationField.getType() && this.iUnitMillis == preciseDurationField.iUnitMillis;
    }

    @Override // org.joda.time.DurationField
    public long getDifferenceAsLong(long j10, long j11) {
        return FieldUtils.safeSubtract(j10, j11) / this.iUnitMillis;
    }

    @Override // org.joda.time.DurationField
    public long getMillis(int i10, long j10) {
        return ((long) i10) * this.iUnitMillis;
    }

    @Override // org.joda.time.DurationField
    public long getMillis(long j10, long j11) {
        return FieldUtils.safeMultiply(j10, this.iUnitMillis);
    }

    @Override // org.joda.time.DurationField
    public final long getUnitMillis() {
        return this.iUnitMillis;
    }

    @Override // org.joda.time.DurationField
    public long getValueAsLong(long j10, long j11) {
        return j10 / this.iUnitMillis;
    }

    public int hashCode() {
        long j10 = this.iUnitMillis;
        return getType().hashCode() + ((int) (j10 ^ (j10 >>> 32)));
    }

    @Override // org.joda.time.DurationField
    public final boolean isPrecise() {
        return true;
    }
}
