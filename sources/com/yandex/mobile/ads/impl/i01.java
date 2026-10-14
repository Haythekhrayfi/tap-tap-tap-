package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class i01 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object f21560h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile i01 f21561i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private nz0 f21562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f21563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Boolean f21564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f21565d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f21567f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f21566e = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f21568g = true;

    private i01() {
    }

    public static void a() {
        synchronized (f21560h) {
        }
    }

    public static i01 b() {
        if (f21561i == null) {
            synchronized (f21560h) {
                if (f21561i == null) {
                    f21561i = new i01();
                }
            }
        }
        return f21561i;
    }

    public final nz0 a(Context context) {
        nz0 nz0Var;
        synchronized (f21560h) {
            if (this.f21562a == null) {
                Objects.requireNonNull(hk.f21441a);
                this.f21562a = hk.a.a(context).a();
            }
            nz0Var = this.f21562a;
        }
        return nz0Var;
    }

    public final void a(int i10) {
        synchronized (f21560h) {
            this.f21565d = Integer.valueOf(i10);
        }
    }

    public final void a(Context context, nz0 nz0Var) {
        synchronized (f21560h) {
            this.f21562a = nz0Var;
            Objects.requireNonNull(hk.f21441a);
            hk.a.a(context).a(nz0Var);
        }
    }

    public final void a(boolean z10) {
        synchronized (f21560h) {
            this.f21567f = z10;
            this.f21568g = z10;
        }
    }

    public final void b(boolean z10) {
        synchronized (f21560h) {
            this.f21564c = Boolean.valueOf(z10);
        }
    }

    public final Integer c() {
        Integer num;
        synchronized (f21560h) {
            num = this.f21565d;
        }
        return num;
    }

    public final void c(boolean z10) {
        synchronized (f21560h) {
            this.f21566e = z10;
        }
    }

    public final Boolean d() {
        Boolean bool;
        synchronized (f21560h) {
            bool = this.f21564c;
        }
        return bool;
    }

    public final void d(boolean z10) {
        synchronized (f21560h) {
            this.f21563b = Boolean.valueOf(z10);
        }
    }

    public final boolean e() {
        boolean z10;
        synchronized (f21560h) {
            z10 = this.f21567f;
        }
        return z10;
    }

    public final boolean f() {
        boolean z10;
        synchronized (f21560h) {
            z10 = this.f21566e;
        }
        return z10;
    }

    public final Boolean g() {
        Boolean bool;
        synchronized (f21560h) {
            bool = this.f21563b;
        }
        return bool;
    }

    public final boolean h() {
        boolean z10;
        synchronized (f21560h) {
            z10 = this.f21568g;
        }
        return z10;
    }
}
