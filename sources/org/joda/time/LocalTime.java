package org.joda.time;

import android.support.v4.media.a;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
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
public final class LocalTime extends BaseLocal implements Serializable {
    private static final int HOUR_OF_DAY = 0;
    public static final LocalTime MIDNIGHT = new LocalTime(0, 0, 0, 0);
    private static final int MILLIS_OF_SECOND = 3;
    private static final int MINUTE_OF_HOUR = 1;
    private static final int SECOND_OF_MINUTE = 2;
    private static final Set<DurationFieldType> TIME_DURATION_TYPES;
    private static final long serialVersionUID = -12873158713873L;
    private final Chronology iChronology;
    private final long iLocalMillis;

    public static final class Property extends AbstractReadableInstantFieldProperty {
        private static final long serialVersionUID = -325842547277223L;
        private transient DateTimeField iField;
        private transient LocalTime iInstant;

        public Property(LocalTime localTime, DateTimeField dateTimeField) {
            this.iInstant = localTime;
            this.iField = dateTimeField;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            this.iInstant = (LocalTime) objectInputStream.readObject();
            this.iField = ((DateTimeFieldType) objectInputStream.readObject()).getField(this.iInstant.getChronology());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeObject(this.iInstant);
            objectOutputStream.writeObject(this.iField.getType());
        }

        public LocalTime addCopy(int i10) {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.add(localTime.getLocalMillis(), i10));
        }

