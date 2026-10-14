package r7;

import i8.x;
import p7.l0;
import p7.y0;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a<x> f35260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a<l0> f35261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ic.a<x7.a> f35262c;

    public c(ic.a<x> aVar, ic.a<l0> aVar2, ic.a<x7.a> aVar3) {
        this.f35260a = aVar;
        this.f35261b = aVar2;
        this.f35262c = aVar3;
    }

    @Override // ic.a
    public Object get() {
        return new y0(this.f35260a.get(), this.f35261b.get(), this.f35262c.get());
    }
}
