package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ln, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1792ln {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Fm<EnumC1817mn, InterfaceC1767kn> f16864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Fm<EnumC1745k1, InterfaceC1767kn> f16865b;

    public C1792ln() {
        this(new C1717in(), new C1842nn(), new C1643fn());
    }

    public C1792ln(InterfaceC1767kn interfaceC1767kn, InterfaceC1767kn interfaceC1767kn2, InterfaceC1767kn interfaceC1767kn3) {
        Fm<EnumC1817mn, InterfaceC1767kn> fm = new Fm<>(interfaceC1767kn);
        this.f16864a = fm;
        fm.a(EnumC1817mn.NONE, interfaceC1767kn);
        fm.a(EnumC1817mn.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER, interfaceC1767kn2);
        fm.a(EnumC1817mn.AES_VALUE_ENCRYPTION, interfaceC1767kn3);
        Fm<EnumC1745k1, InterfaceC1767kn> fm2 = new Fm<>(interfaceC1767kn);
        this.f16865b = fm2;
        fm2.a(EnumC1745k1.EVENT_TYPE_IDENTITY, interfaceC1767kn3);
    }

    public InterfaceC1767kn a(C1744k0 c1744k0) {
        return this.f16865b.a(EnumC1745k1.a(c1744k0.n()));
    }

    public InterfaceC1767kn a(EnumC1817mn enumC1817mn) {
        return this.f16864a.a(enumC1817mn);
    }
}
