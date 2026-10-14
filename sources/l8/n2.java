package l8;

/* JADX INFO: loaded from: classes2.dex */
public final class n2 implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a<v> f32636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a<z7.d> f32637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ic.a<i8.z> f32638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ic.a<q8.e> f32639d;

    public n2(ic.a<v> aVar, ic.a<z7.d> aVar2, ic.a<i8.z> aVar3, ic.a<q8.e> aVar4) {
        this.f32636a = aVar;
        this.f32637b = aVar2;
        this.f32638c = aVar3;
        this.f32639d = aVar4;
    }

    @Override // ic.a
    public Object get() {
        return new g2(this.f32636a.get(), this.f32637b.get(), this.f32638c.get(), this.f32639d.get());
    }
}
