package l8;

/* JADX INFO: loaded from: classes2.dex */
public final class h6 implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a<v> f32426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a<w7.b> f32427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ic.a<p7.j> f32428c;

    public h6(ic.a<v> aVar, ic.a<w7.b> aVar2, ic.a<p7.j> aVar3) {
        this.f32426a = aVar;
        this.f32427b = aVar2;
        this.f32428c = aVar3;
    }

    @Override // ic.a
    public Object get() {
        return new g6(this.f32426a.get(), this.f32427b.get(), this.f32428c.get());
    }
}
