package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public class Uk implements InterfaceC1692hm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15193a;

    public Uk(String str) {
        this.f15193a = str;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1692hm
    public Wl.b a() {
        return Wl.b.EQUALS;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1692hm
    public boolean a(Object obj) {
        return ((String) obj).equals(this.f15193a);
    }
}
