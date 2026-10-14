package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f26708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b61 f26709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f26710d;

    public /* synthetic */ y51(String str) {
        this(str, true);
    }

    public y51(String str, boolean z10) {
        fd.j0.i(str, "name");
        this.f26707a = str;
        this.f26708b = z10;
        this.f26710d = -1L;
    }

    public final void a(long j10) {
        this.f26710d = j10;
    }

    public final void a(b61 b61Var) {
        fd.j0.i(b61Var, "queue");
        b61 b61Var2 = this.f26709c;
        if (b61Var2 == b61Var) {
            return;
        }
        if (!(b61Var2 == null)) {
            throw new IllegalStateException("task is in multiple queues".toString());
        }
        this.f26709c = b61Var;
    }

    public final boolean a() {
        return this.f26708b;
    }

    public final String b() {
        return this.f26707a;
    }

    public final long c() {
        return this.f26710d;
    }

    public final b61 d() {
        return this.f26709c;
    }

    public abstract long e();

    public final String toString() {
        return this.f26707a;
    }
}
