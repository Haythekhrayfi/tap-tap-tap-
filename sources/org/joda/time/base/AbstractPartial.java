package org.joda.time.base;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DurationFieldType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractPartial implements ReadablePartial, Comparable<ReadablePartial> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Comparable
    public int compareTo(ReadablePartial readablePartial) {
        if (this == readablePartial) {
            return 0;
        }
        if (size() != readablePartial.size()) {
            throw new ClassCastException("ReadablePartial objects must have matching field types");
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (getFieldType(i10) != readablePartial.getFieldType(i10)) {
                throw new ClassCastException("ReadablePartial objects must have matching field types");
            }
        }
        int size2 = size();
        for (int i11 = 0; i11 < size2; i11++) {
            if (getValue(i11) > readablePartial.getValue(i11)) {
                return 1;
            }
            if (getValue(i11) < readablePartial.getValue(i11)) {
                return -1;
            }
        }
        return 0;
    }

    @Override // org.joda.time.ReadablePartial
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReadablePartial)) {
            return false;
        }
        ReadablePartial readablePartial = (ReadablePartial) obj;
        if (size() != readablePartial.size()) {
            return false;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (getValue(i10) != readablePartial.getValue(i10) || getFieldType(i10) != readablePartial.getFieldType(i10)) {
                return false;
            }
        }
        return FieldUtils.equals(getChronology(), readablePartial.getChronology());
    }

    @Override // org.joda.time.ReadablePartial
    public int get(DateTimeFieldType dateTimeFieldType) {
        return getValue(indexOfSupported(dateTimeFieldType));
    }

    @Override // org.joda.time.ReadablePartial
    public DateTimeField getField(int i10) {
        return getField(i10, getChronology());
    }

    public abstract DateTimeField getField(int i10, Chronology chronology);

    @Override // org.joda.time.ReadablePartial
    public DateTimeFieldType getFieldType(int i10) {
        return getField(i10, getChronology()).getType();
    }

    public DateTimeFieldType[] getFieldTypes() {
        int size = size();
        DateTimeFieldType[] dateTimeFieldTypeArr = new DateTimeFieldType[size];
        for (int i10 = 0; i10 < size; i10++) {
            dateTimeFieldTypeArr[i10] = getFieldType(i10);
        }
        return dateTimeFieldTypeArr;
    }

    public DateTimeField[] getFields() {
        int size = size();
        DateTimeField[] dateTimeFieldArr = new DateTimeField[size];
        for (int i10 = 0; i10 < size; i10++) {
            dateTimeFieldArr[i10] = getField(i10);
        }
        return dateTimeFieldArr;
    }

    public int[] getValues() {
        int size = size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = getValue(i10);
        }
        return iArr;
    }

    @Override // org.joda.time.ReadablePartial
    public int hashCode() {
        int size = size();
        int iHashCode = 157;
        for (int i10 = 0; i10 < size; i10++) {
            iHashCode = getFieldType(i10).hashCode() + ((getValue(i10) + (iHashCode * 23)) * 23);
        }
        return getChronology().hashCode() + iHashCode;
    }

    public int indexOf(DateTimeFieldType dateTimeFieldType) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (getFieldType(i10) == dateTimeFieldType) {
                return i10;
            }
        }
        return -1;
    }

    public int indexOf(DurationFieldType durationFieldType) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (getFieldType(i10).getDurationType() == durationFieldType) {
                return i10;
            }
        }
        return -1;
    }

    public int indexOfSupported(DateTimeFieldType dateTimeFieldType) {
        int iIndexOf = indexOf(dateTimeFieldType);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        throw new IllegalArgumentException("Field '" + dateTimeFieldType + "' is not supported");
    }

    public int indexOfSupported(DurationFieldType durationFieldType) {
        int iIndexOf = indexOf(durationFieldType);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        throw new IllegalArgumentException("Field '" + durationFieldType + "' is not supported");
    }

    public boolean isAfter(ReadablePartial readablePartial) {
        if (readablePartial != null) {
            return compareTo(readablePartial) > 0;
        }
        throw new IllegalArgumentException("Partial cannot be null");
    }

    public boolean isBefore(ReadablePartial readablePartial) {
        if (readablePartial != null) {
            return compareTo(readablePartial) < 0;
        }
        throw new IllegalArgumentException("Partial cannot be null");
    }

    public boolean isEqual(ReadablePartial readablePartial) {
        if (readablePartial != null) {
            return compareTo(readablePartial) == 0;
        }
        throw new IllegalArgumentException("Partial cannot be null");
    }

    @Override // org.joda.time.ReadablePartial
    public boolean isSupported(DateTimeFieldType dateTimeFieldType) {
        return indexOf(dateTimeFieldType) != -1;
    }

    @Override // org.joda.time.ReadablePartial
    public DateTime toDateTime(ReadableInstant readableInstant) {
        Chronology instantChronology = DateTimeUtils.getInstantChronology(readableInstant);
        return new DateTime(instantChronology.set(this, DateTimeUtils.getInstantMillis(readableInstant)), instantChronology);
    }

    public String toString(DateTimeFormatter dateTimeFormatter) {
        return dateTimeFormatter == null ? toString() : dateTimeFormatter.print(this);
    }
}
