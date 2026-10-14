package l8;

/* JADX INFO: loaded from: classes2.dex */
public final class u3 implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a<v> f32876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a<i8.j0> f32877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ic.a<i8.u> f32878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ic.a<s7.g> f32879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ic.a<j> f32880e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ic.a<i6> f32881f;

    public u3(ic.a<v> aVar, ic.a<i8.j0> aVar2, ic.a<i8.u> aVar3, ic.a<s7.g> aVar4, ic.a<j> aVar5, ic.a<i6> aVar6) {
        this.f32876a = aVar;
        this.f32877b = aVar2;
        this.f32878c = aVar3;
        this.f32879d = aVar4;
        this.f32880e = aVar5;
        this.f32881f = aVar6;
    }

    @Override // ic.a
    public Object get() {
        return new o3(this.f32876a.get(), this.f32877b.get(), this.f32878c, this.f32879d.get(), this.f32880e.get(), this.f32881f.get());
    }
}
