package org.joda.time.field;

import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;

/* JADX INFO: loaded from: classes3.dex */
public class DividedDateTimeField extends DecoratedDateTimeField {
    private static final long serialVersionUID = 8318475124230605365L;
    public final int iDivisor;
    public final DurationField iDurationField;
    private final int iMax;
    private final int iMin;
    public final DurationField iRangeDurationField;

    public DividedDateTimeField(DateTimeField dateTimeField, DateTimeFieldType dateTimeFieldType, int i10) {
        this(dateTimeField, dateTimeField.getRangeDurationField(), dateTimeFieldType, i10);
    }

    public DividedDateTimeField(DateTimeField dateTimeField, DurationField durationField, DateTimeFieldType dateTimeFieldType, int i10) {
        super(dateTimeField, dateTimeFieldType);
        if (i10 < 2) {
            throw new IllegalArgumentException("The divisor must be at least 2");
        }
        DurationField durationField2 = dateTimeField.getDurationField();
        if (durationField2 == null) {
            this.iDurationField = null;
        } else {
            this.iDurationField = new ScaledDurationField(durationField2, dateTimeFieldType.getDurationType(), i10);
        }
        this.iRangeDurationField = durationField;
        this.iDivisor = i10;
        int minimumValue = dateTimeField.getMinimumValue();
        int i11 = minimumValue >= 0 ? minimumValue / i10 : ((minimumValue + 1) / i10) - 1;
        int maximumValue = dateTimeField.getMaximumValue();
        int i12 = maximumValue >= 0 ? maximumValue / i10 : ((maximumValue + 1) / i10) - 1;
        this.iMin = i11;
        this.iMax = i12;
    }

    public DividedDateTimeField(RemainderDateTimeField remainderDateTimeField, DateTimeFieldType dateTimeFieldType) {
        this(remainderDateTimeField, (DurationField) null, dateTimeFieldType);
    }

    public DividedDateTimeField(RemainderDateTimeField remainderDateTimeField, DurationField durationField, DateTimeFieldType dateTimeFieldType) {
        super(remainderDateTimeField.getWrappedField(), dateTimeFieldType);
        int i10 = remainderDateTimeField.iDivisor;
        this.iDivisor = i10;
        this.iDurationField = remainderDateTimeField.iRangeField;
        this.iRangeDurationField = durationField;
        DateTimeField wrappedField = getWrappedField();
        int minimumValue = wrappedField.getMinimumValue();
        int i11 = minimumValue >= 0 ? minimumValue / i10 : ((minimumValue + 1) / i10) - 1;
        int maximumValue = wrappedField.getMaximumValue();
        int i12 = maximumValue >= 0 ? maximumValue / i10 : ((maximumValue + 1) / i10) - 1;
        this.iMin = i11;
        this.iMax = i12;
    }

    private int getRemainder(int i10) {
        int i11 = this.iDivisor;
        if (i10 >= 0) {
            return i10 % i11;
        }
        return ((i10 + 1) % i11) + (i11 - 1);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j10, int i10) {
        return getWrappedField().add(j10, i10 * this.iDivisor);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j10, long j11) {
        return getWrappedField().add(j10, j11 * ((long) this.iDivisor));
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long addWrapField(long j10, int i10) {
        return set(j10, FieldUtils.getWrappedValue(get(j10), i10, this.iMin, this.iMax));
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int get(long j10) {
        int i10 = getWrappedField().get(j10);
        return i10 >= 0 ? i10 / this.iDivisor : ((i10 + 1) / this.iDivisor) - 1;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getDifference(long j10, long j11) {
        return getWrappedField().getDifference(j10, j11) / this.iDivisor;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long getDifferenceAsLong(long j10, long j11) {
        return getWrappedField().getDifferenceAsLong(j10, j11) / ((long) this.iDivisor);
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
        return this.iMax;
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue() {
        return this.iMin;
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getRangeDurationField() {
        DurationField durationField = this.iRangeDurationField;
        return durationField != null ? durationField : super.getRangeDurationField();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long remainder(long j10) {
        return set(j10, get(getWrappedField().remainder(j10)));
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundFloor(long j10) {
        DateTimeField wrappedField = getWrappedField();
        return wrappedField.roundFloor(wrappedField.set(j10, get(j10) * this.iDivisor));
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long set(long j10, int i10) {
        FieldUtils.verifyValueBounds(this, i10, this.iMin, this.iMax);
        return getWrappedField().set(j10, (i10 * this.iDivisor) + getRemainder(getWrappedField().get(j10)));
    }
}
