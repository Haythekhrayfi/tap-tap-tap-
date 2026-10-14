package vb;

/* JADX INFO: loaded from: classes3.dex */
public final class h<T> extends a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pb.b<? super nb.b> f36882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final pb.a f36883e;

    public h(lb.i<T> iVar, pb.b<? super nb.b> bVar, pb.a aVar) {
        super(iVar);
        this.f36882d = bVar;
        this.f36883e = aVar;
    }

    @Override // lb.i
    public void t(lb.k<? super T> kVar) {
        this.f36794c.c(new tb.f(kVar, this.f36882d, this.f36883e));
    }
}
