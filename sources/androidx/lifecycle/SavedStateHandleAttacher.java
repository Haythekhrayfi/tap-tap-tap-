package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleAttacher implements n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0 f2156c;

    public SavedStateHandleAttacher(g0 g0Var) {
        fd.j0.i(g0Var, "provider");
        this.f2156c = g0Var;
    }

    @Override // androidx.lifecycle.n
    public void g(p pVar, i.b bVar) {
        fd.j0.i(pVar, "source");
        fd.j0.i(bVar, "event");
        if (bVar == i.b.ON_CREATE) {
            pVar.getLifecycle().c(this);
            this.f2156c.b();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + bVar).toString());
        }
    }
}
