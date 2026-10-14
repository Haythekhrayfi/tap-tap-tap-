package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.tc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1980tc extends Cd<Ec> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f17446c;

    public C1980tc(Oc oc2, String str) {
        this(oc2, str, new R2());
    }

    public C1980tc(Oc oc2, String str, R2 r10) {
        super(oc2, r10);
        this.f17446c = str;
    }

    @Override // com.yandex.metrica.impl.ob.Cd
    public String a() {
        return this.f17446c;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1955sc
    public boolean a(Object obj) {
        Dc dc2 = ((Ec) obj).f13903b;
        return dc2 != null && a(dc2.f13809b);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1955sc
    public boolean b(Object obj) {
        return ((Ec) obj).f13902a.f17906a;
    }
}
