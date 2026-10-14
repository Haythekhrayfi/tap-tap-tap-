package y;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import ch.qos.logback.classic.spi.CallerData;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"LogConditional"})
public class a {
    public static String a() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        StringBuilder sbA = defpackage.a.a(".(");
        sbA.append(stackTraceElement.getFileName());
        sbA.append(":");
        sbA.append(stackTraceElement.getLineNumber());
        sbA.append(") ");
        sbA.append(stackTraceElement.getMethodName());
        sbA.append("()");
        return sbA.toString();
    }

    public static String b() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        StringBuilder sbA = defpackage.a.a(".(");
        sbA.append(stackTraceElement.getFileName());
        sbA.append(":");
        sbA.append(stackTraceElement.getLineNumber());
        sbA.append(")");
        return sbA.toString();
    }

    public static String c(Context context, int i10) {
        if (i10 == -1) {
            return "UNKNOWN";
        }
        try {
            return context.getResources().getResourceEntryName(i10);
        } catch (Exception unused) {
            return android.support.v4.media.a.a(CallerData.NA, i10);
        }
    }

    public static String d(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    public static String e(r rVar, int i10) {
        return i10 == -1 ? "UNDEFINED" : rVar.getContext().getResources().getResourceEntryName(i10);
    }
}
