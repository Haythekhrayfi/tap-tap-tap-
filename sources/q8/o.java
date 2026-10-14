package q8;

import i8.x0;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a<e> f34844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a<Boolean> f34845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ic.a<x0> f34846c;

    public o(ic.a<e> aVar, ic.a<Boolean> aVar2, ic.a<x0> aVar3) {
        this.f34844a = aVar;
        this.f34845b = aVar2;
        this.f34846c = aVar3;
    }

    @Override // ic.a
    public Object get() {
        return new n(this.f34844a.get(), this.f34845b.get().booleanValue(), this.f34846c.get());
    }
}
