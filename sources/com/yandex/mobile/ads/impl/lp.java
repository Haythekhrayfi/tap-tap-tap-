package com.yandex.mobile.ads.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class lp {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f22752b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile lp f22753c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p7.k f22754a;

    private lp() {
    }

    public static lp a() {
        if (f22753c == null) {
            synchronized (f22752b) {
                if (f22753c == null) {
                    f22753c = new lp();
                }
            }
        }
        return f22753c;
    }

    public final p7.k a(Context context) {
        synchronized (f22752b) {
            if (this.f22754a == null) {
                this.f22754a = xp.a(context);
            }
        }
        return this.f22754a;
    }
}
