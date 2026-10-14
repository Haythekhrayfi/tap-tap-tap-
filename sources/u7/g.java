package u7;

import p7.h;
import p7.j;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a<w7.a> f36055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a<j> f36056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ic.a<q8.e> f36057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ic.a<h> f36058d;

    public g(ic.a<w7.a> aVar, ic.a<j> aVar2, ic.a<q8.e> aVar3, ic.a<h> aVar4) {
        this.f36055a = aVar;
        this.f36056b = aVar2;
        this.f36057c = aVar3;
        this.f36058d = aVar4;
    }

    @Override // ic.a
    public Object get() {
        return new f(this.f36055a.get(), this.f36056b.get(), this.f36057c.get(), this.f36058d.get());
    }
}
