package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class bn1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static bn1 f19296b = new bn1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f19297a;

    private bn1() {
    }

    public static bn1 a() {
        return f19296b;
    }

    public final void a(Context context) {
        this.f19297a = context != null ? context.getApplicationContext() : null;
    }

    public final Context b() {
        return this.f19297a;
    }
}
