package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.na, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1829na implements Object<Hc, C1760kg.k.a.b.C0185a> {
    public Hc a(C1760kg.k.a.b.C0185a c0185a) {
        com.yandex.metrica.gpllibrary.a.b bVar;
        int i10 = c0185a.f16687d;
        if (i10 == 1) {
            bVar = com.yandex.metrica.gpllibrary.a.b.PRIORITY_LOW_POWER;
        } else if (i10 != 2) {
            bVar = i10 != 3 ? com.yandex.metrica.gpllibrary.a.b.PRIORITY_NO_POWER : com.yandex.metrica.gpllibrary.a.b.PRIORITY_HIGH_ACCURACY;
        } else {
            bVar = com.yandex.metrica.gpllibrary.a.b.PRIORITY_BALANCED_POWER_ACCURACY;
        }
        return new Hc(bVar, c0185a.f16685b, c0185a.f16686c);
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1760kg.k.a.b.C0185a b(Hc hc2) {
        C1760kg.k.a.b.C0185a c0185a = new C1760kg.k.a.b.C0185a();
        c0185a.f16685b = hc2.f14144b;
        c0185a.f16686c = hc2.f14145c;
        int iOrdinal = hc2.f14143a.ordinal();
        int i10 = 3;
        if (iOrdinal == 1) {
            i10 = 1;
        } else if (iOrdinal == 2) {
            i10 = 2;
        } else if (iOrdinal != 3) {
            i10 = 0;
        }
        c0185a.f16687d = i10;
        return c0185a;
    }
}
