package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
class CompositeGeneratedAdaptersObserver implements n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g[] f2128c;

    public CompositeGeneratedAdaptersObserver(g[] gVarArr) {
        this.f2128c = gVarArr;
    }

    @Override // androidx.lifecycle.n
    public void g(p pVar, i.b bVar) {
        u uVar = new u();
        for (g gVar : this.f2128c) {
            gVar.a(pVar, bVar, false, uVar);
        }
        for (g gVar2 : this.f2128c) {
            gVar2.a(pVar, bVar, true, uVar);
        }
    }
}
