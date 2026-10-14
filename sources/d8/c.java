package d8;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a<p7.j> f28855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a<q8.e> f28856b;

    public c(ic.a<p7.j> aVar, ic.a<q8.e> aVar2) {
        this.f28855a = aVar;
        this.f28856b = aVar2;
    }

    @Override // ic.a
    public Object get() {
        return new b(this.f28855a.get(), this.f28856b.get());
    }
}
