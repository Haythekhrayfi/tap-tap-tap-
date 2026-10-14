package org.joda.time;

/* JADX INFO: loaded from: classes3.dex */
public interface ReadablePeriod {
    boolean equals(Object obj);

    int get(DurationFieldType durationFieldType);

    DurationFieldType getFieldType(int i10);

    PeriodType getPeriodType();

    int getValue(int i10);

    int hashCode();

    boolean isSupported(DurationFieldType durationFieldType);

    int size();

    MutablePeriod toMutablePeriod();

    Period toPeriod();

    String toString();
}
