package e8;

import i8.q0;
import p7.c1;
import p7.y0;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a<i8.h> f29102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a<c1> f29103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ic.a<q0> f29104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ic.a<y0> f29105d;

    public i(ic.a<i8.h> aVar, ic.a<c1> aVar2, ic.a<q0> aVar3, ic.a<y0> aVar4) {
        this.f29102a = aVar;
        this.f29103b = aVar2;
        this.f29104c = aVar3;
        this.f29105d = aVar4;
    }

    @Override // ic.a
    public Object get() {
        return new d(this.f29102a, this.f29103b.get(), this.f29104c.get(), this.f29105d.get());
    }
}
