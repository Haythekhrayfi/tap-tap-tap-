package fd;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r0<T> extends ld.h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29617e;

    public r0(int i10) {
        this.f29617e = i10;
    }

    public void b(Object obj, Throwable th) {
    }

    public abstract mc.d<T> c();

    public Throwable e(Object obj) {
        v vVar = obj instanceof v ? (v) obj : null;
        if (vVar != null) {
            return vVar.f29629a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T f(Object obj) {
        return obj;
    }

    public final void g(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            jc.a.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        j0.f(th);
        f.f(c().getContext(), new i0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object h();

    @Override // java.lang.Runnable
    public final void run() {
        Object objF;
        j1 j1Var;
        Object objF2;
        ld.i iVar = this.f33101d;
        try {
            kd.f fVar = (kd.f) c();
            mc.d<T> dVar = fVar.f32035g;
            Object obj = fVar.f32037i;
            mc.f context = dVar.getContext();
            Object objC = kd.b0.c(context, obj);
            h2<?> h2VarD = objC != kd.b0.f32018a ? b0.d(dVar, context, objC) : null;
            try {
                mc.f context2 = dVar.getContext();
                Object objH = h();
                Throwable thE = e(objH);
                if (thE == null && f.g(this.f29617e)) {
                    int i10 = j1.f29579x1;
                    j1Var = (j1) context2.b(j1.b.f29580c);
                } else {
                    j1Var = null;
                }
                if (j1Var != null && !j1Var.a()) {
                    CancellationException cancellationExceptionQ = j1Var.q();
                    b(objH, cancellationExceptionQ);
                    jc.i.a aVar = jc.i.f31813c;
                    objF2 = h9.d.f(cancellationExceptionQ);
                } else if (thE != null) {
                    jc.i.a aVar2 = jc.i.f31813c;
                    objF2 = h9.d.f(thE);
                } else {
                    jc.i.a aVar3 = jc.i.f31813c;
                    objF2 = f(objH);
                }
                dVar.resumeWith(objF2);
                Object objF3 = jc.w.f31842a;
                if (h2VarD == null || h2VarD.z0()) {
                    kd.b0.a(context, objC);
                }
                try {
                    jc.i.a aVar4 = jc.i.f31813c;
                    iVar.a();
                } catch (Throwable th) {
                    jc.i.a aVar5 = jc.i.f31813c;
                    objF3 = h9.d.f(th);
                }
                g(null, jc.i.a(objF3));
            } catch (Throwable th2) {
                if (h2VarD == null || h2VarD.z0()) {
                    kd.b0.a(context, objC);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                jc.i.a aVar6 = jc.i.f31813c;
                iVar.a();
                objF = jc.w.f31842a;
            } catch (Throwable th4) {
                jc.i.a aVar7 = jc.i.f31813c;
                objF = h9.d.f(th4);
            }
            g(th3, jc.i.a(objF));
        }
    }
}
