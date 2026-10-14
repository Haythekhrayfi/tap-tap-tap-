package org.joda.time;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DurationField implements Comparable<DurationField> {
    public abstract long add(long j10, int i10);

    public abstract long add(long j10, long j11);

    public abstract int getDifference(long j10, long j11);

    public abstract long getDifferenceAsLong(long j10, long j11);

    public abstract long getMillis(int i10);

    public abstract long getMillis(int i10, long j10);

    public abstract long getMillis(long j10);

    public abstract long getMillis(long j10, long j11);

    public abstract String getName();

    public abstract DurationFieldType getType();

    public abstract long getUnitMillis();

    public abstract int getValue(long j10);

    public abstract int getValue(long j10, long j11);

    public abstract long getValueAsLong(long j10);

    public abstract long getValueAsLong(long j10, long j11);

    public abstract boolean isPrecise();

    public abstract boolean isSupported();

    public long subtract(long j10, int i10) {
        return i10 == Integer.MIN_VALUE ? subtract(j10, i10) : add(j10, -i10);
    }

    public long subtract(long j10, long j11) {
        if (j11 != Long.MIN_VALUE) {
            return add(j10, -j11);
        }
        throw new ArithmeticException("Long.MIN_VALUE cannot be negated");
    }

    public abstract String toString();
}
