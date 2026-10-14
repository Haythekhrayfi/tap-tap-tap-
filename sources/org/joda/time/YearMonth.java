package org.joda.time;

import android.support.v4.media.a;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BasePartial;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.AbstractPartialFieldProperty;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/* JADX INFO: loaded from: classes3.dex */
public final class YearMonth extends BasePartial {
    private static final DateTimeFieldType[] FIELD_TYPES = {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear()};
    public static final int MONTH_OF_YEAR = 1;
    public static final int YEAR = 0;
    private static final long serialVersionUID = 797544782896179L;

    public static class Property extends AbstractPartialFieldProperty implements Serializable {
        private static final long serialVersionUID = 5727734012190224363L;
        private final YearMonth iBase;
        private final int iFieldIndex;

        public Property(YearMonth yearMonth, int i10) {
            this.iBase = yearMonth;
            this.iFieldIndex = i10;
        }

        public YearMonth addToCopy(int i10) {
            return new YearMonth(this.iBase, getField().add(this.iBase, this.iFieldIndex, this.iBase.getValues(), i10));
        }

        public YearMonth addWrapFieldToCopy(int i10) {
            return new YearMonth(this.iBase, getField().addWrapField(this.iBase, this.iFieldIndex, this.iBase.getValues(), i10));
        }

        @Override // org.joda.time.field.AbstractPartialFieldProperty
        public int get() {
            return this.iBase.getValue(this.iFieldIndex);
        }

        @Override // org.joda.time.field.AbstractPartialFieldProperty
        public DateTimeField getField() {
            return this.iBase.getField(this.iFieldIndex);
        }

        @Override // org.joda.time.field.AbstractPartialFieldProperty
        public ReadablePartial getReadablePartial() {
            return this.iBase;
        }

        public YearMonth getYearMonth() {
            return this.iBase;
        }

        public YearMonth setCopy(int i10) {
            return new YearMonth(this.iBase, getField().set(this.iBase, this.iFieldIndex, this.iBase.getValues(), i10));
        }

        public YearMonth setCopy(String str) {
            return setCopy(str, null);
        }

        public YearMonth setCopy(String str, Locale locale) {
            return new YearMonth(this.iBase, getField().set(this.iBase, this.iFieldIndex, this.iBase.getValues(), str, locale));
        }
    }

    public YearMonth() {
    }

    public YearMonth(int i10, int i11) {
        this(i10, i11, null);
    }

    public YearMonth(int i10, int i11, Chronology chronology) {
        super(new int[]{i10, i11}, chronology);
    }

    public YearMonth(long j10) {
        super(j10);
    }

    public YearMonth(long j10, Chronology chronology) {
        super(j10, chronology);
    }

    public YearMonth(Object obj) {
        super(obj, null, ISODateTimeFormat.localDateParser());
    }

    public YearMonth(Object obj, Chronology chronology) {
        super(obj, DateTimeUtils.getChronology(chronology), ISODateTimeFormat.localDateParser());
    }

    public YearMonth(Chronology chronology) {
        super(chronology);
    }

    public YearMonth(DateTimeZone dateTimeZone) {
        super(ISOChronology.getInstance(dateTimeZone));
    }

    public YearMonth(YearMonth yearMonth, Chronology chronology) {
        super((BasePartial) yearMonth, chronology);
    }

    public YearMonth(YearMonth yearMonth, int[] iArr) {
        super(yearMonth, iArr);
    }

    public static YearMonth fromCalendarFields(Calendar calendar) {
        if (calendar != null) {
            return new YearMonth(calendar.get(1), calendar.get(2) + 1);
        }
        throw new IllegalArgumentException("The calendar must not be null");
    }

    public static YearMonth fromDateFields(Date date) {
        if (date != null) {
            return new YearMonth(date.getYear() + 1900, date.getMonth() + 1);
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    public static YearMonth now() {
        return new YearMonth();
    }

    public static YearMonth now(Chronology chronology) {
        Objects.requireNonNull(chronology, "Chronology must not be null");
        return new YearMonth(chronology);
    }

    public static YearMonth now(DateTimeZone dateTimeZone) {
        Objects.requireNonNull(dateTimeZone, "Zone must not be null");
        return new YearMonth(dateTimeZone);
    }

    @FromString
    public static YearMonth parse(String str) {
        return parse(str, ISODateTimeFormat.localDateParser());
    }

    public static YearMonth parse(String str, DateTimeFormatter dateTimeFormatter) {
        LocalDate localDate = dateTimeFormatter.parseLocalDate(str);
        return new YearMonth(localDate.getYear(), localDate.getMonthOfYear());
    }

    private Object readResolve() {
        return !DateTimeZone.UTC.equals(getChronology().getZone()) ? new YearMonth(this, getChronology().withUTC()) : this;
    }

    @Override // org.joda.time.base.AbstractPartial
    public DateTimeField getField(int i10, Chronology chronology) {
        if (i10 == 0) {
            return chronology.year();
        }
        if (i10 == 1) {
            return chronology.monthOfYear();
        }
        throw new IndexOutOfBoundsException(a.a("Invalid index: ", i10));
    }

    @Override // org.joda.time.base.AbstractPartial, org.joda.time.ReadablePartial
    public DateTimeFieldType getFieldType(int i10) {
        return FIELD_TYPES[i10];
    }

    @Override // org.joda.time.base.AbstractPartial
    public DateTimeFieldType[] getFieldTypes() {
        return (DateTimeFieldType[]) FIELD_TYPES.clone();
    }

    public int getMonthOfYear() {
        return getValue(1);
    }

    public int getYear() {
        return getValue(0);
    }

    public YearMonth minus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, -1);
    }

