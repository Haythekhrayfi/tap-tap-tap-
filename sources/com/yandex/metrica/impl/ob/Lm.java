package com.yandex.metrica.impl.ob;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class Lm implements InterfaceC1496a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile long f14431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private I9 f14432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Om f14433c;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static Lm f14434a = new Lm();
    }

    private Lm() {
    }

    public static Lm c() {
        return b.f14434a;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1496a1
    public synchronized long a() {
        return this.f14431a;
    }

    public synchronized void a(long j10, Long l10) {
        this.f14431a = (j10 - this.f14433c.a()) / 1000;
        boolean z10 = true;
        if (this.f14432b.a(true)) {
            if (l10 != null) {
                long jAbs = Math.abs(j10 - this.f14433c.a());
                I9 i10 = this.f14432b;
                if (jAbs <= TimeUnit.SECONDS.toMillis(l10.longValue())) {
                    z10 = false;
                }
                i10.c(z10);
            } else {
                this.f14432b.c(false);
            }
        }
        this.f14432b.l(this.f14431a);
        this.f14432b.c();
    }

    public synchronized void b() {
        this.f14432b.c(false);
        this.f14432b.c();
    }

    public synchronized void d() {
        I9 i9U = P0.i().u();
        Nm nm = new Nm();
        this.f14432b = i9U;
        this.f14431a = i9U.b(0);
        this.f14433c = nm;
    }

    public synchronized boolean e() {
        return this.f14432b.a(true);
    }
}
