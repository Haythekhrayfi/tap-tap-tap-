package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import android.util.Log;
import ch.qos.logback.classic.net.SyslogAppender;
import java.net.UnknownHostException;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes3.dex */
public final class p90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f24017a = new Object();

    @Pure
    private static String a(String str, Throwable th) {
        boolean z10;
        String strReplace;
        synchronized (f24017a) {
            if (th == null) {
                strReplace = null;
            } else {
                Throwable cause = th;
                while (true) {
                    if (cause == null) {
                        z10 = false;
                        break;
                    }
                    if (cause instanceof UnknownHostException) {
                        z10 = true;
                        break;
                    }
                    cause = cause.getCause();
                }
                strReplace = z10 ? "UnknownHostException (no network)" : Log.getStackTraceString(th).trim().replace(SyslogAppender.DEFAULT_STACKTRACE_PATTERN, "    ");
            }
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        StringBuilder sbA = android.support.v4.media.c.a(str, "\n  ");
        sbA.append(strReplace.replace("\n", "\n  "));
        sbA.append('\n');
        return sbA.toString();
    }

    @Pure
    public static void a(String str, Exception exc) {
        c("BundleUtil", a(str, (Throwable) exc));
    }

    @Pure
    public static void a(String str, String str2) {
        synchronized (f24017a) {
            Log.d(str, str2);
        }
    }

    @Pure
    public static void a(String str, String str2, Throwable th) {
        b(str, a(str2, th));
    }

    @Pure
    public static void b(String str, String str2) {
        synchronized (f24017a) {
            Log.e(str, str2);
        }
    }

    @Pure
    public static void b(String str, String str2, Throwable th) {
        d(str, a(str2, th));
    }

    @Pure
    public static void c(String str, String str2) {
        synchronized (f24017a) {
            Log.i(str, str2);
        }
    }

    @Pure
    public static void d(String str, String str2) {
        synchronized (f24017a) {
            Log.w(str, str2);
        }
    }
}
