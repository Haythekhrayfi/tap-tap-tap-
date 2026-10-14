package t8;

import i8.k;
import i8.u;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a<k> f35712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a<u> f35713b;

    public d(ic.a<k> aVar, ic.a<u> aVar2) {
        this.f35712a = aVar;
        this.f35713b = aVar2;
    }

    @Override // ic.a
    public Object get() {
        return new c(this.f35712a.get(), this.f35713b.get());
    }
}
