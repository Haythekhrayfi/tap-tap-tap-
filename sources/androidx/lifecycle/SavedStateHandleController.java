package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
final class SavedStateHandleController implements n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2158d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e0 f2159e;

    public SavedStateHandleController(String str, e0 e0Var) {
        this.f2157c = str;
        this.f2159e = e0Var;
    }

    @Override // androidx.lifecycle.n
    public void g(p pVar, i.b bVar) {
        if (bVar == i.b.ON_DESTROY) {
            this.f2158d = false;
            pVar.getLifecycle().c(this);
        }
    }

    public void h(m1.b bVar, i iVar) {
        if (this.f2158d) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f2158d = true;
        iVar.a(this);
        bVar.c(this.f2157c, this.f2159e.f2193e);
    }
}
