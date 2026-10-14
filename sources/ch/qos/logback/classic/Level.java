package ch.qos.logback.classic;

import android.support.v4.media.b;
import defpackage.a;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class Level implements Serializable {
    public static final int ALL_INT = Integer.MIN_VALUE;
    public static final int DEBUG_INT = 10000;
    public static final int OFF_INT = Integer.MAX_VALUE;
    public static final int WARN_INT = 30000;
    private static final long serialVersionUID = -814092767334282137L;
    public final int levelInt;
    public final String levelStr;
    public static final Integer OFF_INTEGER = Integer.MAX_VALUE;
    public static final int ERROR_INT = 40000;
    public static final Integer ERROR_INTEGER = Integer.valueOf(ERROR_INT);
    public static final Integer WARN_INTEGER = 30000;
    public static final int INFO_INT = 20000;
    public static final Integer INFO_INTEGER = Integer.valueOf(INFO_INT);
    public static final Integer DEBUG_INTEGER = 10000;
    public static final int TRACE_INT = 5000;
    public static final Integer TRACE_INTEGER = Integer.valueOf(TRACE_INT);
    public static final Integer ALL_INTEGER = Integer.MIN_VALUE;
    public static final Level OFF = new Level(Integer.MAX_VALUE, "OFF");
    public static final Level ERROR = new Level(ERROR_INT, "ERROR");
    public static final Level WARN = new Level(30000, "WARN");
    public static final Level INFO = new Level(INFO_INT, "INFO");
    public static final Level DEBUG = new Level(10000, "DEBUG");
    public static final Level TRACE = new Level(TRACE_INT, "TRACE");
    public static final Level ALL = new Level(Integer.MIN_VALUE, "ALL");

    private Level(int i10, String str) {
        this.levelInt = i10;
        this.levelStr = str;
    }

    public static Level fromLocationAwareLoggerInteger(int i10) {
        if (i10 == 0) {
            return TRACE;
        }
        if (i10 == 10) {
            return DEBUG;
        }
        if (i10 == 20) {
            return INFO;
        }
        if (i10 == 30) {
            return WARN;
        }
        if (i10 == 40) {
            return ERROR;
        }
        throw new IllegalArgumentException(i10 + " not a valid level value");
    }

    private Object readResolve() {
        return toLevel(this.levelInt);
    }

    public static Level toLevel(int i10) {
        return toLevel(i10, DEBUG);
    }

    public static Level toLevel(int i10, Level level) {
        if (i10 == Integer.MIN_VALUE) {
            return ALL;
        }
        if (i10 == 5000) {
            return TRACE;
        }
        if (i10 == 10000) {
            return DEBUG;
        }
        if (i10 == 20000) {
            return INFO;
        }
        if (i10 == 30000) {
            return WARN;
        }
        if (i10 != 40000) {
            return i10 != Integer.MAX_VALUE ? level : OFF;
        }
        return ERROR;
    }

    public static Level toLevel(String str) {
        return toLevel(str, DEBUG);
    }

    public static Level toLevel(String str, Level level) {
        if (str == null) {
            return level;
        }
        String strTrim = str.trim();
        if (strTrim.equalsIgnoreCase("ALL")) {
            return ALL;
        }
        if (strTrim.equalsIgnoreCase("TRACE")) {
            return TRACE;
        }
        if (strTrim.equalsIgnoreCase("DEBUG")) {
            return DEBUG;
        }
        if (strTrim.equalsIgnoreCase("INFO")) {
            return INFO;
        }
        if (strTrim.equalsIgnoreCase("WARN")) {
            return WARN;
        }
        if (strTrim.equalsIgnoreCase("ERROR")) {
            return ERROR;
        }
        return strTrim.equalsIgnoreCase("OFF") ? OFF : level;
    }

    public static int toLocationAwareLoggerInteger(Level level) {
        if (level == null) {
            throw new IllegalArgumentException("null level parameter is not admitted");
        }
        int i10 = level.toInt();
        if (i10 == 5000) {
            return 0;
        }
        if (i10 == 10000) {
            return 10;
        }
        if (i10 == 20000) {
            return 20;
        }
        if (i10 == 30000) {
            return 30;
        }
        if (i10 == 40000) {
            return 40;
        }
        throw new IllegalArgumentException(level + " not a valid level value");
    }

    public static Level valueOf(String str) {
        return toLevel(str, DEBUG);
    }

    public boolean isGreaterOrEqual(Level level) {
        return this.levelInt >= level.levelInt;
    }

    public int toInt() {
        return this.levelInt;
    }

    public Integer toInteger() {
        int i10 = this.levelInt;
        if (i10 == Integer.MIN_VALUE) {
            return ALL_INTEGER;
        }
        if (i10 == 5000) {
            return TRACE_INTEGER;
        }
        if (i10 == 10000) {
            return DEBUG_INTEGER;
        }
        if (i10 == 20000) {
            return INFO_INTEGER;
        }
        if (i10 == 30000) {
            return WARN_INTEGER;
        }
        if (i10 == 40000) {
            return ERROR_INTEGER;
        }
        if (i10 == Integer.MAX_VALUE) {
            return OFF_INTEGER;
        }
        StringBuilder sbA = a.a("Level ");
        sbA.append(this.levelStr);
        sbA.append(", ");
        throw new IllegalStateException(b.a(sbA, this.levelInt, " is unknown."));
    }

    public String toString() {
        return this.levelStr;
    }
}
