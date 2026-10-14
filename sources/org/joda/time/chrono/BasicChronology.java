package org.joda.time.chrono;

import android.support.v4.media.a;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.g;
import ch.qos.logback.core.CoreConstants;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.field.DividedDateTimeField;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.OffsetDateTimeField;
import org.joda.time.field.PreciseDateTimeField;
import org.joda.time.field.PreciseDurationField;
import org.joda.time.field.RemainderDateTimeField;
import org.joda.time.field.ZeroIsMaxDateTimeField;

/* JADX INFO: loaded from: classes3.dex */
abstract class BasicChronology extends AssembledChronology {
    private static final int CACHE_MASK = 1023;
    private static final int CACHE_SIZE = 1024;
    private static final DateTimeField cClockhourOfDayField;
    private static final DateTimeField cClockhourOfHalfdayField;
    private static final DurationField cDaysField;
    private static final DateTimeField cHalfdayOfDayField;
    private static final DurationField cHalfdaysField;
    private static final DateTimeField cHourOfDayField;
    private static final DateTimeField cHourOfHalfdayField;
    private static final DurationField cHoursField;
    private static final DurationField cMillisField;
    private static final DateTimeField cMillisOfDayField;
    private static final DateTimeField cMillisOfSecondField;
    private static final DateTimeField cMinuteOfDayField;
    private static final DateTimeField cMinuteOfHourField;
    private static final DurationField cMinutesField;
    private static final DateTimeField cSecondOfDayField;
    private static final DateTimeField cSecondOfMinuteField;
    private static final DurationField cSecondsField;
    private static final DurationField cWeeksField;
    private static final long serialVersionUID = 8283225332206808863L;
    private final int iMinDaysInFirstWeek;
    private final transient YearInfo[] iYearInfoCache;

    public static class HalfdayField extends PreciseDateTimeField {
        private static final long serialVersionUID = 581601443656929254L;

