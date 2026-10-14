package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
class Mk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F9 f14520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f14521b;

    public Mk(F9 f10) {
        this.f14520a = f10;
        this.f14521b = f10.c(-1L);
    }

    public long a() {
        F9 f10 = this.f14520a;
        long j10 = this.f14521b + 1;
        this.f14521b = j10;
        f10.f(j10);
        return this.f14521b;
    }
}
