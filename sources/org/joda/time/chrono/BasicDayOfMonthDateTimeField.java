package org.joda.time.chrono;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;
import org.joda.time.field.PreciseDurationDateTimeField;

/* JADX INFO: loaded from: classes3.dex */
final class BasicDayOfMonthDateTimeField extends PreciseDurationDateTimeField {
    private static final long serialVersionUID = -4677223814028011723L;
    private final BasicChronology iChronology;

    public BasicDayOfMonthDateTimeField(BasicChronology basicChronology, DurationField durationField) {
        super(DateTimeFieldType.dayOfMonth(), durationField);
        this.iChronology = basicChronology;
    }

    private Object readResolve() {
        return this.iChronology.dayOfMonth();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int get(long j10) {
        return this.iChronology.getDayOfMonth(j10);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue() {
        return this.iChronology.getDaysInMonthMax();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue(long j10) {
        return this.iChronology.getDaysInMonthMax(j10);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue(ReadablePartial readablePartial) {
        if (!readablePartial.isSupported(DateTimeFieldType.monthOfYear())) {
            return getMaximumValue();
        }
        int i10 = readablePartial.get(DateTimeFieldType.monthOfYear());
        if (!readablePartial.isSupported(DateTimeFieldType.year())) {
            return this.iChronology.getDaysInMonthMax(i10);
        }
        return this.iChronology.getDaysInYearMonth(readablePartial.get(DateTimeFieldType.year()), i10);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue(ReadablePartial readablePartial, int[] iArr) {
        int size = readablePartial.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (readablePartial.getFieldType(i10) == DateTimeFieldType.monthOfYear()) {
                int i11 = iArr[i10];
                for (int i12 = 0; i12 < size; i12++) {
                    if (readablePartial.getFieldType(i12) == DateTimeFieldType.year()) {
                        return this.iChronology.getDaysInYearMonth(iArr[i12], i11);
                    }
                }
                return this.iChronology.getDaysInMonthMax(i11);
            }
        }
        return getMaximumValue();
    }

    @Override // org.joda.time.field.PreciseDurationDateTimeField
    public int getMaximumValueForSet(long j10, int i10) {
        return this.iChronology.getDaysInMonthMaxForSet(j10, i10);
    }

    @Override // org.joda.time.field.PreciseDurationDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue() {
        return 1;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getRangeDurationField() {
        return this.iChronology.months();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public boolean isLeap(long j10) {
        return this.iChronology.isLeapDay(j10);
    }
}
