package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Handler;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.j3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1722j3 implements InterfaceC1546c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f16386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f16387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Z f16388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1607ec f16389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceExecutorC1966sn f16390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C f16391f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile P1 f16392g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AbstractC1652g7 f16393h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ea.b f16394i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final C1895q1 f16395j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f16396k;

    public C1722j3(Context context, C1607ec c1607ec, C1941rn c1941rn, Z z10, C c10, C2090xh c2090xh, C1895q1 c1895q1) {
        this.f16396k = false;
        this.f16386a = context;
        this.f16390e = c1941rn;
        this.f16391f = c10;
        this.f16395j = c1895q1;
        Am.a(context);
        B2.b();
        this.f16389d = c1607ec;
        c1607ec.c(context);
        this.f16387b = c1941rn.a();
        this.f16388c = z10;
        z10.a();
        this.f16394i = c2090xh.a(context);
        e();
    }

    public C1722j3(Context context, C1917qn c1917qn) {
        this(context.getApplicationContext(), c1917qn.b(), c1917qn.a());
    }

    private C1722j3(Context context, C1941rn c1941rn, InterfaceExecutorC1966sn interfaceExecutorC1966sn) {
        this(context, new C1607ec(new C1607ec.c(), new C1607ec.e(), new C1607ec.e(), c1941rn, "Client"), c1941rn, new Z(), new C(interfaceExecutorC1966sn), new C2090xh(), new C1895q1());
    }

    private void e() {
        if (!C1720j1.a("com.yandex.metrica.CounterConfiguration")) {
            throw new C1720j1.a("\nClass com.yandex.metrica.CounterConfiguration isn't found.\nPerhaps this is due to obfuscation.\nIf you build your application with ProGuard,\nyou need to keep the Metrica for Apps.\nPlease try to use the following lines of code:\n##########################################\n-keep class com.yandex.metrica.** { *; }\n-dontwarn com.yandex.metrica.**\n##########################################");
        }
        ((C1941rn) this.f16390e).execute(new Em(this.f16386a));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1546c1
    public C a() {
        return this.f16391f;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1546c1
    public synchronized void a(com.yandex.metrica.j jVar, Y0 y10) {
        if (!this.f16396k) {
            Boolean bool = jVar.crashReporting;
            Boolean bool2 = Boolean.TRUE;
            if (bool == null) {
                bool = bool2;
            }
            if (bool.booleanValue() && this.f16392g == null) {
                C2040vh c2040vh = new C2040vh(this.f16394i);
                C1751k7 c1751k7 = new C1751k7(this.f16386a, new S2(y10, "20799a27-fa80-4b36-b2db-0f8141f24180"), new C1648g3(this), (com.yandex.metrica.d) null);
                C1751k7 c1751k8 = new C1751k7(this.f16386a, new S2(y10, "0e5e9c33-f8c3-4568-86c5-2e4f57523f72"), new C1673h3(this), (com.yandex.metrica.d) null);
                if (this.f16393h == null) {
                    this.f16393h = new C1751k7(this.f16386a, new C1919r1(y10, jVar), new C1698i3(this), jVar.f18077l);
                }
                this.f16392g = new P1(Thread.getDefaultUncaughtExceptionHandler(), Arrays.asList(c2040vh, c1751k7, c1751k8, this.f16393h), Y.g().j(), new C3(), new E3());
                Thread.setDefaultUncaughtExceptionHandler(this.f16392g);
            }
            Boolean bool3 = jVar.appOpenTrackingEnabled;
            if (bool3 != null) {
                bool2 = bool3;
            }
            if (bool2.booleanValue()) {
                this.f16391f.a();
            }
            this.f16396k = true;
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1546c1
    public void a(Map<String, Object> map) {
        this.f16395j.a(map);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1546c1
    public InterfaceExecutorC1966sn b() {
        return this.f16390e;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1546c1
    public Handler c() {
        return this.f16387b;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1546c1
    public InterfaceC1781lc d() {
        return this.f16389d;
    }
}
