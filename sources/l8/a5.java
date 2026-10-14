package l8;

/* JADX INFO: loaded from: classes2.dex */
public final class a5 implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a<v> f32245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a<p7.h> f32246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ic.a<y7.a> f32247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ic.a<w7.b> f32248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ic.a<q8.e> f32249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ic.a<Boolean> f32250f;

    public a5(ic.a<v> aVar, ic.a<p7.h> aVar2, ic.a<y7.a> aVar3, ic.a<w7.b> aVar4, ic.a<q8.e> aVar5, ic.a<Boolean> aVar6) {
        this.f32245a = aVar;
        this.f32246b = aVar2;
        this.f32247c = aVar3;
        this.f32248d = aVar4;
        this.f32249e = aVar5;
        this.f32250f = aVar6;
    }

    @Override // ic.a
    public Object get() {
        return new p4(this.f32245a.get(), this.f32246b.get(), this.f32247c.get(), this.f32248d.get(), this.f32249e.get(), this.f32250f.get().booleanValue());
    }
}
