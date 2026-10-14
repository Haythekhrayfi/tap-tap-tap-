package l8;

/* JADX INFO: loaded from: classes2.dex */
public final class q2 implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a<v> f32764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a<i6> f32765b;

    public q2(ic.a<v> aVar, ic.a<i6> aVar2) {
        this.f32764a = aVar;
        this.f32765b = aVar2;
    }

    @Override // ic.a
    public Object get() {
        return new p2(this.f32764a.get(), this.f32765b.get());
    }
}
