package t8;

import i8.k;
import i8.u;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a<k> f35708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a<u> f35709b;

    public b(ic.a<k> aVar, ic.a<u> aVar2) {
        this.f35708a = aVar;
        this.f35709b = aVar2;
    }

    @Override // ic.a
    public Object get() {
        return new a(this.f35708a.get(), this.f35709b.get());
    }
}
