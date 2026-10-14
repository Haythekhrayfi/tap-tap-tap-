package l8;

/* JADX INFO: loaded from: classes2.dex */
public final class i4 implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a<v> f32453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a<i8.e0> f32454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ic.a<w7.d> f32455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ic.a<q8.e> f32456d;

    public i4(ic.a<v> aVar, ic.a<i8.e0> aVar2, ic.a<w7.d> aVar3, ic.a<q8.e> aVar4) {
        this.f32453a = aVar;
        this.f32454b = aVar2;
        this.f32455c = aVar3;
        this.f32456d = aVar4;
    }

    @Override // ic.a
    public Object get() {
        return new h4(this.f32453a.get(), this.f32454b.get(), this.f32455c.get(), this.f32456d.get());
    }
}
