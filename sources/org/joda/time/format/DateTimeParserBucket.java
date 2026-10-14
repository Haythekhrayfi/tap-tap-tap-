package org.joda.time.format;

import ch.qos.logback.core.CoreConstants;
import defpackage.a;
import java.util.Arrays;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.IllegalInstantException;

/* JADX INFO: loaded from: classes3.dex */
public class DateTimeParserBucket {
    private final Chronology iChrono;
    private final Integer iDefaultPivotYear;
    private final int iDefaultYear;
    private final DateTimeZone iDefaultZone;
    private final Locale iLocale;
    private final long iMillis;
    private Integer iOffset;
    private Integer iPivotYear;
    private SavedField[] iSavedFields;
    private int iSavedFieldsCount;
    private boolean iSavedFieldsShared;
    private Object iSavedState;
    private DateTimeZone iZone;

    public static class SavedField implements Comparable<SavedField> {
        public DateTimeField iField;
        public Locale iLocale;
        public String iText;
        public int iValue;

        @Override // java.lang.Comparable
        public int compareTo(SavedField savedField) {
            DateTimeField dateTimeField = savedField.iField;
            int iCompareReverse = DateTimeParserBucket.compareReverse(this.iField.getRangeDurationField(), dateTimeField.getRangeDurationField());
            return iCompareReverse != 0 ? iCompareReverse : DateTimeParserBucket.compareReverse(this.iField.getDurationField(), dateTimeField.getDurationField());
        }

        public void init(DateTimeField dateTimeField, int i10) {
            this.iField = dateTimeField;
            this.iValue = i10;
            this.iText = null;
            this.iLocale = null;
        }

        public void init(DateTimeField dateTimeField, String str, Locale locale) {
            this.iField = dateTimeField;
            this.iValue = 0;
            this.iText = str;
            this.iLocale = locale;
        }

        public long set(long j10, boolean z10) {
            String str = this.iText;
            long extended = str == null ? this.iField.setExtended(j10, this.iValue) : this.iField.set(j10, str, this.iLocale);
            return z10 ? this.iField.roundFloor(extended) : extended;
        }
    }

    public class SavedState {
        public final Integer iOffset;
        public final SavedField[] iSavedFields;
        public final int iSavedFieldsCount;
        public final DateTimeZone iZone;

        public SavedState() {
            this.iZone = DateTimeParserBucket.this.iZone;
            this.iOffset = DateTimeParserBucket.this.iOffset;
            this.iSavedFields = DateTimeParserBucket.this.iSavedFields;
            this.iSavedFieldsCount = DateTimeParserBucket.this.iSavedFieldsCount;
        }

        public boolean restoreState(DateTimeParserBucket dateTimeParserBucket) {
            if (dateTimeParserBucket != DateTimeParserBucket.this) {
                return false;
            }
            dateTimeParserBucket.iZone = this.iZone;
            dateTimeParserBucket.iOffset = this.iOffset;
            dateTimeParserBucket.iSavedFields = this.iSavedFields;
            if (this.iSavedFieldsCount < dateTimeParserBucket.iSavedFieldsCount) {
                dateTimeParserBucket.iSavedFieldsShared = true;
            }
            dateTimeParserBucket.iSavedFieldsCount = this.iSavedFieldsCount;
            return true;
        }
    }

    @Deprecated
    public DateTimeParserBucket(long j10, Chronology chronology, Locale locale) {
        this(j10, chronology, locale, null, 2000);
    }

    @Deprecated
    public DateTimeParserBucket(long j10, Chronology chronology, Locale locale, Integer num) {
        this(j10, chronology, locale, num, 2000);
    }

    public DateTimeParserBucket(long j10, Chronology chronology, Locale locale, Integer num, int i10) {
        Chronology chronology2 = DateTimeUtils.getChronology(chronology);
        this.iMillis = j10;
        DateTimeZone zone = chronology2.getZone();
        this.iDefaultZone = zone;
        this.iChrono = chronology2.withUTC();
        this.iLocale = locale == null ? Locale.getDefault() : locale;
        this.iDefaultYear = i10;
        this.iDefaultPivotYear = num;
        this.iZone = zone;
        this.iPivotYear = num;
        this.iSavedFields = new SavedField[8];
    }

    public static int compareReverse(DurationField durationField, DurationField durationField2) {
        if (durationField == null || !durationField.isSupported()) {
            return (durationField2 == null || !durationField2.isSupported()) ? 0 : -1;
        }
        if (durationField2 == null || !durationField2.isSupported()) {
            return 1;
        }
        return -durationField.compareTo(durationField2);
    }

    private SavedField obtainSaveField() {
        SavedField[] savedFieldArr = this.iSavedFields;
        int i10 = this.iSavedFieldsCount;
        if (i10 == savedFieldArr.length || this.iSavedFieldsShared) {
            SavedField[] savedFieldArr2 = new SavedField[i10 == savedFieldArr.length ? i10 * 2 : savedFieldArr.length];
            System.arraycopy(savedFieldArr, 0, savedFieldArr2, 0, i10);
            this.iSavedFields = savedFieldArr2;
            this.iSavedFieldsShared = false;
            savedFieldArr = savedFieldArr2;
        }
        this.iSavedState = null;
        SavedField savedField = savedFieldArr[i10];
        if (savedField == null) {
            savedField = new SavedField();
            savedFieldArr[i10] = savedField;
        }
        this.iSavedFieldsCount = i10 + 1;
        return savedField;
    }

