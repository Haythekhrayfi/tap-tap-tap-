package com.yandex.mobile.ads.impl;

import android.util.Log;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class bu0 extends x60 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f19327b;

    public static void a(boolean z10) {
        f19327b = z10;
    }

    public static void f(String str, Object... objArr) {
        if (x60.f26426a || f19327b) {
            Log.w("Yandex Mobile Ads", String.format(Locale.US, str, objArr));
        }
    }
}
