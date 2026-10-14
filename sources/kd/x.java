package kd;

/* JADX INFO: loaded from: classes3.dex */
public class x<T> extends fd.a<T> implements oc.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final mc.d<T> f32071e;

    /* JADX WARN: Multi-variable type inference failed */
    public x(mc.f fVar, mc.d<? super T> dVar) {
        super(fVar, true, true);
        this.f32071e = dVar;
    }

    @Override // fd.o1
    public void E(Object obj) {
        g.a(nc.b.c(this.f32071e), fd.z.A(obj, this.f32071e), null);
    }

    @Override // oc.d
    public final oc.d getCallerFrame() {
        mc.d<T> dVar = this.f32071e;
        if (dVar instanceof oc.d) {
            return (oc.d) dVar;
        }
        return null;
    }

    @Override // fd.o1
    public final boolean i0() {
        return true;
    }

    @Override // fd.a
    public void w0(Object obj) {
        mc.d<T> dVar = this.f32071e;
        dVar.resumeWith(fd.z.A(obj, dVar));
    }
}
