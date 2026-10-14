package org.joda.time.field;

import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;

/* JADX INFO: loaded from: classes3.dex */
public class RemainderDateTimeField extends DecoratedDateTimeField {
    private static final long serialVersionUID = 5708241235177666790L;
    public final int iDivisor;
    public final DurationField iDurationField;
    public final DurationField iRangeField;

    public RemainderDateTimeField(DateTimeField dateTimeField, DateTimeFieldType dateTimeFieldType, int i10) {
        super(dateTimeField, dateTimeFieldType);
        if (i10 < 2) {
            throw new IllegalArgumentException("The divisor must be at least 2");
        }
        DurationField durationField = dateTimeField.getDurationField();
        if (durationField == null) {
            this.iRangeField = null;
        } else {
            this.iRangeField = new ScaledDurationField(durationField, dateTimeFieldType.getRangeDurationType(), i10);
        }
        this.iDurationField = dateTimeField.getDurationField();
        this.iDivisor = i10;
    }

    public RemainderDateTimeField(DateTimeField dateTimeField, DurationField durationField, DateTimeFieldType dateTimeFieldType, int i10) {
        super(dateTimeField, dateTimeFieldType);
        if (i10 < 2) {
            throw new IllegalArgumentException("The divisor must be at least 2");
        }
        this.iRangeField = durationField;
        this.iDurationField = dateTimeField.getDurationField();
        this.iDivisor = i10;
    }

    public RemainderDateTimeField(DividedDateTimeField dividedDateTimeField) {
        this(dividedDateTimeField, dividedDateTimeField.getType());
    }

    public RemainderDateTimeField(DividedDateTimeField dividedDateTimeField, DateTimeFieldType dateTimeFieldType) {
        this(dividedDateTimeField, dividedDateTimeField.getWrappedField().getDurationField(), dateTimeFieldType);
    }

    public RemainderDateTimeField(DividedDateTimeField dividedDateTimeField, DurationField durationField, DateTimeFieldType dateTimeFieldType) {
        super(dividedDateTimeField.getWrappedField(), dateTimeFieldType);
        this.iDivisor = dividedDateTimeField.iDivisor;
        this.iDurationField = durationField;
        this.iRangeField = dividedDateTimeField.iDurationField;
    }

    private int getDivided(int i10) {
        return i10 >= 0 ? i10 / this.iDivisor : ((i10 + 1) / this.iDivisor) - 1;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long addWrapField(long j10, int i10) {
        return set(j10, FieldUtils.getWrappedValue(get(j10), i10, 0, this.iDivisor - 1));
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int get(long j10) {
        int i10 = getWrappedField().get(j10);
        int i11 = this.iDivisor;
        if (i10 >= 0) {
            return i10 % i11;
        }
        return ((i10 + 1) % i11) + (i11 - 1);
    }

    public int getDivisor() {
        return this.iDivisor;
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getDurationField() {
        return this.iDurationField;
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue() {
        return this.iDivisor - 1;
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue() {
        return 0;
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getRangeDurationField() {
        return this.iRangeField;
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
        FieldUtils.verifyValueBounds(this, i10, 0, this.iDivisor - 1);
        return getWrappedField().set(j10, (getDivided(getWrappedField().get(j10)) * this.iDivisor) + i10);
    }
}
