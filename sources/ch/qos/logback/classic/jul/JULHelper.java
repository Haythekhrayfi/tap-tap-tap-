package ch.qos.logback.classic.jul;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class JULHelper {
    public static Level asJULLevel(ch.qos.logback.classic.Level level) {
        if (level == null) {
            throw new IllegalArgumentException("Unexpected level [null]");
        }
        int i10 = level.levelInt;
        if (i10 == Integer.MIN_VALUE) {
            return Level.ALL;
        }
        if (i10 == 5000) {
            return Level.FINEST;
        }
        if (i10 == 10000) {
            return Level.FINE;
        }
        if (i10 == 20000) {
            return Level.INFO;
        }
        if (i10 == 30000) {
            return Level.WARNING;
        }
        if (i10 == 40000) {
            return Level.SEVERE;
        }
        if (i10 == Integer.MAX_VALUE) {
            return Level.OFF;
        }
        throw new IllegalArgumentException("Unexpected level [" + level + "]");
    }

    public static Logger asJULLogger(ch.qos.logback.classic.Logger logger) {
        return asJULLogger(logger.getName());
    }

    public static Logger asJULLogger(String str) {
        return Logger.getLogger(asJULLoggerName(str));
    }

    public static String asJULLoggerName(String str) {
        return org.slf4j.Logger.ROOT_LOGGER_NAME.equals(str) ? "" : str;
    }

    public static final boolean isRegularNonRootLogger(Logger logger) {
        if (logger == null) {
            return false;
        }
        return !logger.getName().equals("");
    }

    public static final boolean isRoot(Logger logger) {
        if (logger == null) {
            return false;
        }
        return logger.getName().equals("");
    }
}
