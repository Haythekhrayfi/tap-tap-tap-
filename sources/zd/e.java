package zd;

import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class e<T> implements c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f45283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ge.b<T> f45284b;

    /* JADX WARN: Multi-variable type inference failed */
    public e(ge.b<? extends T> bVar) {
        j0.j(bVar, "bean");
        this.f45284b = bVar;
    }

    @Override // zd.c
    public ge.b<T> a() {
        return this.f45284b;
    }

    @Override // zd.c
    public <T> b<T> b(uc.a<ae.a> aVar) {
        boolean z10 = this.f45283a == null;
        if (z10) {
            this.f45283a = (T) c.a.a(this, aVar);
        }
        return new b<>(this.f45283a, z10);
    }

    @Override // zd.c
    public void release() {
    }
}
