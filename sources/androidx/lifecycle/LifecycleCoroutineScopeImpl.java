package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl extends k implements n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f2134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mc.f f2135d;

    public LifecycleCoroutineScopeImpl(i iVar, mc.f fVar) {
        fd.j0.i(iVar, "lifecycle");
        fd.j0.i(fVar, "coroutineContext");
        this.f2134c = iVar;
        this.f2135d = fVar;
        if (iVar.b() == i.c.DESTROYED) {
            fd.z.h(fVar, null, 1, null);
        }
    }

    @Override // androidx.lifecycle.n
    public void g(p pVar, i.b bVar) {
        fd.j0.i(pVar, "source");
        fd.j0.i(bVar, "event");
        if (this.f2134c.b().compareTo(i.c.DESTROYED) <= 0) {
            this.f2134c.c(this);
            fd.z.h(this.f2135d, null, 1, null);
        }
    }

    @Override // androidx.lifecycle.k
    public i h() {
        return this.f2134c;
    }

    @Override // fd.g0
    public mc.f w() {
        return this.f2135d;
    }
}
