package w7;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a<q8.e> f37142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a<u7.f> f37143b;

    public e(ic.a<q8.e> aVar, ic.a<u7.f> aVar2) {
        this.f37142a = aVar;
        this.f37143b = aVar2;
    }

    @Override // ic.a
    public Object get() {
        return new d(this.f37142a.get(), this.f37143b.get());
    }
}
