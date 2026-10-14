package oc;

import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c extends a {
    private final mc.f _context;
    private transient mc.d<Object> intercepted;

    public c(mc.d<Object> dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }

    public c(mc.d<Object> dVar, mc.f fVar) {
        super(dVar);
        this._context = fVar;
    }

    @Override // mc.d
    public mc.f getContext() {
        mc.f fVar = this._context;
        j0.f(fVar);
        return fVar;
    }

    public final mc.d<Object> intercepted() {
        mc.d<Object> dVarC = this.intercepted;
        if (dVarC == null) {
            mc.f context = getContext();
            int i10 = mc.e.B1;
            mc.e eVar = (mc.e) context.b(mc.e.a.f33537c);
            if (eVar == null || (dVarC = eVar.C(this)) == null) {
                dVarC = this;
            }
            this.intercepted = dVarC;
        }
        return dVarC;
    }

    @Override // oc.a
    public void releaseIntercepted() {
        mc.d<?> dVar = this.intercepted;
        if (dVar != null && dVar != this) {
            mc.f context = getContext();
            int i10 = mc.e.B1;
            mc.f.a aVarB = context.b(mc.e.a.f33537c);
            j0.f(aVarB);
            ((mc.e) aVarB).h(dVar);
        }
        this.intercepted = b.f34224c;
    }
}
