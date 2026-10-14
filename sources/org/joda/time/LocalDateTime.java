package org.joda.time;

import android.support.v4.media.a;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BaseLocal;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.PartialConverter;
import org.joda.time.field.AbstractReadableInstantFieldProperty;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/* JADX INFO: loaded from: classes3.dex */
public final class LocalDateTime extends BaseLocal implements Serializable {
    private static final int DAY_OF_MONTH = 2;
    private static final int MILLIS_OF_DAY = 3;
    private static final int MONTH_OF_YEAR = 1;
    private static final int YEAR = 0;
    private static final long serialVersionUID = -268716875315837168L;
    private final Chronology iChronology;
    private final long iLocalMillis;

    public static final class Property extends AbstractReadableInstantFieldProperty {
        private static final long serialVersionUID = -358138762846288L;
        private transient DateTimeField iField;
        private transient LocalDateTime iInstant;

        public Property(LocalDateTime localDateTime, DateTimeField dateTimeField) {
            this.iInstant = localDateTime;
            this.iField = dateTimeField;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            this.iInstant = (LocalDateTime) objectInputStream.readObject();
            this.iField = ((DateTimeFieldType) objectInputStream.readObject()).getField(this.iInstant.getChronology());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeObject(this.iInstant);
            objectOutputStream.writeObject(this.iField.getType());
        }

        public LocalDateTime addToCopy(int i10) {
            LocalDateTime localDateTime = this.iInstant;
            return localDateTime.withLocalMillis(this.iField.add(localDateTime.getLocalMillis(), i10));
        }

        public LocalDateTime addToCopy(long j10) {
            LocalDateTime localDateTime = this.iInstant;
            return localDateTime.withLocalMillis(this.iField.add(localDateTime.getLocalMillis(), j10));
        }

