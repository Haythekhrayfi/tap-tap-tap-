package org.joda.time;

import android.support.v4.media.a;
import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.joda.time.base.AbstractPartial;
import org.joda.time.field.AbstractPartialFieldProperty;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/* JADX INFO: loaded from: classes3.dex */
public final class Partial extends AbstractPartial implements Serializable {
    private static final long serialVersionUID = 12324121189002L;
    private final Chronology iChronology;
    private transient DateTimeFormatter[] iFormatter;
    private final DateTimeFieldType[] iTypes;
    private final int[] iValues;

    public static class Property extends AbstractPartialFieldProperty implements Serializable {
        private static final long serialVersionUID = 53278362873888L;
        private final int iFieldIndex;
        private final Partial iPartial;

        public Property(Partial partial, int i10) {
            this.iPartial = partial;
            this.iFieldIndex = i10;
        }

        public Partial addToCopy(int i10) {
            return new Partial(this.iPartial, getField().add(this.iPartial, this.iFieldIndex, this.iPartial.getValues(), i10));
        }

        public Partial addWrapFieldToCopy(int i10) {
            return new Partial(this.iPartial, getField().addWrapField(this.iPartial, this.iFieldIndex, this.iPartial.getValues(), i10));
        }

        @Override // org.joda.time.field.AbstractPartialFieldProperty
        public int get() {
            return this.iPartial.getValue(this.iFieldIndex);
        }

        @Override // org.joda.time.field.AbstractPartialFieldProperty
        public DateTimeField getField() {
            return this.iPartial.getField(this.iFieldIndex);
        }

        public Partial getPartial() {
            return this.iPartial;
        }

        @Override // org.joda.time.field.AbstractPartialFieldProperty
        public ReadablePartial getReadablePartial() {
            return this.iPartial;
        }

        public Partial setCopy(int i10) {
            return new Partial(this.iPartial, getField().set(this.iPartial, this.iFieldIndex, this.iPartial.getValues(), i10));
        }

        public Partial setCopy(String str) {
            return setCopy(str, null);
        }

        public Partial setCopy(String str, Locale locale) {
            return new Partial(this.iPartial, getField().set(this.iPartial, this.iFieldIndex, this.iPartial.getValues(), str, locale));
        }

        public Partial withMaximumValue() {
            return setCopy(getMaximumValue());
        }

        public Partial withMinimumValue() {
            return setCopy(getMinimumValue());
        }
    }

    public Partial() {
        this((Chronology) null);
    }

    public Partial(Chronology chronology) {
        this.iChronology = DateTimeUtils.getChronology(chronology).withUTC();
        this.iTypes = new DateTimeFieldType[0];
        this.iValues = new int[0];
    }

    public Partial(Chronology chronology, DateTimeFieldType[] dateTimeFieldTypeArr, int[] iArr) {
        this.iChronology = chronology;
        this.iTypes = dateTimeFieldTypeArr;
        this.iValues = iArr;
    }

    public Partial(DateTimeFieldType dateTimeFieldType, int i10) {
        this(dateTimeFieldType, i10, (Chronology) null);
    }

