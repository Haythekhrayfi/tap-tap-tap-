package hd;

import kd.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class x<E> extends w<E> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final uc.l<E, jc.w> f31114h;

    /* JADX WARN: Multi-variable type inference failed */
    public x(E e10, fd.i<? super jc.w> iVar, uc.l<? super E, jc.w> lVar) {
        super(e10, iVar);
        this.f31114h = lVar;
    }

    @Override // hd.u
    public void A() {
        uc.l<E, jc.w> lVar = this.f31114h;
        E e10 = this.f31112f;
        mc.f context = this.f31113g.getContext();
        f0 f0VarA = kd.t.a(lVar, e10, null);
        if (f0VarA != null) {
            fd.f.f(context, f0VarA);
        }
    }

    @Override // kd.k
    public boolean t() {
        if (!super.t()) {
            return false;
        }
        A();
        return true;
    }
}
