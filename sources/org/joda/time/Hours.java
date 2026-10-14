package org.joda.time;

import defpackage.a;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

/* JADX INFO: loaded from: classes3.dex */
public final class Hours extends BaseSingleFieldPeriod {
    private static final long serialVersionUID = 87525275727380864L;
    public static final Hours ZERO = new Hours(0);
    public static final Hours ONE = new Hours(1);
    public static final Hours TWO = new Hours(2);
    public static final Hours THREE = new Hours(3);
    public static final Hours FOUR = new Hours(4);
    public static final Hours FIVE = new Hours(5);
    public static final Hours SIX = new Hours(6);
    public static final Hours SEVEN = new Hours(7);
    public static final Hours EIGHT = new Hours(8);
    public static final Hours MAX_VALUE = new Hours(Integer.MAX_VALUE);
    public static final Hours MIN_VALUE = new Hours(Integer.MIN_VALUE);
    private static final PeriodFormatter PARSER = ISOPeriodFormat.standard().withParseType(PeriodType.hours());

    private Hours(int i10) {
        super(i10);
    }

    public static Hours hours(int i10) {
        if (i10 == Integer.MIN_VALUE) {
            return MIN_VALUE;
        }
        if (i10 == Integer.MAX_VALUE) {
            return MAX_VALUE;
        }
        switch (i10) {
            case 0:
                return ZERO;
            case 1:
                return ONE;
            case 2:
                return TWO;
            case 3:
                return THREE;
            case 4:
                return FOUR;
            case 5:
                return FIVE;
            case 6:
                return SIX;
            case 7:
                return SEVEN;
            case 8:
                return EIGHT;
            default:
                return new Hours(i10);
        }
    }

    public static Hours hoursBetween(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        return hours(BaseSingleFieldPeriod.between(readableInstant, readableInstant2, DurationFieldType.hours()));
    }

    public static Hours hoursBetween(ReadablePartial readablePartial, ReadablePartial readablePartial2) {
        return hours(((readablePartial instanceof LocalTime) && (readablePartial2 instanceof LocalTime)) ? DateTimeUtils.getChronology(readablePartial.getChronology()).hours().getDifference(((LocalTime) readablePartial2).getLocalMillis(), ((LocalTime) readablePartial).getLocalMillis()) : BaseSingleFieldPeriod.between(readablePartial, readablePartial2, ZERO));
    }

    public static Hours hoursIn(ReadableInterval readableInterval) {
        return readableInterval == null ? ZERO : hours(BaseSingleFieldPeriod.between(readableInterval.getStart(), readableInterval.getEnd(), DurationFieldType.hours()));
    }

    @FromString
    public static Hours parseHours(String str) {
        return str == null ? ZERO : hours(PARSER.parsePeriod(str).getHours());
    }

    private Object readResolve() {
        return hours(getValue());
    }

    public static Hours standardHoursIn(ReadablePeriod readablePeriod) {
        return hours(BaseSingleFieldPeriod.standardPeriodIn(readablePeriod, 3600000L));
    }

    public Hours dividedBy(int i10) {
        return i10 == 1 ? this : hours(getValue() / i10);
    }

    @Override // org.joda.time.base.BaseSingleFieldPeriod
    public DurationFieldType getFieldType() {
        return DurationFieldType.hours();
    }

    public int getHours() {
        return getValue();
    }

    @Override // org.joda.time.base.BaseSingleFieldPeriod, org.joda.time.ReadablePeriod
    public PeriodType getPeriodType() {
        return PeriodType.hours();
    }

    public boolean isGreaterThan(Hours hours) {
        if (hours == null) {
            return getValue() > 0;
        }
        return getValue() > hours.getValue();
    }

    public boolean isLessThan(Hours hours) {
        if (hours == null) {
            return getValue() < 0;
        }
        return getValue() < hours.getValue();
    }

    public Hours minus(int i10) {
        return plus(FieldUtils.safeNegate(i10));
    }

    public Hours minus(Hours hours) {
        return hours == null ? this : minus(hours.getValue());
    }

    public Hours multipliedBy(int i10) {
        return hours(FieldUtils.safeMultiply(getValue(), i10));
    }

    public Hours negated() {
        return hours(FieldUtils.safeNegate(getValue()));
    }

    public Hours plus(int i10) {
        return i10 == 0 ? this : hours(FieldUtils.safeAdd(getValue(), i10));
    }

    public Hours plus(Hours hours) {
        return hours == null ? this : plus(hours.getValue());
    }

    public Days toStandardDays() {
        return Days.days(getValue() / 24);
    }

    public Duration toStandardDuration() {
        return new Duration(((long) getValue()) * 3600000);
    }

    public Minutes toStandardMinutes() {
        return Minutes.minutes(FieldUtils.safeMultiply(getValue(), 60));
    }

    public Seconds toStandardSeconds() {
        return Seconds.seconds(FieldUtils.safeMultiply(getValue(), DateTimeConstants.SECONDS_PER_HOUR));
    }

    public Weeks toStandardWeeks() {
        return Weeks.weeks(getValue() / 168);
    }

    @Override // org.joda.time.ReadablePeriod
    @ToString
    public String toString() {
        StringBuilder sbA = a.a("PT");
        sbA.append(String.valueOf(getValue()));
        sbA.append("H");
        return sbA.toString();
    }
}
