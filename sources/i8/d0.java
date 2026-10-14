package i8;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a<Context> f31326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a<l0> f31327b;

    public d0(ic.a<Context> aVar, ic.a<l0> aVar2) {
        this.f31326a = aVar;
        this.f31327b = aVar2;
    }

    @Override // ic.a
    public Object get() {
        return new c0(this.f31326a.get(), this.f31327b.get());
    }
}
