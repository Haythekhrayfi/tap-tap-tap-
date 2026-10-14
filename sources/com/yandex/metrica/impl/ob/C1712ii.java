package com.yandex.metrica.impl.ob;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ii, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1712ii {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f16354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f16355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Om f16356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Mm f16357d;

    public C1712ii() {
        this(new Nm(), new Mm());
    }

    public C1712ii(Om om, Mm mm) {
        this.f16356c = om;
        this.f16357d = mm;
    }

    public synchronized double a() {
        return this.f16357d.b(this.f16355b, TimeUnit.MILLISECONDS);
    }

    public synchronized double b() {
        return this.f16357d.b(this.f16354a, TimeUnit.MILLISECONDS);
    }

    public synchronized void c() {
        this.f16355b = this.f16356c.a();
    }

    public synchronized void d() {
        this.f16354a = this.f16356c.a();
    }

    public synchronized void e() {
        this.f16355b = 0L;
    }
}
