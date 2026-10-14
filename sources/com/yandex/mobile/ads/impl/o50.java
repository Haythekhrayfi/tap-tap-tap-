package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class o50 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f23695d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile o50 f23696e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f23697a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f23698b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f23699c = true;

    private o50() {
    }

    public static o50 a() {
        if (f23696e == null) {
            synchronized (f23695d) {
                if (f23696e == null) {
                    f23696e = new o50();
                }
            }
        }
        return f23696e;
    }

    public final void a(boolean z10) {
        this.f23699c = z10;
    }

    public final void b(boolean z10) {
        this.f23697a = z10;
    }

    public final boolean b() {
        return this.f23699c;
    }

    public final void c(boolean z10) {
        this.f23698b = z10;
    }

    public final boolean c() {
        return this.f23697a;
    }

    public final boolean d() {
        return this.f23698b;
    }
}
