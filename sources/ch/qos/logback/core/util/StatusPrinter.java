package ch.qos.logback.core.util;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.helpers.ThrowableToStringArray;
import ch.qos.logback.core.status.Status;
import ch.qos.logback.core.status.StatusManager;
import ch.qos.logback.core.status.StatusUtil;
import defpackage.a;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class StatusPrinter {
    private static PrintStream ps = System.out;
    public static CachingDateFormatter cachingDateFormat = new CachingDateFormatter("HH:mm:ss,SSS");

    private static void appendThrowable(StringBuilder sb2, Throwable th) {
        for (String str : ThrowableToStringArray.convert(th)) {
            if (!str.startsWith(CoreConstants.CAUSED_BY)) {
                sb2.append(Character.isDigit(str.charAt(0)) ? "\t... " : "\tat ");
            }
            sb2.append(str);
            sb2.append(CoreConstants.LINE_SEPARATOR);
        }
    }

    public static void buildStr(StringBuilder sb2, String str, Status status) {
        StringBuilder sbA;
        String str2;
        if (status.hasChildren()) {
            sbA = a.a(str);
            str2 = "+ ";
        } else {
            sbA = a.a(str);
            str2 = "|-";
        }
        sbA.append(str2);
        String string = sbA.toString();
        CachingDateFormatter cachingDateFormatter = cachingDateFormat;
        if (cachingDateFormatter != null) {
            sb2.append(cachingDateFormatter.format(status.getDate().longValue()));
            sb2.append(" ");
        }
        sb2.append(string);
        sb2.append(status);
        sb2.append(CoreConstants.LINE_SEPARATOR);
        if (status.getThrowable() != null) {
            appendThrowable(sb2, status.getThrowable());
        }
        if (status.hasChildren()) {
            Iterator<Status> it = status.iterator();
            while (it.hasNext()) {
                buildStr(sb2, str + "  ", it.next());
            }
        }
    }

    private static void buildStrFromStatusList(StringBuilder sb2, List<Status> list) {
        if (list == null) {
            return;
        }
        Iterator<Status> it = list.iterator();
        while (it.hasNext()) {
            buildStr(sb2, "", it.next());
        }
    }

    public static void print(Context context) {
        print(context, 0L);
    }

    public static void print(Context context, long j10) {
        if (context == null) {
            throw new IllegalArgumentException("Context argument cannot be null");
        }
        StatusManager statusManager = context.getStatusManager();
        if (statusManager != null) {
            print(statusManager, j10);
            return;
        }
        PrintStream printStream = ps;
        StringBuilder sbA = a.a("WARN: Context named \"");
        sbA.append(context.getName());
        sbA.append("\" has no status manager");
        printStream.println(sbA.toString());
    }

    public static void print(StatusManager statusManager) {
        print(statusManager, 0L);
    }

    public static void print(StatusManager statusManager, long j10) {
        StringBuilder sb2 = new StringBuilder();
        buildStrFromStatusList(sb2, StatusUtil.filterStatusListByTimeThreshold(statusManager.getCopyOfStatusList(), j10));
        ps.println(sb2.toString());
    }

    public static void print(List<Status> list) {
        StringBuilder sb2 = new StringBuilder();
        buildStrFromStatusList(sb2, list);
        ps.println(sb2.toString());
    }

    public static void printIfErrorsOccured(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Context argument cannot be null");
        }
        StatusManager statusManager = context.getStatusManager();
        if (statusManager != null) {
            if (new StatusUtil(context).getHighestLevel(0L) == 2) {
                print(statusManager);
            }
        } else {
            PrintStream printStream = ps;
            StringBuilder sbA = a.a("WARN: Context named \"");
            sbA.append(context.getName());
            sbA.append("\" has no status manager");
            printStream.println(sbA.toString());
        }
    }

    public static void printInCaseOfErrorsOrWarnings(Context context) {
        printInCaseOfErrorsOrWarnings(context, 0L);
    }

    public static void printInCaseOfErrorsOrWarnings(Context context, long j10) {
        if (context == null) {
            throw new IllegalArgumentException("Context argument cannot be null");
        }
        StatusManager statusManager = context.getStatusManager();
        if (statusManager != null) {
            if (new StatusUtil(context).getHighestLevel(j10) >= 1) {
                print(statusManager, j10);
            }
        } else {
            PrintStream printStream = ps;
            StringBuilder sbA = a.a("WARN: Context named \"");
            sbA.append(context.getName());
            sbA.append("\" has no status manager");
            printStream.println(sbA.toString());
        }
    }

    public static void setPrintStream(PrintStream printStream) {
        ps = printStream;
    }
}
