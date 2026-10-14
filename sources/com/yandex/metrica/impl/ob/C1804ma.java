package com.yandex.metrica.impl.ob;

import java.util.Objects;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ma, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1804ma implements Object<Ec, C1760kg.k.a.C0183a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1779la f16885a;

    public C1804ma() {
        this(new C1779la());
    }

    public C1804ma(C1779la c1779la) {
        this.f16885a = c1779la;
    }

    public Ec a(C1760kg.k.a.C0183a c0183a) {
        Dc dc2;
        C1760kg.k.a.C0183a.C0184a c0184a = c0183a.f16679d;
        if (c0184a != null) {
            Objects.requireNonNull(this.f16885a);
            dc2 = new Dc(c0184a.f16680b, c0184a.f16681c);
        } else {
            dc2 = null;
        }
        return new Ec(new C2111yd(c0183a.f16677b, c0183a.f16678c), dc2);
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1760kg.k.a.C0183a b(Ec ec2) {
        C1760kg.k.a.C0183a c0183a = new C1760kg.k.a.C0183a();
        C2111yd c2111yd = ec2.f13902a;
        c0183a.f16677b = c2111yd.f17906a;
        c0183a.f16678c = c2111yd.f17907b;
        Dc dc2 = ec2.f13903b;
        if (dc2 != null) {
            Objects.requireNonNull(this.f16885a);
            C1760kg.k.a.C0183a.C0184a c0184a = new C1760kg.k.a.C0183a.C0184a();
            c0184a.f16680b = dc2.f13808a;
            c0184a.f16681c = dc2.f13809b;
            c0183a.f16679d = c0184a;
        }
        return c0183a;
    }
}
