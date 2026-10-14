package com.yandex.mobile.ads.impl;

import android.util.Log;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class o60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f23702a = true;

    public static final void a(String str, Object... objArr) {
        fd.j0.i(str, "format");
        fd.j0.i(objArr, "args");
        if (f23702a) {
            Locale locale = Locale.US;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            String str2 = String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            fd.j0.h(str2, "format(locale, format, *args)");
            Log.e("YandexAds", "[Integration] " + str2);
        }
    }

    public static final void a(boolean z10) {
        f23702a = z10;
    }

    public static final void b(String str, Object... objArr) {
        fd.j0.i(str, "format");
        fd.j0.i(objArr, "args");
        if (f23702a) {
            Locale locale = Locale.US;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            String str2 = String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            fd.j0.h(str2, "format(locale, format, *args)");
            Log.i("YandexAds", "[Integration] " + str2);
        }
    }

    public static final void c(String str, Object... objArr) {
        fd.j0.i(str, "format");
        fd.j0.i(objArr, "args");
        if (f23702a) {
            Locale locale = Locale.US;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            String str2 = String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            fd.j0.h(str2, "format(locale, format, *args)");
            Log.w("YandexAds", "[Integration] " + str2);
        }
    }
}
