package l8;

/* JADX INFO: loaded from: classes2.dex */
public final class m3 implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a<v> f32586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a<i8.e0> f32587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ic.a<w7.d> f32588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ic.a<q8.e> f32589d;

    public m3(ic.a<v> aVar, ic.a<i8.e0> aVar2, ic.a<w7.d> aVar3, ic.a<q8.e> aVar4) {
        this.f32586a = aVar;
        this.f32587b = aVar2;
        this.f32588c = aVar3;
        this.f32589d = aVar4;
    }

    @Override // ic.a
    public Object get() {
        return new r2(this.f32586a.get(), this.f32587b.get(), this.f32588c.get(), this.f32589d.get());
    }
}
