package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.sb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1954sb implements InterfaceC1605ea<Gb, C1979tb<Rf.m, Fn>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2004ub f17293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Un f17294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Un f17295c;

    public C1954sb() {
        this(new C2004ub(), new Un(100), new Un(2048));
    }

    public C1954sb(C2004ub c2004ub, Un un, Un un2) {
        this.f17293a = c2004ub;
        this.f17294b = un;
        this.f17295c = un2;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1979tb<Rf.m, Fn> b(Gb gb2) {
        C1979tb<Rf.n, Fn> c1979tbB;
        Rf.m mVar = new Rf.m();
        Qn<String, Fn> qnA = this.f17294b.a(gb2.f14086a);
        mVar.f14915b = O2.c(qnA.f14828a);
        Qn<String, Fn> qnA2 = this.f17295c.a(gb2.f14087b);
        mVar.f14916c = O2.c(qnA2.f14828a);
        Hb hb2 = gb2.f14088c;
        if (hb2 != null) {
            c1979tbB = this.f17293a.b(hb2);
            mVar.f14917d = c1979tbB.f17444a;
        } else {
            c1979tbB = null;
        }
        return new C1979tb<>(mVar, En.a(qnA, qnA2, c1979tbB));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public Gb a(C1979tb<Rf.m, Fn> c1979tb) {
        throw new UnsupportedOperationException();
    }
}
