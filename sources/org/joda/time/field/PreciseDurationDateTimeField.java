package org.joda.time.field;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PreciseDurationDateTimeField extends BaseDateTimeField {
    private static final long serialVersionUID = 5004523158306266035L;
    private final DurationField iUnitField;
    public final long iUnitMillis;

    public PreciseDurationDateTimeField(DateTimeFieldType dateTimeFieldType, DurationField durationField) {
        super(dateTimeFieldType);
        if (!durationField.isPrecise()) {
            throw new IllegalArgumentException("Unit duration field must be precise");
        }
        long unitMillis = durationField.getUnitMillis();
        this.iUnitMillis = unitMillis;
        if (unitMillis < 1) {
            throw new IllegalArgumentException("The unit milliseconds must be at least 1");
        }
        this.iUnitField = durationField;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getDurationField() {
        return this.iUnitField;
    }

    public int getMaximumValueForSet(long j10, int i10) {
        return getMaximumValue(j10);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue() {
        return 0;
    }

    public final long getUnitMillis() {
        return this.iUnitMillis;
    }

    @Override // org.joda.time.DateTimeField
    public boolean isLenient() {
        return false;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long remainder(long j10) {
        if (j10 >= 0) {
            return j10 % this.iUnitMillis;
        }
        long j11 = this.iUnitMillis;
        return (((j10 + 1) % j11) + j11) - 1;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundCeiling(long j10) {
        if (j10 <= 0) {
            return j10 - (j10 % this.iUnitMillis);
        }
        long j11 = j10 - 1;
        long j12 = this.iUnitMillis;
        return (j11 - (j11 % j12)) + j12;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundFloor(long j10) {
        long j11;
        if (j10 >= 0) {
            j11 = j10 % this.iUnitMillis;
        } else {
            long j12 = j10 + 1;
            j11 = this.iUnitMillis;
            j10 = j12 - (j12 % j11);
        }
        return j10 - j11;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long set(long j10, int i10) {
        FieldUtils.verifyValueBounds(this, i10, getMinimumValue(), getMaximumValueForSet(j10, i10));
        return (((long) (i10 - get(j10))) * this.iUnitMillis) + j10;
    }
}
