package jd;

import fd.j0;
import fd.z;
import jc.w;
import kd.b0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i<S, T> extends g<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final id.d<S> f31863f;

    /* JADX WARN: Multi-variable type inference failed */
    public i(id.d<? extends S> dVar, mc.f fVar, int i10, hd.e eVar) {
        super(fVar, i10, eVar);
        this.f31863f = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0057  */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // jd.g, id.d
    public Object a(id.e<? super T> eVar, mc.d<? super w> dVar) {
        Object objA;
        if (this.f31858d == -3) {
            mc.f context = dVar.getContext();
            mc.f fVarI = context.i(this.f31857c);
            if (j0.d(fVarI, context)) {
                Object objE = e(eVar, dVar);
                if (objE == nc.a.COROUTINE_SUSPENDED) {
                    return objE;
                }
            } else {
                int i10 = mc.e.B1;
                mc.e.a aVar = mc.e.a.f33537c;
                if (j0.d(fVarI.b(aVar), context.b(aVar))) {
                    mc.f context2 = dVar.getContext();
                    if (!(eVar instanceof r)) {
                        eVar = new t(eVar, context2);
                    }
                    Object objS = z.S(fVarI, eVar, b0.b(fVarI), new h(this, null), dVar);
                    nc.a aVar2 = nc.a.COROUTINE_SUSPENDED;
                    if (objS != aVar2) {
                        objS = w.f31842a;
                    }
                    if (objS == aVar2) {
                        return objS;
                    }
                } else {
                    objA = super.a(eVar, dVar);
                    if (objA == nc.a.COROUTINE_SUSPENDED) {
                        return objA;
                    }
                }
            }
        } else {
            objA = super.a(eVar, dVar);
            if (objA == nc.a.COROUTINE_SUSPENDED) {
                return objA;
            }
        }
        return w.f31842a;
    }

    @Override // jd.g
    public Object c(hd.p<? super T> pVar, mc.d<? super w> dVar) {
        Object objE = e(new r(pVar), dVar);
        return objE == nc.a.COROUTINE_SUSPENDED ? objE : w.f31842a;
    }

    public abstract Object e(id.e<? super T> eVar, mc.d<? super w> dVar);

    @Override // jd.g
    public String toString() {
        return this.f31863f + " -> " + super.toString();
    }
}
