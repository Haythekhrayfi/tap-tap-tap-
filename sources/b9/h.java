package b9;

import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class h<T> implements ic.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jc.e f3380a;

    public h(uc.a<? extends T> aVar) {
        j0.i(aVar, "init");
        this.f3380a = jc.f.b(aVar);
    }

    @Override // ic.a
    public T get() {
        return (T) this.f3380a.getValue();
    }
}
