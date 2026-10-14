package zd;

import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class a<T> implements c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ge.b<T> f45277a;

    /* JADX WARN: Multi-variable type inference failed */
    public a(ge.b<? extends T> bVar) {
        j0.j(bVar, "bean");
        this.f45277a = bVar;
    }

    @Override // zd.c
    public ge.b<T> a() {
        return this.f45277a;
    }

    @Override // zd.c
    public <T> b<T> b(uc.a<ae.a> aVar) {
        return new b<>(c.a.a(this, aVar), true);
    }

    @Override // zd.c
    public void release() {
    }
}
