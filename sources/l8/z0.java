package l8;

/* JADX INFO: loaded from: classes2.dex */
public final class z0 implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a<p> f32995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a<e8.d> f32996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ic.a<x7.a> f32997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ic.a<r1> f32998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ic.a<i8.r> f32999e;

    public z0(ic.a<p> aVar, ic.a<e8.d> aVar2, ic.a<x7.a> aVar3, ic.a<r1> aVar4, ic.a<i8.r> aVar5) {
        this.f32995a = aVar;
        this.f32996b = aVar2;
        this.f32997c = aVar3;
        this.f32998d = aVar4;
        this.f32999e = aVar5;
    }

    @Override // ic.a
    public Object get() {
        return new v(this.f32995a.get(), this.f32996b.get(), this.f32997c.get(), this.f32998d.get(), this.f32999e.get());
    }
}
