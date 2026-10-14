package ch.qos.logback.core.util;

import androidx.activity.j;
import androidx.recyclerview.widget.RecyclerView;
import i.f;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class Duration {
    public static final long DAYS_COEFFICIENT = 86400000;
    private static final int DOUBLE_GROUP = 1;
    private static final String DOUBLE_PART = "([0-9]*(.[0-9]+)?)";
    private static final Pattern DURATION_PATTERN = Pattern.compile("([0-9]*(.[0-9]+)?)\\s*(|milli(second)?|second(e)?|minute|hour|day)s?", 2);
    public static final long HOURS_COEFFICIENT = 3600000;
    public static final long MINUTES_COEFFICIENT = 60000;
    public static final long SECONDS_COEFFICIENT = 1000;
    private static final int UNIT_GROUP = 3;
    private static final String UNIT_PART = "(|milli(second)?|second(e)?|minute|hour|day)s?";
    public final long millis;

    public Duration(long j10) {
        this.millis = j10;
    }

    public static Duration buildByDays(double d10) {
        return new Duration((long) (d10 * 8.64E7d));
    }

    public static Duration buildByHours(double d10) {
        return new Duration((long) (d10 * 3600000.0d));
    }

    public static Duration buildByMilliseconds(double d10) {
        return new Duration((long) d10);
    }

    public static Duration buildByMinutes(double d10) {
        return new Duration((long) (d10 * 60000.0d));
    }

    public static Duration buildBySeconds(double d10) {
        return new Duration((long) (d10 * 1000.0d));
    }

    public static Duration buildUnbounded() {
        return new Duration(RecyclerView.FOREVER_NS);
    }

    public static Duration valueOf(String str) {
        Matcher matcher = DURATION_PATTERN.matcher(str);
        if (!matcher.matches()) {
            throw new IllegalArgumentException(j.a("String value [", str, "] is not in the expected format."));
        }
        String strGroup = matcher.group(1);
        String strGroup2 = matcher.group(3);
        double dDoubleValue = Double.valueOf(strGroup).doubleValue();
        if (strGroup2.equalsIgnoreCase("milli") || strGroup2.equalsIgnoreCase("millisecond") || strGroup2.length() == 0) {
            return buildByMilliseconds(dDoubleValue);
        }
        if (strGroup2.equalsIgnoreCase("second") || strGroup2.equalsIgnoreCase("seconde")) {
            return buildBySeconds(dDoubleValue);
        }
        if (strGroup2.equalsIgnoreCase("minute")) {
            return buildByMinutes(dDoubleValue);
        }
        if (strGroup2.equalsIgnoreCase("hour")) {
            return buildByHours(dDoubleValue);
        }
        if (strGroup2.equalsIgnoreCase("day")) {
            return buildByDays(dDoubleValue);
        }
        throw new IllegalStateException(f.a("Unexpected ", strGroup2));
    }

    public long getMilliseconds() {
        return this.millis;
    }

    public String toString() {
        StringBuilder sb2;
        String str;
        long j10 = this.millis;
        if (j10 < 1000) {
            sb2 = new StringBuilder();
            sb2.append(this.millis);
            str = " milliseconds";
        } else if (j10 < 60000) {
            sb2 = new StringBuilder();
            sb2.append(this.millis / 1000);
            str = " seconds";
        } else if (j10 < 3600000) {
            sb2 = new StringBuilder();
            sb2.append(this.millis / 60000);
            str = " minutes";
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.millis / 3600000);
            str = " hours";
        }
        sb2.append(str);
        return sb2.toString();
    }
}
