package l8;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a<p7.j> f32656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a<p7.h> f32657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ic.a<c> f32658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ic.a<Boolean> f32659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ic.a<Boolean> f32660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ic.a<Boolean> f32661f;

    public o(ic.a<p7.j> aVar, ic.a<p7.h> aVar2, ic.a<c> aVar3, ic.a<Boolean> aVar4, ic.a<Boolean> aVar5, ic.a<Boolean> aVar6) {
        this.f32656a = aVar;
        this.f32657b = aVar2;
        this.f32658c = aVar3;
        this.f32659d = aVar4;
        this.f32660e = aVar5;
        this.f32661f = aVar6;
    }

    @Override // ic.a
    public Object get() {
        return new j(this.f32656a.get(), this.f32657b.get(), this.f32658c.get(), this.f32659d.get().booleanValue(), this.f32660e.get().booleanValue(), this.f32661f.get().booleanValue());
    }
}
