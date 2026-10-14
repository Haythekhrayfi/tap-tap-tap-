package ch.qos.logback.classic.spi;

import ch.qos.logback.core.CoreConstants;
import defpackage.a;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class CallerData {
    public static final String CALLER_DATA_NA;
    public static final StackTraceElement[] EMPTY_CALLER_DATA_ARRAY;
    public static final int LINE_NA = -1;
    private static final String LOG4J_CATEGORY = "org.apache.log4j.Category";
    public static final String NA = "?";
    private static final String SLF4J_BOUNDARY = "org.slf4j.Logger";

    static {
        StringBuilder sbA = a.a("?#?:?");
        sbA.append(CoreConstants.LINE_SEPARATOR);
        CALLER_DATA_NA = sbA.toString();
        EMPTY_CALLER_DATA_ARRAY = new StackTraceElement[0];
    }

    public static StackTraceElement[] extract(Throwable th, String str, int i10, List<String> list) {
        if (th == null) {
            return null;
        }
        StackTraceElement[] stackTrace = th.getStackTrace();
        int i11 = -1;
        for (int i12 = 0; i12 < stackTrace.length; i12++) {
            if (!isInFrameworkSpace(stackTrace[i12].getClassName(), str, list)) {
                if (i11 != -1) {
                    break;
                }
            } else {
                i11 = i12 + 1;
            }
        }
        if (i11 == -1) {
            return EMPTY_CALLER_DATA_ARRAY;
        }
        int length = stackTrace.length - i11;
        if (i10 >= length) {
            i10 = length;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i10];
        for (int i13 = 0; i13 < i10; i13++) {
            stackTraceElementArr[i13] = stackTrace[i11 + i13];
        }
        return stackTraceElementArr;
    }

    public static boolean isInFrameworkSpace(String str, String str2, List<String> list) {
        return str.equals(str2) || str.equals(LOG4J_CATEGORY) || str.startsWith(SLF4J_BOUNDARY) || isInFrameworkSpaceList(str, list);
    }

    private static boolean isInFrameworkSpaceList(String str, List<String> list) {
        if (list == null) {
            return false;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static StackTraceElement naInstance() {
        return new StackTraceElement(NA, NA, NA, -1);
    }
}
