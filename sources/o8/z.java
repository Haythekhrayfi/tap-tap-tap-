package o8;

import p7.l0;

/* JADX INFO: loaded from: classes2.dex */
public final class z implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a<i8.k> f34149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a<l0> f34150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ic.a<x7.a> f34151c;

    public z(ic.a<i8.k> aVar, ic.a<l0> aVar2, ic.a<x7.a> aVar3) {
        this.f34149a = aVar;
        this.f34150b = aVar2;
        this.f34151c = aVar3;
    }

    @Override // ic.a
    public Object get() {
        return new y(this.f34149a.get(), this.f34150b.get(), this.f34151c.get());
    }
}
