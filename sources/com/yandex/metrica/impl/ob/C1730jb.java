package com.yandex.metrica.impl.ob;

import java.util.List;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.jb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1730jb implements InterfaceC1605ea<List<String>, C1979tb<Rf.d, Fn>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Tn f16406a;

    public C1730jb() {
        this(new Tn(20, 100));
    }

    public C1730jb(Tn tn) {
        this.f16406a = tn;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1979tb<Rf.d, Fn> b(List<String> list) {
        Qn<List<String>, Hn> qnA = this.f16406a.a((List) list);
        Rf.d dVar = new Rf.d();
        List<String> list2 = qnA.f14828a;
        int i10 = O2.f14603a;
        byte[][] bArr = new byte[0][];
        if (list2 != null) {
            bArr = new byte[list2.size()][];
            for (int i11 = 0; i11 < list2.size(); i11++) {
                bArr[i11] = O2.c(list2.get(i11));
            }
        }
        dVar.f14887b = bArr;
        return new C1979tb<>(dVar, qnA.f14829b);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public List<String> a(C1979tb<Rf.d, Fn> c1979tb) {
        throw new UnsupportedOperationException();
    }
}
