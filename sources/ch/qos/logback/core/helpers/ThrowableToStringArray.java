package ch.qos.logback.core.helpers;

import android.support.v4.media.c;
import ch.qos.logback.core.CoreConstants;
import defpackage.a;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ThrowableToStringArray {
    public static String[] convert(Throwable th) {
        LinkedList linkedList = new LinkedList();
        extract(linkedList, th, null);
        return (String[]) linkedList.toArray(new String[0]);
    }

    private static void extract(List<String> list, Throwable th, StackTraceElement[] stackTraceElementArr) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int iFindNumberOfCommonFrames = findNumberOfCommonFrames(stackTrace, stackTraceElementArr);
        list.add(formatFirstLine(th, stackTraceElementArr));
        for (int i10 = 0; i10 < stackTrace.length - iFindNumberOfCommonFrames; i10++) {
            StringBuilder sbA = a.a("\tat ");
            sbA.append(stackTrace[i10].toString());
            list.add(sbA.toString());
        }
        if (iFindNumberOfCommonFrames != 0) {
            list.add("\t... " + iFindNumberOfCommonFrames + " common frames omitted");
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            extract(list, cause, stackTrace);
        }
    }

    private static int findNumberOfCommonFrames(StackTraceElement[] stackTraceElementArr, StackTraceElement[] stackTraceElementArr2) {
        int i10 = 0;
        if (stackTraceElementArr2 == null) {
            return 0;
        }
        int length = stackTraceElementArr.length - 1;
        for (int length2 = stackTraceElementArr2.length - 1; length >= 0 && length2 >= 0 && stackTraceElementArr[length].equals(stackTraceElementArr2[length2]); length2--) {
            i10++;
            length--;
        }
        return i10;
    }

    private static String formatFirstLine(Throwable th, StackTraceElement[] stackTraceElementArr) {
        StringBuilder sbA = a.a(stackTraceElementArr != null ? CoreConstants.CAUSED_BY : "");
        sbA.append(th.getClass().getName());
        String string = sbA.toString();
        return th.getMessage() != null ? r2.a.a(th, c.a(string, ": ")) : string;
    }
}
