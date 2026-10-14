package org.joda.time;

import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DateTimeField {
    public abstract long add(long j10, int i10);

    public abstract long add(long j10, long j11);

    public abstract int[] add(ReadablePartial readablePartial, int i10, int[] iArr, int i11);

    public abstract long addWrapField(long j10, int i10);

    public abstract int[] addWrapField(ReadablePartial readablePartial, int i10, int[] iArr, int i11);

    public abstract int[] addWrapPartial(ReadablePartial readablePartial, int i10, int[] iArr, int i11);

    public abstract int get(long j10);

    public abstract String getAsShortText(int i10, Locale locale);

    public abstract String getAsShortText(long j10);

    public abstract String getAsShortText(long j10, Locale locale);

    public abstract String getAsShortText(ReadablePartial readablePartial, int i10, Locale locale);

    public abstract String getAsShortText(ReadablePartial readablePartial, Locale locale);

    public abstract String getAsText(int i10, Locale locale);

    public abstract String getAsText(long j10);

    public abstract String getAsText(long j10, Locale locale);

    public abstract String getAsText(ReadablePartial readablePartial, int i10, Locale locale);

    public abstract String getAsText(ReadablePartial readablePartial, Locale locale);

    public abstract int getDifference(long j10, long j11);

    public abstract long getDifferenceAsLong(long j10, long j11);

    public abstract DurationField getDurationField();

    public abstract int getLeapAmount(long j10);

    public abstract DurationField getLeapDurationField();

    public abstract int getMaximumShortTextLength(Locale locale);

    public abstract int getMaximumTextLength(Locale locale);

    public abstract int getMaximumValue();

    public abstract int getMaximumValue(long j10);

    public abstract int getMaximumValue(ReadablePartial readablePartial);

    public abstract int getMaximumValue(ReadablePartial readablePartial, int[] iArr);

    public abstract int getMinimumValue();

    public abstract int getMinimumValue(long j10);

    public abstract int getMinimumValue(ReadablePartial readablePartial);

    public abstract int getMinimumValue(ReadablePartial readablePartial, int[] iArr);

    public abstract String getName();

    public abstract DurationField getRangeDurationField();

    public abstract DateTimeFieldType getType();

    public abstract boolean isLeap(long j10);

    public abstract boolean isLenient();

    public abstract boolean isSupported();

    public abstract long remainder(long j10);

    public abstract long roundCeiling(long j10);

    public abstract long roundFloor(long j10);

    public abstract long roundHalfCeiling(long j10);

    public abstract long roundHalfEven(long j10);

    public abstract long roundHalfFloor(long j10);

    public abstract long set(long j10, int i10);

    public abstract long set(long j10, String str);

    public abstract long set(long j10, String str, Locale locale);

    public abstract int[] set(ReadablePartial readablePartial, int i10, int[] iArr, int i11);

    public abstract int[] set(ReadablePartial readablePartial, int i10, int[] iArr, String str, Locale locale);

    public long setExtended(long j10, int i10) {
        return set(j10, i10);
    }

    public abstract String toString();
}
