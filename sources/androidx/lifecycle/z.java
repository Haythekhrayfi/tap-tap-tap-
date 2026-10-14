package androidx.lifecycle;

import fd.j1;

/* JADX INFO: loaded from: classes.dex */
@oc.e(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.kt", l = {162}, m = "invokeSuspend")
public final class z extends oc.h implements uc.p<fd.g0, mc.d<Object>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f2258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f2259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i.c f2260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ uc.p<fd.g0, mc.d<Object>, Object> f2261g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z(i iVar, i.c cVar, uc.p<? super fd.g0, ? super mc.d<Object>, ? extends Object> pVar, mc.d<? super z> dVar) {
        super(2, dVar);
        this.f2259e = iVar;
        this.f2260f = cVar;
        this.f2261g = pVar;
    }

    @Override // oc.a
    public final mc.d<jc.w> create(Object obj, mc.d<?> dVar) {
        z zVar = new z(this.f2259e, this.f2260f, this.f2261g, dVar);
        zVar.f2258d = obj;
        return zVar;
    }

    @Override // uc.p
    public Object invoke(fd.g0 g0Var, mc.d<Object> dVar) {
        z zVar = new z(this.f2259e, this.f2260f, this.f2261g, dVar);
        zVar.f2258d = g0Var;
        return zVar.invokeSuspend(jc.w.f31842a);
    }

    @Override // oc.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        j jVar;
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i10 = this.f2257c;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar = (j) this.f2258d;
            try {
                h9.d.t(obj);
                jVar.a();
                return obj;
            } catch (Throwable th) {
                th = th;
                jVar.a();
                throw th;
            }
        }
        h9.d.t(obj);
        mc.f fVarW = ((fd.g0) this.f2258d).w();
        int i11 = j1.f29579x1;
        j1 j1Var = (j1) fVarW.b(j1.b.f29580c);
        if (j1Var == null) {
            throw new IllegalStateException("when[State] methods should have a parent job".toString());
        }
        y yVar = new y();
        j jVar2 = new j(this.f2259e, this.f2260f, yVar.f2256e, j1Var);
        try {
            uc.p<fd.g0, mc.d<Object>, Object> pVar = this.f2261g;
            this.f2258d = jVar2;
            this.f2257c = 1;
            obj = y8.c0.V(yVar, pVar, this);
            if (obj == aVar) {
                return aVar;
            }
            jVar = jVar2;
            jVar.a();
            return obj;
        } catch (Throwable th2) {
            th = th2;
            jVar = jVar2;
            jVar.a();
            throw th;
        }
    }
}
