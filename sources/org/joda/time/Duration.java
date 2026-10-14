package org.joda.time;

import java.math.RoundingMode;
import org.joda.convert.FromString;
import org.joda.time.base.BaseDuration;
import org.joda.time.field.FieldUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class Duration extends BaseDuration {
    public static final Duration ZERO = new Duration(0);
    private static final long serialVersionUID = 2471658376918L;

    public Duration(long j10) {
        super(j10);
    }

    public Duration(long j10, long j11) {
        super(j10, j11);
    }

    public Duration(Object obj) {
        super(obj);
    }

    public Duration(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        super(readableInstant, readableInstant2);
    }

    public static Duration millis(long j10) {
        return j10 == 0 ? ZERO : new Duration(j10);
    }

    @FromString
    public static Duration parse(String str) {
        return new Duration(str);
    }

    public static Duration standardDays(long j10) {
        return j10 == 0 ? ZERO : new Duration(FieldUtils.safeMultiply(j10, DateTimeConstants.MILLIS_PER_DAY));
    }

    public static Duration standardHours(long j10) {
        return j10 == 0 ? ZERO : new Duration(FieldUtils.safeMultiply(j10, DateTimeConstants.MILLIS_PER_HOUR));
    }

    public static Duration standardMinutes(long j10) {
        return j10 == 0 ? ZERO : new Duration(FieldUtils.safeMultiply(j10, DateTimeConstants.MILLIS_PER_MINUTE));
    }

    public static Duration standardSeconds(long j10) {
        return j10 == 0 ? ZERO : new Duration(FieldUtils.safeMultiply(j10, 1000));
    }

    public Duration abs() {
        return getMillis() < 0 ? negated() : this;
    }

    public Duration dividedBy(long j10) {
        return j10 == 1 ? this : new Duration(FieldUtils.safeDivide(getMillis(), j10));
    }

    public Duration dividedBy(long j10, RoundingMode roundingMode) {
        return j10 == 1 ? this : new Duration(FieldUtils.safeDivide(getMillis(), j10, roundingMode));
    }

    public long getStandardDays() {
        return getMillis() / 86400000;
    }

    public long getStandardHours() {
        return getMillis() / 3600000;
    }

    public long getStandardMinutes() {
        return getMillis() / 60000;
    }

    public long getStandardSeconds() {
        return getMillis() / 1000;
    }

    public Duration minus(long j10) {
        return withDurationAdded(j10, -1);
    }

    public Duration minus(ReadableDuration readableDuration) {
        return readableDuration == null ? this : withDurationAdded(readableDuration.getMillis(), -1);
    }

    public Duration multipliedBy(long j10) {
        return j10 == 1 ? this : new Duration(FieldUtils.safeMultiply(getMillis(), j10));
    }

    public Duration negated() {
        if (getMillis() != Long.MIN_VALUE) {
            return new Duration(-getMillis());
        }
        throw new ArithmeticException("Negation of this duration would overflow");
    }

    public Duration plus(long j10) {
        return withDurationAdded(j10, 1);
    }

    public Duration plus(ReadableDuration readableDuration) {
        return readableDuration == null ? this : withDurationAdded(readableDuration.getMillis(), 1);
    }

    @Override // org.joda.time.base.AbstractDuration, org.joda.time.ReadableDuration
    public Duration toDuration() {
        return this;
    }

    public Days toStandardDays() {
        return Days.days(FieldUtils.safeToInt(getStandardDays()));
    }

    public Hours toStandardHours() {
        return Hours.hours(FieldUtils.safeToInt(getStandardHours()));
    }

    public Minutes toStandardMinutes() {
        return Minutes.minutes(FieldUtils.safeToInt(getStandardMinutes()));
    }

    public Seconds toStandardSeconds() {
        return Seconds.seconds(FieldUtils.safeToInt(getStandardSeconds()));
    }

    public Duration withDurationAdded(long j10, int i10) {
        if (j10 == 0 || i10 == 0) {
            return this;
        }
        return new Duration(FieldUtils.safeAdd(getMillis(), FieldUtils.safeMultiply(j10, i10)));
    }

    public Duration withDurationAdded(ReadableDuration readableDuration, int i10) {
        return (readableDuration == null || i10 == 0) ? this : withDurationAdded(readableDuration.getMillis(), i10);
    }

    public Duration withMillis(long j10) {
        return j10 == getMillis() ? this : new Duration(j10);
    }
}
