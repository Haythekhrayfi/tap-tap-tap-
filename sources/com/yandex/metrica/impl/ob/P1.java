package com.yandex.metrica.impl.ob;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
class P1 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final AtomicBoolean f14685f = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<InterfaceC1702i7> f14686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f14687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final E3 f14688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Hm f14689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C3 f14690e;

    public P1(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, List<InterfaceC1702i7> list, Hm hm2, C3 c10, E3 e10) {
        this.f14686a = list;
        this.f14687b = uncaughtExceptionHandler;
        this.f14689d = hm2;
        this.f14690e = c10;
        this.f14688c = e10;
    }

    public static boolean a() {
        return f14685f.get();
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        try {
            f14685f.set(true);
            C1602e7 c1602e7 = new C1602e7(this.f14690e.a(thread), this.f14688c.a(thread), ((Dm) this.f14689d).b());
            Iterator<InterfaceC1702i7> it = this.f14686a.iterator();
            while (it.hasNext()) {
                it.next().a(th, c1602e7);
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f14687b;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        } catch (Throwable th2) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f14687b;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
            throw th2;
        }
    }
}
