package com.yandex.metrica.impl.ob;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class R0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorC1966sn f14830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T0 f14831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f14832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Runnable f14833d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Runnable f14834e = new b();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            R0.this.f14831b.a();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((P2) R0.this.f14832c).b()) {
                R0.this.f14833d.run();
            }
        }
    }

    public static class c {
        public R0 a(InterfaceExecutorC1966sn interfaceExecutorC1966sn, T0 t10, d dVar) {
            return new R0(interfaceExecutorC1966sn, t10, dVar);
        }
    }

    public interface d {
    }

    public R0(InterfaceExecutorC1966sn interfaceExecutorC1966sn, T0 t10, d dVar) {
        this.f14830a = interfaceExecutorC1966sn;
        this.f14831b = t10;
        this.f14832c = dVar;
    }

    public void a() {
        ((C1941rn) this.f14830a).a(this.f14833d);
        ((C1941rn) this.f14830a).a(this.f14833d, 90L, TimeUnit.SECONDS);
    }

    public void b() {
        ((C1941rn) this.f14830a).execute(this.f14834e);
    }

    public void c() {
        ((C1941rn) this.f14830a).a(this.f14833d);
        ((C1941rn) this.f14830a).a(this.f14834e);
    }
}
