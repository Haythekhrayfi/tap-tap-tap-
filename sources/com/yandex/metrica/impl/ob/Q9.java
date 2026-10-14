package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.AbstractC1594e;

/* JADX INFO: loaded from: classes.dex */
public class Q9<T, P extends AbstractC1594e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f14740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC2106y8 f14741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final P9<P> f14742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC1605ea<T, P> f14743d;

    public Q9(String str, InterfaceC2106y8 interfaceC2106y8, P9<P> p10, InterfaceC1605ea<T, P> interfaceC1605ea) {
        this.f14740a = str;
        this.f14741b = interfaceC2106y8;
        this.f14742c = p10;
        this.f14743d = interfaceC1605ea;
    }

    public void a() {
        this.f14741b.b(this.f14740a);
    }

    public void a(T t10) {
        this.f14741b.a(this.f14740a, this.f14742c.a(this.f14743d.b(t10)));
    }

    public T b() {
        try {
            byte[] bArrA = this.f14741b.a(this.f14740a);
            return U2.a(bArrA) ? (T) this.f14743d.a(this.f14742c.a()) : (T) this.f14743d.a(this.f14742c.a(bArrA));
        } catch (Throwable unused) {
            return (T) this.f14743d.a(this.f14742c.a());
        }
    }
}
