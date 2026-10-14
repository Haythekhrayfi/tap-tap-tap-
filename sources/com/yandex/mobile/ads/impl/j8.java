package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
final class j8 implements l8 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f21982e = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f21983f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile j8 f21984g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n8 f21986b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f21988d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f21985a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m8 f21987c = new m8();

    private j8(Context context) {
        this.f21986b = new n8(context);
    }

    public static j8 a(Context context) {
        if (f21984g == null) {
            synchronized (f21983f) {
                if (f21984g == null) {
                    f21984g = new j8(context);
                }
            }
        }
        return f21984g;
    }

    public final void a() {
        synchronized (f21983f) {
            this.f21985a.removeCallbacksAndMessages(null);
            this.f21988d = false;
        }
        this.f21987c.a();
    }

    public final void a(h8 h8Var) {
        synchronized (f21983f) {
            this.f21985a.removeCallbacksAndMessages(null);
            this.f21988d = false;
        }
        this.f21987c.a(h8Var);
    }

    public final void a(o8 o8Var) {
        this.f21987c.b(o8Var);
    }

    public final void b(o8 o8Var) {
        boolean z10;
        this.f21987c.a(o8Var);
        synchronized (f21983f) {
            z10 = true;
            if (this.f21988d) {
                z10 = false;
            } else {
                this.f21988d = true;
            }
        }
        if (z10) {
            this.f21985a.postDelayed(new i8(this), f21982e);
            this.f21986b.a(this);
        }
    }
}
