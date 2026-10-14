package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public class We implements InterfaceC1809mf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1792ln f15389a;

    public We() {
        this(new C1792ln());
    }

    public We(C1792ln c1792ln) {
        this.f15389a = c1792ln;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1809mf
    public byte[] a(Xe xe2, C1736jh c1736jh) {
        String str = xe2.f15485b;
        return this.f15389a.a(xe2.f15501r).a(str != null ? O2.c(str) : new byte[0]);
    }
}
