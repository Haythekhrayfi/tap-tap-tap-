package com.iab.omid.library.applovin.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static f f12948b = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f12949a;

    private f() {
    }

    public static f b() {
        return f12948b;
    }

    public Context a() {
        return this.f12949a;
    }

    public void a(Context context) {
        this.f12949a = context != null ? context.getApplicationContext() : null;
    }
}