        public LocalDateTime addWrapFieldToCopy(int i10) {
            LocalDateTime localDateTime = this.iInstant;
            return localDateTime.withLocalMillis(this.iField.addWrapField(localDateTime.getLocalMillis(), i10));
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        public Chronology getChronology() {
            return this.iInstant.getChronology();
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        public DateTimeField getField() {
            return this.iField;
        }

        public LocalDateTime getLocalDateTime() {
            return this.iInstant;
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        public long getMillis() {
            return this.iInstant.getLocalMillis();
        }

        public LocalDateTime roundCeilingCopy() {
            LocalDateTime localDateTime = this.iInstant;
            return localDateTime.withLocalMillis(this.iField.roundCeiling(localDateTime.getLocalMillis()));
        }

        public LocalDateTime roundFloorCopy() {
            LocalDateTime localDateTime = this.iInstant;
            return localDateTime.withLocalMillis(this.iField.roundFloor(localDateTime.getLocalMillis()));
        }

        public LocalDateTime roundHalfCeilingCopy() {
            LocalDateTime localDateTime = this.iInstant;
            return localDateTime.withLocalMillis(this.iField.roundHalfCeiling(localDateTime.getLocalMillis()));
        }

        public LocalDateTime roundHalfEvenCopy() {
            LocalDateTime localDateTime = this.iInstant;
            return localDateTime.withLocalMillis(this.iField.roundHalfEven(localDateTime.getLocalMillis()));
        }

        public LocalDateTime roundHalfFloorCopy() {
            LocalDateTime localDateTime = this.iInstant;
            return localDateTime.withLocalMillis(this.iField.roundHalfFloor(localDateTime.getLocalMillis()));
        }

        public LocalDateTime setCopy(int i10) {
            LocalDateTime localDateTime = this.iInstant;
            return localDateTime.withLocalMillis(this.iField.set(localDateTime.getLocalMillis(), i10));
        }

        public LocalDateTime setCopy(String str) {
            return setCopy(str, null);
        }

        public LocalDateTime setCopy(String str, Locale locale) {
            LocalDateTime localDateTime = this.iInstant;
            return localDateTime.withLocalMillis(this.iField.set(localDateTime.getLocalMillis(), str, locale));
        }

        public LocalDateTime withMaximumValue() {
            return setCopy(getMaximumValue());
        }

        public LocalDateTime withMinimumValue() {
            return setCopy(getMinimumValue());
        }
    }

    public LocalDateTime() {
        this(DateTimeUtils.currentTimeMillis(), ISOChronology.getInstance());
    }

    public LocalDateTime(int i10, int i11, int i12, int i13, int i14) {
        this(i10, i11, i12, i13, i14, 0, 0, ISOChronology.getInstanceUTC());
    }

    public LocalDateTime(int i10, int i11, int i12, int i13, int i14, int i15) {
        this(i10, i11, i12, i13, i14, i15, 0, ISOChronology.getInstanceUTC());
    }

    public LocalDateTime(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this(i10, i11, i12, i13, i14, i15, i16, ISOChronology.getInstanceUTC());
    }

    public LocalDateTime(int i10, int i11, int i12, int i13, int i14, int i15, int i16, Chronology chronology) {
        Chronology chronologyWithUTC = DateTimeUtils.getChronology(chronology).withUTC();
        long dateTimeMillis = chronologyWithUTC.getDateTimeMillis(i10, i11, i12, i13, i14, i15, i16);
        this.iChronology = chronologyWithUTC;
        this.iLocalMillis = dateTimeMillis;
    }

    public LocalDateTime(long j10) {
        this(j10, ISOChronology.getInstance());
    }

    public LocalDateTime(long j10, Chronology chronology) {
        Chronology chronology2 = DateTimeUtils.getChronology(chronology);
        this.iLocalMillis = chronology2.getZone().getMillisKeepLocal(DateTimeZone.UTC, j10);
        this.iChronology = chronology2.withUTC();
    }

    public LocalDateTime(long j10, DateTimeZone dateTimeZone) {
        this(j10, ISOChronology.getInstance(dateTimeZone));
    }

    public LocalDateTime(Object obj) {
        this(obj, (Chronology) null);
    }

    public LocalDateTime(Object obj, Chronology chronology) {
        PartialConverter partialConverter = ConverterManager.getInstance().getPartialConverter(obj);
        Chronology chronology2 = DateTimeUtils.getChronology(partialConverter.getChronology(obj, chronology));
        Chronology chronologyWithUTC = chronology2.withUTC();
        this.iChronology = chronologyWithUTC;
        int[] partialValues = partialConverter.getPartialValues(this, obj, chronology2, ISODateTimeFormat.localDateOptionalTimeParser());
        this.iLocalMillis = chronologyWithUTC.getDateTimeMillis(partialValues[0], partialValues[1], partialValues[2], partialValues[3]);
    }

    public LocalDateTime(Object obj, DateTimeZone dateTimeZone) {
        PartialConverter partialConverter = ConverterManager.getInstance().getPartialConverter(obj);
        Chronology chronology = DateTimeUtils.getChronology(partialConverter.getChronology(obj, dateTimeZone));
        Chronology chronologyWithUTC = chronology.withUTC();
        this.iChronology = chronologyWithUTC;
        int[] partialValues = partialConverter.getPartialValues(this, obj, chronology, ISODateTimeFormat.localDateOptionalTimeParser());
        this.iLocalMillis = chronologyWithUTC.getDateTimeMillis(partialValues[0], partialValues[1], partialValues[2], partialValues[3]);
    }

    public LocalDateTime(Chronology chronology) {
        this(DateTimeUtils.currentTimeMillis(), chronology);
    }

    public LocalDateTime(DateTimeZone dateTimeZone) {
        this(DateTimeUtils.currentTimeMillis(), ISOChronology.getInstance(dateTimeZone));
    }

    private Date correctDstTransition(Date date, TimeZone timeZone) {
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTime(date);
        LocalDateTime localDateTimeFromCalendarFields = fromCalendarFields(calendar);
        if (localDateTimeFromCalendarFields.isBefore(this)) {
            while (localDateTimeFromCalendarFields.isBefore(this)) {
                calendar.setTimeInMillis(calendar.getTimeInMillis() + 60000);
                localDateTimeFromCalendarFields = fromCalendarFields(calendar);
            }
            while (!localDateTimeFromCalendarFields.isBefore(this)) {
                calendar.setTimeInMillis(calendar.getTimeInMillis() - 1000);
                localDateTimeFromCalendarFields = fromCalendarFields(calendar);
            }
            calendar.setTimeInMillis(calendar.getTimeInMillis() + 1000);
        } else if (localDateTimeFromCalendarFields.equals(this)) {
            Calendar calendar2 = Calendar.getInstance(timeZone);
            calendar2.setTimeInMillis(calendar.getTimeInMillis() - ((long) timeZone.getDSTSavings()));
            if (fromCalendarFields(calendar2).equals(this)) {
                calendar = calendar2;
            }
        }
        return calendar.getTime();
    }

    public static LocalDateTime fromCalendarFields(Calendar calendar) {
        if (calendar == null) {
            throw new IllegalArgumentException("The calendar must not be null");
        }
        int i10 = calendar.get(0);
        int i11 = calendar.get(1);
        if (i10 != 1) {
            i11 = 1 - i11;
        }
        return new LocalDateTime(i11, calendar.get(2) + 1, calendar.get(5), calendar.get(11), calendar.get(12), calendar.get(13), calendar.get(14));
    }

    public static LocalDateTime fromDateFields(Date date) {
        if (date == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        if (date.getTime() >= 0) {
            return new LocalDateTime(date.getYear() + 1900, date.getMonth() + 1, date.getDate(), date.getHours(), date.getMinutes(), date.getSeconds(), (((int) (date.getTime() % 1000)) + 1000) % 1000);
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(date);
        return fromCalendarFields(gregorianCalendar);
    }

    public static LocalDateTime now() {
        return new LocalDateTime();
    }

    public static LocalDateTime now(Chronology chronology) {
        Objects.requireNonNull(chronology, "Chronology must not be null");
        return new LocalDateTime(chronology);
    }

    public static LocalDateTime now(DateTimeZone dateTimeZone) {
        Objects.requireNonNull(dateTimeZone, "Zone must not be null");
        return new LocalDateTime(dateTimeZone);
    }

    @FromString
    public static LocalDateTime parse(String str) {
        return parse(str, ISODateTimeFormat.localDateOptionalTimeParser());
    }

    public static LocalDateTime parse(String str, DateTimeFormatter dateTimeFormatter) {
        return dateTimeFormatter.parseLocalDateTime(str);
    }

    private Object readResolve() {
        Chronology chronology = this.iChronology;
        if (chronology == null) {
            return new LocalDateTime(this.iLocalMillis, ISOChronology.getInstanceUTC());
        }
        return !DateTimeZone.UTC.equals(chronology.getZone()) ? new LocalDateTime(this.iLocalMillis, this.iChronology.withUTC()) : this;
    }

    public Property centuryOfEra() {
        return new Property(this, getChronology().centuryOfEra());
    }

    @Override // org.joda.time.base.AbstractPartial, java.lang.Comparable
    public int compareTo(ReadablePartial readablePartial) {
        if (this == readablePartial) {
            return 0;
        }
        if (readablePartial instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) readablePartial;
            if (this.iChronology.equals(localDateTime.iChronology)) {
                long j10 = this.iLocalMillis;
                long j11 = localDateTime.iLocalMillis;
                if (j10 < j11) {
                    return -1;
                }
                return j10 == j11 ? 0 : 1;
            }
        }
        return super.compareTo(readablePartial);
    }

    public Property dayOfMonth() {
        return new Property(this, getChronology().dayOfMonth());
    }

    public Property dayOfWeek() {
        return new Property(this, getChronology().dayOfWeek());
    }

    public Property dayOfYear() {
        return new Property(this, getChronology().dayOfYear());
    }

    @Override // org.joda.time.base.AbstractPartial, org.joda.time.ReadablePartial
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            if (this.iChronology.equals(localDateTime.iChronology)) {
                return this.iLocalMillis == localDateTime.iLocalMillis;
            }
        }
        return super.equals(obj);
    }

    public Property era() {
        return new Property(this, getChronology().era());
    }

    @Override // org.joda.time.base.AbstractPartial, org.joda.time.ReadablePartial
    public int get(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            return dateTimeFieldType.getField(getChronology()).get(getLocalMillis());
        }
        throw new IllegalArgumentException("The DateTimeFieldType must not be null");
    }

