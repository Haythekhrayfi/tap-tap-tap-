package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"UseSparseArrays"})
public final class p0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f23936b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile p0 f23937c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f23938a = new HashMap();

    private p0() {
    }

    public static p0 a() {
        if (f23937c == null) {
            synchronized (f23936b) {
                if (f23937c == null) {
                    f23937c = new p0();
                }
            }
        }
        return f23937c;
    }

    public final o0 a(long j10) {
        o0 o0Var;
        synchronized (f23936b) {
            o0Var = (o0) this.f23938a.remove(Long.valueOf(j10));
        }
        return o0Var;
    }

    public final void a(long j10, o0 o0Var) {
        synchronized (f23936b) {
            this.f23938a.put(Long.valueOf(j10), o0Var);
        }
    }
}
