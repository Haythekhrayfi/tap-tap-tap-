package org.joda.time.field;

import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;

/* JADX INFO: loaded from: classes3.dex */
public class OffsetDateTimeField extends DecoratedDateTimeField {
    private static final long serialVersionUID = 3145790132623583142L;
    private final int iMax;
    private final int iMin;
    private final int iOffset;

    public OffsetDateTimeField(DateTimeField dateTimeField, int i10) {
        this(dateTimeField, dateTimeField == null ? null : dateTimeField.getType(), i10, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public OffsetDateTimeField(DateTimeField dateTimeField, DateTimeFieldType dateTimeFieldType, int i10) {
        this(dateTimeField, dateTimeFieldType, i10, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public OffsetDateTimeField(DateTimeField dateTimeField, DateTimeFieldType dateTimeFieldType, int i10, int i11, int i12) {
        super(dateTimeField, dateTimeFieldType);
        if (i10 == 0) {
            throw new IllegalArgumentException("The offset cannot be zero");
        }
        this.iOffset = i10;
        if (i11 < dateTimeField.getMinimumValue() + i10) {
            this.iMin = dateTimeField.getMinimumValue() + i10;
        } else {
            this.iMin = i11;
        }
        if (i12 > dateTimeField.getMaximumValue() + i10) {
            this.iMax = dateTimeField.getMaximumValue() + i10;
        } else {
            this.iMax = i12;
        }
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j10, int i10) {
        long jAdd = super.add(j10, i10);
        FieldUtils.verifyValueBounds(this, get(jAdd), this.iMin, this.iMax);
        return jAdd;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j10, long j11) {
        long jAdd = super.add(j10, j11);
        FieldUtils.verifyValueBounds(this, get(jAdd), this.iMin, this.iMax);
        return jAdd;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long addWrapField(long j10, int i10) {
        return set(j10, FieldUtils.getWrappedValue(get(j10), i10, this.iMin, this.iMax));
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int get(long j10) {
        return super.get(j10) + this.iOffset;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getLeapAmount(long j10) {
        return getWrappedField().getLeapAmount(j10);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getLeapDurationField() {
        return getWrappedField().getLeapDurationField();
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue() {
        return this.iMax;
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue() {
        return this.iMin;
    }

    public int getOffset() {
        return this.iOffset;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public boolean isLeap(long j10) {
        return getWrappedField().isLeap(j10);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long remainder(long j10) {
        return getWrappedField().remainder(j10);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundCeiling(long j10) {
        return getWrappedField().roundCeiling(j10);
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundFloor(long j10) {
        return getWrappedField().roundFloor(j10);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundHalfCeiling(long j10) {
        return getWrappedField().roundHalfCeiling(j10);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundHalfEven(long j10) {
        return getWrappedField().roundHalfEven(j10);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundHalfFloor(long j10) {
        return getWrappedField().roundHalfFloor(j10);
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long set(long j10, int i10) {
        FieldUtils.verifyValueBounds(this, i10, this.iMin, this.iMax);
        return super.set(j10, i10 - this.iOffset);
    }
}
