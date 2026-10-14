package r7;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a<Boolean> f35268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a<l9.h> f35269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ic.a<l9.e> f35270c;

    public g(ic.a<Boolean> aVar, ic.a<l9.h> aVar2, ic.a<l9.e> aVar3) {
        this.f35268a = aVar;
        this.f35269b = aVar2;
        this.f35270c = aVar3;
    }

    @Override // ic.a
    public Object get() {
        return this.f35268a.get().booleanValue() ? new l9.a(this.f35269b.get(), this.f35270c.get()) : new l9.d();
    }
}
