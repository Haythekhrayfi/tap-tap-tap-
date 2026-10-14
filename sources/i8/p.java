package i8;

import y9.l1;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends r1.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r1.l f31400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p7.o0 f31401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f31402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1 f31403d;

    public p(r1.l lVar, p7.o0 o0Var, k kVar, l1 l1Var) {
        this.f31400a = lVar;
        this.f31401b = o0Var;
        this.f31402c = kVar;
        this.f31403d = l1Var;
    }

    @Override // r1.m, r1.l.g
    public void onTransitionEnd(r1.l lVar) {
        fd.j0.i(lVar, "transition");
        this.f31401b.a(this.f31402c, this.f31403d);
        this.f31400a.removeListener(this);
    }
}
