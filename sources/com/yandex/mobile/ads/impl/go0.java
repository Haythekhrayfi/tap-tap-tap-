package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class go0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f21116c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile go0 f21117d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final so0 f21118a = new so0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f21119b;

    private go0() {
    }

    public static go0 a() {
        if (f21117d == null) {
            synchronized (f21116c) {
                if (f21117d == null) {
                    f21117d = new go0();
                }
            }
        }
        go0 go0Var = f21117d;
        Objects.requireNonNull(go0Var);
        return go0Var;
    }

    public final void a(Context context) {
        synchronized (f21116c) {
            if (this.f21118a.b(context) && !this.f21119b) {
                vo0.a(context);
                this.f21119b = true;
            }
        }
    }
}
