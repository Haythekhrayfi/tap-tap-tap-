package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Build;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class ep {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gp f20308a = new gp();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g90 f20309b = new g90();

    public static String a() {
        return Build.MANUFACTURER;
    }

    public final String a(Context context) {
        return fp.a(this.f20308a.a(context)).toLowerCase(Locale.US);
    }

    public final String b(Context context) {
        return this.f20309b.a(context);
    }
}
