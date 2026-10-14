package fd;

import android.content.ComponentCallbacks;
import ch.qos.logback.core.joran.action.Action;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f {
    public static hd.f a(int i10, hd.e eVar, uc.l lVar, int i11) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            eVar = hd.e.SUSPEND;
        }
        int i12 = 1;
        if (i10 == -2) {
            if (eVar == hd.e.SUSPEND) {
                Objects.requireNonNull(hd.f.A1);
                i12 = hd.f.a.f31098b;
            }
            return new hd.d(i12, eVar, null);
        }
        if (i10 == -1) {
            if (eVar == hd.e.SUSPEND) {
                return new hd.l(null);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        if (i10 == 0) {
            return eVar == hd.e.SUSPEND ? new hd.t(null) : new hd.d(1, eVar, null);
        }
        if (i10 != Integer.MAX_VALUE) {
            return (i10 == 1 && eVar == hd.e.DROP_OLDEST) ? new hd.l(null) : new hd.d(i10, eVar, null);
        }
        return new hd.m(null);
    }

    public static r b(j1 j1Var, int i10) {
        return new s(null);
    }

    public static Object c(fe.a aVar, String str, Class cls, uc.a aVar2, int i10) {
        String str2 = (i10 & 1) != 0 ? "" : null;
        ae.b bVar = (i10 & 4) != 0 ? ae.b.f348c : null;
        j0.j(aVar, "$receiver");
        j0.j(str2, "name");
        j0.j(bVar, "parameters");
        wd.b bVar2 = aVar.f29652f;
        cd.c cVarA = vc.b0.a(cls);
        wd.b.a aVar3 = wd.b.f37310d;
        Objects.requireNonNull(bVar2);
        return bVar2.f37311a.c(new yd.h(str2, cVarA, null, bVar));
    }

    public static final wd.b d(ComponentCallbacks componentCallbacks) {
        j0.j(componentCallbacks, "$receiver");
        wd.a aVar = le.b.f33117a;
        if (aVar != null) {
            return aVar.f37307e;
        }
        throw new IllegalStateException("StandAloneContext Koin instance is null".toString());
    }

    public static final String e(ge.b<?> bVar) {
        j0.j(bVar, "$receiver");
        Object obj = bVar.f30453j.get(Action.SCOPE_ATTRIBUTE);
        if (!(obj instanceof String)) {
            obj = null;
        }
        String str = (String) obj;
        return str != null ? str : "";
    }

    public static final void f(mc.f fVar, Throwable th) {
        try {
            int i10 = d0.f29559w1;
            d0 d0Var = (d0) fVar.b(d0.a.f29560c);
            if (d0Var != null) {
                d0Var.J(fVar, th);
            } else {
                f0.a(fVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                jc.a.a(runtimeException, th);
                th = runtimeException;
            }
            f0.a(fVar, th);
        }
    }

    public static final boolean g(int i10) {
        return i10 == 1 || i10 == 2;
    }

    public static final <T> void h(r0<? super T> r0Var, mc.d<? super T> dVar, boolean z10) {
        Object objF;
        Object objH = r0Var.h();
        Throwable thE = r0Var.e(objH);
        if (thE != null) {
            jc.i.a aVar = jc.i.f31813c;
            objF = h9.d.f(thE);
        } else {
            jc.i.a aVar2 = jc.i.f31813c;
            objF = r0Var.f(objH);
        }
        if (!z10) {
            dVar.resumeWith(objF);
            return;
        }
        kd.f fVar = (kd.f) dVar;
        mc.d<T> dVar2 = fVar.f32035g;
        Object obj = fVar.f32037i;
        mc.f context = dVar2.getContext();
        Object objC = kd.b0.c(context, obj);
        h2<?> h2VarD = objC != kd.b0.f32018a ? b0.d(dVar2, context, objC) : null;
        try {
            fVar.f32035g.resumeWith(objF);
        } finally {
            if (h2VarD == null || h2VarD.z0()) {
                kd.b0.a(context, objC);
            }
        }
    }

    public static final <T, R> Object i(kd.x<? super T> xVar, R r10, uc.p<? super R, ? super mc.d<? super T>, ? extends Object> pVar) {
        Object vVar;
        Object objJ0;
        try {
            vc.f0.c(pVar, 2);
            vVar = pVar.invoke(r10, xVar);
        } catch (Throwable th) {
            vVar = new v(th, false, 2, null);
        }
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        if (vVar == aVar || (objJ0 = xVar.j0(vVar)) == p1.f29609b) {
            return aVar;
        }
        if (objJ0 instanceof v) {
            throw ((v) objJ0).f29629a;
        }
        return p1.a(objJ0);
    }
}
