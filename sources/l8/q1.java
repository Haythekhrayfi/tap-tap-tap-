package l8;

/* JADX INFO: loaded from: classes2.dex */
public final class q1 implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a<v> f32760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a<p7.n0> f32761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ic.a<p7.l0> f32762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ic.a<x7.a> f32763d;

    public q1(ic.a<v> aVar, ic.a<p7.n0> aVar2, ic.a<p7.l0> aVar3, ic.a<x7.a> aVar4) {
        this.f32760a = aVar;
        this.f32761b = aVar2;
        this.f32762c = aVar3;
        this.f32763d = aVar4;
    }

    @Override // ic.a
    public Object get() {
        return new p1(this.f32760a.get(), this.f32761b.get(), this.f32762c.get(), this.f32763d.get());
    }
}
