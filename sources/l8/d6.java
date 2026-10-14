package l8;

/* JADX INFO: loaded from: classes2.dex */
public final class d6 implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a<v> f32332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a<i8.e0> f32333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ic.a<z7.d> f32334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ic.a<Boolean> f32335d;

    public d6(ic.a<v> aVar, ic.a<i8.e0> aVar2, ic.a<z7.d> aVar3, ic.a<Boolean> aVar4) {
        this.f32332a = aVar;
        this.f32333b = aVar2;
        this.f32334c = aVar3;
        this.f32335d = aVar4;
    }

    @Override // ic.a
    public Object get() {
        return new m5(this.f32332a.get(), this.f32333b.get(), this.f32334c.get(), this.f32335d.get().booleanValue());
    }
}
