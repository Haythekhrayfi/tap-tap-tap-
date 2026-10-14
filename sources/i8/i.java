package i8;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a<j0> f31344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a<u> f31345b;

    public i(ic.a<j0> aVar, ic.a<u> aVar2) {
        this.f31344a = aVar;
        this.f31345b = aVar2;
    }

    @Override // ic.a
    public Object get() {
        return new h(this.f31344a.get(), this.f31345b.get());
    }
}