        public LocalTime addCopy(long j10) {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.add(localTime.getLocalMillis(), j10));
        }

        public LocalTime addNoWrapToCopy(int i10) {
            long jAdd = this.iField.add(this.iInstant.getLocalMillis(), i10);
            if (this.iInstant.getChronology().millisOfDay().get(jAdd) == jAdd) {
                return this.iInstant.withLocalMillis(jAdd);
            }
            throw new IllegalArgumentException("The addition exceeded the boundaries of LocalTime");
        }

        public LocalTime addWrapFieldToCopy(int i10) {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.addWrapField(localTime.getLocalMillis(), i10));
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        public Chronology getChronology() {
            return this.iInstant.getChronology();
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        public DateTimeField getField() {
            return this.iField;
        }

        public LocalTime getLocalTime() {
            return this.iInstant;
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        public long getMillis() {
            return this.iInstant.getLocalMillis();
        }

        public LocalTime roundCeilingCopy() {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.roundCeiling(localTime.getLocalMillis()));
        }

        public LocalTime roundFloorCopy() {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.roundFloor(localTime.getLocalMillis()));
        }

        public LocalTime roundHalfCeilingCopy() {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.roundHalfCeiling(localTime.getLocalMillis()));
        }

        public LocalTime roundHalfEvenCopy() {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.roundHalfEven(localTime.getLocalMillis()));
        }

        public LocalTime roundHalfFloorCopy() {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.roundHalfFloor(localTime.getLocalMillis()));
        }

        public LocalTime setCopy(int i10) {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.set(localTime.getLocalMillis(), i10));
        }

        public LocalTime setCopy(String str) {
            return setCopy(str, null);
        }

        public LocalTime setCopy(String str, Locale locale) {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.set(localTime.getLocalMillis(), str, locale));
        }

        public LocalTime withMaximumValue() {
            return setCopy(getMaximumValue());
        }

        public LocalTime withMinimumValue() {
            return setCopy(getMinimumValue());
        }
    }

    static {
        HashSet hashSet = new HashSet();
        TIME_DURATION_TYPES = hashSet;
        hashSet.add(DurationFieldType.millis());
        hashSet.add(DurationFieldType.seconds());
        hashSet.add(DurationFieldType.minutes());
        hashSet.add(DurationFieldType.hours());
    }

    public LocalTime() {
        this(DateTimeUtils.currentTimeMillis(), ISOChronology.getInstance());
    }

    public LocalTime(int i10, int i11) {
        this(i10, i11, 0, 0, ISOChronology.getInstanceUTC());
    }

    public LocalTime(int i10, int i11, int i12) {
        this(i10, i11, i12, 0, ISOChronology.getInstanceUTC());
    }

    public LocalTime(int i10, int i11, int i12, int i13) {
        this(i10, i11, i12, i13, ISOChronology.getInstanceUTC());
    }

    public LocalTime(int i10, int i11, int i12, int i13, Chronology chronology) {
        Chronology chronologyWithUTC = DateTimeUtils.getChronology(chronology).withUTC();
        long dateTimeMillis = chronologyWithUTC.getDateTimeMillis(0L, i10, i11, i12, i13);
        this.iChronology = chronologyWithUTC;
        this.iLocalMillis = dateTimeMillis;
    }

    public LocalTime(long j10) {
        this(j10, ISOChronology.getInstance());
    }

    public LocalTime(long j10, Chronology chronology) {
        Chronology chronology2 = DateTimeUtils.getChronology(chronology);
        long millisKeepLocal = chronology2.getZone().getMillisKeepLocal(DateTimeZone.UTC, j10);
        Chronology chronologyWithUTC = chronology2.withUTC();
        this.iLocalMillis = chronologyWithUTC.millisOfDay().get(millisKeepLocal);
        this.iChronology = chronologyWithUTC;
    }

    public LocalTime(long j10, DateTimeZone dateTimeZone) {
        this(j10, ISOChronology.getInstance(dateTimeZone));
    }

    public LocalTime(Object obj) {
        this(obj, (Chronology) null);
    }

    public LocalTime(Object obj, Chronology chronology) {
        PartialConverter partialConverter = ConverterManager.getInstance().getPartialConverter(obj);
        Chronology chronology2 = DateTimeUtils.getChronology(partialConverter.getChronology(obj, chronology));
        Chronology chronologyWithUTC = chronology2.withUTC();
        this.iChronology = chronologyWithUTC;
        int[] partialValues = partialConverter.getPartialValues(this, obj, chronology2, ISODateTimeFormat.localTimeParser());
        this.iLocalMillis = chronologyWithUTC.getDateTimeMillis(0L, partialValues[0], partialValues[1], partialValues[2], partialValues[3]);
    }

    public LocalTime(Object obj, DateTimeZone dateTimeZone) {
        PartialConverter partialConverter = ConverterManager.getInstance().getPartialConverter(obj);
        Chronology chronology = DateTimeUtils.getChronology(partialConverter.getChronology(obj, dateTimeZone));
        Chronology chronologyWithUTC = chronology.withUTC();
        this.iChronology = chronologyWithUTC;
        int[] partialValues = partialConverter.getPartialValues(this, obj, chronology, ISODateTimeFormat.localTimeParser());
        this.iLocalMillis = chronologyWithUTC.getDateTimeMillis(0L, partialValues[0], partialValues[1], partialValues[2], partialValues[3]);
    }

    public LocalTime(Chronology chronology) {
        this(DateTimeUtils.currentTimeMillis(), chronology);
    }

    public LocalTime(DateTimeZone dateTimeZone) {
        this(DateTimeUtils.currentTimeMillis(), ISOChronology.getInstance(dateTimeZone));
    }

    public static LocalTime fromCalendarFields(Calendar calendar) {
        if (calendar != null) {
            return new LocalTime(calendar.get(11), calendar.get(12), calendar.get(13), calendar.get(14));
        }
        throw new IllegalArgumentException("The calendar must not be null");
    }

    public static LocalTime fromDateFields(Date date) {
        if (date != null) {
            return new LocalTime(date.getHours(), date.getMinutes(), date.getSeconds(), (((int) (date.getTime() % 1000)) + 1000) % 1000);
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    public static LocalTime fromMillisOfDay(long j10) {
        return fromMillisOfDay(j10, null);
    }

    public static LocalTime fromMillisOfDay(long j10, Chronology chronology) {
        return new LocalTime(j10, DateTimeUtils.getChronology(chronology).withUTC());
    }

    public static LocalTime now() {
        return new LocalTime();
    }

    public static LocalTime now(Chronology chronology) {
        Objects.requireNonNull(chronology, "Chronology must not be null");
        return new LocalTime(chronology);
    }

    public static LocalTime now(DateTimeZone dateTimeZone) {
        Objects.requireNonNull(dateTimeZone, "Zone must not be null");
        return new LocalTime(dateTimeZone);
    }

    @FromString
    public static LocalTime parse(String str) {
        return parse(str, ISODateTimeFormat.localTimeParser());
    }

    public static LocalTime parse(String str, DateTimeFormatter dateTimeFormatter) {
        return dateTimeFormatter.parseLocalTime(str);
    }

    private Object readResolve() {
        Chronology chronology = this.iChronology;
        if (chronology == null) {
            return new LocalTime(this.iLocalMillis, ISOChronology.getInstanceUTC());
        }
        return !DateTimeZone.UTC.equals(chronology.getZone()) ? new LocalTime(this.iLocalMillis, this.iChronology.withUTC()) : this;
    }

    @Override // org.joda.time.base.AbstractPartial, java.lang.Comparable
    public int compareTo(ReadablePartial readablePartial) {
        if (this == readablePartial) {
            return 0;
        }
        if (readablePartial instanceof LocalTime) {
            LocalTime localTime = (LocalTime) readablePartial;
            if (this.iChronology.equals(localTime.iChronology)) {
                long j10 = this.iLocalMillis;
                long j11 = localTime.iLocalMillis;
                if (j10 < j11) {
                    return -1;
                }
                return j10 == j11 ? 0 : 1;
            }
        }
        return super.compareTo(readablePartial);
    }

    @Override // org.joda.time.base.AbstractPartial, org.joda.time.ReadablePartial
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalTime) {
            LocalTime localTime = (LocalTime) obj;
            if (this.iChronology.equals(localTime.iChronology)) {
                return this.iLocalMillis == localTime.iLocalMillis;
            }
        }
        return super.equals(obj);
    }

    @Override // org.joda.time.base.AbstractPartial, org.joda.time.ReadablePartial
    public int get(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        }
        if (isSupported(dateTimeFieldType)) {
            return dateTimeFieldType.getField(getChronology()).get(getLocalMillis());
        }
        throw new IllegalArgumentException("Field '" + dateTimeFieldType + "' is not supported");
    }

    @Override // org.joda.time.ReadablePartial
    public Chronology getChronology() {
        return this.iChronology;
    }

    @Override // org.joda.time.base.AbstractPartial
    public DateTimeField getField(int i10, Chronology chronology) {
        if (i10 == 0) {
            return chronology.hourOfDay();
        }
        if (i10 == 1) {
            return chronology.minuteOfHour();
        }
        if (i10 == 2) {
            return chronology.secondOfMinute();
        }
        if (i10 == 3) {
            return chronology.millisOfSecond();
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

    public int getSecondOfMinute() {
        return getChronology().secondOfMinute().get(getLocalMillis());
    }

    @Override // org.joda.time.ReadablePartial
    public int getValue(int i10) {
        DateTimeField dateTimeFieldHourOfDay;
        if (i10 == 0) {
            dateTimeFieldHourOfDay = getChronology().hourOfDay();
        } else if (i10 == 1) {
            dateTimeFieldHourOfDay = getChronology().minuteOfHour();
        } else if (i10 == 2) {
            dateTimeFieldHourOfDay = getChronology().secondOfMinute();
        } else {
            if (i10 != 3) {
                throw new IndexOutOfBoundsException(a.a("Invalid index: ", i10));
            }
            dateTimeFieldHourOfDay = getChronology().millisOfSecond();
        }
        return dateTimeFieldHourOfDay.get(getLocalMillis());
    }

    public Property hourOfDay() {
        return new Property(this, getChronology().hourOfDay());
    }

    @Override // org.joda.time.base.AbstractPartial, org.joda.time.ReadablePartial
    public boolean isSupported(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null || !isSupported(dateTimeFieldType.getDurationType())) {
            return false;
        }
        DurationFieldType rangeDurationType = dateTimeFieldType.getRangeDurationType();
        return isSupported(rangeDurationType) || rangeDurationType == DurationFieldType.days();
    }

    public boolean isSupported(DurationFieldType durationFieldType) {
        if (durationFieldType == null) {
            return false;
        }
        DurationField field = durationFieldType.getField(getChronology());
        if (TIME_DURATION_TYPES.contains(durationFieldType) || field.getUnitMillis() < getChronology().days().getUnitMillis()) {
            return field.isSupported();
        }
        return false;
    }

    public Property millisOfDay() {
        return new Property(this, getChronology().millisOfDay());
    }

    public Property millisOfSecond() {
        return new Property(this, getChronology().millisOfSecond());
    }

    public LocalTime minus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, -1);
    }

    public LocalTime minusHours(int i10) {
        return i10 == 0 ? this : withLocalMillis(getChronology().hours().subtract(getLocalMillis(), i10));
    }

    public LocalTime minusMillis(int i10) {
        return i10 == 0 ? this : withLocalMillis(getChronology().millis().subtract(getLocalMillis(), i10));
    }

    public LocalTime minusMinutes(int i10) {
        return i10 == 0 ? this : withLocalMillis(getChronology().minutes().subtract(getLocalMillis(), i10));
    }

    public LocalTime minusSeconds(int i10) {
        return i10 == 0 ? this : withLocalMillis(getChronology().seconds().subtract(getLocalMillis(), i10));
    }

    public Property minuteOfHour() {
        return new Property(this, getChronology().minuteOfHour());
    }

    public LocalTime plus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, 1);
    }

    public LocalTime plusHours(int i10) {
        return i10 == 0 ? this : withLocalMillis(getChronology().hours().add(getLocalMillis(), i10));
    }

    public LocalTime plusMillis(int i10) {
        return i10 == 0 ? this : withLocalMillis(getChronology().millis().add(getLocalMillis(), i10));
    }

    public LocalTime plusMinutes(int i10) {
        return i10 == 0 ? this : withLocalMillis(getChronology().minutes().add(getLocalMillis(), i10));
    }

    public LocalTime plusSeconds(int i10) {
        return i10 == 0 ? this : withLocalMillis(getChronology().seconds().add(getLocalMillis(), i10));
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

    public DateTime toDateTimeToday() {
        return toDateTimeToday(null);
    }

    public DateTime toDateTimeToday(DateTimeZone dateTimeZone) {
        Chronology chronologyWithZone = getChronology().withZone(dateTimeZone);
        return new DateTime(chronologyWithZone.set(this, DateTimeUtils.currentTimeMillis()), chronologyWithZone);
    }

    @Override // org.joda.time.ReadablePartial
    @ToString
    public String toString() {
        return ISODateTimeFormat.time().print(this);
    }

    public String toString(String str) {
        return str == null ? toString() : DateTimeFormat.forPattern(str).print(this);
    }

    public String toString(String str, Locale locale) throws IllegalArgumentException {
        return str == null ? toString() : DateTimeFormat.forPattern(str).withLocale(locale).print(this);
    }

    public LocalTime withField(DateTimeFieldType dateTimeFieldType, int i10) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field must not be null");
        }
        if (isSupported(dateTimeFieldType)) {
            return withLocalMillis(dateTimeFieldType.getField(getChronology()).set(getLocalMillis(), i10));
        }
        throw new IllegalArgumentException("Field '" + dateTimeFieldType + "' is not supported");
    }

    public LocalTime withFieldAdded(DurationFieldType durationFieldType, int i10) {
        if (durationFieldType == null) {
            throw new IllegalArgumentException("Field must not be null");
        }
        if (isSupported(durationFieldType)) {
            return i10 == 0 ? this : withLocalMillis(durationFieldType.getField(getChronology()).add(getLocalMillis(), i10));
        }
        throw new IllegalArgumentException("Field '" + durationFieldType + "' is not supported");
    }

    public LocalTime withFields(ReadablePartial readablePartial) {
        return readablePartial == null ? this : withLocalMillis(getChronology().set(readablePartial, getLocalMillis()));
    }

    public LocalTime withHourOfDay(int i10) {
        return withLocalMillis(getChronology().hourOfDay().set(getLocalMillis(), i10));
    }

    public LocalTime withLocalMillis(long j10) {
        return j10 == getLocalMillis() ? this : new LocalTime(j10, getChronology());
    }

    public LocalTime withMillisOfDay(int i10) {
        return withLocalMillis(getChronology().millisOfDay().set(getLocalMillis(), i10));
    }

    public LocalTime withMillisOfSecond(int i10) {
        return withLocalMillis(getChronology().millisOfSecond().set(getLocalMillis(), i10));
    }

    public LocalTime withMinuteOfHour(int i10) {
        return withLocalMillis(getChronology().minuteOfHour().set(getLocalMillis(), i10));
    }

    public LocalTime withPeriodAdded(ReadablePeriod readablePeriod, int i10) {
        return (readablePeriod == null || i10 == 0) ? this : withLocalMillis(getChronology().add(readablePeriod, getLocalMillis(), i10));
    }

    public LocalTime withSecondOfMinute(int i10) {
        return withLocalMillis(getChronology().secondOfMinute().set(getLocalMillis(), i10));
    }
}
