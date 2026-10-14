package org.joda.time.chrono;

import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.field.BaseDateTimeField;
import org.joda.time.field.DecoratedDurationField;
import org.joda.time.format.ISODateTimeFormat;

/* JADX INFO: loaded from: classes3.dex */
public final class GJChronology extends AssembledChronology {
    public static final Instant DEFAULT_CUTOVER = new Instant(-12219292800000L);
    private static final ConcurrentHashMap<GJCacheKey, GJChronology> cCache = new ConcurrentHashMap<>();
    private static final long serialVersionUID = -2545574827706931671L;
    private Instant iCutoverInstant;
    private long iCutoverMillis;
    private long iGapDuration;
    private GregorianChronology iGregorianChronology;
    private JulianChronology iJulianChronology;

    public class CutoverField extends BaseDateTimeField {
        private static final long serialVersionUID = 3528501219481026402L;
        public final boolean iConvertByWeekyear;
        public final long iCutover;
        public DurationField iDurationField;
        public final DateTimeField iGregorianField;
        public final DateTimeField iJulianField;
        public DurationField iRangeDurationField;

        public CutoverField(GJChronology gJChronology, DateTimeField dateTimeField, DateTimeField dateTimeField2, long j10) {
            this(gJChronology, dateTimeField, dateTimeField2, j10, false);
        }

        public CutoverField(GJChronology gJChronology, DateTimeField dateTimeField, DateTimeField dateTimeField2, long j10, boolean z10) {
            this(dateTimeField, dateTimeField2, null, j10, z10);
        }

