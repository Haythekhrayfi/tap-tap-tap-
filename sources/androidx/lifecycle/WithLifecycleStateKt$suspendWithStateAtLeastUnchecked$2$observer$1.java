package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 implements n {
    @Override // androidx.lifecycle.n
    public void g(p pVar, i.b bVar) {
        fd.j0.i(pVar, "source");
        fd.j0.i(bVar, "event");
        if (bVar == i.b.upTo(null) || bVar == i.b.ON_DESTROY) {
            throw null;
        }
    }
}
