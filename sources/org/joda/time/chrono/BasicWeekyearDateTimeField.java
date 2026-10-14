package org.joda.time.chrono;

import ch.qos.logback.core.CoreConstants;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.ImpreciseDateTimeField;

/* JADX INFO: loaded from: classes3.dex */
final class BasicWeekyearDateTimeField extends ImpreciseDateTimeField {
    private static final long WEEK_53 = 31449600000L;
    private static final long serialVersionUID = 6215066916806820644L;
    private final BasicChronology iChronology;

    public BasicWeekyearDateTimeField(BasicChronology basicChronology) {
        super(DateTimeFieldType.weekyear(), basicChronology.getAverageMillisPerYear());
        this.iChronology = basicChronology;
    }

    private Object readResolve() {
        return this.iChronology.weekyear();
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j10, int i10) {
        return i10 == 0 ? j10 : set(j10, get(j10) + i10);
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j10, long j11) {
        return add(j10, FieldUtils.safeToInt(j11));
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long addWrapField(long j10, int i10) {
        return add(j10, i10);
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int get(long j10) {
        return this.iChronology.getWeekyear(j10);
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long getDifferenceAsLong(long j10, long j11) {
        if (j10 < j11) {
            return -getDifference(j11, j10);
        }
        int i10 = get(j10);
        int i11 = get(j11);
        long jRemainder = remainder(j10);
        long jRemainder2 = remainder(j11);
        if (jRemainder2 >= WEEK_53 && this.iChronology.getWeeksInYear(i10) <= 52) {
            jRemainder2 -= CoreConstants.MILLIS_IN_ONE_WEEK;
        }
        int i12 = i10 - i11;
        if (jRemainder < jRemainder2) {
            i12--;
        }
        return i12;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getLeapAmount(long j10) {
        BasicChronology basicChronology = this.iChronology;
        return basicChronology.getWeeksInYear(basicChronology.getWeekyear(j10)) - 52;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getLeapDurationField() {
        return this.iChronology.weeks();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue() {
        return this.iChronology.getMaxYear();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue() {
        return this.iChronology.getMinYear();
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getRangeDurationField() {
        return null;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public boolean isLeap(long j10) {
        BasicChronology basicChronology = this.iChronology;
        return basicChronology.getWeeksInYear(basicChronology.getWeekyear(j10)) > 52;
    }

    @Override // org.joda.time.DateTimeField
    public boolean isLenient() {
        return false;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long remainder(long j10) {
        return j10 - roundFloor(j10);
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundFloor(long j10) {
        long jRoundFloor = this.iChronology.weekOfWeekyear().roundFloor(j10);
        int weekOfWeekyear = this.iChronology.getWeekOfWeekyear(jRoundFloor);
        return weekOfWeekyear > 1 ? jRoundFloor - (((long) (weekOfWeekyear - 1)) * CoreConstants.MILLIS_IN_ONE_WEEK) : jRoundFloor;
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long set(long j10, int i10) {
        FieldUtils.verifyValueBounds(this, Math.abs(i10), this.iChronology.getMinYear(), this.iChronology.getMaxYear());
        int i11 = get(j10);
        if (i11 == i10) {
            return j10;
        }
        int dayOfWeek = this.iChronology.getDayOfWeek(j10);
        int weeksInYear = this.iChronology.getWeeksInYear(i11);
        int weeksInYear2 = this.iChronology.getWeeksInYear(i10);
        if (weeksInYear2 < weeksInYear) {
            weeksInYear = weeksInYear2;
        }
        int weekOfWeekyear = this.iChronology.getWeekOfWeekyear(j10);
        if (weekOfWeekyear <= weeksInYear) {
            weeksInYear = weekOfWeekyear;
        }
        long year = this.iChronology.setYear(j10, i10);
        int i12 = get(year);
        if (i12 < i10) {
            year += CoreConstants.MILLIS_IN_ONE_WEEK;
        } else if (i12 > i10) {
            year -= CoreConstants.MILLIS_IN_ONE_WEEK;
        }
        return this.iChronology.dayOfWeek().set((((long) (weeksInYear - this.iChronology.getWeekOfWeekyear(year))) * CoreConstants.MILLIS_IN_ONE_WEEK) + year, dayOfWeek);
    }
}
