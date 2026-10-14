package l8;

/* JADX INFO: loaded from: classes2.dex */
public final class n1 implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a<v> f32630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a<i8.j0> f32631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ic.a<s7.j> f32632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ic.a<s7.g> f32633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ic.a<i8.u> f32634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ic.a<q8.e> f32635f;

    public n1(ic.a<v> aVar, ic.a<i8.j0> aVar2, ic.a<s7.j> aVar3, ic.a<s7.g> aVar4, ic.a<i8.u> aVar5, ic.a<q8.e> aVar6) {
        this.f32630a = aVar;
        this.f32631b = aVar2;
        this.f32632c = aVar3;
        this.f32633d = aVar4;
        this.f32634e = aVar5;
        this.f32635f = aVar6;
    }

    @Override // ic.a
    public Object get() {
        return new j1(this.f32630a.get(), this.f32631b, this.f32632c.get(), this.f32633d.get(), this.f32634e, this.f32635f.get());
    }
}
