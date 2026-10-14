package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class Gd implements T0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final I9 f14089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final R2 f14090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Ec f14091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1523b3 f14092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Om f14093e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a f14094f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Fd f14095g;

    public static class a {
    }

    public Gd(Context context, Ec ec2) {
        this(ec2, C1523b3.a(context));
    }

    private Gd(Ec ec2, C1523b3 c1523b3) {
        this(c1523b3, P0.i().u(), new R2(), new Nm(), new a(), ec2, new Fd(null, c1523b3.a()));
    }

    public Gd(C1523b3 c1523b3, I9 i10, R2 r10, Om om, a aVar, Ec ec2, Fd fd2) {
        this.f14092d = c1523b3;
        this.f14089a = i10;
        this.f14090b = r10;
        this.f14094f = aVar;
        this.f14091c = ec2;
        this.f14093e = om;
        this.f14095g = fd2;
    }

    @Override // com.yandex.metrica.impl.ob.T0
    public void a() {
        Ec ec2 = this.f14091c;
        if (ec2 == null || !ec2.f13902a.f17906a) {
            return;
        }
        this.f14095g.a(this.f14092d.b());
    }

    public void a(Ec ec2) {
        if (U2.a(this.f14091c, ec2)) {
            return;
        }
        this.f14091c = ec2;
        if (ec2 == null || !ec2.f13902a.f17906a) {
            return;
        }
        this.f14095g.a(this.f14092d.b());
    }

    public void b() {
        Ec ec2 = this.f14091c;
        if (ec2 == null || ec2.f13903b == null || !this.f14090b.b(this.f14089a.f(0L), this.f14091c.f13903b.f13809b, "last wifi scan attempt time")) {
            return;
        }
        Objects.requireNonNull(this.f14094f);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        if (this.f14092d.a(countDownLatch, this.f14095g)) {
            this.f14089a.k(this.f14093e.b());
            try {
                countDownLatch.await(5L, TimeUnit.SECONDS);
            } catch (Throwable unused) {
            }
        }
    }
}