    public int getCenturyOfEra() {
        return getChronology().centuryOfEra().get(getLocalMillis());
    }

    @Override // org.joda.time.ReadablePartial
    public Chronology getChronology() {
        return this.iChronology;
    }

    public int getDayOfMonth() {
        return getChronology().dayOfMonth().get(getLocalMillis());
    }

    public int getDayOfWeek() {
        return getChronology().dayOfWeek().get(getLocalMillis());
    }

    public int getDayOfYear() {
        return getChronology().dayOfYear().get(getLocalMillis());
    }

    public int getEra() {
        return getChronology().era().get(getLocalMillis());
    }

    @Override // org.joda.time.base.AbstractPartial
    public DateTimeField getField(int i10, Chronology chronology) {
        if (i10 == 0) {
            return chronology.year();
        }
        if (i10 == 1) {
            return chronology.monthOfYear();
        }
        if (i10 == 2) {
            return chronology.dayOfMonth();
        }
        if (i10 == 3) {
            return chronology.millisOfDay();
        }
        throw new IndexOutOfBoundsException(a.a("Invalid index: ", i10));
    }

    public int getHourOfDay() {
        return getChronology().hourOfDay().get(getLocalMillis());
    }

    @Override // org.joda.time.base.BaseLocal
    public long getLocalMillis() {
        return this.iLocalMillis;
    }

