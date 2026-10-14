package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.CounterConfiguration;

/* JADX INFO: loaded from: classes.dex */
public class T4 implements InterfaceC1723j4, Y4, InterfaceC1748k4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1549c4 f15065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2123z0 f15066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private U4 f15067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C2127z4 f15068d;

    public static class a {
        public U4 a(Context context, C1549c4 c1549c4, Qi qi, X4.a aVar) {
            return new U4(new X4.b(context, c1549c4.b()), qi, aVar);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C1845o1 f15069a;

        public b() {
            this(P0.i().j());
        }

        public b(C1845o1 c1845o1) {
            this.f15069a = c1845o1;
        }

        public C2123z0<T4> a(T4 t10, Wi wi, Z4 z10, I8 i10) {
            C2123z0<T4> c2123z0 = new C2123z0<>(t10, wi.a(), z10, i10);
            this.f15069a.a(c2123z0);
            return c2123z0;
        }
    }

    public T4(Context context, C1549c4 c1549c4, X3.a aVar, Qi qi, Wi wi, CounterConfiguration.b bVar) {
        this(context, c1549c4, aVar, qi, wi, bVar, new Z4(), new b(), new a(), new C2127z4(context, c1549c4), P0.i().y().a(c1549c4.a()));
    }

    public T4(Context context, C1549c4 c1549c4, X3.a aVar, Qi qi, Wi wi, CounterConfiguration.b bVar, Z4 z10, b bVar2, a aVar2, C2127z4 c2127z4, I8 i10) {
        this.f15065a = c1549c4;
        this.f15068d = c2127z4;
        this.f15066b = bVar2.a(this, wi, z10, i10);
        synchronized (this) {
            this.f15068d.a(qi.P());
            this.f15067c = aVar2.a(context, c1549c4, qi, new X4.a(aVar));
        }
    }

    @Override // com.yandex.metrica.impl.ob.Y4
    public X4 a() {
        return this.f15067c.b();
    }

    @Override // com.yandex.metrica.impl.ob.Li
    public void a(Hi hi, Qi qi) {
    }

    @Override // com.yandex.metrica.impl.ob.Li
    public synchronized void a(Qi qi) {
        this.f15067c.a(qi);
        this.f15068d.a(qi.P());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1798m4
    public void a(X3.a aVar) {
        this.f15067c.a(aVar);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1798m4
    public void a(C1744k0 c1744k0) {
        this.f15066b.a(c1744k0);
    }

    public void b() {
        if (this.f15068d.a(this.f15067c.b().E())) {
            this.f15066b.a(J0.a());
            this.f15068d.a();
        }
    }
}
