package i8;

import p7.h1;

/* JADX INFO: loaded from: classes2.dex */
public final class p0 implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a<p7.h> f31404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a<h1> f31405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ic.a<p7.j> f31406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ic.a<l8.c> f31407d;

    public p0(ic.a<p7.h> aVar, ic.a<h1> aVar2, ic.a<p7.j> aVar3, ic.a<l8.c> aVar4) {
        this.f31404a = aVar;
        this.f31405b = aVar2;
        this.f31406c = aVar3;
        this.f31407d = aVar4;
    }

    @Override // ic.a
    public Object get() {
        return new n0(this.f31404a.get(), this.f31405b.get(), this.f31406c.get(), this.f31407d.get());
    }
}
