package id;

import fd.j1;

/* JADX INFO: loaded from: classes3.dex */
public final class o<T> implements q<T>, jd.l<T>, jd.l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j1 f31594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q<T> f31595d;

    /* JADX WARN: Multi-variable type inference failed */
    public o(q<? extends T> qVar, j1 j1Var) {
        this.f31594c = j1Var;
        this.f31595d = qVar;
    }

    @Override // id.q, id.d
    public Object a(e<? super T> eVar, mc.d<?> dVar) {
        return this.f31595d.a(eVar, dVar);
    }

    @Override // jd.l
    public d<T> b(mc.f fVar, int i10, hd.e eVar) {
        return s.a(this, fVar, i10, eVar);
    }
}
