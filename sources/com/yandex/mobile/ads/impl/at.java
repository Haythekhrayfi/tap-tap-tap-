package com.yandex.mobile.ads.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class at {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f19056c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile at f19057d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zs f19058a = new zs();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private m11 f19059b;

    private at() {
    }

    public static at a() {
        if (f19057d == null) {
            synchronized (f19056c) {
                if (f19057d == null) {
                    f19057d = new at();
                }
            }
        }
        return f19057d;
    }

    public final dg a(Context context) {
        m11 m11Var;
        synchronized (f19056c) {
            if (this.f19059b == null) {
                this.f19059b = this.f19058a.a(context);
            }
            m11Var = this.f19059b;
        }
        return m11Var;
    }
}
