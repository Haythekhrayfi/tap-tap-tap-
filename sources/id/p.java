package id;

import fd.j1;

/* JADX INFO: loaded from: classes3.dex */
public final class p<T> implements u<T>, jd.l<T>, jd.l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j1 f31596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u<T> f31597d;

    /* JADX WARN: Multi-variable type inference failed */
    public p(u<? extends T> uVar, j1 j1Var) {
        this.f31596c = j1Var;
        this.f31597d = uVar;
    }

    @Override // id.q, id.d
    public Object a(e<? super T> eVar, mc.d<?> dVar) {
        return this.f31597d.a(eVar, dVar);
    }

    @Override // jd.l
    public d<T> b(mc.f fVar, int i10, hd.e eVar) {
        return w.b(this, fVar, i10, eVar);
    }

    @Override // id.u
    public T getValue() {
        return this.f31597d.getValue();
    }
}
