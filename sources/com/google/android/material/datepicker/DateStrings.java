package com.google.android.material.datepicker;

import android.text.format.DateUtils;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import o0.d;

/* JADX INFO: loaded from: classes2.dex */
class DateStrings {
    private DateStrings() {
    }

    public static d<String, String> getDateRangeString(Long l10, Long l11) {
        return getDateRangeString(l10, l11, null);
    }

    public static d<String, String> getDateRangeString(Long l10, Long l11, SimpleDateFormat simpleDateFormat) {
        if (l10 == null && l11 == null) {
            return new d<>(null, null);
        }
        if (l10 == null) {
            return new d<>(null, getDateString(l11.longValue(), simpleDateFormat));
        }
        if (l11 == null) {
            return new d<>(getDateString(l10.longValue(), simpleDateFormat), null);
        }
        Calendar todayCalendar = UtcDates.getTodayCalendar();
        Calendar utcCalendar = UtcDates.getUtcCalendar();
        utcCalendar.setTimeInMillis(l10.longValue());
        Calendar utcCalendar2 = UtcDates.getUtcCalendar();
        utcCalendar2.setTimeInMillis(l11.longValue());
        if (simpleDateFormat != null) {
            return new d<>(simpleDateFormat.format(new Date(l10.longValue())), simpleDateFormat.format(new Date(l11.longValue())));
        }
        if (utcCalendar.get(1) == utcCalendar2.get(1)) {
            return utcCalendar.get(1) == todayCalendar.get(1) ? new d<>(getMonthDay(l10.longValue(), Locale.getDefault()), getMonthDay(l11.longValue(), Locale.getDefault())) : new d<>(getMonthDay(l10.longValue(), Locale.getDefault()), getYearMonthDay(l11.longValue(), Locale.getDefault()));
        }
        return new d<>(getYearMonthDay(l10.longValue(), Locale.getDefault()), getYearMonthDay(l11.longValue(), Locale.getDefault()));
    }

    public static String getDateString(long j10) {
        return getDateString(j10, null);
    }

    public static String getDateString(long j10, SimpleDateFormat simpleDateFormat) {
        Calendar todayCalendar = UtcDates.getTodayCalendar();
        Calendar utcCalendar = UtcDates.getUtcCalendar();
        utcCalendar.setTimeInMillis(j10);
        if (simpleDateFormat != null) {
            return simpleDateFormat.format(new Date(j10));
        }
        return todayCalendar.get(1) == utcCalendar.get(1) ? getMonthDay(j10) : getYearMonthDay(j10);
    }

    public static String getMonthDay(long j10) {
        return getMonthDay(j10, Locale.getDefault());
    }

    public static String getMonthDay(long j10, Locale locale) {
        return UtcDates.getAbbrMonthDayFormat(locale).format(new Date(j10));
    }

    public static String getMonthDayOfWeekDay(long j10) {
        return getMonthDayOfWeekDay(j10, Locale.getDefault());
    }

    public static String getMonthDayOfWeekDay(long j10, Locale locale) {
        return UtcDates.getAbbrMonthWeekdayDayFormat(locale).format(new Date(j10));
    }

    public static String getYearMonth(long j10) {
        return DateUtils.formatDateTime(null, j10, 8228);
    }

    public static String getYearMonthDay(long j10) {
        return getYearMonthDay(j10, Locale.getDefault());
    }

    public static String getYearMonthDay(long j10, Locale locale) {
        return UtcDates.getYearAbbrMonthDayFormat(locale).format(new Date(j10));
    }

    public static String getYearMonthDayOfWeekDay(long j10) {
        return getYearMonthDayOfWeekDay(j10, Locale.getDefault());
    }

    public static String getYearMonthDayOfWeekDay(long j10, Locale locale) {
        return UtcDates.getYearAbbrMonthWeekdayDayFormat(locale).format(new Date(j10));
    }
}
