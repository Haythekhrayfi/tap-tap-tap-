package vb;

/* JADX INFO: loaded from: classes3.dex */
public final class o<T> extends lb.i<T> implements sb.g<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T f36928c;

    public o(T t10) {
        this.f36928c = t10;
    }

    @Override // sb.g, java.util.concurrent.Callable
    public T call() {
        return this.f36928c;
    }

    @Override // lb.i
    public void t(lb.k<? super T> kVar) {
        t.a aVar = new t.a(kVar, this.f36928c);
        kVar.b(aVar);
        aVar.run();
    }
}
