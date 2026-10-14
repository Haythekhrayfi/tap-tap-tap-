package com.yandex.metrica.impl.ob;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.l6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1775l6 implements InterfaceC1850o6<C1900q6> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1624f4 f16805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1999u6 f16806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2104y6 f16807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1974t6 f16808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final W0 f16809e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Nm f16810f;

    public AbstractC1775l6(C1624f4 c1624f4, C1999u6 c1999u6, C2104y6 c2104y6, C1974t6 c1974t6, W0 w10, Nm nm) {
        this.f16805a = c1624f4;
        this.f16806b = c1999u6;
        this.f16807c = c2104y6;
        this.f16808d = c1974t6;
        this.f16809e = w10;
        this.f16810f = nm;
    }

    public C1875p6 a(Object obj) {
        C1900q6 c1900q6 = (C1900q6) obj;
        if (this.f16807c.h()) {
            this.f16809e.reportEvent("create session with non-empty storage");
        }
        C1624f4 c1624f4 = this.f16805a;
        C2104y6 c2104y6 = this.f16807c;
        long jA = this.f16806b.a();
        C2104y6 c2104y6D = this.f16807c.d(jA);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c2104y6D.e(timeUnit.toSeconds(c1900q6.f17164a)).a(c1900q6.f17164a).c(0L).a(true).b();
        this.f16805a.i().a(jA, this.f16808d.b(), timeUnit.toSeconds(c1900q6.f17165b));
        return new C1875p6(c1624f4, c2104y6, a(), new Nm());
    }

    public C1924r6 a() {
        C1924r6.b bVarD = new C1924r6.b(this.f16808d).a(this.f16807c.i()).b(this.f16807c.e()).a(this.f16807c.c()).c(this.f16807c.f()).d(this.f16807c.g());
        bVarD.f17222a = this.f16807c.d();
        return new C1924r6(bVarD);
    }

    public final C1875p6 b() {
        if (this.f16807c.h()) {
            return new C1875p6(this.f16805a, this.f16807c, a(), this.f16810f);
        }
        return null;
    }
}
