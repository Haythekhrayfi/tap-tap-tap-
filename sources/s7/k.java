package s7;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a<g> f35481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a<i8.h> f35482b;

    public k(ic.a<g> aVar, ic.a<i8.h> aVar2) {
        this.f35481a = aVar;
        this.f35482b = aVar2;
    }

    @Override // ic.a
    public Object get() {
        return new j(this.f35481a.get(), this.f35482b);
    }
}
