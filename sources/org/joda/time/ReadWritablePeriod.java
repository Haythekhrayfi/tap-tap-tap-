package org.joda.time;

/* JADX INFO: loaded from: classes3.dex */
public interface ReadWritablePeriod extends ReadablePeriod {
    void add(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17);

    void add(DurationFieldType durationFieldType, int i10);

    void add(ReadableInterval readableInterval);

    void add(ReadablePeriod readablePeriod);

    void addDays(int i10);

    void addHours(int i10);

    void addMillis(int i10);

    void addMinutes(int i10);

    void addMonths(int i10);

    void addSeconds(int i10);

    void addWeeks(int i10);

    void addYears(int i10);

    void clear();

    void set(DurationFieldType durationFieldType, int i10);

    void setDays(int i10);

    void setHours(int i10);

    void setMillis(int i10);

    void setMinutes(int i10);

    void setMonths(int i10);

    void setPeriod(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17);

    void setPeriod(ReadableInterval readableInterval);

    void setPeriod(ReadablePeriod readablePeriod);

    void setSeconds(int i10);

    void setValue(int i10, int i11);

    void setWeeks(int i10);

    void setYears(int i10);
}
