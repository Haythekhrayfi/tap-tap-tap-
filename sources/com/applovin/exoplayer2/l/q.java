package com.applovin.exoplayer2.l;

import android.text.TextUtils;
import android.util.Log;
import ch.qos.logback.classic.net.SyslogAppender;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f7649a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f7650b = true;

    private static String a(String str, Throwable th) {
        String strA = a(th);
        if (TextUtils.isEmpty(strA)) {
            return str;
        }
        StringBuilder sbA = android.support.v4.media.c.a(str, "\n  ");
        sbA.append(strA.replace("\n", "\n  "));
        sbA.append('\n');
        return sbA.toString();
    }

    public static String a(Throwable th) {
        if (th == null) {
            return null;
        }
        if (b(th)) {
            return "UnknownHostException (no network)";
        }
        return !f7650b ? th.getMessage() : Log.getStackTraceString(th).trim().replace(SyslogAppender.DEFAULT_STACKTRACE_PATTERN, "    ");
    }

    public static void a(String str, String str2) {
        if (f7649a == 0) {
            Log.d(str, str2);
        }
    }

    public static void a(String str, String str2, Throwable th) {
        b(str, a(str2, th));
    }

    public static void b(String str, String str2) {
        if (f7649a <= 1) {
            Log.i(str, str2);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        c(str, a(str2, th));
    }

    private static boolean b(Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    public static void c(String str, String str2) {
        if (f7649a <= 2) {
            Log.w(str, str2);
        }
    }

    public static void c(String str, String str2, Throwable th) {
        d(str, a(str2, th));
    }

    public static void d(String str, String str2) {
        if (f7649a <= 3) {
            Log.e(str, str2);
        }
    }
}
