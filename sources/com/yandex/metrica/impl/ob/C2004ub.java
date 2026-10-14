package com.yandex.metrica.impl.ob;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ub, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2004ub implements InterfaceC1605ea<Hb, C1979tb<Rf.n, Fn>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1830nb f17520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1730jb f17521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Un f17522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Un f17523d;

    public C2004ub() {
        this(new C1830nb(), new C1730jb(), new Un(100), new Un(1000));
    }

    public C2004ub(C1830nb c1830nb, C1730jb c1730jb, Un un, Un un2) {
        this.f17520a = c1830nb;
        this.f17521b = c1730jb;
        this.f17522c = un;
        this.f17523d = un2;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1979tb<Rf.n, Fn> b(Hb hb2) {
        C1979tb<Rf.d, Fn> c1979tbB;
        Rf.n nVar = new Rf.n();
        Qn<String, Fn> qnA = this.f17522c.a(hb2.f14139a);
        nVar.f14918b = O2.c(qnA.f14828a);
        List<String> list = hb2.f14140b;
        C1979tb<Rf.i, Fn> c1979tbB2 = null;
        if (list != null) {
            c1979tbB = this.f17521b.b(list);
            nVar.f14919c = c1979tbB.f17444a;
        } else {
            c1979tbB = null;
        }
        Qn<String, Fn> qnA2 = this.f17523d.a(hb2.f14141c);
        nVar.f14920d = O2.c(qnA2.f14828a);
        Map<String, String> map = hb2.f14142d;
        if (map != null) {
            c1979tbB2 = this.f17520a.b(map);
            nVar.f14921e = c1979tbB2.f17444a;
        }
        return new C1979tb<>(nVar, En.a(qnA, c1979tbB, qnA2, c1979tbB2));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public Hb a(C1979tb<Rf.n, Fn> c1979tb) {
        throw new UnsupportedOperationException();
    }
}
