package org.joda.time;

import androidx.activity.j;
import ch.qos.logback.core.CoreConstants;
import defpackage.a;
import org.joda.convert.FromString;
import org.joda.time.base.BasePeriod;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

/* JADX INFO: loaded from: classes3.dex */
public final class Period extends BasePeriod {
    public static final Period ZERO = new Period();
    private static final long serialVersionUID = 741052353876488155L;

    public Period() {
        super(0L, (PeriodType) null, (Chronology) null);
    }

    public Period(int i10, int i11, int i12, int i13) {
        super(0, 0, 0, 0, i10, i11, i12, i13, PeriodType.standard());
    }

    public Period(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        super(i10, i11, i12, i13, i14, i15, i16, i17, PeriodType.standard());
    }

    public Period(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, PeriodType periodType) {
        super(i10, i11, i12, i13, i14, i15, i16, i17, periodType);
    }

    public Period(long j10) {
        super(j10);
    }

    public Period(long j10, long j11) {
        super(j10, j11, null, null);
    }

    public Period(long j10, long j11, Chronology chronology) {
        super(j10, j11, null, chronology);
    }

    public Period(long j10, long j11, PeriodType periodType) {
        super(j10, j11, periodType, null);
    }

    public Period(long j10, long j11, PeriodType periodType, Chronology chronology) {
        super(j10, j11, periodType, chronology);
    }

    public Period(long j10, Chronology chronology) {
        super(j10, (PeriodType) null, chronology);
    }

    public Period(long j10, PeriodType periodType) {
        super(j10, periodType, (Chronology) null);
    }

    public Period(long j10, PeriodType periodType, Chronology chronology) {
        super(j10, periodType, chronology);
    }

    public Period(Object obj) {
        super(obj, (PeriodType) null, (Chronology) null);
    }

    public Period(Object obj, Chronology chronology) {
        super(obj, (PeriodType) null, chronology);
    }

    public Period(Object obj, PeriodType periodType) {
        super(obj, periodType, (Chronology) null);
    }

    public Period(Object obj, PeriodType periodType, Chronology chronology) {
        super(obj, periodType, chronology);
    }

    public Period(ReadableDuration readableDuration, ReadableInstant readableInstant) {
        super(readableDuration, readableInstant, (PeriodType) null);
    }

    public Period(ReadableDuration readableDuration, ReadableInstant readableInstant, PeriodType periodType) {
        super(readableDuration, readableInstant, periodType);
    }

    public Period(ReadableInstant readableInstant, ReadableDuration readableDuration) {
        super(readableInstant, readableDuration, (PeriodType) null);
    }

    public Period(ReadableInstant readableInstant, ReadableDuration readableDuration, PeriodType periodType) {
        super(readableInstant, readableDuration, periodType);
    }

    public Period(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        super(readableInstant, readableInstant2, (PeriodType) null);
    }

    public Period(ReadableInstant readableInstant, ReadableInstant readableInstant2, PeriodType periodType) {
        super(readableInstant, readableInstant2, periodType);
    }

    public Period(ReadablePartial readablePartial, ReadablePartial readablePartial2) {
        super(readablePartial, readablePartial2, (PeriodType) null);
    }

    public Period(ReadablePartial readablePartial, ReadablePartial readablePartial2, PeriodType periodType) {
        super(readablePartial, readablePartial2, periodType);
    }

    private Period(int[] iArr, PeriodType periodType) {
        super(iArr, periodType);
    }

    private void checkYearsAndMonths(String str) {
        if (getMonths() != 0) {
            throw new UnsupportedOperationException(j.a("Cannot convert to ", str, " as this period contains months and months vary in length"));
        }
        if (getYears() != 0) {
            throw new UnsupportedOperationException(j.a("Cannot convert to ", str, " as this period contains years and years vary in length"));
        }
    }

    public static Period days(int i10) {
        return new Period(new int[]{0, 0, 0, i10, 0, 0, 0, 0}, PeriodType.standard());
    }

