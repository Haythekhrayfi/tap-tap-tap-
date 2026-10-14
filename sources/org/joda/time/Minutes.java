package org.joda.time;

import defpackage.a;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

/* JADX INFO: loaded from: classes3.dex */
public final class Minutes extends BaseSingleFieldPeriod {
    private static final long serialVersionUID = 87525275727380863L;
    public static final Minutes ZERO = new Minutes(0);
    public static final Minutes ONE = new Minutes(1);
    public static final Minutes TWO = new Minutes(2);
    public static final Minutes THREE = new Minutes(3);
    public static final Minutes MAX_VALUE = new Minutes(Integer.MAX_VALUE);
    public static final Minutes MIN_VALUE = new Minutes(Integer.MIN_VALUE);
    private static final PeriodFormatter PARSER = ISOPeriodFormat.standard().withParseType(PeriodType.minutes());

    private Minutes(int i10) {
        super(i10);
    }

    public static Minutes minutes(int i10) {
        if (i10 == Integer.MIN_VALUE) {
            return MIN_VALUE;
        }
        if (i10 == Integer.MAX_VALUE) {
            return MAX_VALUE;
        }
        if (i10 == 0) {
            return ZERO;
        }
        if (i10 == 1) {
            return ONE;
        }
        if (i10 != 2) {
            return i10 != 3 ? new Minutes(i10) : THREE;
        }
        return TWO;
    }

    public static Minutes minutesBetween(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        return minutes(BaseSingleFieldPeriod.between(readableInstant, readableInstant2, DurationFieldType.minutes()));
    }

    public static Minutes minutesBetween(ReadablePartial readablePartial, ReadablePartial readablePartial2) {
        return minutes(((readablePartial instanceof LocalTime) && (readablePartial2 instanceof LocalTime)) ? DateTimeUtils.getChronology(readablePartial.getChronology()).minutes().getDifference(((LocalTime) readablePartial2).getLocalMillis(), ((LocalTime) readablePartial).getLocalMillis()) : BaseSingleFieldPeriod.between(readablePartial, readablePartial2, ZERO));
    }

    public static Minutes minutesIn(ReadableInterval readableInterval) {
        return readableInterval == null ? ZERO : minutes(BaseSingleFieldPeriod.between(readableInterval.getStart(), readableInterval.getEnd(), DurationFieldType.minutes()));
    }

    @FromString
    public static Minutes parseMinutes(String str) {
        return str == null ? ZERO : minutes(PARSER.parsePeriod(str).getMinutes());
    }

    private Object readResolve() {
        return minutes(getValue());
    }

    public static Minutes standardMinutesIn(ReadablePeriod readablePeriod) {
        return minutes(BaseSingleFieldPeriod.standardPeriodIn(readablePeriod, 60000L));
    }

    public Minutes dividedBy(int i10) {
        return i10 == 1 ? this : minutes(getValue() / i10);
    }

    @Override // org.joda.time.base.BaseSingleFieldPeriod
    public DurationFieldType getFieldType() {
        return DurationFieldType.minutes();
    }

    public int getMinutes() {
        return getValue();
    }

    @Override // org.joda.time.base.BaseSingleFieldPeriod, org.joda.time.ReadablePeriod
    public PeriodType getPeriodType() {
        return PeriodType.minutes();
    }

    public boolean isGreaterThan(Minutes minutes) {
        if (minutes == null) {
            return getValue() > 0;
        }
        return getValue() > minutes.getValue();
    }

    public boolean isLessThan(Minutes minutes) {
        if (minutes == null) {
            return getValue() < 0;
        }
        return getValue() < minutes.getValue();
    }

    public Minutes minus(int i10) {
        return plus(FieldUtils.safeNegate(i10));
    }

    public Minutes minus(Minutes minutes) {
        return minutes == null ? this : minus(minutes.getValue());
    }

    public Minutes multipliedBy(int i10) {
        return minutes(FieldUtils.safeMultiply(getValue(), i10));
    }

    public Minutes negated() {
        return minutes(FieldUtils.safeNegate(getValue()));
    }

    public Minutes plus(int i10) {
        return i10 == 0 ? this : minutes(FieldUtils.safeAdd(getValue(), i10));
    }

    public Minutes plus(Minutes minutes) {
        return minutes == null ? this : plus(minutes.getValue());
    }

    public Days toStandardDays() {
        return Days.days(getValue() / DateTimeConstants.MINUTES_PER_DAY);
    }

    public Duration toStandardDuration() {
        return new Duration(((long) getValue()) * 60000);
    }

    public Hours toStandardHours() {
        return Hours.hours(getValue() / 60);
    }

    public Seconds toStandardSeconds() {
        return Seconds.seconds(FieldUtils.safeMultiply(getValue(), 60));
    }

    public Weeks toStandardWeeks() {
        return Weeks.weeks(getValue() / DateTimeConstants.MINUTES_PER_WEEK);
    }

    @Override // org.joda.time.ReadablePeriod
    @ToString
    public String toString() {
        StringBuilder sbA = a.a("PT");
        sbA.append(String.valueOf(getValue()));
        sbA.append("M");
        return sbA.toString();
    }
}
