package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import com.yandex.metrica.AppMetricaDeviceIDListener;
import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.YandexMetricaConfig;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.l3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1772l3 implements Y0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile C1772l3 f16795f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile boolean f16796g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f16797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1747k3 f16798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FutureTask<InterfaceC1571d1> f16799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC1546c1 f16800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C1917qn f16801e;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.l3$a */
    public class a implements Callable<InterfaceC1571d1> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        public InterfaceC1571d1 call() throws Exception {
            return C1772l3.a(C1772l3.this);
        }
    }

    public C1772l3(Context context, C1747k3 c1747k3, InterfaceC1546c1 interfaceC1546c1, C1917qn c1917qn) {
        this.f16797a = context;
        this.f16798b = c1747k3;
        this.f16800d = interfaceC1546c1;
        this.f16801e = c1917qn;
        FutureTask<InterfaceC1571d1> futureTask = new FutureTask<>(new a());
        this.f16799c = futureTask;
        c1917qn.b().execute(futureTask);
    }

    private C1772l3(Context context, C1747k3 c1747k3, C1917qn c1917qn) {
        this(context, c1747k3, c1747k3.a(context, c1917qn), c1917qn);
    }

    public static InterfaceC1571d1 a(C1772l3 c1772l3) {
        return c1772l3.f16798b.a(c1772l3.f16797a, c1772l3.f16800d);
    }

    public static C1772l3 a(Context context) {
        if (f16795f == null) {
            synchronized (C1772l3.class) {
                if (f16795f == null) {
                    f16795f = new C1772l3(context.getApplicationContext(), new C1747k3(), Y.g().d());
                    C1772l3 c1772l3 = f16795f;
                    c1772l3.f16801e.b().execute(new RunnableC1797m3(c1772l3));
                }
            }
        }
        return f16795f;
    }

    public static void a(Location location) {
        f().a(location);
    }

    public static void a(String str) {
        f().setUserProfileID(str);
    }

    public static void a(String str, String str2) {
        f().c(str, str2);
    }

    public static void a(boolean z10) {
        f().b(z10);
    }

    public static void b(boolean z10) {
        f().a(z10);
    }

    public static void c(boolean z10) {
        f().setStatisticsSending(z10);
    }

    private static InterfaceC2049w1 f() {
        return i() ? f16795f.g() : Y.g().f();
    }

    private InterfaceC1571d1 g() {
        try {
            return this.f16799c.get();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public static synchronized boolean h() {
        return f16796g;
    }

    public static synchronized boolean i() {
        return (f16795f == null || !f16795f.f16799c.isDone() || f16795f.g().d() == null) ? false : true;
    }

    public static synchronized void j() {
        f16796g = true;
    }

    public static C1772l3 k() {
        return f16795f;
    }

    public W0 a(com.yandex.metrica.f fVar) {
        return g().a(fVar);
    }

    public String a() {
        return g().a();
    }

    public void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        g().a(deferredDeeplinkListener);
    }

    public void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        g().a(deferredDeeplinkParametersListener);
    }

    public void a(IIdentifierCallback iIdentifierCallback, List<String> list) {
        g().a(iIdentifierCallback, list);
    }

    public void a(Map<String, Object> map) {
        this.f16800d.a(map);
    }

    @Override // com.yandex.metrica.impl.ob.Y0
    public X0 b() {
        return g().b();
    }

    public void b(AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
        g().a(appMetricaDeviceIDListener);
    }

    public void b(YandexMetricaConfig yandexMetricaConfig, com.yandex.metrica.j jVar) {
        g().a(yandexMetricaConfig, jVar);
    }

    public void b(com.yandex.metrica.j jVar) {
        this.f16800d.a(jVar, this);
    }

    public String c() {
        return g().c();
    }

    public void c(com.yandex.metrica.f fVar) {
        g().c(fVar);
    }

    public C1969t1 d() {
        return g().d();
    }

    public InterfaceC1781lc e() {
        return this.f16800d.d();
    }
}
