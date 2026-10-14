package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public class Cl implements InterfaceC1692hm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f13777a;

    public Cl(int i10) {
        this.f13777a = i10;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1692hm
    public Wl.b a() {
        return Wl.b.TEXT_TOO_LONG;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1692hm
    public boolean a(Object obj) {
        return ((String) obj).length() > this.f13777a;
    }
}
