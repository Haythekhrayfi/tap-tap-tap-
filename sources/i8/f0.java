package i8;

/* JADX INFO: loaded from: classes2.dex */
public final class f0 implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a<y7.a> f31334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a<y7.a> f31335b;

    public f0(ic.a<y7.a> aVar, ic.a<y7.a> aVar2) {
        this.f31334a = aVar;
        this.f31335b = aVar2;
    }

    @Override // ic.a
    public Object get() {
        return new e0(this.f31334a.get(), this.f31335b.get());
    }
}