        public CutoverField(DateTimeField dateTimeField, DateTimeField dateTimeField2, DurationField durationField, long j10, boolean z10) {
            super(dateTimeField2.getType());
            this.iJulianField = dateTimeField;
            this.iGregorianField = dateTimeField2;
            this.iCutover = j10;
            this.iConvertByWeekyear = z10;
            this.iDurationField = dateTimeField2.getDurationField();
            if (durationField == null && (durationField = dateTimeField2.getRangeDurationField()) == null) {
                durationField = dateTimeField.getRangeDurationField();
            }
            this.iRangeDurationField = durationField;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long add(long j10, int i10) {
            return this.iGregorianField.add(j10, i10);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long add(long j10, long j11) {
            return this.iGregorianField.add(j10, j11);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int[] add(ReadablePartial readablePartial, int i10, int[] iArr, int i11) {
            if (i11 == 0) {
                return iArr;
            }
            if (!DateTimeUtils.isContiguous(readablePartial)) {
                return super.add(readablePartial, i10, iArr, i11);
            }
            long j10 = 0;
            int size = readablePartial.size();
            for (int i12 = 0; i12 < size; i12++) {
                j10 = readablePartial.getFieldType(i12).getField(GJChronology.this).set(j10, iArr[i12]);
            }
            return GJChronology.this.get(readablePartial, add(j10, i11));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int get(long j10) {
            return (j10 >= this.iCutover ? this.iGregorianField : this.iJulianField).get(j10);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public String getAsShortText(int i10, Locale locale) {
            return this.iGregorianField.getAsShortText(i10, locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public String getAsShortText(long j10, Locale locale) {
            return (j10 >= this.iCutover ? this.iGregorianField : this.iJulianField).getAsShortText(j10, locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public String getAsText(int i10, Locale locale) {
            return this.iGregorianField.getAsText(i10, locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public String getAsText(long j10, Locale locale) {
            return (j10 >= this.iCutover ? this.iGregorianField : this.iJulianField).getAsText(j10, locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getDifference(long j10, long j11) {
            return this.iGregorianField.getDifference(j10, j11);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long getDifferenceAsLong(long j10, long j11) {
            return this.iGregorianField.getDifferenceAsLong(j10, j11);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public DurationField getDurationField() {
            return this.iDurationField;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getLeapAmount(long j10) {
            return (j10 >= this.iCutover ? this.iGregorianField : this.iJulianField).getLeapAmount(j10);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public DurationField getLeapDurationField() {
            return this.iGregorianField.getLeapDurationField();
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumShortTextLength(Locale locale) {
            return Math.max(this.iJulianField.getMaximumShortTextLength(locale), this.iGregorianField.getMaximumShortTextLength(locale));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumTextLength(Locale locale) {
            return Math.max(this.iJulianField.getMaximumTextLength(locale), this.iGregorianField.getMaximumTextLength(locale));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumValue() {
            return this.iGregorianField.getMaximumValue();
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumValue(long j10) {
            if (j10 >= this.iCutover) {
                return this.iGregorianField.getMaximumValue(j10);
            }
            int maximumValue = this.iJulianField.getMaximumValue(j10);
            long j11 = this.iJulianField.set(j10, maximumValue);
            long j12 = this.iCutover;
            if (j11 < j12) {
                return maximumValue;
            }
            DateTimeField dateTimeField = this.iJulianField;
            return dateTimeField.get(dateTimeField.add(j12, -1));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumValue(ReadablePartial readablePartial) {
            return getMaximumValue(GJChronology.getInstanceUTC().set(readablePartial, 0L));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumValue(ReadablePartial readablePartial, int[] iArr) {
            GJChronology instanceUTC = GJChronology.getInstanceUTC();
            int size = readablePartial.size();
            long j10 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                DateTimeField field = readablePartial.getFieldType(i10).getField(instanceUTC);
                if (iArr[i10] <= field.getMaximumValue(j10)) {
                    j10 = field.set(j10, iArr[i10]);
                }
            }
            return getMaximumValue(j10);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMinimumValue() {
            return this.iJulianField.getMinimumValue();
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMinimumValue(long j10) {
            if (j10 < this.iCutover) {
                return this.iJulianField.getMinimumValue(j10);
            }
            int minimumValue = this.iGregorianField.getMinimumValue(j10);
            long j11 = this.iGregorianField.set(j10, minimumValue);
            long j12 = this.iCutover;
            return j11 < j12 ? this.iGregorianField.get(j12) : minimumValue;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMinimumValue(ReadablePartial readablePartial) {
            return this.iJulianField.getMinimumValue(readablePartial);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMinimumValue(ReadablePartial readablePartial, int[] iArr) {
            return this.iJulianField.getMinimumValue(readablePartial, iArr);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public DurationField getRangeDurationField() {
            return this.iRangeDurationField;
        }

        public long gregorianToJulian(long j10) {
            return this.iConvertByWeekyear ? GJChronology.this.gregorianToJulianByWeekyear(j10) : GJChronology.this.gregorianToJulianByYear(j10);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public boolean isLeap(long j10) {
            return (j10 >= this.iCutover ? this.iGregorianField : this.iJulianField).isLeap(j10);
        }

        @Override // org.joda.time.DateTimeField
        public boolean isLenient() {
            return false;
        }

        public long julianToGregorian(long j10) {
            return this.iConvertByWeekyear ? GJChronology.this.julianToGregorianByWeekyear(j10) : GJChronology.this.julianToGregorianByYear(j10);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long roundCeiling(long j10) {
            if (j10 >= this.iCutover) {
                return this.iGregorianField.roundCeiling(j10);
            }
            long jRoundCeiling = this.iJulianField.roundCeiling(j10);
            return (jRoundCeiling < this.iCutover || jRoundCeiling - GJChronology.this.iGapDuration < this.iCutover) ? jRoundCeiling : julianToGregorian(jRoundCeiling);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long roundFloor(long j10) {
            if (j10 < this.iCutover) {
                return this.iJulianField.roundFloor(j10);
            }
            long jRoundFloor = this.iGregorianField.roundFloor(j10);
            return (jRoundFloor >= this.iCutover || GJChronology.this.iGapDuration + jRoundFloor >= this.iCutover) ? jRoundFloor : gregorianToJulian(jRoundFloor);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long set(long j10, int i10) {
            long jJulianToGregorian;
            if (j10 >= this.iCutover) {
                jJulianToGregorian = this.iGregorianField.set(j10, i10);
                if (jJulianToGregorian < this.iCutover) {
                    if (GJChronology.this.iGapDuration + jJulianToGregorian < this.iCutover) {
                        jJulianToGregorian = gregorianToJulian(jJulianToGregorian);
                    }
                    if (get(jJulianToGregorian) != i10) {
                        throw new IllegalFieldValueException(this.iGregorianField.getType(), Integer.valueOf(i10), (Number) null, (Number) null);
                    }
                }
            } else {
                jJulianToGregorian = this.iJulianField.set(j10, i10);
                if (jJulianToGregorian >= this.iCutover) {
                    if (jJulianToGregorian - GJChronology.this.iGapDuration >= this.iCutover) {
                        jJulianToGregorian = julianToGregorian(jJulianToGregorian);
                    }
                    if (get(jJulianToGregorian) != i10) {
                        throw new IllegalFieldValueException(this.iJulianField.getType(), Integer.valueOf(i10), (Number) null, (Number) null);
                    }
                }
            }
            return jJulianToGregorian;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long set(long j10, String str, Locale locale) {
            if (j10 >= this.iCutover) {
                long j11 = this.iGregorianField.set(j10, str, locale);
                return (j11 >= this.iCutover || GJChronology.this.iGapDuration + j11 >= this.iCutover) ? j11 : gregorianToJulian(j11);
            }
            long j12 = this.iJulianField.set(j10, str, locale);
            return (j12 < this.iCutover || j12 - GJChronology.this.iGapDuration < this.iCutover) ? j12 : julianToGregorian(j12);
        }
    }

    public final class ImpreciseCutoverField extends CutoverField {
        private static final long serialVersionUID = 3410248757173576441L;

        public ImpreciseCutoverField(GJChronology gJChronology, DateTimeField dateTimeField, DateTimeField dateTimeField2, long j10) {
            this(dateTimeField, dateTimeField2, (DurationField) null, j10, false);
        }

        public ImpreciseCutoverField(GJChronology gJChronology, DateTimeField dateTimeField, DateTimeField dateTimeField2, DurationField durationField, long j10) {
            this(dateTimeField, dateTimeField2, durationField, j10, false);
        }

        public ImpreciseCutoverField(DateTimeField dateTimeField, DateTimeField dateTimeField2, DurationField durationField, long j10, boolean z10) {
            super(GJChronology.this, dateTimeField, dateTimeField2, j10, z10);
            this.iDurationField = durationField == null ? new LinkedDurationField(this.iDurationField, this) : durationField;
        }

        public ImpreciseCutoverField(GJChronology gJChronology, DateTimeField dateTimeField, DateTimeField dateTimeField2, DurationField durationField, DurationField durationField2, long j10) {
            this(dateTimeField, dateTimeField2, durationField, j10, false);
            this.iRangeDurationField = durationField2;
        }

        @Override // org.joda.time.chrono.GJChronology.CutoverField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long add(long j10, int i10) {
            DateTimeField dateTimeFieldYear;
            if (j10 < this.iCutover) {
                long jAdd = this.iJulianField.add(j10, i10);
                return (jAdd < this.iCutover || jAdd - GJChronology.this.iGapDuration < this.iCutover) ? jAdd : julianToGregorian(jAdd);
            }
            long jAdd2 = this.iGregorianField.add(j10, i10);
            if (jAdd2 >= this.iCutover || GJChronology.this.iGapDuration + jAdd2 >= this.iCutover) {
                return jAdd2;
            }
            if (this.iConvertByWeekyear) {
                if (GJChronology.this.iGregorianChronology.weekyear().get(jAdd2) <= 0) {
                    dateTimeFieldYear = GJChronology.this.iGregorianChronology.weekyear();
                    jAdd2 = dateTimeFieldYear.add(jAdd2, -1);
                }
            } else if (GJChronology.this.iGregorianChronology.year().get(jAdd2) <= 0) {
                dateTimeFieldYear = GJChronology.this.iGregorianChronology.year();
                jAdd2 = dateTimeFieldYear.add(jAdd2, -1);
            }
            return gregorianToJulian(jAdd2);
        }

        @Override // org.joda.time.chrono.GJChronology.CutoverField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long add(long j10, long j11) {
            DateTimeField dateTimeFieldYear;
            if (j10 < this.iCutover) {
                long jAdd = this.iJulianField.add(j10, j11);
                return (jAdd < this.iCutover || jAdd - GJChronology.this.iGapDuration < this.iCutover) ? jAdd : julianToGregorian(jAdd);
            }
            long jAdd2 = this.iGregorianField.add(j10, j11);
            if (jAdd2 >= this.iCutover || GJChronology.this.iGapDuration + jAdd2 >= this.iCutover) {
                return jAdd2;
            }
            if (this.iConvertByWeekyear) {
                if (GJChronology.this.iGregorianChronology.weekyear().get(jAdd2) <= 0) {
                    dateTimeFieldYear = GJChronology.this.iGregorianChronology.weekyear();
                    jAdd2 = dateTimeFieldYear.add(jAdd2, -1);
                }
            } else if (GJChronology.this.iGregorianChronology.year().get(jAdd2) <= 0) {
                dateTimeFieldYear = GJChronology.this.iGregorianChronology.year();
                jAdd2 = dateTimeFieldYear.add(jAdd2, -1);
            }
            return gregorianToJulian(jAdd2);
        }

        @Override // org.joda.time.chrono.GJChronology.CutoverField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getDifference(long j10, long j11) {
            DateTimeField dateTimeField;
            long j12 = this.iCutover;
            if (j10 >= j12) {
                if (j11 >= j12) {
                    dateTimeField = this.iGregorianField;
                } else {
                    j10 = gregorianToJulian(j10);
                    dateTimeField = this.iJulianField;
                }
            } else if (j11 < j12) {
                dateTimeField = this.iJulianField;
            } else {
                j10 = julianToGregorian(j10);
                dateTimeField = this.iGregorianField;
            }
            return dateTimeField.getDifference(j10, j11);
        }

        @Override // org.joda.time.chrono.GJChronology.CutoverField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long getDifferenceAsLong(long j10, long j11) {
            DateTimeField dateTimeField;
            long j12 = this.iCutover;
            if (j10 >= j12) {
                if (j11 >= j12) {
                    dateTimeField = this.iGregorianField;
                } else {
                    j10 = gregorianToJulian(j10);
                    dateTimeField = this.iJulianField;
                }
            } else if (j11 < j12) {
                dateTimeField = this.iJulianField;
            } else {
                j10 = julianToGregorian(j10);
                dateTimeField = this.iGregorianField;
            }
            return dateTimeField.getDifferenceAsLong(j10, j11);
        }

        @Override // org.joda.time.chrono.GJChronology.CutoverField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumValue(long j10) {
            return (j10 >= this.iCutover ? this.iGregorianField : this.iJulianField).getMaximumValue(j10);
        }

        @Override // org.joda.time.chrono.GJChronology.CutoverField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMinimumValue(long j10) {
            return (j10 >= this.iCutover ? this.iGregorianField : this.iJulianField).getMinimumValue(j10);
        }
    }

    public static class LinkedDurationField extends DecoratedDurationField {
        private static final long serialVersionUID = 4097975388007713084L;
        private final ImpreciseCutoverField iField;

        public LinkedDurationField(DurationField durationField, ImpreciseCutoverField impreciseCutoverField) {
            super(durationField, durationField.getType());
            this.iField = impreciseCutoverField;
        }

        @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
        public long add(long j10, int i10) {
            return this.iField.add(j10, i10);
        }

        @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
        public long add(long j10, long j11) {
            return this.iField.add(j10, j11);
        }

        @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
        public int getDifference(long j10, long j11) {
            return this.iField.getDifference(j10, j11);
        }

        @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
        public long getDifferenceAsLong(long j10, long j11) {
            return this.iField.getDifferenceAsLong(j10, j11);
        }
    }

    private GJChronology(Chronology chronology, JulianChronology julianChronology, GregorianChronology gregorianChronology, Instant instant) {
        super(chronology, new Object[]{julianChronology, gregorianChronology, instant});
    }

    private GJChronology(JulianChronology julianChronology, GregorianChronology gregorianChronology, Instant instant) {
        super(null, new Object[]{julianChronology, gregorianChronology, instant});
    }

    private static long convertByWeekyear(long j10, Chronology chronology, Chronology chronology2) {
        return chronology2.millisOfDay().set(chronology2.dayOfWeek().set(chronology2.weekOfWeekyear().set(chronology2.weekyear().set(0L, chronology.weekyear().get(j10)), chronology.weekOfWeekyear().get(j10)), chronology.dayOfWeek().get(j10)), chronology.millisOfDay().get(j10));
    }

    private static long convertByYear(long j10, Chronology chronology, Chronology chronology2) {
        return chronology2.getDateTimeMillis(chronology.year().get(j10), chronology.monthOfYear().get(j10), chronology.dayOfMonth().get(j10), chronology.millisOfDay().get(j10));
    }

    public static GJChronology getInstance() {
        return getInstance(DateTimeZone.getDefault(), DEFAULT_CUTOVER, 4);
    }

    public static GJChronology getInstance(DateTimeZone dateTimeZone) {
        return getInstance(dateTimeZone, DEFAULT_CUTOVER, 4);
    }

    public static GJChronology getInstance(DateTimeZone dateTimeZone, long j10, int i10) {
        return getInstance(dateTimeZone, j10 == DEFAULT_CUTOVER.getMillis() ? null : new Instant(j10), i10);
    }

    public static GJChronology getInstance(DateTimeZone dateTimeZone, ReadableInstant readableInstant) {
        return getInstance(dateTimeZone, readableInstant, 4);
    }

    public static GJChronology getInstance(DateTimeZone dateTimeZone, ReadableInstant readableInstant, int i10) {
        Instant instant;
        GJChronology gJChronology;
        DateTimeZone zone = DateTimeUtils.getZone(dateTimeZone);
        if (readableInstant == null) {
            instant = DEFAULT_CUTOVER;
        } else {
            instant = readableInstant.toInstant();
            if (new LocalDate(instant.getMillis(), GregorianChronology.getInstance(zone)).getYear() <= 0) {
                throw new IllegalArgumentException("Cutover too early. Must be on or after 0001-01-01.");
            }
        }
        GJCacheKey gJCacheKey = new GJCacheKey(zone, instant, i10);
        ConcurrentHashMap<GJCacheKey, GJChronology> concurrentHashMap = cCache;
        GJChronology gJChronology2 = concurrentHashMap.get(gJCacheKey);
        if (gJChronology2 != null) {
            return gJChronology2;
        }
        DateTimeZone dateTimeZone2 = DateTimeZone.UTC;
        if (zone == dateTimeZone2) {
            gJChronology = new GJChronology(JulianChronology.getInstance(zone, i10), GregorianChronology.getInstance(zone, i10), instant);
        } else {
            GJChronology gJChronology3 = getInstance(dateTimeZone2, instant, i10);
            gJChronology = new GJChronology(ZonedChronology.getInstance(gJChronology3, zone), gJChronology3.iJulianChronology, gJChronology3.iGregorianChronology, gJChronology3.iCutoverInstant);
        }
        GJChronology gJChronologyPutIfAbsent = concurrentHashMap.putIfAbsent(gJCacheKey, gJChronology);
        return gJChronologyPutIfAbsent != null ? gJChronologyPutIfAbsent : gJChronology;
    }

    public static GJChronology getInstanceUTC() {
        return getInstance(DateTimeZone.UTC, DEFAULT_CUTOVER, 4);
    }

    private Object readResolve() {
        return getInstance(getZone(), this.iCutoverInstant, getMinimumDaysInFirstWeek());
    }

    @Override // org.joda.time.chrono.AssembledChronology
    public void assemble(AssembledChronology.Fields fields) {
        Object[] objArr = (Object[]) getParam();
        JulianChronology julianChronology = (JulianChronology) objArr[0];
        GregorianChronology gregorianChronology = (GregorianChronology) objArr[1];
        Instant instant = (Instant) objArr[2];
        this.iCutoverMillis = instant.getMillis();
        this.iJulianChronology = julianChronology;
        this.iGregorianChronology = gregorianChronology;
        this.iCutoverInstant = instant;
        if (getBase() != null) {
            return;
        }
        if (julianChronology.getMinimumDaysInFirstWeek() != gregorianChronology.getMinimumDaysInFirstWeek()) {
            throw new IllegalArgumentException();
        }
        long j10 = this.iCutoverMillis;
        this.iGapDuration = j10 - julianToGregorianByYear(j10);
        fields.copyFieldsFrom(gregorianChronology);
        if (gregorianChronology.millisOfDay().get(this.iCutoverMillis) == 0) {
            fields.millisOfSecond = new CutoverField(this, julianChronology.millisOfSecond(), fields.millisOfSecond, this.iCutoverMillis);
            fields.millisOfDay = new CutoverField(this, julianChronology.millisOfDay(), fields.millisOfDay, this.iCutoverMillis);
            fields.secondOfMinute = new CutoverField(this, julianChronology.secondOfMinute(), fields.secondOfMinute, this.iCutoverMillis);
            fields.secondOfDay = new CutoverField(this, julianChronology.secondOfDay(), fields.secondOfDay, this.iCutoverMillis);
            fields.minuteOfHour = new CutoverField(this, julianChronology.minuteOfHour(), fields.minuteOfHour, this.iCutoverMillis);
            fields.minuteOfDay = new CutoverField(this, julianChronology.minuteOfDay(), fields.minuteOfDay, this.iCutoverMillis);
            fields.hourOfDay = new CutoverField(this, julianChronology.hourOfDay(), fields.hourOfDay, this.iCutoverMillis);
            fields.hourOfHalfday = new CutoverField(this, julianChronology.hourOfHalfday(), fields.hourOfHalfday, this.iCutoverMillis);
            fields.clockhourOfDay = new CutoverField(this, julianChronology.clockhourOfDay(), fields.clockhourOfDay, this.iCutoverMillis);
            fields.clockhourOfHalfday = new CutoverField(this, julianChronology.clockhourOfHalfday(), fields.clockhourOfHalfday, this.iCutoverMillis);
            fields.halfdayOfDay = new CutoverField(this, julianChronology.halfdayOfDay(), fields.halfdayOfDay, this.iCutoverMillis);
        }
        fields.era = new CutoverField(this, julianChronology.era(), fields.era, this.iCutoverMillis);
        ImpreciseCutoverField impreciseCutoverField = new ImpreciseCutoverField(this, julianChronology.year(), fields.year, this.iCutoverMillis);
        fields.year = impreciseCutoverField;
        fields.years = impreciseCutoverField.getDurationField();
        fields.yearOfEra = new ImpreciseCutoverField(this, julianChronology.yearOfEra(), fields.yearOfEra, fields.years, this.iCutoverMillis);
        ImpreciseCutoverField impreciseCutoverField2 = new ImpreciseCutoverField(this, julianChronology.centuryOfEra(), fields.centuryOfEra, this.iCutoverMillis);
        fields.centuryOfEra = impreciseCutoverField2;
        fields.centuries = impreciseCutoverField2.getDurationField();
        fields.yearOfCentury = new ImpreciseCutoverField(this, julianChronology.yearOfCentury(), fields.yearOfCentury, fields.years, fields.centuries, this.iCutoverMillis);
        ImpreciseCutoverField impreciseCutoverField3 = new ImpreciseCutoverField(this, julianChronology.monthOfYear(), fields.monthOfYear, (DurationField) null, fields.years, this.iCutoverMillis);
        fields.monthOfYear = impreciseCutoverField3;
        fields.months = impreciseCutoverField3.getDurationField();
        ImpreciseCutoverField impreciseCutoverField4 = new ImpreciseCutoverField(julianChronology.weekyear(), fields.weekyear, (DurationField) null, this.iCutoverMillis, true);
        fields.weekyear = impreciseCutoverField4;
        fields.weekyears = impreciseCutoverField4.getDurationField();
        fields.weekyearOfCentury = new ImpreciseCutoverField(this, julianChronology.weekyearOfCentury(), fields.weekyearOfCentury, fields.weekyears, fields.centuries, this.iCutoverMillis);
        fields.dayOfYear = new CutoverField(julianChronology.dayOfYear(), fields.dayOfYear, fields.years, gregorianChronology.year().roundCeiling(this.iCutoverMillis), false);
        fields.weekOfWeekyear = new CutoverField(julianChronology.weekOfWeekyear(), fields.weekOfWeekyear, fields.weekyears, gregorianChronology.weekyear().roundCeiling(this.iCutoverMillis), true);
        CutoverField cutoverField = new CutoverField(this, julianChronology.dayOfMonth(), fields.dayOfMonth, this.iCutoverMillis);
        cutoverField.iRangeDurationField = fields.months;
        fields.dayOfMonth = cutoverField;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GJChronology)) {
            return false;
        }
        GJChronology gJChronology = (GJChronology) obj;
        return this.iCutoverMillis == gJChronology.iCutoverMillis && getMinimumDaysInFirstWeek() == gJChronology.getMinimumDaysInFirstWeek() && getZone().equals(gJChronology.getZone());
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public long getDateTimeMillis(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        Chronology base = getBase();
        if (base != null) {
            return base.getDateTimeMillis(i10, i11, i12, i13);
        }
        long dateTimeMillis = this.iGregorianChronology.getDateTimeMillis(i10, i11, i12, i13);
        if (dateTimeMillis < this.iCutoverMillis) {
            dateTimeMillis = this.iJulianChronology.getDateTimeMillis(i10, i11, i12, i13);
            if (dateTimeMillis >= this.iCutoverMillis) {
                throw new IllegalArgumentException("Specified date does not exist");
            }
        }
        return dateTimeMillis;
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public long getDateTimeMillis(int i10, int i11, int i12, int i13, int i14, int i15, int i16) throws IllegalArgumentException {
        long dateTimeMillis;
        Chronology base = getBase();
        if (base != null) {
            return base.getDateTimeMillis(i10, i11, i12, i13, i14, i15, i16);
        }
        try {
            dateTimeMillis = this.iGregorianChronology.getDateTimeMillis(i10, i11, i12, i13, i14, i15, i16);
        } catch (IllegalFieldValueException e10) {
            if (i11 != 2 || i12 != 29) {
                throw e10;
            }
            dateTimeMillis = this.iGregorianChronology.getDateTimeMillis(i10, i11, 28, i13, i14, i15, i16);
            if (dateTimeMillis >= this.iCutoverMillis) {
                throw e10;
            }
        }
        if (dateTimeMillis < this.iCutoverMillis) {
            dateTimeMillis = this.iJulianChronology.getDateTimeMillis(i10, i11, i12, i13, i14, i15, i16);
            if (dateTimeMillis >= this.iCutoverMillis) {
                throw new IllegalArgumentException("Specified date does not exist");
            }
        }
        return dateTimeMillis;
    }

    public Instant getGregorianCutover() {
        return this.iCutoverInstant;
    }

    public int getMinimumDaysInFirstWeek() {
        return this.iGregorianChronology.getMinimumDaysInFirstWeek();
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public DateTimeZone getZone() {
        Chronology base = getBase();
        return base != null ? base.getZone() : DateTimeZone.UTC;
    }

    public long gregorianToJulianByWeekyear(long j10) {
        return convertByWeekyear(j10, this.iGregorianChronology, this.iJulianChronology);
    }

    public long gregorianToJulianByYear(long j10) {
        return convertByYear(j10, this.iGregorianChronology, this.iJulianChronology);
    }

    public int hashCode() {
        return this.iCutoverInstant.hashCode() + getMinimumDaysInFirstWeek() + getZone().hashCode() + 25025;
    }

    public long julianToGregorianByWeekyear(long j10) {
        return convertByWeekyear(j10, this.iJulianChronology, this.iGregorianChronology);
    }

    public long julianToGregorianByYear(long j10) {
        return convertByYear(j10, this.iJulianChronology, this.iGregorianChronology);
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(60);
        stringBuffer.append("GJChronology");
        stringBuffer.append('[');
        stringBuffer.append(getZone().getID());
        if (this.iCutoverMillis != DEFAULT_CUTOVER.getMillis()) {
            stringBuffer.append(",cutover=");
            (withUTC().dayOfYear().remainder(this.iCutoverMillis) == 0 ? ISODateTimeFormat.date() : ISODateTimeFormat.dateTime()).withChronology(withUTC()).printTo(stringBuffer, this.iCutoverMillis);
        }
        if (getMinimumDaysInFirstWeek() != 4) {
            stringBuffer.append(",mdfw=");
            stringBuffer.append(getMinimumDaysInFirstWeek());
        }
        stringBuffer.append(']');
        return stringBuffer.toString();
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public Chronology withUTC() {
        return withZone(DateTimeZone.UTC);
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public Chronology withZone(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.getDefault();
        }
        return dateTimeZone == getZone() ? this : getInstance(dateTimeZone, this.iCutoverInstant, getMinimumDaysInFirstWeek());
    }
}
