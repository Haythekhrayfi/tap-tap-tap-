package ib;

/* JADX INFO: loaded from: classes3.dex */
public final class a<T> implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ic.a<T> f31543a;

    @Override // ic.a
    public T get() {
        ic.a<T> aVar = this.f31543a;
        if (aVar != null) {
            return aVar.get();
        }
        throw new IllegalStateException();
    }
}
