package org.joda.time;

/* JADX INFO: loaded from: classes3.dex */
public interface ReadWritableDateTime extends ReadableDateTime, ReadWritableInstant {
    void addDays(int i10);

    void addHours(int i10);

    void addMillis(int i10);

    void addMinutes(int i10);

    void addMonths(int i10);

    void addSeconds(int i10);

    void addWeeks(int i10);

    void addWeekyears(int i10);

    void addYears(int i10);

    void setDate(int i10, int i11, int i12);

    void setDateTime(int i10, int i11, int i12, int i13, int i14, int i15, int i16);

    void setDayOfMonth(int i10);

    void setDayOfWeek(int i10);

    void setDayOfYear(int i10);

    void setHourOfDay(int i10);

    void setMillisOfDay(int i10);

    void setMillisOfSecond(int i10);

    void setMinuteOfDay(int i10);

    void setMinuteOfHour(int i10);

    void setMonthOfYear(int i10);

    void setSecondOfDay(int i10);

    void setSecondOfMinute(int i10);

    void setTime(int i10, int i11, int i12, int i13);

    void setWeekOfWeekyear(int i10);

    void setWeekyear(int i10);

    void setYear(int i10);
}
