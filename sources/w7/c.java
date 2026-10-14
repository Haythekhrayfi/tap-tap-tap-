package w7;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a<q8.e> f37140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a<u7.f> f37141b;

    public c(ic.a<q8.e> aVar, ic.a<u7.f> aVar2) {
        this.f37140a = aVar;
        this.f37141b = aVar2;
    }

    @Override // ic.a
    public Object get() {
        return new b(this.f37140a.get(), this.f37141b.get());
    }
}
