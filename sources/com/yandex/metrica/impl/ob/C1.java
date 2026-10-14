package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
class C1 implements G3<K3> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B1 f13749a;

    public C1(B1 b10) {
        this.f13749a = b10;
    }

    @Override // com.yandex.metrica.impl.ob.G3
    public boolean a(H3 h10) {
        return !this.f13749a.f13681c.getPackageName().equals(((K3) h10).f14339a);
    }
}
