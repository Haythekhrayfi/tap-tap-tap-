package org.joda.time.field;

import defpackage.a;
import java.util.Locale;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.ReadablePartial;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseDateTimeField extends DateTimeField {
    private final DateTimeFieldType iType;

    public BaseDateTimeField(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("The type must not be null");
        }
        this.iType = dateTimeFieldType;
    }

    @Override // org.joda.time.DateTimeField
    public long add(long j10, int i10) {
        return getDurationField().add(j10, i10);
    }

    @Override // org.joda.time.DateTimeField
    public long add(long j10, long j11) {
        return getDurationField().add(j10, j11);
    }

    @Override // org.joda.time.DateTimeField
    public int[] add(ReadablePartial readablePartial, int i10, int[] iArr, int i11) {
        if (i11 == 0) {
            return iArr;
        }
        DateTimeField field = null;
        while (i11 > 0) {
            int maximumValue = getMaximumValue(readablePartial, iArr);
            long j10 = iArr[i10] + i11;
            if (j10 <= maximumValue) {
                iArr[i10] = (int) j10;
                break;
            }
            if (field == null) {
                if (i10 == 0) {
                    throw new IllegalArgumentException("Maximum value exceeded for add");
                }
                field = readablePartial.getField(i10 - 1);
                if (getRangeDurationField().getType() != field.getDurationField().getType()) {
                    throw new IllegalArgumentException("Fields invalid for add");
                }
            }
            i11 -= (maximumValue + 1) - iArr[i10];
            iArr = field.add(readablePartial, i10 - 1, iArr, 1);
            iArr[i10] = getMinimumValue(readablePartial, iArr);
        }
        while (i11 < 0) {
            int minimumValue = getMinimumValue(readablePartial, iArr);
            long j11 = iArr[i10] + i11;
            if (j11 >= minimumValue) {
                iArr[i10] = (int) j11;
                break;
            }
            if (field == null) {
                if (i10 == 0) {
                    throw new IllegalArgumentException("Maximum value exceeded for add");
                }
                field = readablePartial.getField(i10 - 1);
                if (getRangeDurationField().getType() != field.getDurationField().getType()) {
                    throw new IllegalArgumentException("Fields invalid for add");
                }
            }
            i11 -= (minimumValue - 1) - iArr[i10];
            iArr = field.add(readablePartial, i10 - 1, iArr, -1);
            iArr[i10] = getMaximumValue(readablePartial, iArr);
        }
        return set(readablePartial, i10, iArr, iArr[i10]);
    }

    @Override // org.joda.time.DateTimeField
    public long addWrapField(long j10, int i10) {
        return set(j10, FieldUtils.getWrappedValue(get(j10), i10, getMinimumValue(j10), getMaximumValue(j10)));
    }

    @Override // org.joda.time.DateTimeField
    public int[] addWrapField(ReadablePartial readablePartial, int i10, int[] iArr, int i11) {
        return set(readablePartial, i10, iArr, FieldUtils.getWrappedValue(iArr[i10], i11, getMinimumValue(readablePartial), getMaximumValue(readablePartial)));
    }

    @Override // org.joda.time.DateTimeField
    public int[] addWrapPartial(ReadablePartial readablePartial, int i10, int[] iArr, int i11) {
        if (i11 == 0) {
            return iArr;
        }
        DateTimeField field = null;
        while (i11 > 0) {
            int maximumValue = getMaximumValue(readablePartial, iArr);
            long j10 = iArr[i10] + i11;
            if (j10 <= maximumValue) {
                iArr[i10] = (int) j10;
                break;
            }
            if (field == null) {
                if (i10 == 0) {
                    i11 -= (maximumValue + 1) - iArr[i10];
                    iArr[i10] = getMinimumValue(readablePartial, iArr);
                } else {
                    field = readablePartial.getField(i10 - 1);
                    if (getRangeDurationField().getType() != field.getDurationField().getType()) {
                        throw new IllegalArgumentException("Fields invalid for add");
                    }
                }
            }
            i11 -= (maximumValue + 1) - iArr[i10];
            iArr = field.addWrapPartial(readablePartial, i10 - 1, iArr, 1);
            iArr[i10] = getMinimumValue(readablePartial, iArr);
        }
        while (i11 < 0) {
            int minimumValue = getMinimumValue(readablePartial, iArr);
            long j11 = iArr[i10] + i11;
            if (j11 >= minimumValue) {
                iArr[i10] = (int) j11;
                break;
            }
            if (field == null) {
                if (i10 == 0) {
                    i11 -= (minimumValue - 1) - iArr[i10];
                    iArr[i10] = getMaximumValue(readablePartial, iArr);
                } else {
                    field = readablePartial.getField(i10 - 1);
                    if (getRangeDurationField().getType() != field.getDurationField().getType()) {
                        throw new IllegalArgumentException("Fields invalid for add");
                    }
                }
            }
            i11 -= (minimumValue - 1) - iArr[i10];
            iArr = field.addWrapPartial(readablePartial, i10 - 1, iArr, -1);
            iArr[i10] = getMaximumValue(readablePartial, iArr);
        }
        return set(readablePartial, i10, iArr, iArr[i10]);
    }

    public int convertText(String str, Locale locale) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new IllegalFieldValueException(getType(), str);
        }
    }

    @Override // org.joda.time.DateTimeField
    public abstract int get(long j10);

    @Override // org.joda.time.DateTimeField
    public String getAsShortText(int i10, Locale locale) {
        return getAsText(i10, locale);
    }

    @Override // org.joda.time.DateTimeField
    public final String getAsShortText(long j10) {
        return getAsShortText(j10, (Locale) null);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsShortText(long j10, Locale locale) {
        return getAsShortText(get(j10), locale);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsShortText(ReadablePartial readablePartial, int i10, Locale locale) {
        return getAsShortText(i10, locale);
    }

    @Override // org.joda.time.DateTimeField
    public final String getAsShortText(ReadablePartial readablePartial, Locale locale) {
        return getAsShortText(readablePartial, readablePartial.get(getType()), locale);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsText(int i10, Locale locale) {
        return Integer.toString(i10);
    }

    @Override // org.joda.time.DateTimeField
    public final String getAsText(long j10) {
        return getAsText(j10, (Locale) null);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsText(long j10, Locale locale) {
        return getAsText(get(j10), locale);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsText(ReadablePartial readablePartial, int i10, Locale locale) {
        return getAsText(i10, locale);
    }

    @Override // org.joda.time.DateTimeField
    public final String getAsText(ReadablePartial readablePartial, Locale locale) {
        return getAsText(readablePartial, readablePartial.get(getType()), locale);
    }

    @Override // org.joda.time.DateTimeField
    public int getDifference(long j10, long j11) {
        return getDurationField().getDifference(j10, j11);
    }

    @Override // org.joda.time.DateTimeField
    public long getDifferenceAsLong(long j10, long j11) {
        return getDurationField().getDifferenceAsLong(j10, j11);
    }

    @Override // org.joda.time.DateTimeField
    public abstract DurationField getDurationField();

    @Override // org.joda.time.DateTimeField
    public int getLeapAmount(long j10) {
        return 0;
    }

    @Override // org.joda.time.DateTimeField
    public DurationField getLeapDurationField() {
        return null;
    }

    @Override // org.joda.time.DateTimeField
    public int getMaximumShortTextLength(Locale locale) {
        return getMaximumTextLength(locale);
    }

    @Override // org.joda.time.DateTimeField
    public int getMaximumTextLength(Locale locale) {
        int maximumValue = getMaximumValue();
        if (maximumValue >= 0) {
            if (maximumValue < 10) {
                return 1;
            }
            if (maximumValue < 100) {
                return 2;
            }
            if (maximumValue < 1000) {
                return 3;
            }
        }
        return Integer.toString(maximumValue).length();
    }

    @Override // org.joda.time.DateTimeField
    public abstract int getMaximumValue();

    @Override // org.joda.time.DateTimeField
    public int getMaximumValue(long j10) {
        return getMaximumValue();
    }

    @Override // org.joda.time.DateTimeField
    public int getMaximumValue(ReadablePartial readablePartial) {
        return getMaximumValue();
    }

    @Override // org.joda.time.DateTimeField
    public int getMaximumValue(ReadablePartial readablePartial, int[] iArr) {
        return getMaximumValue(readablePartial);
    }

    @Override // org.joda.time.DateTimeField
    public abstract int getMinimumValue();

    @Override // org.joda.time.DateTimeField
    public int getMinimumValue(long j10) {
        return getMinimumValue();
    }

    @Override // org.joda.time.DateTimeField
    public int getMinimumValue(ReadablePartial readablePartial) {
        return getMinimumValue();
    }

    @Override // org.joda.time.DateTimeField
    public int getMinimumValue(ReadablePartial readablePartial, int[] iArr) {
        return getMinimumValue(readablePartial);
    }

    @Override // org.joda.time.DateTimeField
    public final String getName() {
        return this.iType.getName();
    }

    @Override // org.joda.time.DateTimeField
    public abstract DurationField getRangeDurationField();

    @Override // org.joda.time.DateTimeField
    public final DateTimeFieldType getType() {
        return this.iType;
    }

    @Override // org.joda.time.DateTimeField
    public boolean isLeap(long j10) {
        return false;
    }

    @Override // org.joda.time.DateTimeField
    public final boolean isSupported() {
        return true;
    }

    @Override // org.joda.time.DateTimeField
    public long remainder(long j10) {
        return j10 - roundFloor(j10);
    }

    @Override // org.joda.time.DateTimeField
    public long roundCeiling(long j10) {
        long jRoundFloor = roundFloor(j10);
        return jRoundFloor != j10 ? add(jRoundFloor, 1) : j10;
    }

    @Override // org.joda.time.DateTimeField
    public abstract long roundFloor(long j10);

    @Override // org.joda.time.DateTimeField
    public long roundHalfCeiling(long j10) {
        long jRoundFloor = roundFloor(j10);
        long jRoundCeiling = roundCeiling(j10);
        return jRoundCeiling - j10 <= j10 - jRoundFloor ? jRoundCeiling : jRoundFloor;
    }

    @Override // org.joda.time.DateTimeField
    public long roundHalfEven(long j10) {
        long jRoundFloor = roundFloor(j10);
        long jRoundCeiling = roundCeiling(j10);
        long j11 = j10 - jRoundFloor;
        long j12 = jRoundCeiling - j10;
        if (j11 < j12) {
            return jRoundFloor;
        }
        return (j12 >= j11 && (get(jRoundCeiling) & 1) != 0) ? jRoundFloor : jRoundCeiling;
    }

    @Override // org.joda.time.DateTimeField
    public long roundHalfFloor(long j10) {
        long jRoundFloor = roundFloor(j10);
        long jRoundCeiling = roundCeiling(j10);
        return j10 - jRoundFloor <= jRoundCeiling - j10 ? jRoundFloor : jRoundCeiling;
    }

    @Override // org.joda.time.DateTimeField
    public abstract long set(long j10, int i10);

    @Override // org.joda.time.DateTimeField
    public final long set(long j10, String str) {
        return set(j10, str, null);
    }

    @Override // org.joda.time.DateTimeField
    public long set(long j10, String str, Locale locale) {
        return set(j10, convertText(str, locale));
    }

    @Override // org.joda.time.DateTimeField
    public int[] set(ReadablePartial readablePartial, int i10, int[] iArr, int i11) {
        FieldUtils.verifyValueBounds(this, i11, getMinimumValue(readablePartial, iArr), getMaximumValue(readablePartial, iArr));
        iArr[i10] = i11;
        while (true) {
            i10++;
            if (i10 >= readablePartial.size()) {
                return iArr;
            }
            DateTimeField field = readablePartial.getField(i10);
            if (iArr[i10] > field.getMaximumValue(readablePartial, iArr)) {
                iArr[i10] = field.getMaximumValue(readablePartial, iArr);
            }
            if (iArr[i10] < field.getMinimumValue(readablePartial, iArr)) {
                iArr[i10] = field.getMinimumValue(readablePartial, iArr);
            }
        }
    }

    @Override // org.joda.time.DateTimeField
    public int[] set(ReadablePartial readablePartial, int i10, int[] iArr, String str, Locale locale) {
        return set(readablePartial, i10, iArr, convertText(str, locale));
    }

    @Override // org.joda.time.DateTimeField
    public String toString() {
        StringBuilder sbA = a.a("DateTimeField[");
        sbA.append(getName());
        sbA.append(']');
        return sbA.toString();
    }
}
