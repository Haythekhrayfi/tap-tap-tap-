package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.g7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1652g7 implements InterfaceC1702i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f16184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.yandex.metrica.d f16185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final K0 f16186c;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.g7$a */
    public interface a {
        boolean a(Throwable th);
    }

    public AbstractC1652g7(a aVar, com.yandex.metrica.d dVar, K0 k10) {
        this.f16184a = aVar;
        this.f16185b = dVar;
        this.f16186c = k10;
    }

    public abstract void a(C1876p7 c1876p7);

    @Override // com.yandex.metrica.impl.ob.InterfaceC1702i7
    public void a(Throwable th, C1602e7 c1602e7) {
        if (this.f16184a.a(th)) {
            com.yandex.metrica.d dVar = this.f16185b;
            if (dVar == null || th == null || (th = dVar.a(th)) != null) {
                a(C1901q7.a(th, c1602e7, null, this.f16186c.a(), this.f16186c.b()));
            }
        }
    }
}
