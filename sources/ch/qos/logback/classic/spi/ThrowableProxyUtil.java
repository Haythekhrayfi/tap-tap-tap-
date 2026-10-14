package ch.qos.logback.classic.spi;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes.dex */
public class ThrowableProxyUtil {
    private static final int BUILDER_CAPACITY = 2048;
    public static final int REGULAR_EXCEPTION_INDENT = 1;
    public static final int SUPPRESSED_EXCEPTION_INDENT = 1;

    public static String asString(IThrowableProxy iThrowableProxy) {
        StringBuilder sb2 = new StringBuilder(2048);
        recursiveAppend(sb2, null, 1, iThrowableProxy);
        return sb2.toString();
    }

    public static void build(ThrowableProxy throwableProxy, Throwable th, ThrowableProxy throwableProxy2) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        throwableProxy.commonFrames = throwableProxy2 != null ? findNumberOfCommonFrames(stackTrace, throwableProxy2.getStackTraceElementProxyArray()) : -1;
        throwableProxy.stackTraceElementProxyArray = steArrayToStepArray(stackTrace);
    }

    public static int findNumberOfCommonFrames(StackTraceElement[] stackTraceElementArr, StackTraceElementProxy[] stackTraceElementProxyArr) {
        int i10 = 0;
        if (stackTraceElementProxyArr != null && stackTraceElementArr != null) {
            int length = stackTraceElementArr.length - 1;
            for (int length2 = stackTraceElementProxyArr.length - 1; length >= 0 && length2 >= 0 && stackTraceElementArr[length].equals(stackTraceElementProxyArr[length2].ste); length2--) {
                i10++;
                length--;
            }
        }
        return i10;
    }

    public static void indent(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append('\t');
        }
    }

    private static void recursiveAppend(StringBuilder sb2, String str, int i10, IThrowableProxy iThrowableProxy) {
        if (iThrowableProxy == null) {
            return;
        }
        subjoinFirstLine(sb2, str, i10, iThrowableProxy);
        sb2.append(CoreConstants.LINE_SEPARATOR);
        subjoinSTEPArray(sb2, i10, iThrowableProxy);
        IThrowableProxy[] suppressed = iThrowableProxy.getSuppressed();
        if (suppressed != null) {
            for (IThrowableProxy iThrowableProxy2 : suppressed) {
                recursiveAppend(sb2, CoreConstants.SUPPRESSED, i10 + 1, iThrowableProxy2);
            }
        }
        recursiveAppend(sb2, CoreConstants.CAUSED_BY, i10, iThrowableProxy.getCause());
    }

    public static StackTraceElementProxy[] steArrayToStepArray(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null) {
            return new StackTraceElementProxy[0];
        }
        int length = stackTraceElementArr.length;
        StackTraceElementProxy[] stackTraceElementProxyArr = new StackTraceElementProxy[length];
        for (int i10 = 0; i10 < length; i10++) {
            stackTraceElementProxyArr[i10] = new StackTraceElementProxy(stackTraceElementArr[i10]);
        }
        return stackTraceElementProxyArr;
    }

    private static void subjoinExceptionMessage(StringBuilder sb2, IThrowableProxy iThrowableProxy) {
        sb2.append(iThrowableProxy.getClassName());
        sb2.append(": ");
        sb2.append(iThrowableProxy.getMessage());
    }

    public static void subjoinFirstLine(StringBuilder sb2, IThrowableProxy iThrowableProxy) {
        if (iThrowableProxy.getCommonFrames() > 0) {
            sb2.append(CoreConstants.CAUSED_BY);
        }
        subjoinExceptionMessage(sb2, iThrowableProxy);
    }

    private static void subjoinFirstLine(StringBuilder sb2, String str, int i10, IThrowableProxy iThrowableProxy) {
        indent(sb2, i10 - 1);
        if (str != null) {
            sb2.append(str);
        }
        subjoinExceptionMessage(sb2, iThrowableProxy);
    }

    public static void subjoinFirstLineRootCauseFirst(StringBuilder sb2, IThrowableProxy iThrowableProxy) {
        if (iThrowableProxy.getCause() != null) {
            sb2.append(CoreConstants.WRAPPED_BY);
        }
        subjoinExceptionMessage(sb2, iThrowableProxy);
    }

    public static void subjoinPackagingData(StringBuilder sb2, StackTraceElementProxy stackTraceElementProxy) {
        ClassPackagingData classPackagingData;
        if (stackTraceElementProxy == null || (classPackagingData = stackTraceElementProxy.getClassPackagingData()) == null) {
            return;
        }
        sb2.append(!classPackagingData.isExact() ? " ~[" : " [");
        sb2.append(classPackagingData.getCodeLocation());
        sb2.append(CoreConstants.COLON_CHAR);
        sb2.append(classPackagingData.getVersion());
        sb2.append(']');
    }

    public static void subjoinSTEP(StringBuilder sb2, StackTraceElementProxy stackTraceElementProxy) {
        sb2.append(stackTraceElementProxy.toString());
        subjoinPackagingData(sb2, stackTraceElementProxy);
    }

    public static void subjoinSTEPArray(StringBuilder sb2, int i10, IThrowableProxy iThrowableProxy) {
        StackTraceElementProxy[] stackTraceElementProxyArray = iThrowableProxy.getStackTraceElementProxyArray();
        int commonFrames = iThrowableProxy.getCommonFrames();
        for (int i11 = 0; i11 < stackTraceElementProxyArray.length - commonFrames; i11++) {
            StackTraceElementProxy stackTraceElementProxy = stackTraceElementProxyArray[i11];
            indent(sb2, i10);
            subjoinSTEP(sb2, stackTraceElementProxy);
            sb2.append(CoreConstants.LINE_SEPARATOR);
        }
        if (commonFrames > 0) {
            indent(sb2, i10);
            sb2.append("... ");
            sb2.append(commonFrames);
            sb2.append(" common frames omitted");
            sb2.append(CoreConstants.LINE_SEPARATOR);
        }
    }

    public static void subjoinSTEPArray(StringBuilder sb2, IThrowableProxy iThrowableProxy) {
        subjoinSTEPArray(sb2, 1, iThrowableProxy);
    }
}
