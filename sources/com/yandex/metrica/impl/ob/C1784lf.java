package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.lf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1784lf implements InterfaceC1809mf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1792ln f16824a;

    public C1784lf() {
        this(new C1792ln());
    }

    public C1784lf(C1792ln c1792ln) {
        this.f16824a = c1792ln;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1809mf
    public byte[] a(Xe xe2, C1736jh c1736jh) {
        byte[] bArrA = new byte[0];
        try {
            bArrA = V0.a(xe2.f15485b);
        } catch (Throwable unused) {
        }
        byte[] bArrA2 = this.f16824a.a(xe2.f15501r).a(bArrA);
        return bArrA2 == null ? new byte[0] : bArrA2;
    }
}
