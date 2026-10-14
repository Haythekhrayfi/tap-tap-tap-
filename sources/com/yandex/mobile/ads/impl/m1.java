package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class m1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f22867c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b90 f22868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile j1 f22869b;

    public m1(b90 b90Var) {
        fd.j0.i(b90Var, "localStorage");
        this.f22868a = b90Var;
    }

    public final j1 a() {
        synchronized (f22867c) {
            if (this.f22869b == null) {
                this.f22869b = new j1(this.f22868a.a("AdBlockerLastUpdate"), this.f22868a.getBoolean("AdBlockerDetected", false));
            }
        }
        j1 j1Var = this.f22869b;
        if (j1Var != null) {
            return j1Var;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final void a(j1 j1Var) {
        fd.j0.i(j1Var, "adBlockerState");
        synchronized (f22867c) {
            this.f22869b = j1Var;
            this.f22868a.putLong("AdBlockerLastUpdate", j1Var.a());
            this.f22868a.putBoolean("AdBlockerDetected", j1Var.b());
        }
    }
}