        public HalfdayField() {
            super(DateTimeFieldType.halfdayOfDay(), BasicChronology.cHalfdaysField, BasicChronology.cDaysField);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public String getAsText(int i10, Locale locale) {
            return GJLocaleSymbols.forLocale(locale).halfdayValueToText(i10);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumTextLength(Locale locale) {
            return GJLocaleSymbols.forLocale(locale).getHalfdayMaxTextLength();
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long set(long j10, String str, Locale locale) {
            return set(j10, GJLocaleSymbols.forLocale(locale).halfdayTextToValue(str));
        }
    }

    public static class YearInfo {
        public final long iFirstDayMillis;
        public final int iYear;

        public YearInfo(int i10, long j10) {
            this.iYear = i10;
            this.iFirstDayMillis = j10;
        }
    }

    static {
        DurationField durationField = MillisDurationField.INSTANCE;
        cMillisField = durationField;
        PreciseDurationField preciseDurationField = new PreciseDurationField(DurationFieldType.seconds(), 1000L);
        cSecondsField = preciseDurationField;
        PreciseDurationField preciseDurationField2 = new PreciseDurationField(DurationFieldType.minutes(), 60000L);
        cMinutesField = preciseDurationField2;
        PreciseDurationField preciseDurationField3 = new PreciseDurationField(DurationFieldType.hours(), 3600000L);
        cHoursField = preciseDurationField3;
        PreciseDurationField preciseDurationField4 = new PreciseDurationField(DurationFieldType.halfdays(), 43200000L);
        cHalfdaysField = preciseDurationField4;
        PreciseDurationField preciseDurationField5 = new PreciseDurationField(DurationFieldType.days(), 86400000L);
        cDaysField = preciseDurationField5;
        cWeeksField = new PreciseDurationField(DurationFieldType.weeks(), CoreConstants.MILLIS_IN_ONE_WEEK);
        cMillisOfSecondField = new PreciseDateTimeField(DateTimeFieldType.millisOfSecond(), durationField, preciseDurationField);
        cMillisOfDayField = new PreciseDateTimeField(DateTimeFieldType.millisOfDay(), durationField, preciseDurationField5);
        cSecondOfMinuteField = new PreciseDateTimeField(DateTimeFieldType.secondOfMinute(), preciseDurationField, preciseDurationField2);
        cSecondOfDayField = new PreciseDateTimeField(DateTimeFieldType.secondOfDay(), preciseDurationField, preciseDurationField5);
        cMinuteOfHourField = new PreciseDateTimeField(DateTimeFieldType.minuteOfHour(), preciseDurationField2, preciseDurationField3);
        cMinuteOfDayField = new PreciseDateTimeField(DateTimeFieldType.minuteOfDay(), preciseDurationField2, preciseDurationField5);
        PreciseDateTimeField preciseDateTimeField = new PreciseDateTimeField(DateTimeFieldType.hourOfDay(), preciseDurationField3, preciseDurationField5);
        cHourOfDayField = preciseDateTimeField;
        PreciseDateTimeField preciseDateTimeField2 = new PreciseDateTimeField(DateTimeFieldType.hourOfHalfday(), preciseDurationField3, preciseDurationField4);
        cHourOfHalfdayField = preciseDateTimeField2;
        cClockhourOfDayField = new ZeroIsMaxDateTimeField(preciseDateTimeField, DateTimeFieldType.clockhourOfDay());
        cClockhourOfHalfdayField = new ZeroIsMaxDateTimeField(preciseDateTimeField2, DateTimeFieldType.clockhourOfHalfday());
        cHalfdayOfDayField = new HalfdayField();
    }

    public BasicChronology(Chronology chronology, Object obj, int i10) {
        super(chronology, obj);
        this.iYearInfoCache = new YearInfo[1024];
        if (i10 < 1 || i10 > 7) {
            throw new IllegalArgumentException(a.a("Invalid min days in first week: ", i10));
        }
        this.iMinDaysInFirstWeek = i10;
    }

    private long getDateTimeMillis0(int i10, int i11, int i12, int i13) {
        long dateMidnightMillis = getDateMidnightMillis(i10, i11, i12);
        if (dateMidnightMillis == Long.MIN_VALUE) {
            dateMidnightMillis = getDateMidnightMillis(i10, i11, i12 + 1);
            i13 -= DateTimeConstants.MILLIS_PER_DAY;
        }
        long j10 = ((long) i13) + dateMidnightMillis;
        if (j10 < 0 && dateMidnightMillis > 0) {
            return RecyclerView.FOREVER_NS;
        }
        if (j10 <= 0 || dateMidnightMillis >= 0) {
            return j10;
        }
        return Long.MIN_VALUE;
    }

    private YearInfo getYearInfo(int i10) {
        YearInfo[] yearInfoArr = this.iYearInfoCache;
        int i11 = i10 & CACHE_MASK;
        YearInfo yearInfo = yearInfoArr[i11];
        if (yearInfo != null && yearInfo.iYear == i10) {
            return yearInfo;
        }
        YearInfo yearInfo2 = new YearInfo(i10, calculateFirstDayOfYearMillis(i10));
        this.iYearInfoCache[i11] = yearInfo2;
        return yearInfo2;
    }

    @Override // org.joda.time.chrono.AssembledChronology
    public void assemble(AssembledChronology.Fields fields) {
        fields.millis = cMillisField;
        fields.seconds = cSecondsField;
        fields.minutes = cMinutesField;
        fields.hours = cHoursField;
        fields.halfdays = cHalfdaysField;
        fields.days = cDaysField;
        fields.weeks = cWeeksField;
        fields.millisOfSecond = cMillisOfSecondField;
        fields.millisOfDay = cMillisOfDayField;
        fields.secondOfMinute = cSecondOfMinuteField;
        fields.secondOfDay = cSecondOfDayField;
        fields.minuteOfHour = cMinuteOfHourField;
        fields.minuteOfDay = cMinuteOfDayField;
        fields.hourOfDay = cHourOfDayField;
        fields.hourOfHalfday = cHourOfHalfdayField;
        fields.clockhourOfDay = cClockhourOfDayField;
        fields.clockhourOfHalfday = cClockhourOfHalfdayField;
        fields.halfdayOfDay = cHalfdayOfDayField;
        BasicYearDateTimeField basicYearDateTimeField = new BasicYearDateTimeField(this);
        fields.year = basicYearDateTimeField;
        GJYearOfEraDateTimeField gJYearOfEraDateTimeField = new GJYearOfEraDateTimeField(basicYearDateTimeField, this);
        fields.yearOfEra = gJYearOfEraDateTimeField;
        DividedDateTimeField dividedDateTimeField = new DividedDateTimeField(new OffsetDateTimeField(gJYearOfEraDateTimeField, 99), DateTimeFieldType.centuryOfEra(), 100);
        fields.centuryOfEra = dividedDateTimeField;
        fields.centuries = dividedDateTimeField.getDurationField();
        fields.yearOfCentury = new OffsetDateTimeField(new RemainderDateTimeField((DividedDateTimeField) fields.centuryOfEra), DateTimeFieldType.yearOfCentury(), 1);
        fields.era = new GJEraDateTimeField(this);
        fields.dayOfWeek = new GJDayOfWeekDateTimeField(this, fields.days);
        fields.dayOfMonth = new BasicDayOfMonthDateTimeField(this, fields.days);
        fields.dayOfYear = new BasicDayOfYearDateTimeField(this, fields.days);
        fields.monthOfYear = new GJMonthOfYearDateTimeField(this);
        fields.weekyear = new BasicWeekyearDateTimeField(this);
        fields.weekOfWeekyear = new BasicWeekOfWeekyearDateTimeField(this, fields.weeks);
        fields.weekyearOfCentury = new OffsetDateTimeField(new RemainderDateTimeField(fields.weekyear, fields.centuries, DateTimeFieldType.weekyearOfCentury(), 100), DateTimeFieldType.weekyearOfCentury(), 1);
        fields.years = fields.year.getDurationField();
        fields.months = fields.monthOfYear.getDurationField();
        fields.weekyears = fields.weekyear.getDurationField();
    }

    public abstract long calculateFirstDayOfYearMillis(int i10);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BasicChronology basicChronology = (BasicChronology) obj;
        return getMinimumDaysInFirstWeek() == basicChronology.getMinimumDaysInFirstWeek() && getZone().equals(basicChronology.getZone());
    }

    public abstract long getApproxMillisAtEpochDividedByTwo();

    public abstract long getAverageMillisPerMonth();

    public abstract long getAverageMillisPerYear();

    public abstract long getAverageMillisPerYearDividedByTwo();

    public long getDateMidnightMillis(int i10, int i11, int i12) {
        FieldUtils.verifyValueBounds(DateTimeFieldType.year(), i10, getMinYear() - 1, getMaxYear() + 1);
        FieldUtils.verifyValueBounds(DateTimeFieldType.monthOfYear(), i11, 1, getMaxMonth(i10));
        FieldUtils.verifyValueBounds(DateTimeFieldType.dayOfMonth(), i12, 1, getDaysInYearMonth(i10, i11));
        long yearMonthDayMillis = getYearMonthDayMillis(i10, i11, i12);
        if (yearMonthDayMillis < 0 && i10 == getMaxYear() + 1) {
            return RecyclerView.FOREVER_NS;
        }
        if (yearMonthDayMillis <= 0 || i10 != getMinYear() - 1) {
            return yearMonthDayMillis;
        }
        return Long.MIN_VALUE;
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public long getDateTimeMillis(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        Chronology base = getBase();
        if (base != null) {
            return base.getDateTimeMillis(i10, i11, i12, i13);
        }
        FieldUtils.verifyValueBounds(DateTimeFieldType.millisOfDay(), i13, 0, 86399999);
        return getDateTimeMillis0(i10, i11, i12, i13);
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public long getDateTimeMillis(int i10, int i11, int i12, int i13, int i14, int i15, int i16) throws IllegalArgumentException {
        Chronology base = getBase();
        if (base != null) {
            return base.getDateTimeMillis(i10, i11, i12, i13, i14, i15, i16);
        }
        FieldUtils.verifyValueBounds(DateTimeFieldType.hourOfDay(), i13, 0, 23);
        FieldUtils.verifyValueBounds(DateTimeFieldType.minuteOfHour(), i14, 0, 59);
        FieldUtils.verifyValueBounds(DateTimeFieldType.secondOfMinute(), i15, 0, 59);
        FieldUtils.verifyValueBounds(DateTimeFieldType.millisOfSecond(), i16, 0, g.MAX_BIND_PARAMETER_CNT);
        return getDateTimeMillis0(i10, i11, i12, (i15 * 1000) + (i14 * DateTimeConstants.MILLIS_PER_MINUTE) + (i13 * DateTimeConstants.MILLIS_PER_HOUR) + i16);
    }

    public int getDayOfMonth(long j10) {
        int year = getYear(j10);
        return getDayOfMonth(j10, year, getMonthOfYear(j10, year));
    }

    public int getDayOfMonth(long j10, int i10) {
        return getDayOfMonth(j10, i10, getMonthOfYear(j10, i10));
    }

    public int getDayOfMonth(long j10, int i10, int i11) {
        return ((int) ((j10 - (getYearMillis(i10) + getTotalMillisByYearMonth(i10, i11))) / 86400000)) + 1;
    }

    public int getDayOfWeek(long j10) {
        long j11;
        if (j10 >= 0) {
            j11 = j10 / 86400000;
        } else {
            j11 = (j10 - 86399999) / 86400000;
            if (j11 < -3) {
                return ((int) ((j11 + 4) % 7)) + 7;
            }
        }
        return ((int) ((j11 + 3) % 7)) + 1;
    }

    public int getDayOfYear(long j10) {
        return getDayOfYear(j10, getYear(j10));
    }

    public int getDayOfYear(long j10, int i10) {
        return ((int) ((j10 - getYearMillis(i10)) / 86400000)) + 1;
    }

    public int getDaysInMonthMax() {
        return 31;
    }

    public abstract int getDaysInMonthMax(int i10);

    public int getDaysInMonthMax(long j10) {
        int year = getYear(j10);
        return getDaysInYearMonth(year, getMonthOfYear(j10, year));
    }

    public int getDaysInMonthMaxForSet(long j10, int i10) {
        return getDaysInMonthMax(j10);
    }

    public int getDaysInYear(int i10) {
        return isLeapYear(i10) ? 366 : 365;
    }

    public int getDaysInYearMax() {
        return 366;
    }

    public abstract int getDaysInYearMonth(int i10, int i11);

    public long getFirstWeekOfYearMillis(int i10) {
        long yearMillis = getYearMillis(i10);
        int dayOfWeek = getDayOfWeek(yearMillis);
        return dayOfWeek > 8 - this.iMinDaysInFirstWeek ? (((long) (8 - dayOfWeek)) * 86400000) + yearMillis : yearMillis - (((long) (dayOfWeek - 1)) * 86400000);
    }

    public int getMaxMonth() {
        return 12;
    }

    public int getMaxMonth(int i10) {
        return getMaxMonth();
    }

    public abstract int getMaxYear();

    public int getMillisOfDay(long j10) {
        return j10 >= 0 ? (int) (j10 % 86400000) : ((int) ((j10 + 1) % 86400000)) + 86399999;
    }

    public abstract int getMinYear();

    public int getMinimumDaysInFirstWeek() {
        return this.iMinDaysInFirstWeek;
    }

    public int getMonthOfYear(long j10) {
        return getMonthOfYear(j10, getYear(j10));
    }

    public abstract int getMonthOfYear(long j10, int i10);

    public abstract long getTotalMillisByYearMonth(int i10, int i11);

    public int getWeekOfWeekyear(long j10) {
        return getWeekOfWeekyear(j10, getYear(j10));
    }

    public int getWeekOfWeekyear(long j10, int i10) {
        long firstWeekOfYearMillis = getFirstWeekOfYearMillis(i10);
        if (j10 < firstWeekOfYearMillis) {
            return getWeeksInYear(i10 - 1);
        }
        if (j10 >= getFirstWeekOfYearMillis(i10 + 1)) {
            return 1;
        }
        return ((int) ((j10 - firstWeekOfYearMillis) / CoreConstants.MILLIS_IN_ONE_WEEK)) + 1;
    }

    public int getWeeksInYear(int i10) {
        return (int) ((getFirstWeekOfYearMillis(i10 + 1) - getFirstWeekOfYearMillis(i10)) / CoreConstants.MILLIS_IN_ONE_WEEK);
    }

    public int getWeekyear(long j10) {
        long j11;
        int year = getYear(j10);
        int weekOfWeekyear = getWeekOfWeekyear(j10, year);
        if (weekOfWeekyear == 1) {
            j11 = j10 + CoreConstants.MILLIS_IN_ONE_WEEK;
        } else {
            if (weekOfWeekyear <= 51) {
                return year;
            }
            j11 = j10 - 1209600000;
        }
        return getYear(j11);
    }

    public int getYear(long j10) {
        long averageMillisPerYearDividedByTwo = getAverageMillisPerYearDividedByTwo();
        long approxMillisAtEpochDividedByTwo = (j10 >> 1) + getApproxMillisAtEpochDividedByTwo();
        if (approxMillisAtEpochDividedByTwo < 0) {
            approxMillisAtEpochDividedByTwo = (approxMillisAtEpochDividedByTwo - averageMillisPerYearDividedByTwo) + 1;
        }
        int i10 = (int) (approxMillisAtEpochDividedByTwo / averageMillisPerYearDividedByTwo);
        long yearMillis = getYearMillis(i10);
        long j11 = j10 - yearMillis;
        if (j11 < 0) {
            return i10 - 1;
        }
        if (j11 >= 31536000000L) {
            return yearMillis + (isLeapYear(i10) ? 31622400000L : 31536000000L) <= j10 ? i10 + 1 : i10;
        }
        return i10;
    }

    public abstract long getYearDifference(long j10, long j11);

    public long getYearMillis(int i10) {
        return getYearInfo(i10).iFirstDayMillis;
    }

    public long getYearMonthDayMillis(int i10, int i11, int i12) {
        return (((long) (i12 - 1)) * 86400000) + getYearMillis(i10) + getTotalMillisByYearMonth(i10, i11);
    }

    public long getYearMonthMillis(int i10, int i11) {
        return getYearMillis(i10) + getTotalMillisByYearMonth(i10, i11);
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public DateTimeZone getZone() {
        Chronology base = getBase();
        return base != null ? base.getZone() : DateTimeZone.UTC;
    }

    public int hashCode() {
        return getZone().hashCode() + (getClass().getName().hashCode() * 11) + getMinimumDaysInFirstWeek();
    }

    public boolean isLeapDay(long j10) {
        return false;
    }

    public abstract boolean isLeapYear(int i10);

    public abstract long setYear(long j10, int i10);

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public String toString() {
        StringBuilder sb2 = new StringBuilder(60);
        String name = getClass().getName();
        int iLastIndexOf = name.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            name = name.substring(iLastIndexOf + 1);
        }
        sb2.append(name);
        sb2.append('[');
        DateTimeZone zone = getZone();
        if (zone != null) {
            sb2.append(zone.getID());
        }
        if (getMinimumDaysInFirstWeek() != 4) {
            sb2.append(",mdfw=");
            sb2.append(getMinimumDaysInFirstWeek());
        }
        sb2.append(']');
        return sb2.toString();
    }
}
