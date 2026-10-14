package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.r1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1919r1 extends S2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.yandex.metrica.j f17200c;

    public C1919r1(Y0 y10, com.yandex.metrica.j jVar) {
        super(y10, jVar.apiKey);
        this.f17200c = jVar;
    }

    @Override // com.yandex.metrica.impl.ob.S2
    public InterfaceC1521b1 a() {
        return this.f14994b.b().a(this.f17200c);
    }
}
