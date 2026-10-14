package org.joda.time;

/* JADX INFO: loaded from: classes3.dex */
public interface ReadablePartial extends Comparable<ReadablePartial> {
    boolean equals(Object obj);

    int get(DateTimeFieldType dateTimeFieldType);

    Chronology getChronology();

    DateTimeField getField(int i10);

    DateTimeFieldType getFieldType(int i10);

    int getValue(int i10);

    int hashCode();

    boolean isSupported(DateTimeFieldType dateTimeFieldType);

    int size();

    DateTime toDateTime(ReadableInstant readableInstant);

    String toString();
}