    private static void sort(SavedField[] savedFieldArr, int i10) {
        if (i10 > 10) {
            Arrays.sort(savedFieldArr, 0, i10);
            return;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            for (int i12 = i11; i12 > 0; i12--) {
                int i13 = i12 - 1;
                if (savedFieldArr[i13].compareTo(savedFieldArr[i12]) <= 0) {
                    break;
                }
                SavedField savedField = savedFieldArr[i12];
                savedFieldArr[i12] = savedFieldArr[i13];
                savedFieldArr[i13] = savedField;
            }
        }
    }

    public long computeMillis() {
        return computeMillis(false, (CharSequence) null);
    }

    public long computeMillis(boolean z10) {
        return computeMillis(z10, (CharSequence) null);
    }

    public long computeMillis(boolean z10, CharSequence charSequence) {
        SavedField[] savedFieldArr = this.iSavedFields;
        int i10 = this.iSavedFieldsCount;
        if (this.iSavedFieldsShared) {
            savedFieldArr = (SavedField[]) savedFieldArr.clone();
            this.iSavedFields = savedFieldArr;
            this.iSavedFieldsShared = false;
        }
        sort(savedFieldArr, i10);
        if (i10 > 0) {
            DurationField field = DurationFieldType.months().getField(this.iChrono);
            DurationField field2 = DurationFieldType.days().getField(this.iChrono);
            DurationField durationField = savedFieldArr[0].iField.getDurationField();
            if (compareReverse(durationField, field) >= 0 && compareReverse(durationField, field2) <= 0) {
                saveField(DateTimeFieldType.year(), this.iDefaultYear);
                return computeMillis(z10, charSequence);
            }
        }
        long j10 = this.iMillis;
        for (int i11 = 0; i11 < i10; i11++) {
            try {
                j10 = savedFieldArr[i11].set(j10, z10);
            } catch (IllegalFieldValueException e10) {
                if (charSequence != null) {
                    e10.prependMessage("Cannot parse \"" + ((Object) charSequence) + CoreConstants.DOUBLE_QUOTE_CHAR);
                }
                throw e10;
            }
        }
        if (z10) {
            int i12 = 0;
            while (i12 < i10) {
                if (!savedFieldArr[i12].iField.isLenient()) {
                    j10 = savedFieldArr[i12].set(j10, i12 == i10 + (-1));
                }
                i12++;
            }
        }
        Integer num = this.iOffset;
        if (num != null) {
            return j10 - ((long) num.intValue());
        }
        DateTimeZone dateTimeZone = this.iZone;
        if (dateTimeZone == null) {
            return j10;
        }
        int offsetFromLocal = dateTimeZone.getOffsetFromLocal(j10);
        long j11 = j10 - ((long) offsetFromLocal);
        if (offsetFromLocal == this.iZone.getOffset(j11)) {
            return j11;
        }
        StringBuilder sbA = a.a("Illegal instant due to time zone offset transition (");
        sbA.append(this.iZone);
        sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String string = sbA.toString();
        if (charSequence != null) {
            string = "Cannot parse \"" + ((Object) charSequence) + "\": " + string;
        }
        throw new IllegalInstantException(string);
    }

    public long computeMillis(boolean z10, String str) {
        return computeMillis(z10, (CharSequence) str);
    }

    public long doParseMillis(InternalParser internalParser, CharSequence charSequence) {
        int into = internalParser.parseInto(this, charSequence, 0);
        if (into < 0) {
            into = ~into;
        } else if (into >= charSequence.length()) {
            return computeMillis(true, charSequence);
        }
        throw new IllegalArgumentException(FormatUtils.createErrorMessage(charSequence.toString(), into));
    }

    public Chronology getChronology() {
        return this.iChrono;
    }

    public Locale getLocale() {
        return this.iLocale;
    }

    @Deprecated
    public int getOffset() {
        Integer num = this.iOffset;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public Integer getOffsetInteger() {
        return this.iOffset;
    }

    public Integer getPivotYear() {
        return this.iPivotYear;
    }

    public DateTimeZone getZone() {
        return this.iZone;
    }

    public long parseMillis(DateTimeParser dateTimeParser, CharSequence charSequence) {
        reset();
        return doParseMillis(DateTimeParserInternalParser.of(dateTimeParser), charSequence);
    }

    public void reset() {
        this.iZone = this.iDefaultZone;
        this.iOffset = null;
        this.iPivotYear = this.iDefaultPivotYear;
        this.iSavedFieldsCount = 0;
        this.iSavedFieldsShared = false;
        this.iSavedState = null;
    }

    public boolean restoreState(Object obj) {
        if (!(obj instanceof SavedState) || !((SavedState) obj).restoreState(this)) {
            return false;
        }
        this.iSavedState = obj;
        return true;
    }

    public void saveField(DateTimeField dateTimeField, int i10) {
        obtainSaveField().init(dateTimeField, i10);
    }

    public void saveField(DateTimeFieldType dateTimeFieldType, int i10) {
        obtainSaveField().init(dateTimeFieldType.getField(this.iChrono), i10);
    }

    public void saveField(DateTimeFieldType dateTimeFieldType, String str, Locale locale) {
        obtainSaveField().init(dateTimeFieldType.getField(this.iChrono), str, locale);
    }

    public Object saveState() {
        if (this.iSavedState == null) {
            this.iSavedState = new SavedState();
        }
        return this.iSavedState;
    }

    @Deprecated
    public void setOffset(int i10) {
        this.iSavedState = null;
        this.iOffset = Integer.valueOf(i10);
    }

    public void setOffset(Integer num) {
        this.iSavedState = null;
        this.iOffset = num;
    }

    @Deprecated
    public void setPivotYear(Integer num) {
        this.iPivotYear = num;
    }

    public void setZone(DateTimeZone dateTimeZone) {
        this.iSavedState = null;
        this.iZone = dateTimeZone;
    }
}