    public YearMonth minusMonths(int i10) {
        return withFieldAdded(DurationFieldType.months(), FieldUtils.safeNegate(i10));
    }

    public YearMonth minusYears(int i10) {
        return withFieldAdded(DurationFieldType.years(), FieldUtils.safeNegate(i10));
    }

    public Property monthOfYear() {
        return new Property(this, 1);
    }

    public YearMonth plus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, 1);
    }

    public YearMonth plusMonths(int i10) {
        return withFieldAdded(DurationFieldType.months(), i10);
    }

    public YearMonth plusYears(int i10) {
        return withFieldAdded(DurationFieldType.years(), i10);
    }

    public Property property(DateTimeFieldType dateTimeFieldType) {
        return new Property(this, indexOfSupported(dateTimeFieldType));
    }

    @Override // org.joda.time.ReadablePartial
    public int size() {
        return 2;
    }

    public Interval toInterval() {
        return toInterval(null);
    }

    public Interval toInterval(DateTimeZone dateTimeZone) {
        DateTimeZone zone = DateTimeUtils.getZone(dateTimeZone);
        return new Interval(toLocalDate(1).toDateTimeAtStartOfDay(zone), plusMonths(1).toLocalDate(1).toDateTimeAtStartOfDay(zone));
    }

    public LocalDate toLocalDate(int i10) {
        return new LocalDate(getYear(), getMonthOfYear(), i10, getChronology());
    }

    @Override // org.joda.time.ReadablePartial
    @ToString
    public String toString() {
        return ISODateTimeFormat.yearMonth().print(this);
    }

    @Override // org.joda.time.base.BasePartial
    public String toString(String str) {
        return str == null ? toString() : DateTimeFormat.forPattern(str).print(this);
    }

    @Override // org.joda.time.base.BasePartial
    public String toString(String str, Locale locale) throws IllegalArgumentException {
        return str == null ? toString() : DateTimeFormat.forPattern(str).withLocale(locale).print(this);
    }

    public YearMonth withChronologyRetainFields(Chronology chronology) {
        Chronology chronologyWithUTC = DateTimeUtils.getChronology(chronology).withUTC();
        if (chronologyWithUTC == getChronology()) {
            return this;
        }
        YearMonth yearMonth = new YearMonth(this, chronologyWithUTC);
        chronologyWithUTC.validate(yearMonth, getValues());
        return yearMonth;
    }

    public YearMonth withField(DateTimeFieldType dateTimeFieldType, int i10) {
        int iIndexOfSupported = indexOfSupported(dateTimeFieldType);
        if (i10 == getValue(iIndexOfSupported)) {
            return this;
        }
        return new YearMonth(this, getField(iIndexOfSupported).set(this, iIndexOfSupported, getValues(), i10));
    }

    public YearMonth withFieldAdded(DurationFieldType durationFieldType, int i10) {
        int iIndexOfSupported = indexOfSupported(durationFieldType);
        if (i10 == 0) {
            return this;
        }
        return new YearMonth(this, getField(iIndexOfSupported).add(this, iIndexOfSupported, getValues(), i10));
    }

    public YearMonth withMonthOfYear(int i10) {
        return new YearMonth(this, getChronology().monthOfYear().set(this, 1, getValues(), i10));
    }

    public YearMonth withPeriodAdded(ReadablePeriod readablePeriod, int i10) {
        if (readablePeriod == null || i10 == 0) {
            return this;
        }
        int[] values = getValues();
        for (int i11 = 0; i11 < readablePeriod.size(); i11++) {
            int iIndexOf = indexOf(readablePeriod.getFieldType(i11));
            if (iIndexOf >= 0) {
                values = getField(iIndexOf).add(this, iIndexOf, values, FieldUtils.safeMultiply(readablePeriod.getValue(i11), i10));
            }
        }
        return new YearMonth(this, values);
    }

    public YearMonth withYear(int i10) {
        return new YearMonth(this, getChronology().year().set(this, 0, getValues(), i10));
    }

    public Property year() {
        return new Property(this, 0);
    }
}
