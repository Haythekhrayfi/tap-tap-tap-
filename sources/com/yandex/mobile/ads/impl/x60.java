package com.yandex.mobile.ads.impl;

import android.util.Log;
import com.yandex.mobile.ads.BuildConfigFieldProvider;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class x60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f26426a = BuildConfigFieldProvider.isWithLogs();

    public static String a(String str, Object... objArr) {
        String string;
        if (objArr.length != 0) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        for (int i10 = 2; i10 < stackTrace.length; i10++) {
            if (!stackTrace[i10].getClass().equals(x60.class)) {
                String className = stackTrace[i10].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                StringBuilder sbA = android.support.v4.media.c.a(strSubstring.substring(strSubstring.lastIndexOf(36) + 1), ".");
                sbA.append(stackTrace[i10].getMethodName());
                string = sbA.toString();
                return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), string, str);
            }
        }
        string = "<unknown>";
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), string, str);
    }

    public static void a(Throwable th, String str, Object... objArr) {
        if (f26426a) {
            Log.e("Yandex Mobile Ads Debug", a(str, objArr), th);
        }
    }

    public static void b(String str, Object... objArr) {
        if (f26426a) {
            Log.d("Yandex Mobile Ads Debug", a(str, objArr));
        }
    }

    public static void c(String str, Object... objArr) {
        if (f26426a) {
            Log.e("Yandex Mobile Ads Debug", a(str, objArr));
        }
    }

    public static void d(String str, Object... objArr) {
        if (f26426a) {
            Log.i("Yandex Mobile Ads Debug", a(str, objArr));
        }
    }

    public static void e(String str, Object... objArr) {
        if (f26426a) {
            Log.v("Yandex Mobile Ads Debug", a(str, objArr));
        }
    }

    public static void f(String str, Object... objArr) {
        if (f26426a) {
            Log.w("Yandex Mobile Ads Debug", a(str, objArr));
        }
    }
}
