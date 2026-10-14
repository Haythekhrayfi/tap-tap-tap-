package i8;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class k0 implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a<Context> f31378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a<l9.g> f31379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ic.a<g0> f31380c;

    public k0(ic.a<Context> aVar, ic.a<l9.g> aVar2, ic.a<g0> aVar3) {
        this.f31378a = aVar;
        this.f31379b = aVar2;
        this.f31380c = aVar3;
    }

    @Override // ic.a
    public Object get() {
        return new j0(this.f31378a.get(), this.f31379b.get(), this.f31380c.get());
    }
}
