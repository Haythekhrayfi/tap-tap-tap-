package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.PreloadInfo;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.s1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1944s1 extends J implements U0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final com.yandex.metrica.a f17258p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Cg f17259q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final com.yandex.metrica.j f17260r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Ii f17261s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private C1669h f17262t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Zl f17263u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final C2122z f17264v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final AtomicBoolean f17265w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final E3 f17266x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final R7 f17267y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final uo<String> f17257z = new ro(new po("Referral url"));
    private static final Long A = Long.valueOf(TimeUnit.SECONDS.toMillis(5));

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.s1$a */
    public class a implements C1669h.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceExecutorC1966sn f17268a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C1820n1 f17269b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ S2 f17270c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ S2 f17271d;

        /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.s1$a$a, reason: collision with other inner class name */
        public class RunnableC0186a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C1602e7 f17273a;

            public RunnableC0186a(C1602e7 c1602e7) {
                this.f17273a = c1602e7;
            }

            @Override // java.lang.Runnable
            public void run() {
                C1944s1.this.a(this.f17273a);
                if (a.this.f17269b.a(this.f17273a.f16025a.f16883f)) {
                    a.this.f17270c.a().a(this.f17273a);
                }
                if (a.this.f17269b.b(this.f17273a.f16025a.f16883f)) {
                    a.this.f17271d.a().a(this.f17273a);
                }
            }
        }

        public a(InterfaceExecutorC1966sn interfaceExecutorC1966sn, C1820n1 c1820n1, S2 s10, S2 s11) {
            this.f17268a = interfaceExecutorC1966sn;
            this.f17269b = c1820n1;
            this.f17270c = s10;
            this.f17271d = s11;
        }

        @Override // com.yandex.metrica.impl.ob.C1669h.b
        public void a() {
            C1602e7 c1602e7A = C1944s1.this.f17266x.a();
            ((C1941rn) this.f17268a).execute(new RunnableC0186a(c1602e7A));
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.s1$b */
    public class b implements com.yandex.metrica.a.InterfaceC0171a {
        public b() {
        }

        @Override // com.yandex.metrica.a.InterfaceC0171a
        public void a() {
            C1944s1 c1944s1 = C1944s1.this;
            c1944s1.f14252i.a(c1944s1.f14245b.a());
        }

        @Override // com.yandex.metrica.a.InterfaceC0171a
        public void b() {
            C1944s1 c1944s1 = C1944s1.this;
            c1944s1.f14252i.b(c1944s1.f14245b.a());
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.s1$c */
    public static class c {
        public Zl a(Context context, InterfaceExecutorC1966sn interfaceExecutorC1966sn, F9 f10, C1944s1 c1944s1, Ii ii) {
            return new Zl(context, f10, c1944s1, interfaceExecutorC1966sn, ii.d());
        }
    }

    public C1944s1(Context context, U3 u10, com.yandex.metrica.j jVar, C1821n2 c1821n2, R7 r10, Ii ii, S2 s10, S2 s11, F9 f10, Cg cg, Y y10, K0 k10) {
        C1746k2 c1746k2 = new C1746k2(u10, new CounterConfiguration(jVar, CounterConfiguration.b.MAIN), jVar.userProfileID);
        Integer num = jVar.sessionTimeout;
        this(context, jVar, c1821n2, r10, c1746k2, new com.yandex.metrica.a(num == null ? TimeUnit.SECONDS.toMillis(10L) : num.intValue()), cg, ii, new C1820n1(), y10.j(), s10, s11, f10, y10.c(), k10, new c(), new C2122z(), new C2090xh(), new C2065wh(jVar.appVersion, jVar.f18066a), new C1502a7(k10), new F7(), new A7(), new C2000u7(), new C1950s7());
    }

    public C1944s1(Context context, com.yandex.metrica.j jVar, C1821n2 c1821n2, R7 r10, C1746k2 c1746k2, com.yandex.metrica.a aVar, Cg cg, Ii ii, C1820n1 c1820n1, Hm hm2, S2 s10, S2 s11, F9 f10, InterfaceExecutorC1966sn interfaceExecutorC1966sn, K0 k10, c cVar, C2122z c2122z, C2090xh c2090xh, C2065wh c2065wh, C1502a7 c1502a7, F7 f11, A7 a10, C2000u7 c2000u7, C1950s7 c1950s7) {
        super(context, c1821n2, c1746k2, k10, hm2, c2090xh.a(c1821n2.b(), jVar.apiKey, true), c2065wh, f11, a10, c2000u7, c1950s7, c1502a7);
        this.f17265w = new AtomicBoolean(false);
        this.f17266x = new E3();
        this.f14245b.a(a(jVar));
        this.f17258p = aVar;
        this.f17259q = cg;
        this.f17267y = r10;
        this.f17260r = jVar;
        this.f17264v = c2122z;
        Zl zlA = cVar.a(context, interfaceExecutorC1966sn, f10, this, ii);
        this.f17263u = zlA;
        this.f17261s = ii;
        ii.a(zlA);
        a(jVar.nativeCrashReporting, this.f14245b);
        ii.b();
        cg.a();
        this.f17262t = a(interfaceExecutorC1966sn, c1820n1, s10, s11);
        if (C1694i.a(jVar.f18076k)) {
            g();
        }
        h();
    }

    private Pe a(com.yandex.metrica.j jVar) {
        PreloadInfo preloadInfo = jVar.preloadInfo;
        Im im = this.f14246c;
        Boolean bool = jVar.f18074i;
        Boolean bool2 = Boolean.FALSE;
        if (bool == null) {
            bool = bool2;
        }
        return new Pe(preloadInfo, im, bool.booleanValue());
    }

    private C1669h a(InterfaceExecutorC1966sn interfaceExecutorC1966sn, C1820n1 c1820n1, S2 s10, S2 s11) {
        return new C1669h(new a(interfaceExecutorC1966sn, c1820n1, s10, s11));
    }

    private void a(Boolean bool, C1746k2 c1746k2) {
        Boolean bool2 = Boolean.TRUE;
        if (bool == null) {
            bool = bool2;
        }
        boolean zBooleanValue = bool.booleanValue();
        this.f17267y.a(zBooleanValue, c1746k2.b().c(), c1746k2.f16558c.a());
        if (this.f14246c.c()) {
            this.f14246c.a("Set report native crashes enabled: %b", Boolean.valueOf(zBooleanValue));
        }
    }

    private void h() {
        this.f14252i.a(this.f14245b.a());
        com.yandex.metrica.a aVar = this.f17258p;
        b bVar = new b();
        long jLongValue = A.longValue();
        synchronized (aVar) {
            aVar.f13502b.add(new com.yandex.metrica.a.b(aVar, bVar, aVar.f13501a, jLongValue));
        }
    }

    @Override // com.yandex.metrica.impl.ob.U0
    public void a(Activity activity) {
        if (this.f17264v.a(activity, C2122z.a.RESUMED)) {
            e(activity != null ? activity.getClass().getSimpleName() : null);
            com.yandex.metrica.a aVar = this.f17258p;
            synchronized (aVar) {
                for (com.yandex.metrica.a.b bVar : aVar.f13502b) {
                    if (bVar.f13506d) {
                        bVar.f13506d = false;
                        ((C1941rn) bVar.f13503a).a(bVar.f13507e);
                        bVar.f13504b.b();
                    }
                }
            }
            if (activity != null) {
                this.f17263u.b(activity);
            }
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2049w1
    public void a(Location location) {
        this.f14245b.b().d(location);
        if (this.f14246c.c()) {
            this.f14246c.a("Set location: %s", location);
        }
    }

    @Override // com.yandex.metrica.impl.ob.U0
    public void a(Ol ol, boolean z10) {
        this.f17263u.a(ol, z10);
    }

    @Override // com.yandex.metrica.impl.ob.U0
    public void a(X2 x10) {
        x10.a(this.f14246c);
    }

    @Override // com.yandex.metrica.impl.ob.U0
    public void a(C2097y.c cVar) {
        if (cVar == C2097y.c.WATCHING) {
            if (this.f14246c.c()) {
                this.f14246c.b("Enable activity auto tracking");
            }
        } else if (this.f14246c.c()) {
            Im im = this.f14246c;
            StringBuilder sbA = defpackage.a.a("Could not enable activity auto tracking. ");
            sbA.append(cVar.f17876a);
            im.c(sbA.toString());
        }
    }

    @Override // com.yandex.metrica.impl.ob.U0
    public void a(String str) {
        ((ro) f17257z).a(str);
        this.f14252i.a(J0.a("referral", str, false, this.f14246c), this.f14245b);
        if (this.f14246c.c()) {
            this.f14246c.b("Referral URL received: " + f(str));
        }
    }

    @Override // com.yandex.metrica.impl.ob.U0
    public void a(String str, boolean z10) {
        if (this.f14246c.c()) {
            this.f14246c.b("App opened via deeplink: " + f(str));
        }
        this.f14252i.a(J0.a("open", str, z10, this.f14246c), this.f14245b);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1741jm
    public void a(JSONObject jSONObject) {
        C1821n2 c1821n2 = this.f14252i;
        Im im = this.f14246c;
        List<Integer> list = J0.f14266i;
        c1821n2.a(new S(jSONObject.toString(), "view_tree", EnumC1745k1.EVENT_TYPE_RAW_VIEW_TREE.b(), 0, im), this.f14245b);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2049w1
    public void a(boolean z10) {
    }

    @Override // com.yandex.metrica.impl.ob.U0
    public void b(Activity activity) {
        if (this.f17264v.a(activity, C2122z.a.PAUSED)) {
            d(activity != null ? activity.getClass().getSimpleName() : null);
            com.yandex.metrica.a aVar = this.f17258p;
            synchronized (aVar) {
                for (com.yandex.metrica.a.b bVar : aVar.f13502b) {
                    if (!bVar.f13506d) {
                        bVar.f13506d = true;
                        ((C1941rn) bVar.f13503a).a(bVar.f13507e, bVar.f13505c);
                    }
                }
            }
            if (activity != null) {
                this.f17263u.a(activity);
            }
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1741jm
    public void b(JSONObject jSONObject) {
        C1821n2 c1821n2 = this.f14252i;
        Im im = this.f14246c;
        List<Integer> list = J0.f14266i;
        c1821n2.a(new S(jSONObject.toString(), "view_tree", EnumC1745k1.EVENT_TYPE_VIEW_TREE.b(), 0, im), this.f14245b);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2049w1
    public void b(boolean z10) {
        this.f14245b.b().i(z10);
    }

    @Override // com.yandex.metrica.impl.ob.J, com.yandex.metrica.impl.ob.InterfaceC2049w1
    public void c(String str, String str2) {
        super.c(str, str2);
        this.f17267y.a(this.f14245b.f16558c.a());
    }

    public final void g() {
        if (this.f17265w.compareAndSet(false, true)) {
            this.f17262t.c();
        }
    }
}
