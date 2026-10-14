package hd;

import fd.j0;
import kd.z;

/* JADX INFO: loaded from: classes3.dex */
public final class i<E> extends u implements s<E> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Throwable f31104f;

    public i(Throwable th) {
        this.f31104f = th;
    }

    public final Throwable B() {
        Throwable th = this.f31104f;
        return th == null ? new k("Channel was closed") : th;
    }

    @Override // hd.s
    public Object d() {
        return this;
    }

    @Override // hd.s
    public z h(E e10, kd.k.c cVar) {
        return fd.l.f29590a;
    }

    @Override // hd.s
    public void i(E e10) {
    }

    @Override // kd.k
    public String toString() {
        StringBuilder sbA = defpackage.a.a("Closed@");
        sbA.append(j0.n(this));
        sbA.append('[');
        sbA.append(this.f31104f);
        sbA.append(']');
        return sbA.toString();
    }

    @Override // hd.u
    public void w() {
    }

    @Override // hd.u
    public Object x() {
        return this;
    }

    @Override // hd.u
    public void y(i<?> iVar) {
    }

    @Override // hd.u
    public z z(kd.k.c cVar) {
        return fd.l.f29590a;
    }
}
