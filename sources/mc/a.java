package mc;

import ch.qos.logback.core.joran.action.Action;
import fd.j0;
import uc.p;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements f.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f.b<?> f33531c;

    public a(f.b<?> bVar) {
        j0.i(bVar, Action.KEY_ATTRIBUTE);
        this.f33531c = bVar;
    }

    @Override // mc.f
    public <R> R Y(R r10, p<? super R, ? super f.a, ? extends R> pVar) {
        return (R) f.a.C0363a.a(this, r10, pVar);
    }

    @Override // mc.f.a, mc.f
    public <E extends f.a> E b(f.b<E> bVar) {
        return (E) f.a.C0363a.b(this, bVar);
    }

    @Override // mc.f.a
    public f.b<?> getKey() {
        return this.f33531c;
    }

    @Override // mc.f
    public f i(f fVar) {
        return f.a.C0363a.d(this, fVar);
    }

    @Override // mc.f
    public f p(f.b<?> bVar) {
        return f.a.C0363a.c(this, bVar);
    }
}
