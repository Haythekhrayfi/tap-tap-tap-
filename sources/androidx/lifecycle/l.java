package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@oc.e(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", l = {}, m = "invokeSuspend")
public final class l extends oc.h implements uc.p<fd.g0, mc.d<? super jc.w>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f2227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LifecycleCoroutineScopeImpl f2228d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, mc.d<? super l> dVar) {
        super(2, dVar);
        this.f2228d = lifecycleCoroutineScopeImpl;
    }

    @Override // oc.a
    public final mc.d<jc.w> create(Object obj, mc.d<?> dVar) {
        l lVar = new l(this.f2228d, dVar);
        lVar.f2227c = obj;
        return lVar;
    }

    @Override // uc.p
    public Object invoke(fd.g0 g0Var, mc.d<? super jc.w> dVar) {
        l lVar = new l(this.f2228d, dVar);
        lVar.f2227c = g0Var;
        jc.w wVar = jc.w.f31842a;
        lVar.invokeSuspend(wVar);
        return wVar;
    }

    @Override // oc.a
    public final Object invokeSuspend(Object obj) {
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        h9.d.t(obj);
        fd.g0 g0Var = (fd.g0) this.f2227c;
        if (this.f2228d.f2134c.b().compareTo(i.c.INITIALIZED) >= 0) {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.f2228d;
            lifecycleCoroutineScopeImpl.f2134c.a(lifecycleCoroutineScopeImpl);
        } else {
            fd.z.h(g0Var.w(), null, 1, null);
        }
        return jc.w.f31842a;
    }
}