    public int getMillisOfDay() {
        return getChronology().millisOfDay().get(getLocalMillis());
    }

    public int getMillisOfSecond() {
        return getChronology().millisOfSecond().get(getLocalMillis());
    }

    public int getMinuteOfHour() {
        return getChronology().minuteOfHour().get(getLocalMillis());
    }

    public int getMonthOfYear() {
        return getChronology().monthOfYear().get(getLocalMillis());
    }

    public int getSecondOfMinute() {
        return getChronology().secondOfMinute().get(getLocalMillis());
    }

    @Override // org.joda.time.ReadablePartial
    public int getValue(int i10) {
        DateTimeField dateTimeFieldYear;
        if (i10 == 0) {
            dateTimeFieldYear = getChronology().year();
        } else if (i10 == 1) {
            dateTimeFieldYear = getChronology().monthOfYear();
        } else if (i10 == 2) {
            dateTimeFieldYear = getChronology().dayOfMonth();
        } else {
            if (i10 != 3) {
                throw new IndexOutOfBoundsException(a.a("Invalid index: ", i10));
            }
            dateTimeFieldYear = getChronology().millisOfDay();
        }
        return dateTimeFieldYear.get(getLocalMillis());
    }

    public int getWeekOfWeekyear() {
        return getChronology().weekOfWeekyear().get(getLocalMillis());
    }

    public int getWeekyear() {
        return getChronology().weekyear().get(getLocalMillis());
    }

    public int getYear() {
        return getChronology().year().get(getLocalMillis());
    }

    public int getYearOfCentury() {
        return getChronology().yearOfCentury().get(getLocalMillis());
    }

    public int getYearOfEra() {
        return getChronology().yearOfEra().get(getLocalMillis());
    }

    public Property hourOfDay() {
        return new Property(this, getChronology().hourOfDay());
    }

    @Override // org.joda.time.base.AbstractPartial, org.joda.time.ReadablePartial
    public boolean isSupported(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            return false;
        }
        return dateTimeFieldType.getField(getChronology()).isSupported();
    }

    public boolean isSupported(DurationFieldType durationFieldType) {
        if (durationFieldType == null) {
            return false;
        }
        return durationFieldType.getField(getChronology()).isSupported();
    }

    public Property millisOfDay() {
        return new Property(this, getChronology().millisOfDay());
    }

    public Property millisOfSecond() {
        return new Property(this, getChronology().millisOfSecond());
    }

    public LocalDateTime minus(ReadableDuration readableDuration) {
        return withDurationAdded(readableDuration, -1);
    }

