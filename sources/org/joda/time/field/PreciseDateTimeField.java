package org.joda.time.field;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;

/* JADX INFO: loaded from: classes3.dex */
public class PreciseDateTimeField extends PreciseDurationDateTimeField {
    private static final long serialVersionUID = -5586801265774496376L;
    private final int iRange;
    private final DurationField iRangeField;

    public PreciseDateTimeField(DateTimeFieldType dateTimeFieldType, DurationField durationField, DurationField durationField2) {
        super(dateTimeFieldType, durationField);
        if (!durationField2.isPrecise()) {
            throw new IllegalArgumentException("Range duration field must be precise");
        }
        int unitMillis = (int) (durationField2.getUnitMillis() / getUnitMillis());
        this.iRange = unitMillis;
        if (unitMillis < 2) {
            throw new IllegalArgumentException("The effective range must be at least 2");
        }
        this.iRangeField = durationField2;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long addWrapField(long j10, int i10) {
        int i11 = get(j10);
        return (getUnitMillis() * ((long) (FieldUtils.getWrappedValue(i11, i10, getMinimumValue(), getMaximumValue()) - i11))) + j10;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int get(long j10) {
        return j10 >= 0 ? (int) ((j10 / getUnitMillis()) % ((long) this.iRange)) : (this.iRange - 1) + ((int) (((j10 + 1) / getUnitMillis()) % ((long) this.iRange)));
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue() {
        return this.iRange - 1;
    }

    public int getRange() {
        return this.iRange;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getRangeDurationField() {
        return this.iRangeField;
    }

    @Override // org.joda.time.field.PreciseDurationDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long set(long j10, int i10) {
        FieldUtils.verifyValueBounds(this, i10, getMinimumValue(), getMaximumValue());
        return (((long) (i10 - get(j10))) * this.iUnitMillis) + j10;
    }
}
