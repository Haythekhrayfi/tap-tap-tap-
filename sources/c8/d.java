package c8;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a<x9.a> f3629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a<j> f3630b;

    public d(ic.a<x9.a> aVar, ic.a<j> aVar2) {
        this.f3629a = aVar;
        this.f3630b = aVar2;
    }

    @Override // ic.a
    public Object get() {
        return new c(this.f3629a.get(), this.f3630b.get());
    }
}