    public static Period fieldDifference(ReadablePartial readablePartial, ReadablePartial readablePartial2) {
        if (readablePartial == null || readablePartial2 == null) {
            throw new IllegalArgumentException("ReadablePartial objects must not be null");
        }
        if (readablePartial.size() != readablePartial2.size()) {
            throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
        }
        DurationFieldType[] durationFieldTypeArr = new DurationFieldType[readablePartial.size()];
        int[] iArr = new int[readablePartial.size()];
        int size = readablePartial.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (readablePartial.getFieldType(i10) != readablePartial2.getFieldType(i10)) {
                throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
            }
            durationFieldTypeArr[i10] = readablePartial.getFieldType(i10).getDurationType();
            if (i10 > 0 && durationFieldTypeArr[i10 - 1] == durationFieldTypeArr[i10]) {
                throw new IllegalArgumentException("ReadablePartial objects must not have overlapping fields");
            }
            iArr[i10] = readablePartial2.getValue(i10) - readablePartial.getValue(i10);
        }
        return new Period(iArr, PeriodType.forFields(durationFieldTypeArr));
    }

    public static Period hours(int i10) {
        return new Period(new int[]{0, 0, 0, 0, i10, 0, 0, 0}, PeriodType.standard());
    }

    public static Period millis(int i10) {
        return new Period(new int[]{0, 0, 0, 0, 0, 0, 0, i10}, PeriodType.standard());
    }

    public static Period minutes(int i10) {
        return new Period(new int[]{0, 0, 0, 0, 0, i10, 0, 0}, PeriodType.standard());
    }

    public static Period months(int i10) {
        return new Period(new int[]{0, i10, 0, 0, 0, 0, 0, 0}, PeriodType.standard());
    }

    @FromString
    public static Period parse(String str) {
        return parse(str, ISOPeriodFormat.standard());
    }

    public static Period parse(String str, PeriodFormatter periodFormatter) {
        return periodFormatter.parsePeriod(str);
    }

    public static Period seconds(int i10) {
        return new Period(new int[]{0, 0, 0, 0, 0, 0, i10, 0}, PeriodType.standard());
    }

    public static Period weeks(int i10) {
        return new Period(new int[]{0, 0, i10, 0, 0, 0, 0, 0}, PeriodType.standard());
    }

    public static Period years(int i10) {
        return new Period(new int[]{i10, 0, 0, 0, 0, 0, 0, 0, 0}, PeriodType.standard());
    }

    public int getDays() {
        return getPeriodType().getIndexedField(this, PeriodType.DAY_INDEX);
    }

    public int getHours() {
        return getPeriodType().getIndexedField(this, PeriodType.HOUR_INDEX);
    }

    public int getMillis() {
        return getPeriodType().getIndexedField(this, PeriodType.MILLI_INDEX);
    }

    public int getMinutes() {
        return getPeriodType().getIndexedField(this, PeriodType.MINUTE_INDEX);
    }

    public int getMonths() {
        return getPeriodType().getIndexedField(this, PeriodType.MONTH_INDEX);
    }

    public int getSeconds() {
        return getPeriodType().getIndexedField(this, PeriodType.SECOND_INDEX);
    }

    public int getWeeks() {
        return getPeriodType().getIndexedField(this, PeriodType.WEEK_INDEX);
    }

    public int getYears() {
        return getPeriodType().getIndexedField(this, PeriodType.YEAR_INDEX);
    }

    public Period minus(ReadablePeriod readablePeriod) {
        if (readablePeriod == null) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.YEAR_INDEX, values, -readablePeriod.get(DurationFieldType.YEARS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.MONTH_INDEX, values, -readablePeriod.get(DurationFieldType.MONTHS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.WEEK_INDEX, values, -readablePeriod.get(DurationFieldType.WEEKS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.DAY_INDEX, values, -readablePeriod.get(DurationFieldType.DAYS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.HOUR_INDEX, values, -readablePeriod.get(DurationFieldType.HOURS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.MINUTE_INDEX, values, -readablePeriod.get(DurationFieldType.MINUTES_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.SECOND_INDEX, values, -readablePeriod.get(DurationFieldType.SECONDS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.MILLI_INDEX, values, -readablePeriod.get(DurationFieldType.MILLIS_TYPE));
        return new Period(values, getPeriodType());
    }

    public Period minusDays(int i10) {
        return plusDays(-i10);
    }

    public Period minusHours(int i10) {
        return plusHours(-i10);
    }

    public Period minusMillis(int i10) {
        return plusMillis(-i10);
    }

    public Period minusMinutes(int i10) {
        return plusMinutes(-i10);
    }

    public Period minusMonths(int i10) {
        return plusMonths(-i10);
    }

    public Period minusSeconds(int i10) {
        return plusSeconds(-i10);
    }

    public Period minusWeeks(int i10) {
        return plusWeeks(-i10);
    }

    public Period minusYears(int i10) {
        return plusYears(-i10);
    }

    public Period multipliedBy(int i10) {
        if (this == ZERO || i10 == 1) {
            return this;
        }
        int[] values = getValues();
        for (int i11 = 0; i11 < values.length; i11++) {
            values[i11] = FieldUtils.safeMultiply(values[i11], i10);
        }
        return new Period(values, getPeriodType());
    }

    public Period negated() {
        return multipliedBy(-1);
    }

    public Period normalizedStandard() {
        return normalizedStandard(PeriodType.standard());
    }

    public Period normalizedStandard(PeriodType periodType) {
        PeriodType periodType2 = DateTimeUtils.getPeriodType(periodType);
        Period period = new Period((((long) getWeeks()) * CoreConstants.MILLIS_IN_ONE_WEEK) + (((long) getDays()) * 86400000) + (((long) getHours()) * 3600000) + (((long) getMinutes()) * 60000) + (((long) getSeconds()) * 1000) + ((long) getMillis()), periodType2, ISOChronology.getInstanceUTC());
        int years = getYears();
        int months = getMonths();
        if (years != 0 || months != 0) {
            long j10 = (((long) years) * 12) + ((long) months);
            if (periodType2.isSupported(DurationFieldType.YEARS_TYPE)) {
                int iSafeToInt = FieldUtils.safeToInt(j10 / 12);
                period = period.withYears(iSafeToInt);
                j10 -= (long) (iSafeToInt * 12);
            }
            if (periodType2.isSupported(DurationFieldType.MONTHS_TYPE)) {
                int iSafeToInt2 = FieldUtils.safeToInt(j10);
                period = period.withMonths(iSafeToInt2);
                j10 -= (long) iSafeToInt2;
            }
            if (j10 != 0) {
                StringBuilder sbA = a.a("Unable to normalize as PeriodType is missing either years or months but period has a month/year amount: ");
                sbA.append(toString());
                throw new UnsupportedOperationException(sbA.toString());
            }
        }
        return period;
    }

    public Period plus(ReadablePeriod readablePeriod) {
        if (readablePeriod == null) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.YEAR_INDEX, values, readablePeriod.get(DurationFieldType.YEARS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.MONTH_INDEX, values, readablePeriod.get(DurationFieldType.MONTHS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.WEEK_INDEX, values, readablePeriod.get(DurationFieldType.WEEKS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.DAY_INDEX, values, readablePeriod.get(DurationFieldType.DAYS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.HOUR_INDEX, values, readablePeriod.get(DurationFieldType.HOURS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.MINUTE_INDEX, values, readablePeriod.get(DurationFieldType.MINUTES_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.SECOND_INDEX, values, readablePeriod.get(DurationFieldType.SECONDS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.MILLI_INDEX, values, readablePeriod.get(DurationFieldType.MILLIS_TYPE));
        return new Period(values, getPeriodType());
    }

    public Period plusDays(int i10) {
        if (i10 == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.DAY_INDEX, values, i10);
        return new Period(values, getPeriodType());
    }

    public Period plusHours(int i10) {
        if (i10 == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.HOUR_INDEX, values, i10);
        return new Period(values, getPeriodType());
    }

    public Period plusMillis(int i10) {
        if (i10 == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.MILLI_INDEX, values, i10);
        return new Period(values, getPeriodType());
    }

    public Period plusMinutes(int i10) {
        if (i10 == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.MINUTE_INDEX, values, i10);
        return new Period(values, getPeriodType());
    }

    public Period plusMonths(int i10) {
        if (i10 == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.MONTH_INDEX, values, i10);
        return new Period(values, getPeriodType());
    }

    public Period plusSeconds(int i10) {
        if (i10 == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.SECOND_INDEX, values, i10);
        return new Period(values, getPeriodType());
    }

    public Period plusWeeks(int i10) {
        if (i10 == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.WEEK_INDEX, values, i10);
        return new Period(values, getPeriodType());
    }

    public Period plusYears(int i10) {
        if (i10 == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.YEAR_INDEX, values, i10);
        return new Period(values, getPeriodType());
    }

    @Override // org.joda.time.base.AbstractPeriod, org.joda.time.ReadablePeriod
    public Period toPeriod() {
        return this;
    }

    public Days toStandardDays() {
        checkYearsAndMonths("Days");
        return Days.days(FieldUtils.safeToInt(FieldUtils.safeAdd(FieldUtils.safeAdd(((((long) getHours()) * 3600000) + ((((long) getMinutes()) * 60000) + ((((long) getSeconds()) * 1000) + ((long) getMillis())))) / 86400000, getDays()), ((long) getWeeks()) * 7)));
    }

    public Duration toStandardDuration() {
        checkYearsAndMonths("Duration");
        return new Duration((((long) getWeeks()) * CoreConstants.MILLIS_IN_ONE_WEEK) + (((long) getDays()) * 86400000) + (((long) getHours()) * 3600000) + (((long) getMinutes()) * 60000) + (((long) getSeconds()) * 1000) + ((long) getMillis()));
    }

    public Hours toStandardHours() {
        checkYearsAndMonths("Hours");
        return Hours.hours(FieldUtils.safeToInt(FieldUtils.safeAdd(FieldUtils.safeAdd(FieldUtils.safeAdd(((((long) getMinutes()) * 60000) + ((((long) getSeconds()) * 1000) + ((long) getMillis()))) / 3600000, getHours()), ((long) getDays()) * 24), ((long) getWeeks()) * 168)));
    }

    public Minutes toStandardMinutes() {
        checkYearsAndMonths("Minutes");
        return Minutes.minutes(FieldUtils.safeToInt(FieldUtils.safeAdd(FieldUtils.safeAdd(FieldUtils.safeAdd(FieldUtils.safeAdd(((((long) getSeconds()) * 1000) + ((long) getMillis())) / 60000, getMinutes()), ((long) getHours()) * 60), ((long) getDays()) * 1440), ((long) getWeeks()) * 10080)));
    }

    public Seconds toStandardSeconds() {
        checkYearsAndMonths("Seconds");
        return Seconds.seconds(FieldUtils.safeToInt(FieldUtils.safeAdd(FieldUtils.safeAdd(FieldUtils.safeAdd(FieldUtils.safeAdd(FieldUtils.safeAdd(getMillis() / 1000, getSeconds()), ((long) getMinutes()) * 60), ((long) getHours()) * 3600), ((long) getDays()) * 86400), ((long) getWeeks()) * 604800)));
    }

    public Weeks toStandardWeeks() {
        checkYearsAndMonths("Weeks");
        long days = (((long) getDays()) * 86400000) + (((long) getHours()) * 3600000) + (((long) getMinutes()) * 60000) + (((long) getSeconds()) * 1000) + ((long) getMillis());
        return Weeks.weeks(FieldUtils.safeToInt((days / CoreConstants.MILLIS_IN_ONE_WEEK) + ((long) getWeeks())));
    }

    public Period withDays(int i10) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.DAY_INDEX, values, i10);
        return new Period(values, getPeriodType());
    }

    public Period withField(DurationFieldType durationFieldType, int i10) {
        if (durationFieldType == null) {
            throw new IllegalArgumentException("Field must not be null");
        }
        int[] values = getValues();
        super.setFieldInto(values, durationFieldType, i10);
        return new Period(values, getPeriodType());
    }

    public Period withFieldAdded(DurationFieldType durationFieldType, int i10) {
        if (durationFieldType == null) {
            throw new IllegalArgumentException("Field must not be null");
        }
        if (i10 == 0) {
            return this;
        }
        int[] values = getValues();
        super.addFieldInto(values, durationFieldType, i10);
        return new Period(values, getPeriodType());
    }

    public Period withFields(ReadablePeriod readablePeriod) {
        return readablePeriod == null ? this : new Period(super.mergePeriodInto(getValues(), readablePeriod), getPeriodType());
    }

    public Period withHours(int i10) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.HOUR_INDEX, values, i10);
        return new Period(values, getPeriodType());
    }

    public Period withMillis(int i10) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.MILLI_INDEX, values, i10);
        return new Period(values, getPeriodType());
    }

    public Period withMinutes(int i10) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.MINUTE_INDEX, values, i10);
        return new Period(values, getPeriodType());
    }

    public Period withMonths(int i10) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.MONTH_INDEX, values, i10);
        return new Period(values, getPeriodType());
    }

    public Period withPeriodType(PeriodType periodType) {
        PeriodType periodType2 = DateTimeUtils.getPeriodType(periodType);
        return periodType2.equals(getPeriodType()) ? this : new Period(this, periodType2);
    }

    public Period withSeconds(int i10) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.SECOND_INDEX, values, i10);
        return new Period(values, getPeriodType());
    }

    public Period withWeeks(int i10) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.WEEK_INDEX, values, i10);
        return new Period(values, getPeriodType());
    }

    public Period withYears(int i10) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.YEAR_INDEX, values, i10);
        return new Period(values, getPeriodType());
    }
}
