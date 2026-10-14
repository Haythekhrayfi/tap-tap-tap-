package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
class Kk implements InterfaceC1692hm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f14358a;

    public Kk(String str) {
        this.f14358a = str;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1692hm
    public Wl.b a() {
        return Wl.b.CONTAINS;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1692hm
    public boolean a(Object obj) {
        return ((String) obj).contains(this.f14358a);
    }
}
