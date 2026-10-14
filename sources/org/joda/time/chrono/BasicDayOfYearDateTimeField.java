package org.joda.time.chrono;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;
import org.joda.time.field.PreciseDurationDateTimeField;

/* JADX INFO: loaded from: classes3.dex */
final class BasicDayOfYearDateTimeField extends PreciseDurationDateTimeField {
    private static final long serialVersionUID = -6821236822336841037L;
    private final BasicChronology iChronology;

    public BasicDayOfYearDateTimeField(BasicChronology basicChronology, DurationField durationField) {
        super(DateTimeFieldType.dayOfYear(), durationField);
        this.iChronology = basicChronology;
    }

    private Object readResolve() {
        return this.iChronology.dayOfYear();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int get(long j10) {
        return this.iChronology.getDayOfYear(j10);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue() {
        return this.iChronology.getDaysInYearMax();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue(long j10) {
        return this.iChronology.getDaysInYear(this.iChronology.getYear(j10));
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue(ReadablePartial readablePartial) {
        if (!readablePartial.isSupported(DateTimeFieldType.year())) {
            return this.iChronology.getDaysInYearMax();
        }
        return this.iChronology.getDaysInYear(readablePartial.get(DateTimeFieldType.year()));
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue(ReadablePartial readablePartial, int[] iArr) {
        int size = readablePartial.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (readablePartial.getFieldType(i10) == DateTimeFieldType.year()) {
                return this.iChronology.getDaysInYear(iArr[i10]);
            }
        }
        return this.iChronology.getDaysInYearMax();
    }

    @Override // org.joda.time.field.PreciseDurationDateTimeField
    public int getMaximumValueForSet(long j10, int i10) {
        int daysInYearMax = this.iChronology.getDaysInYearMax() - 1;
        return (i10 > daysInYearMax || i10 < 1) ? getMaximumValue(j10) : daysInYearMax;
    }

    @Override // org.joda.time.field.PreciseDurationDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue() {
        return 1;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getRangeDurationField() {
        return this.iChronology.years();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public boolean isLeap(long j10) {
        return this.iChronology.isLeapDay(j10);
    }
}
