package com.yandex.metrica.impl.ob;

import java.util.Objects;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ha, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1680ha implements Object<Xa, C1760kg.f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1655ga f16269a;

    public C1680ha() {
        this(new C1655ga());
    }

    public C1680ha(C1655ga c1655ga) {
        this.f16269a = c1655ga;
    }

    private Wa a(C1760kg.e eVar) {
        if (eVar == null) {
            return null;
        }
        return this.f16269a.a(eVar);
    }

    private C1760kg.e a(Wa wa2) {
        if (wa2 == null) {
            return null;
        }
        Objects.requireNonNull(this.f16269a);
        C1760kg.e eVar = new C1760kg.e();
        eVar.f16620b = wa2.f15379a;
        eVar.f16621c = wa2.f15380b;
        return eVar;
    }

    public Xa a(C1760kg.f fVar) {
        return new Xa(a(fVar.f16622b), a(fVar.f16623c), a(fVar.f16624d));
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1760kg.f b(Xa xa2) {
        C1760kg.f fVar = new C1760kg.f();
        fVar.f16622b = a(xa2.f15479a);
        fVar.f16623c = a(xa2.f15480b);
        fVar.f16624d = a(xa2.f15481c);
        return fVar;
    }

    public Object a(Object obj) {
        C1760kg.f fVar = (C1760kg.f) obj;
        return new Xa(a(fVar.f16622b), a(fVar.f16623c), a(fVar.f16624d));
    }
}
