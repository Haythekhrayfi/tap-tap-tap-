package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class xp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f26578a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f26579b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private yp0 f26580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private y61 f26581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f26582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f26583f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f26584g;

    public class a implements Runnable {
        private a() {
        }

        public /* synthetic */ a(xp0 xp0Var, int i10) {
            this();
        }

        @Override // java.lang.Runnable
        public final void run() {
            xp0.a(xp0.this);
            xp0.this.c();
        }
    }

    public xp0(boolean z10) {
        this.f26584g = z10;
    }

    public static void a(xp0 xp0Var) {
        Objects.requireNonNull(xp0Var);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = jElapsedRealtime - xp0Var.f26583f;
        xp0Var.f26583f = jElapsedRealtime;
        long j11 = xp0Var.f26582e - j10;
        xp0Var.f26582e = j11;
        y61 y61Var = xp0Var.f26581d;
        if (y61Var != null) {
            y61Var.a(Math.max(0L, j11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f26579b = 2;
        this.f26583f = SystemClock.elapsedRealtime();
        long jMin = Math.min(200L, this.f26582e);
        if (jMin > 0) {
            this.f26578a.postDelayed(new a(this, 0), jMin);
            return;
        }
        yp0 yp0Var = this.f26580c;
        if (yp0Var != null) {
            yp0Var.mo3a();
        }
        a();
    }

    public final void a() {
        if (a6.a(1, this.f26579b)) {
            return;
        }
        this.f26579b = 1;
        this.f26580c = null;
        this.f26578a.removeCallbacksAndMessages(null);
    }

    public final void a(long j10, yp0 yp0Var) {
        a();
        this.f26580c = yp0Var;
        this.f26582e = j10;
        if (this.f26584g) {
            this.f26578a.post(new pp1(this));
        } else {
            c();
        }
    }

    public final void a(y61 y61Var) {
        this.f26581d = y61Var;
    }

    public final void b() {
        if (a6.a(2, this.f26579b)) {
            this.f26579b = 3;
            this.f26578a.removeCallbacksAndMessages(null);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = jElapsedRealtime - this.f26583f;
            this.f26583f = jElapsedRealtime;
            long j11 = this.f26582e - j10;
            this.f26582e = j11;
            y61 y61Var = this.f26581d;
            if (y61Var != null) {
                y61Var.a(Math.max(0L, j11));
            }
        }
    }

    public final void d() {
        if (a6.a(3, this.f26579b)) {
            c();
        }
    }
}
