package org.joda.time.field;

import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;

/* JADX INFO: loaded from: classes3.dex */
public class ScaledDurationField extends DecoratedDurationField {
    private static final long serialVersionUID = -3205227092378684157L;
    private final int iScalar;

    public ScaledDurationField(DurationField durationField, DurationFieldType durationFieldType, int i10) {
        super(durationField, durationFieldType);
        if (i10 == 0 || i10 == 1) {
            throw new IllegalArgumentException("The scalar must not be 0 or 1");
        }
        this.iScalar = i10;
    }

    @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
    public long add(long j10, int i10) {
        return getWrappedField().add(j10, ((long) i10) * ((long) this.iScalar));
    }

    @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
    public long add(long j10, long j11) {
        return getWrappedField().add(j10, FieldUtils.safeMultiply(j11, this.iScalar));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScaledDurationField)) {
            return false;
        }
        ScaledDurationField scaledDurationField = (ScaledDurationField) obj;
        return getWrappedField().equals(scaledDurationField.getWrappedField()) && getType() == scaledDurationField.getType() && this.iScalar == scaledDurationField.iScalar;
    }

    @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
    public int getDifference(long j10, long j11) {
        return getWrappedField().getDifference(j10, j11) / this.iScalar;
    }

    @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
    public long getDifferenceAsLong(long j10, long j11) {
        return getWrappedField().getDifferenceAsLong(j10, j11) / ((long) this.iScalar);
    }

    @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
    public long getMillis(int i10) {
        return getWrappedField().getMillis(((long) i10) * ((long) this.iScalar));
    }

    @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
    public long getMillis(int i10, long j10) {
        return getWrappedField().getMillis(((long) i10) * ((long) this.iScalar), j10);
    }

    @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
    public long getMillis(long j10) {
        return getWrappedField().getMillis(FieldUtils.safeMultiply(j10, this.iScalar));
    }

    @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
    public long getMillis(long j10, long j11) {
        return getWrappedField().getMillis(FieldUtils.safeMultiply(j10, this.iScalar), j11);
    }

    public int getScalar() {
        return this.iScalar;
    }

    @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
    public long getUnitMillis() {
        return getWrappedField().getUnitMillis() * ((long) this.iScalar);
    }

    @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
    public int getValue(long j10) {
        return getWrappedField().getValue(j10) / this.iScalar;
    }

    @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
    public int getValue(long j10, long j11) {
        return getWrappedField().getValue(j10, j11) / this.iScalar;
    }

    @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
    public long getValueAsLong(long j10) {
        return getWrappedField().getValueAsLong(j10) / ((long) this.iScalar);
    }

    @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
    public long getValueAsLong(long j10, long j11) {
        return getWrappedField().getValueAsLong(j10, j11) / ((long) this.iScalar);
    }

    public int hashCode() {
        long j10 = this.iScalar;
        return getWrappedField().hashCode() + getType().hashCode() + ((int) (j10 ^ (j10 >>> 32)));
    }
}
