package com.yandex.metrica.impl.ob;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.hi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1688hi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Mm f16302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f16303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f16304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f16305d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f16306e;

    public C1688hi(Om om, Mm mm) {
        this.f16303b = ((Nm) om).a();
        this.f16302a = mm;
    }

    public void a() {
        this.f16304c = this.f16302a.b(this.f16303b, TimeUnit.MILLISECONDS);
    }

    public void b() {
        this.f16305d = this.f16302a.b(this.f16303b, TimeUnit.MILLISECONDS);
    }

    public void c() {
        this.f16306e = this.f16302a.b(this.f16303b, TimeUnit.MILLISECONDS);
    }

    public long d() {
        return this.f16304c;
    }

    public long e() {
        return this.f16305d;
    }

    public long f() {
        return this.f16306e;
    }
}
