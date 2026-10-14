package hd;

import fd.k1;
import fd.o1;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public class g<E> extends fd.a<jc.w> implements f<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f<E> f31099e;

    public g(mc.f fVar, f<E> fVar2, boolean z10, boolean z11) {
        super(fVar, z10, z11);
        this.f31099e = fVar2;
    }

    @Override // fd.o1
    public void H(Throwable th) throws Throwable {
        CancellationException cancellationExceptionT0 = o1.t0(this, th, null, 1, null);
        this.f31099e.c(cancellationExceptionT0);
        G(cancellationExceptionT0);
    }

    @Override // fd.o1, fd.j1
    public final void c(CancellationException cancellationException) throws Throwable {
        Object objE0 = e0();
        if ((objE0 instanceof fd.v) || ((objE0 instanceof o1.c) && ((o1.c) objE0).e())) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new k1(L(), null, this);
        }
        CancellationException cancellationExceptionT0 = o1.t0(this, cancellationException, null, 1, null);
        this.f31099e.c(cancellationExceptionT0);
        G(cancellationExceptionT0);
    }

    @Override // hd.r
    public Object f(mc.d<? super h<? extends E>> dVar) {
        Object objF = this.f31099e.f(dVar);
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        return objF;
    }

    @Override // hd.v
    public void k(uc.l<? super Throwable, jc.w> lVar) {
        this.f31099e.k(lVar);
    }

    @Override // hd.v
    public boolean offer(E e10) {
        return this.f31099e.offer(e10);
    }

    @Override // hd.r
    public Object r() {
        return this.f31099e.r();
    }

    @Override // hd.v
    public Object u(E e10, mc.d<? super jc.w> dVar) {
        return this.f31099e.u(e10, dVar);
    }

    @Override // hd.v
    public boolean v(Throwable th) {
        return this.f31099e.v(th);
    }

    @Override // hd.v
    public boolean z() {
        return this.f31099e.z();
    }
}
