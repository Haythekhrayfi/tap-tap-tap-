package fd;

/* JADX INFO: loaded from: classes3.dex */
public final class h2<T> extends kd.x<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ThreadLocal<jc.h<mc.f, Object>> f29576f;

    /* JADX WARN: Illegal instructions before constructor call */
    public h2(mc.f fVar, mc.d<? super T> dVar) {
        i2 i2Var = i2.f29578c;
        super(fVar.b(i2Var) == null ? fVar.i(i2Var) : fVar, dVar);
        this.f29576f = new ThreadLocal<>();
        mc.f context = dVar.getContext();
        int i10 = mc.e.B1;
        if (context.b(mc.e.a.f33537c) instanceof c0) {
            return;
        }
        Object objC = kd.b0.c(fVar, null);
        kd.b0.a(fVar, objC);
        this.f29576f.set(new jc.h<>(fVar, objC));
    }

    @Override // kd.x, fd.a
    public void w0(Object obj) {
        jc.h<mc.f, Object> hVar = this.f29576f.get();
        if (hVar != null) {
            kd.b0.a(hVar.f31811c, hVar.f31812d);
            this.f29576f.set(null);
        }
        Object objA = z.A(obj, this.f32071e);
        mc.d<T> dVar = this.f32071e;
        mc.f context = dVar.getContext();
        Object objC = kd.b0.c(context, null);
        h2<?> h2VarD = objC != kd.b0.f32018a ? b0.d(dVar, context, objC) : null;
        try {
            this.f32071e.resumeWith(objA);
        } finally {
            if (h2VarD == null || h2VarD.z0()) {
                kd.b0.a(context, objC);
            }
        }
    }

    public final boolean z0() {
        if (this.f29576f.get() == null) {
            return false;
        }
        this.f29576f.set(null);
        return true;
    }
}
