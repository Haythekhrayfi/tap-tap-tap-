package i8;

/* JADX INFO: loaded from: classes2.dex */
public final class s0 implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a<z0> f31434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a<n0> f31435b;

    public s0(ic.a<z0> aVar, ic.a<n0> aVar2) {
        this.f31434a = aVar;
        this.f31435b = aVar2;
    }

    @Override // ic.a
    public Object get() {
        return new q0(this.f31434a.get(), this.f31435b.get());
    }
}
