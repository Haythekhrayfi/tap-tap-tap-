package hd;

import ch.qos.logback.core.CoreConstants;
import fd.j0;
import kd.z;

/* JADX INFO: loaded from: classes3.dex */
public class w<E> extends u {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final E f31112f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fd.i<jc.w> f31113g;

    /* JADX WARN: Multi-variable type inference failed */
    public w(E e10, fd.i<? super jc.w> iVar) {
        this.f31112f = e10;
        this.f31113g = iVar;
    }

    @Override // kd.k
    public String toString() {
        return getClass().getSimpleName() + '@' + j0.n(this) + CoreConstants.LEFT_PARENTHESIS_CHAR + this.f31112f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // hd.u
    public void w() {
        this.f31113g.B(fd.l.f29590a);
    }

    @Override // hd.u
    public E x() {
        return this.f31112f;
    }

    @Override // hd.u
    public void y(i<?> iVar) {
        fd.i<jc.w> iVar2 = this.f31113g;
        jc.i.a aVar = jc.i.f31813c;
        iVar2.resumeWith(h9.d.f(iVar.B()));
    }

    @Override // hd.u
    public z z(kd.k.c cVar) {
        if (this.f31113g.d(jc.w.f31842a, null) == null) {
            return null;
        }
        return fd.l.f29590a;
    }
}
