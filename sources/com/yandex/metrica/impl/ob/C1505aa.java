package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.aa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1505aa implements InterfaceC1605ea<H, C1536bg.a> {
    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public H a(C1536bg.a aVar) {
        H.a aVar2;
        int i10 = aVar.f15838b;
        Boolean bool = null;
        if (i10 == 1) {
            aVar2 = H.a.ACTIVE;
        } else if (i10 == 2) {
            aVar2 = H.a.WORKING_SET;
        } else if (i10 == 3) {
            aVar2 = H.a.FREQUENT;
        } else if (i10 != 4) {
            aVar2 = i10 != 5 ? null : H.a.RESTRICTED;
        } else {
            aVar2 = H.a.RARE;
        }
        int i11 = aVar.f15839c;
        if (i11 == 0) {
            bool = Boolean.FALSE;
        } else if (i11 == 1) {
            bool = Boolean.TRUE;
        }
        return new H(aVar2, bool);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0023 A[PHI: r3
  0x0023: PHI (r3v1 int) = (r3v0 int), (r3v2 int) binds: [B:7:0x0011, B:11:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1536bg.a b(H h10) {
        C1536bg.a aVar = new C1536bg.a();
        H.a aVar2 = h10.f14110a;
        if (aVar2 != null) {
            int iOrdinal = aVar2.ordinal();
            if (iOrdinal != 0) {
                int i10 = 2;
                if (iOrdinal == 1) {
                    aVar.f15838b = i10;
                } else if (iOrdinal != 2) {
                    i10 = 4;
                    if (iOrdinal == 3) {
                        aVar.f15838b = i10;
                    } else if (iOrdinal == 4) {
                        aVar.f15838b = 5;
                    }
                } else {
                    aVar.f15838b = 3;
                }
            } else {
                aVar.f15838b = 1;
            }
        }
        Boolean bool = h10.f14111b;
        if (bool != null) {
            if (bool.booleanValue()) {
                aVar.f15839c = 1;
            } else {
                aVar.f15839c = 0;
            }
        }
        return aVar;
    }
}