    public LocalDateTime minus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, -1);
    }

    public LocalDateTime minusDays(int i10) {
        return i10 == 0 ? this : withLocalMillis(getChronology().days().subtract(getLocalMillis(), i10));
    }

    public LocalDateTime minusHours(int i10) {
        return i10 == 0 ? this : withLocalMillis(getChronology().hours().subtract(getLocalMillis(), i10));
    }

    public LocalDateTime minusMillis(int i10) {
        return i10 == 0 ? this : withLocalMillis(getChronology().millis().subtract(getLocalMillis(), i10));
    }

    public LocalDateTime minusMinutes(int i10) {
        return i10 == 0 ? this : withLocalMillis(getChronology().minutes().subtract(getLocalMillis(), i10));
    }

    public LocalDateTime minusMonths(int i10) {
        return i10 == 0 ? this : withLocalMillis(getChronology().months().subtract(getLocalMillis(), i10));
    }

    public LocalDateTime minusSeconds(int i10) {
        return i10 == 0 ? this : withLocalMillis(getChronology().seconds().subtract(getLocalMillis(), i10));
    }

    public LocalDateTime minusWeeks(int i10) {
        return i10 == 0 ? this : withLocalMillis(getChronology().weeks().subtract(getLocalMillis(), i10));
    }

    public LocalDateTime minusYears(int i10) {
        return i10 == 0 ? this : withLocalMillis(getChronology().years().subtract(getLocalMillis(), i10));
    }

    public Property minuteOfHour() {
        return new Property(this, getChronology().minuteOfHour());
    }

    public Property monthOfYear() {
        return new Property(this, getChronology().monthOfYear());
    }

    public LocalDateTime plus(ReadableDuration readableDuration) {
        return withDurationAdded(readableDuration, 1);
    }

    public LocalDateTime plus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, 1);
    }

    public LocalDateTime plusDays(int i10) {
        return i10 == 0 ? this : withLocalMillis(getChronology().days().add(getLocalMillis(), i10));
    }

    public LocalDateTime plusHours(int i10) {
        return i10 == 0 ? this : withLocalMillis(getChronology().hours().add(getLocalMillis(), i10));
    }

    public LocalDateTime plusMillis(int i10) {
        return i10 == 0 ? this : withLocalMillis(getChronology().millis().add(getLocalMillis(), i10));
    }

    public LocalDateTime plusMinutes(int i10) {
        return i10 == 0 ? this : withLocalMillis(getChronology().minutes().add(getLocalMillis(), i10));
    }

    public LocalDateTime plusMonths(int i10) {
        return i10 == 0 ? this : withLocalMillis(getChronology().months().add(getLocalMillis(), i10));
    }

    public LocalDateTime plusSeconds(int i10) {
        return i10 == 0 ? this : withLocalMillis(getChronology().seconds().add(getLocalMillis(), i10));
    }

    public LocalDateTime plusWeeks(int i10) {
        return i10 == 0 ? this : withLocalMillis(getChronology().weeks().add(getLocalMillis(), i10));
    }

    public LocalDateTime plusYears(int i10) {
        return i10 == 0 ? this : withLocalMillis(getChronology().years().add(getLocalMillis(), i10));
    }

    public Property property(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        }
        if (isSupported(dateTimeFieldType)) {
            return new Property(this, dateTimeFieldType.getField(getChronology()));
        }
        throw new IllegalArgumentException("Field '" + dateTimeFieldType + "' is not supported");
    }

    public Property secondOfMinute() {
        return new Property(this, getChronology().secondOfMinute());
    }

    @Override // org.joda.time.ReadablePartial
    public int size() {
        return 4;
    }

    public Date toDate() {
        Date date = new Date(getYear() - 1900, getMonthOfYear() - 1, getDayOfMonth(), getHourOfDay(), getMinuteOfHour(), getSecondOfMinute());
        date.setTime(date.getTime() + ((long) getMillisOfSecond()));
        return correctDstTransition(date, TimeZone.getDefault());
    }

    public Date toDate(TimeZone timeZone) {
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.clear();
        calendar.set(getYear(), getMonthOfYear() - 1, getDayOfMonth(), getHourOfDay(), getMinuteOfHour(), getSecondOfMinute());
        Date time = calendar.getTime();
        time.setTime(time.getTime() + ((long) getMillisOfSecond()));
        return correctDstTransition(time, timeZone);
    }

    public DateTime toDateTime() {
        return toDateTime((DateTimeZone) null);
    }

    public DateTime toDateTime(DateTimeZone dateTimeZone) {
        return new DateTime(getYear(), getMonthOfYear(), getDayOfMonth(), getHourOfDay(), getMinuteOfHour(), getSecondOfMinute(), getMillisOfSecond(), this.iChronology.withZone(DateTimeUtils.getZone(dateTimeZone)));
    }

    public LocalDate toLocalDate() {
        return new LocalDate(getLocalMillis(), getChronology());
    }

    public LocalTime toLocalTime() {
        return new LocalTime(getLocalMillis(), getChronology());
    }

    @Override // org.joda.time.ReadablePartial
    @ToString
    public String toString() {
        return ISODateTimeFormat.dateTime().print(this);
    }

    public String toString(String str) {
        return str == null ? toString() : DateTimeFormat.forPattern(str).print(this);
    }

    public String toString(String str, Locale locale) throws IllegalArgumentException {
        return str == null ? toString() : DateTimeFormat.forPattern(str).withLocale(locale).print(this);
    }

    public Property weekOfWeekyear() {
        return new Property(this, getChronology().weekOfWeekyear());
    }

    public Property weekyear() {
        return new Property(this, getChronology().weekyear());
    }

    public LocalDateTime withCenturyOfEra(int i10) {
        return withLocalMillis(getChronology().centuryOfEra().set(getLocalMillis(), i10));
    }

    public LocalDateTime withDate(int i10, int i11, int i12) {
        Chronology chronology = getChronology();
        return withLocalMillis(chronology.dayOfMonth().set(chronology.monthOfYear().set(chronology.year().set(getLocalMillis(), i10), i11), i12));
    }

    public LocalDateTime withDayOfMonth(int i10) {
        return withLocalMillis(getChronology().dayOfMonth().set(getLocalMillis(), i10));
    }

    public LocalDateTime withDayOfWeek(int i10) {
        return withLocalMillis(getChronology().dayOfWeek().set(getLocalMillis(), i10));
    }

    public LocalDateTime withDayOfYear(int i10) {
        return withLocalMillis(getChronology().dayOfYear().set(getLocalMillis(), i10));
    }

    public LocalDateTime withDurationAdded(ReadableDuration readableDuration, int i10) {
        return (readableDuration == null || i10 == 0) ? this : withLocalMillis(getChronology().add(getLocalMillis(), readableDuration.getMillis(), i10));
    }

    public LocalDateTime withEra(int i10) {
        return withLocalMillis(getChronology().era().set(getLocalMillis(), i10));
    }

    public LocalDateTime withField(DateTimeFieldType dateTimeFieldType, int i10) {
        if (dateTimeFieldType != null) {
            return withLocalMillis(dateTimeFieldType.getField(getChronology()).set(getLocalMillis(), i10));
        }
        throw new IllegalArgumentException("Field must not be null");
    }

    public LocalDateTime withFieldAdded(DurationFieldType durationFieldType, int i10) {
        if (durationFieldType != null) {
            return i10 == 0 ? this : withLocalMillis(durationFieldType.getField(getChronology()).add(getLocalMillis(), i10));
        }
        throw new IllegalArgumentException("Field must not be null");
    }

    public LocalDateTime withFields(ReadablePartial readablePartial) {
        return readablePartial == null ? this : withLocalMillis(getChronology().set(readablePartial, getLocalMillis()));
    }

    public LocalDateTime withHourOfDay(int i10) {
        return withLocalMillis(getChronology().hourOfDay().set(getLocalMillis(), i10));
    }

    public LocalDateTime withLocalMillis(long j10) {
        return j10 == getLocalMillis() ? this : new LocalDateTime(j10, getChronology());
    }

    public LocalDateTime withMillisOfDay(int i10) {
        return withLocalMillis(getChronology().millisOfDay().set(getLocalMillis(), i10));
    }

    public LocalDateTime withMillisOfSecond(int i10) {
        return withLocalMillis(getChronology().millisOfSecond().set(getLocalMillis(), i10));
    }

    public LocalDateTime withMinuteOfHour(int i10) {
        return withLocalMillis(getChronology().minuteOfHour().set(getLocalMillis(), i10));
    }

    public LocalDateTime withMonthOfYear(int i10) {
        return withLocalMillis(getChronology().monthOfYear().set(getLocalMillis(), i10));
    }

    public LocalDateTime withPeriodAdded(ReadablePeriod readablePeriod, int i10) {
        return (readablePeriod == null || i10 == 0) ? this : withLocalMillis(getChronology().add(readablePeriod, getLocalMillis(), i10));
    }

    public LocalDateTime withSecondOfMinute(int i10) {
        return withLocalMillis(getChronology().secondOfMinute().set(getLocalMillis(), i10));
    }

    public LocalDateTime withTime(int i10, int i11, int i12, int i13) {
        Chronology chronology = getChronology();
        return withLocalMillis(chronology.millisOfSecond().set(chronology.secondOfMinute().set(chronology.minuteOfHour().set(chronology.hourOfDay().set(getLocalMillis(), i10), i11), i12), i13));
    }

    public LocalDateTime withWeekOfWeekyear(int i10) {
        return withLocalMillis(getChronology().weekOfWeekyear().set(getLocalMillis(), i10));
    }

    public LocalDateTime withWeekyear(int i10) {
        return withLocalMillis(getChronology().weekyear().set(getLocalMillis(), i10));
    }

    public LocalDateTime withYear(int i10) {
        return withLocalMillis(getChronology().year().set(getLocalMillis(), i10));
    }

    public LocalDateTime withYearOfCentury(int i10) {
        return withLocalMillis(getChronology().yearOfCentury().set(getLocalMillis(), i10));
    }

    public LocalDateTime withYearOfEra(int i10) {
        return withLocalMillis(getChronology().yearOfEra().set(getLocalMillis(), i10));
    }

    public Property year() {
        return new Property(this, getChronology().year());
    }

    public Property yearOfCentury() {
        return new Property(this, getChronology().yearOfCentury());
    }

    public Property yearOfEra() {
        return new Property(this, getChronology().yearOfEra());
    }
}
