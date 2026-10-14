package com.yandex.metrica.impl.ob;

import java.util.EnumMap;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.x7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2080x7 implements InterfaceC1605ea<L7, Lf> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final EnumMap<O7, Integer> f17834a;

    static {
        EnumMap<O7, Integer> enumMap = new EnumMap<>(O7.class);
        f17834a = enumMap;
        enumMap.put(O7.UNKNOWN, 0);
        enumMap.put(O7.BREAKPAD, 2);
        enumMap.put(O7.CRASHPAD, 3);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Lf b(L7 l10) {
        Lf lf = new Lf();
        lf.f14417g = 1;
        Lf.a aVar = new Lf.a();
        lf.f14418h = aVar;
        aVar.f14422b = l10.a();
        K7 k7B = l10.b();
        lf.f14418h.f14423c = new Nf();
        Integer num = f17834a.get(k7B.b());
        if (num != null) {
            lf.f14418h.f14423c.f14545b = num.intValue();
        }
        Nf nf = lf.f14418h.f14423c;
        String strA = k7B.a();
        if (strA == null) {
            strA = "";
        }
        nf.f14546c = strA;
        return lf;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public L7 a(Lf lf) {
        throw new UnsupportedOperationException();
    }
}
