package l8;

/* JADX INFO: loaded from: classes2.dex */
public final class d2 implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a<v> f32322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a<s7.j> f32323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ic.a<s7.g> f32324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ic.a<i8.u> f32325d;

    public d2(ic.a<v> aVar, ic.a<s7.j> aVar2, ic.a<s7.g> aVar3, ic.a<i8.u> aVar4) {
        this.f32322a = aVar;
        this.f32323b = aVar2;
        this.f32324c = aVar3;
        this.f32325d = aVar4;
    }

    @Override // ic.a
    public Object get() {
        return new a2(this.f32322a.get(), this.f32323b.get(), this.f32324c.get(), this.f32325d);
    }
}
