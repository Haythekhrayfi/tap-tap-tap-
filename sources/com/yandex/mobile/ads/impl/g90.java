package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class g90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e90 f20983a = new e90();

    public final String a(Context context) {
        Locale locale = context.getResources().getConfiguration().locale;
        Objects.requireNonNull(this.f20983a);
        return e90.a(locale);
    }
}
