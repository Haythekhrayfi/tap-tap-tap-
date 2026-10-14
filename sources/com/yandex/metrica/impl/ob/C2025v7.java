package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.v7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2025v7 implements InterfaceC1605ea<C1876p7, byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2055w7<C1876p7> f17607a;

    public C2025v7() {
        this(new C2055w7(new F7()));
    }

    public C2025v7(C2055w7<C1876p7> c2055w7) {
        this.f17607a = c2055w7;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public C1876p7 a(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    public byte[] a(C1876p7 c1876p7) {
        return this.f17607a.a(c1876p7);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public byte[] b(C1876p7 c1876p7) {
        return this.f17607a.a(c1876p7);
    }
}
