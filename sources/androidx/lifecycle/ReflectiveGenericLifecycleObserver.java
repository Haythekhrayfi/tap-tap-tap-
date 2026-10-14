package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
class ReflectiveGenericLifecycleObserver implements n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b.a f2155d;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f2154c = obj;
        this.f2155d = b.f2172c.b(obj.getClass());
    }

    @Override // androidx.lifecycle.n
    public void g(p pVar, i.b bVar) {
        b.a aVar = this.f2155d;
        Object obj = this.f2154c;
        b.a.a(aVar.f2175a.get(bVar), pVar, bVar, obj);
        b.a.a(aVar.f2175a.get(i.b.ON_ANY), pVar, bVar, obj);
    }
}
