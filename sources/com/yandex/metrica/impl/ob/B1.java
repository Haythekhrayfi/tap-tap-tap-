package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.MetricaService;
import com.yandex.metrica.YandexMetrica;
import java.io.File;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class B1 implements InterfaceC2099y1 {
    private final C2100y2 A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Qi f13679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f13680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f13681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile MetricaService.e f13682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C1613ei f13683e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C1671h1 f13684f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final L0 f13685g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private D4 f13686h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final M1 f13687i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Dd f13688j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private I9 f13689k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private C1622f2 f13690l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final O0 f13691m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C1631fb f13692n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final F3 f13693o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private G7 f13694p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final W6 f13695q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final C1727j8 f13696r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final E f13697s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final InterfaceExecutorC1966sn f13698t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final K1 f13699u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Um<String> f13700v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Um<File> f13701w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private M7<String> f13702x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private InterfaceExecutorC1966sn f13703y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private C1647g2 f13704z;

    public class a implements Um<File> {
        public a() {
        }

        @Override // com.yandex.metrica.impl.ob.Um
        public void b(File file) {
            B1.this.a(file);
        }
    }

    public B1(Context context, MetricaService.e eVar) {
        this(context, eVar, new J4(context));
    }

    public B1(Context context, MetricaService.e eVar, D4 d10, M1 m10, L0 l10, O0 o10, C1631fb c1631fb, F3 f10, C1613ei c1613ei, E e10, W6 w10, C1727j8 c1727j8, InterfaceExecutorC1966sn interfaceExecutorC1966sn, InterfaceExecutorC1966sn interfaceExecutorC1966sn2, K1 k10, C2100y2 c2100y2) {
        this.f13680b = false;
        this.f13701w = new a();
        this.f13681c = context;
        this.f13682d = eVar;
        this.f13686h = d10;
        this.f13687i = m10;
        this.f13685g = l10;
        this.f13691m = o10;
        this.f13692n = c1631fb;
        this.f13693o = f10;
        this.f13683e = c1613ei;
        this.f13697s = e10;
        this.f13698t = interfaceExecutorC1966sn;
        this.f13703y = interfaceExecutorC1966sn2;
        this.f13699u = k10;
        this.f13695q = w10;
        this.f13696r = c1727j8;
        this.f13704z = new C1647g2(this, context);
        this.A = c2100y2;
    }

    private B1(Context context, MetricaService.e eVar, J4 j10) {
        this(context, eVar, new D4(context, j10), new M1(), new L0(), new O0(), new C1631fb(context), F3.a(), new C1613ei(context), P0.i().c(), P0.i().j().c(), C1727j8.a(), P0.i().s().f(), P0.i().s().b(), new K1(), P0.i().p());
    }

    public static void a(B1 b10, Intent intent) {
        b10.f13683e.a();
        b10.A.a(C2120ym.f(intent.getStringExtra("screen_size")));
    }

    public static void a(B1 b10, Qi qi) {
        b10.f13679a = qi;
        C6 c10 = new C6(b10.f13681c);
        ((C1941rn) b10.f13703y).execute(new A1(b10, c10));
        Dd dd2 = b10.f13688j;
        if (dd2 != null) {
            dd2.a(qi);
        }
        b10.f13684f.a(b10.f13679a.u());
        b10.f13692n.a(qi);
        b10.f13683e.b(qi);
    }

    private void a(Qi qi) {
        Dd dd2 = this.f13688j;
        if (dd2 != null) {
            dd2.a(qi);
        }
    }

    private void b(Intent intent, int i10) {
        if (intent != null) {
            intent.getExtras().setClassLoader(CounterConfiguration.class.getClassLoader());
            if (!(intent.getData() == null)) {
                Bundle extras = intent.getExtras();
                T3 t10 = new T3(extras);
                if (!T3.a(t10, this.f13681c)) {
                    C1744k0 c1744k0A = C1744k0.a(extras);
                    if (!((EnumC1745k1.EVENT_TYPE_UNDEFINED.b() == c1744k0A.f16515e) | (c1744k0A.f16511a == null))) {
                        try {
                            this.f13690l.a(C4.a(t10), c1744k0A, new X3(t10));
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        }
        MetricaService.this.stopSelfResult(i10);
    }

    public static void b(B1 b10) {
        b10.f13683e.b();
    }

    public static void b(B1 b10, Qi qi) {
        Dd dd2 = b10.f13688j;
        if (dd2 != null) {
            dd2.a(qi);
        }
    }

    private Integer c(Bundle bundle) {
        U3 u10;
        bundle.setClassLoader(U3.class.getClassLoader());
        String str = U3.f15133c;
        try {
            u10 = (U3) bundle.getParcelable("PROCESS_CFG_OBJ");
        } catch (Throwable unused) {
            u10 = null;
        }
        if (u10 == null) {
            return null;
        }
        return u10.g();
    }

    public static void d(B1 b10) {
        Dd dd2 = b10.f13688j;
        if (dd2 != null) {
            dd2.a(b10);
        }
    }

    public static void e(B1 b10) {
        Dd dd2 = b10.f13688j;
        if (dd2 != null) {
            dd2.b(b10);
        }
    }

    public static void g(B1 b10) {
        if (b10.f13679a != null) {
            P0.i().q().a(b10.f13679a);
        }
    }

    @Override // com.yandex.metrica.impl.ob.O1
    public void a() {
        P0.i().a().a();
        if (this.f13680b) {
            C1870p1.a(this.f13681c).b(this.f13681c.getResources().getConfiguration());
        } else {
            this.f13689k = P0.i().u();
            this.f13691m.a(this.f13681c);
            P0.i().z();
            Lm.c().d();
            this.f13688j = new Dd(C1583dd.a(this.f13681c), C1523b3.a(this.f13681c), this.f13689k);
            this.f13679a = new Qi.b(this.f13681c).a();
            P0.i().x().a(this.f13679a);
            this.f13687i.b(new F1(this));
            this.f13687i.c(new G1(this));
            this.f13687i.d(new H1(this));
            this.f13687i.e(new I1(this));
            this.f13687i.a(new J1(this));
            this.f13693o.a(this, K3.class, J3.a(new D1(this)).a(new C1(this)).a());
            P0.i().t().a(this.f13681c, this.f13679a);
            this.f13684f = new C1671h1(this.f13689k, this.f13679a.u(), new Nm(), new R2(), Oh.a());
            Qi qi = this.f13679a;
            if (qi != null) {
                this.f13683e.b(qi);
            }
            a(this.f13679a);
            K1 k10 = this.f13699u;
            Context context = this.f13681c;
            D4 d10 = this.f13686h;
            Objects.requireNonNull(k10);
            this.f13690l = new C1622f2(context, d10, P0.i().s().f(), new L0());
            YandexMetrica.getReporter(this.f13681c, "20799a27-fa80-4b36-b2db-0f8141f24180");
            File fileA = this.f13685g.a(this.f13681c, "appmetrica_crashes");
            if (fileA != null) {
                K1 k11 = this.f13699u;
                Um<File> um = this.f13701w;
                Objects.requireNonNull(k11);
                this.f13694p = new G7(fileA, um);
                ((C1941rn) this.f13698t).execute(new RunnableC1552c7(this.f13681c, fileA, this.f13701w));
                this.f13694p.a();
            }
            if (U2.a(21)) {
                K1 k12 = this.f13699u;
                C1622f2 c1622f2 = this.f13690l;
                Objects.requireNonNull(k12);
                this.f13702x = new C1528b8(new C1578d8(c1622f2));
                this.f13700v = new E1(this);
                if (this.f13696r.b()) {
                    this.f13702x.a();
                    ((C1941rn) this.f13703y).a(new RunnableC1827n8(), 1L, TimeUnit.MINUTES);
                }
            }
            P0.i().g().a(this.f13679a);
            this.f13680b = true;
        }
        if (U2.a(21)) {
            this.f13695q.a(this.f13700v);
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2099y1
    public void a(int i10, Bundle bundle) {
        this.f13704z.a(i10, bundle);
    }

    @Override // com.yandex.metrica.impl.ob.O1
    public void a(Intent intent) {
        this.f13687i.a(intent);
    }

    @Override // com.yandex.metrica.impl.ob.O1
    public void a(Intent intent, int i10) {
        b(intent, i10);
    }

    @Override // com.yandex.metrica.impl.ob.O1
    public void a(Intent intent, int i10, int i11) {
        b(intent, i11);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2099y1
    public void a(Bundle bundle) {
        Integer numC = c(bundle);
        if (numC != null) {
            this.f13697s.b(numC.intValue());
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2099y1
    public void a(MetricaService.e eVar) {
        this.f13682d = eVar;
    }

    public void a(File file) {
        this.f13690l.a(file);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2099y1
    @Deprecated
    public void a(String str, int i10, String str2, Bundle bundle) {
        bundle.setClassLoader(CounterConfiguration.class.getClassLoader());
        this.f13690l.a(new C1744k0(str2, str, i10, new Nm()), bundle);
    }

    @Override // com.yandex.metrica.impl.ob.O1
    public void b() {
        if (U2.a(21)) {
            this.f13695q.b(this.f13700v);
        }
    }

    @Override // com.yandex.metrica.impl.ob.O1
    public void b(Intent intent) {
        this.f13687i.b(intent);
        if (intent != null) {
            String action = intent.getAction();
            Uri data = intent.getData();
            String encodedAuthority = data == null ? null : data.getEncodedAuthority();
            if ("com.yandex.metrica.IMetricaService".equals(action) && data != null && data.getPath().equals("/client")) {
                int i10 = Integer.parseInt(data.getQueryParameter("pid"));
                this.f13686h.a(encodedAuthority, i10, data.getQueryParameter("psid"));
                this.f13697s.a(i10);
            }
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2099y1
    public void b(Bundle bundle) {
        Integer numC = c(bundle);
        if (numC != null) {
            this.f13697s.c(numC.intValue());
        }
    }

    @Override // com.yandex.metrica.impl.ob.O1
    public void c(Intent intent) {
        this.f13687i.c(intent);
    }

    @Override // com.yandex.metrica.impl.ob.O1
    public void onConfigurationChanged(Configuration configuration) {
        C1870p1.a(this.f13681c).b(configuration);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2099y1
    public void reportData(Bundle bundle) {
        bundle.setClassLoader(CounterConfiguration.class.getClassLoader());
        this.f13684f.a();
        this.f13690l.a(C1744k0.a(bundle), bundle);
    }
}