    public Partial(DateTimeFieldType dateTimeFieldType, int i10, Chronology chronology) {
        Chronology chronologyWithUTC = DateTimeUtils.getChronology(chronology).withUTC();
        this.iChronology = chronologyWithUTC;
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("The field type must not be null");
        }
        this.iTypes = new DateTimeFieldType[]{dateTimeFieldType};
        int[] iArr = {i10};
        this.iValues = iArr;
        chronologyWithUTC.validate(this, iArr);
    }

    public Partial(Partial partial, int[] iArr) {
        this.iChronology = partial.iChronology;
        this.iTypes = partial.iTypes;
        this.iValues = iArr;
    }

    public Partial(ReadablePartial readablePartial) {
        if (readablePartial == null) {
            throw new IllegalArgumentException("The partial must not be null");
        }
        this.iChronology = DateTimeUtils.getChronology(readablePartial.getChronology()).withUTC();
        this.iTypes = new DateTimeFieldType[readablePartial.size()];
        this.iValues = new int[readablePartial.size()];
        for (int i10 = 0; i10 < readablePartial.size(); i10++) {
            this.iTypes[i10] = readablePartial.getFieldType(i10);
            this.iValues[i10] = readablePartial.getValue(i10);
        }
    }

    public Partial(DateTimeFieldType[] dateTimeFieldTypeArr, int[] iArr) {
        this(dateTimeFieldTypeArr, iArr, (Chronology) null);
    }

    public Partial(DateTimeFieldType[] dateTimeFieldTypeArr, int[] iArr, Chronology chronology) {
        Chronology chronologyWithUTC = DateTimeUtils.getChronology(chronology).withUTC();
        this.iChronology = chronologyWithUTC;
        if (dateTimeFieldTypeArr == null) {
            throw new IllegalArgumentException("Types array must not be null");
        }
        if (iArr == null) {
            throw new IllegalArgumentException("Values array must not be null");
        }
        if (iArr.length != dateTimeFieldTypeArr.length) {
            throw new IllegalArgumentException("Values array must be the same length as the types array");
        }
        if (dateTimeFieldTypeArr.length == 0) {
            this.iTypes = dateTimeFieldTypeArr;
            this.iValues = iArr;
            return;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < dateTimeFieldTypeArr.length; i11++) {
            if (dateTimeFieldTypeArr[i11] == null) {
                throw new IllegalArgumentException(a.a("Types array must not contain null: index ", i11));
            }
        }
        DurationField durationField = null;
        while (i10 < dateTimeFieldTypeArr.length) {
            DateTimeFieldType dateTimeFieldType = dateTimeFieldTypeArr[i10];
            DurationField field = dateTimeFieldType.getDurationType().getField(this.iChronology);
            if (i10 > 0) {
                if (!field.isSupported()) {
                    if (durationField.isSupported()) {
                        StringBuilder sbA = defpackage.a.a("Types array must be in order largest-smallest: ");
                        sbA.append(dateTimeFieldTypeArr[i10 - 1].getName());
                        sbA.append(" < ");
                        sbA.append(dateTimeFieldType.getName());
                        throw new IllegalArgumentException(sbA.toString());
                    }
                    StringBuilder sbA2 = defpackage.a.a("Types array must not contain duplicate unsupported: ");
                    sbA2.append(dateTimeFieldTypeArr[i10 - 1].getName());
                    sbA2.append(" and ");
                    sbA2.append(dateTimeFieldType.getName());
                    throw new IllegalArgumentException(sbA2.toString());
                }
                int iCompareTo = durationField.compareTo(field);
                if (iCompareTo < 0) {
                    StringBuilder sbA3 = defpackage.a.a("Types array must be in order largest-smallest: ");
                    sbA3.append(dateTimeFieldTypeArr[i10 - 1].getName());
                    sbA3.append(" < ");
                    sbA3.append(dateTimeFieldType.getName());
                    throw new IllegalArgumentException(sbA3.toString());
                }
                if (iCompareTo != 0) {
                    continue;
                } else if (durationField.equals(field)) {
                    int i12 = i10 - 1;
                    DurationFieldType rangeDurationType = dateTimeFieldTypeArr[i12].getRangeDurationType();
                    DurationFieldType rangeDurationType2 = dateTimeFieldType.getRangeDurationType();
                    if (rangeDurationType == null) {
                        if (rangeDurationType2 == null) {
                            StringBuilder sbA4 = defpackage.a.a("Types array must not contain duplicate: ");
                            sbA4.append(dateTimeFieldTypeArr[i12].getName());
                            sbA4.append(" and ");
                            sbA4.append(dateTimeFieldType.getName());
                            throw new IllegalArgumentException(sbA4.toString());
                        }
                    } else {
                        if (rangeDurationType2 == null) {
                            StringBuilder sbA5 = defpackage.a.a("Types array must be in order largest-smallest: ");
                            sbA5.append(dateTimeFieldTypeArr[i12].getName());
                            sbA5.append(" < ");
                            sbA5.append(dateTimeFieldType.getName());
                            throw new IllegalArgumentException(sbA5.toString());
                        }
                        DurationField field2 = rangeDurationType.getField(this.iChronology);
                        DurationField field3 = rangeDurationType2.getField(this.iChronology);
                        if (field2.compareTo(field3) < 0) {
                            StringBuilder sbA6 = defpackage.a.a("Types array must be in order largest-smallest: ");
                            sbA6.append(dateTimeFieldTypeArr[i12].getName());
                            sbA6.append(" < ");
                            sbA6.append(dateTimeFieldType.getName());
                            throw new IllegalArgumentException(sbA6.toString());
                        }
                        if (field2.compareTo(field3) == 0) {
                            StringBuilder sbA7 = defpackage.a.a("Types array must not contain duplicate: ");
                            sbA7.append(dateTimeFieldTypeArr[i12].getName());
                            sbA7.append(" and ");
                            sbA7.append(dateTimeFieldType.getName());
                            throw new IllegalArgumentException(sbA7.toString());
                        }
                    }
                } else if (durationField.isSupported() && durationField.getType() != DurationFieldType.YEARS_TYPE) {
                    StringBuilder sbA8 = defpackage.a.a("Types array must be in order largest-smallest, for year-based fields, years is defined as being largest: ");
                    sbA8.append(dateTimeFieldTypeArr[i10 - 1].getName());
                    sbA8.append(" < ");
                    sbA8.append(dateTimeFieldType.getName());
                    throw new IllegalArgumentException(sbA8.toString());
                }
            }
            i10++;
            durationField = field;
        }
        this.iTypes = (DateTimeFieldType[]) dateTimeFieldTypeArr.clone();
        chronologyWithUTC.validate(this, iArr);
        this.iValues = (int[]) iArr.clone();
    }

    @Override // org.joda.time.ReadablePartial
    public Chronology getChronology() {
        return this.iChronology;
    }

    @Override // org.joda.time.base.AbstractPartial
    public DateTimeField getField(int i10, Chronology chronology) {
        return this.iTypes[i10].getField(chronology);
    }

    @Override // org.joda.time.base.AbstractPartial, org.joda.time.ReadablePartial
    public DateTimeFieldType getFieldType(int i10) {
        return this.iTypes[i10];
    }

    @Override // org.joda.time.base.AbstractPartial
    public DateTimeFieldType[] getFieldTypes() {
        return (DateTimeFieldType[]) this.iTypes.clone();
    }

    public DateTimeFormatter getFormatter() {
        DateTimeFormatter[] dateTimeFormatterArr = this.iFormatter;
        if (dateTimeFormatterArr == null) {
            if (size() == 0) {
                return null;
            }
            dateTimeFormatterArr = new DateTimeFormatter[2];
            try {
                ArrayList arrayList = new ArrayList(Arrays.asList(this.iTypes));
                dateTimeFormatterArr[0] = ISODateTimeFormat.forFields(arrayList, true, false);
                if (arrayList.size() == 0) {
                    dateTimeFormatterArr[1] = dateTimeFormatterArr[0];
                }
            } catch (IllegalArgumentException unused) {
            }
            this.iFormatter = dateTimeFormatterArr;
        }
        return dateTimeFormatterArr[0];
    }

    @Override // org.joda.time.ReadablePartial
    public int getValue(int i10) {
        return this.iValues[i10];
    }

    @Override // org.joda.time.base.AbstractPartial
    public int[] getValues() {
        return (int[]) this.iValues.clone();
    }

    public boolean isMatch(ReadableInstant readableInstant) {
        long instantMillis = DateTimeUtils.getInstantMillis(readableInstant);
        Chronology instantChronology = DateTimeUtils.getInstantChronology(readableInstant);
        int i10 = 0;
        while (true) {
            DateTimeFieldType[] dateTimeFieldTypeArr = this.iTypes;
            if (i10 >= dateTimeFieldTypeArr.length) {
                return true;
            }
            if (dateTimeFieldTypeArr[i10].getField(instantChronology).get(instantMillis) != this.iValues[i10]) {
                return false;
            }
            i10++;
        }
    }

    public boolean isMatch(ReadablePartial readablePartial) {
        if (readablePartial == null) {
            throw new IllegalArgumentException("The partial must not be null");
        }
        int i10 = 0;
        while (true) {
            DateTimeFieldType[] dateTimeFieldTypeArr = this.iTypes;
            if (i10 >= dateTimeFieldTypeArr.length) {
                return true;
            }
            if (readablePartial.get(dateTimeFieldTypeArr[i10]) != this.iValues[i10]) {
                return false;
            }
            i10++;
        }
    }

    public Partial minus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, -1);
    }

    public Partial plus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, 1);
    }

    public Property property(DateTimeFieldType dateTimeFieldType) {
        return new Property(this, indexOfSupported(dateTimeFieldType));
    }

    @Override // org.joda.time.ReadablePartial
    public int size() {
        return this.iTypes.length;
    }

    @Override // org.joda.time.ReadablePartial
    public String toString() {
        DateTimeFormatter[] dateTimeFormatterArr = this.iFormatter;
        if (dateTimeFormatterArr == null) {
            getFormatter();
            dateTimeFormatterArr = this.iFormatter;
            if (dateTimeFormatterArr == null) {
                return toStringList();
            }
        }
        DateTimeFormatter dateTimeFormatter = dateTimeFormatterArr[1];
        return dateTimeFormatter == null ? toStringList() : dateTimeFormatter.print(this);
    }

    public String toString(String str) {
        return str == null ? toString() : DateTimeFormat.forPattern(str).print(this);
    }

    public String toString(String str, Locale locale) {
        return str == null ? toString() : DateTimeFormat.forPattern(str).withLocale(locale).print(this);
    }

    public String toStringList() {
        int size = size();
        StringBuilder sb2 = new StringBuilder(size * 20);
        sb2.append('[');
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                sb2.append(CoreConstants.COMMA_CHAR);
                sb2.append(' ');
            }
            sb2.append(this.iTypes[i10].getName());
            sb2.append('=');
            sb2.append(this.iValues[i10]);
        }
        sb2.append(']');
        return sb2.toString();
    }

    public Partial with(DateTimeFieldType dateTimeFieldType, int i10) {
        int i11;
        int iCompareTo;
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("The field type must not be null");
        }
        int iIndexOf = indexOf(dateTimeFieldType);
        if (iIndexOf != -1) {
            return i10 == getValue(iIndexOf) ? this : new Partial(this, getField(iIndexOf).set(this, iIndexOf, getValues(), i10));
        }
        int length = this.iTypes.length + 1;
        DateTimeFieldType[] dateTimeFieldTypeArr = new DateTimeFieldType[length];
        int[] iArr = new int[length];
        DurationField field = dateTimeFieldType.getDurationType().getField(this.iChronology);
        if (field.isSupported()) {
            i11 = 0;
            while (true) {
                DateTimeFieldType[] dateTimeFieldTypeArr2 = this.iTypes;
                if (i11 >= dateTimeFieldTypeArr2.length) {
                    break;
                }
                DateTimeFieldType dateTimeFieldType2 = dateTimeFieldTypeArr2[i11];
                DurationField field2 = dateTimeFieldType2.getDurationType().getField(this.iChronology);
                if (field2.isSupported() && ((iCompareTo = field.compareTo(field2)) > 0 || (iCompareTo == 0 && (dateTimeFieldType.getRangeDurationType() == null || (dateTimeFieldType2.getRangeDurationType() != null && dateTimeFieldType.getRangeDurationType().getField(this.iChronology).compareTo(dateTimeFieldType2.getRangeDurationType().getField(this.iChronology)) > 0))))) {
                    break;
                }
                i11++;
            }
        } else {
            i11 = 0;
        }
        System.arraycopy(this.iTypes, 0, dateTimeFieldTypeArr, 0, i11);
        System.arraycopy(this.iValues, 0, iArr, 0, i11);
        dateTimeFieldTypeArr[i11] = dateTimeFieldType;
        iArr[i11] = i10;
        int i12 = i11 + 1;
        int i13 = (length - i11) - 1;
        System.arraycopy(this.iTypes, i11, dateTimeFieldTypeArr, i12, i13);
        System.arraycopy(this.iValues, i11, iArr, i12, i13);
        Partial partial = new Partial(dateTimeFieldTypeArr, iArr, this.iChronology);
        this.iChronology.validate(partial, iArr);
        return partial;
    }

    public Partial withChronologyRetainFields(Chronology chronology) {
        Chronology chronologyWithUTC = DateTimeUtils.getChronology(chronology).withUTC();
        if (chronologyWithUTC == getChronology()) {
            return this;
        }
        Partial partial = new Partial(chronologyWithUTC, this.iTypes, this.iValues);
        chronologyWithUTC.validate(partial, this.iValues);
        return partial;
    }

    public Partial withField(DateTimeFieldType dateTimeFieldType, int i10) {
        int iIndexOfSupported = indexOfSupported(dateTimeFieldType);
        if (i10 == getValue(iIndexOfSupported)) {
            return this;
        }
        return new Partial(this, getField(iIndexOfSupported).set(this, iIndexOfSupported, getValues(), i10));
    }

    public Partial withFieldAddWrapped(DurationFieldType durationFieldType, int i10) {
        int iIndexOfSupported = indexOfSupported(durationFieldType);
        if (i10 == 0) {
            return this;
        }
        return new Partial(this, getField(iIndexOfSupported).addWrapPartial(this, iIndexOfSupported, getValues(), i10));
    }

    public Partial withFieldAdded(DurationFieldType durationFieldType, int i10) {
        int iIndexOfSupported = indexOfSupported(durationFieldType);
        if (i10 == 0) {
            return this;
        }
        return new Partial(this, getField(iIndexOfSupported).add(this, iIndexOfSupported, getValues(), i10));
    }

    public Partial withPeriodAdded(ReadablePeriod readablePeriod, int i10) {
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
        return new Partial(this, values);
    }

    public Partial without(DateTimeFieldType dateTimeFieldType) {
        int iIndexOf = indexOf(dateTimeFieldType);
        if (iIndexOf == -1) {
            return this;
        }
        int size = size() - 1;
        DateTimeFieldType[] dateTimeFieldTypeArr = new DateTimeFieldType[size];
        int size2 = size() - 1;
        int[] iArr = new int[size2];
        System.arraycopy(this.iTypes, 0, dateTimeFieldTypeArr, 0, iIndexOf);
        int i10 = iIndexOf + 1;
        System.arraycopy(this.iTypes, i10, dateTimeFieldTypeArr, iIndexOf, size - iIndexOf);
        System.arraycopy(this.iValues, 0, iArr, 0, iIndexOf);
        System.arraycopy(this.iValues, i10, iArr, iIndexOf, size2 - iIndexOf);
        Partial partial = new Partial(this.iChronology, dateTimeFieldTypeArr, iArr);
        this.iChronology.validate(partial, iArr);
        return partial;
    }
}
