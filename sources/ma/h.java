package ma;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.zipoapps.blytics.SessionManager;
import com.zipoapps.premiumhelper.configuration.appconfig.PremiumHelperConfiguration;
import com.zipoapps.premiumhelper.performance.StartupPerformanceTracker;
import com.zipoapps.premiumhelper.toto.TotoFeature;
import com.zipoapps.premiumhelper.ui.relaunch.RelaunchPremiumActivity;
import fd.c1;
import fd.d2;
import fd.f2;
import fd.g0;
import fd.j0;
import fd.m0;
import fd.z;
import gb.b0;
import gb.d0;
import gb.x;
import java.util.List;
import java.util.Objects;
import jc.w;
import kotlin.reflect.KProperty;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class h {
    public static h A;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final a f33410y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f33411z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f33412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ta.e f33413b = new ta.e("PremiumHelper");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qa.a f33414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ra.a f33415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final gb.e f33416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ma.f f33417f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final oa.b f33418g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.zipoapps.premiumhelper.a f33419h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final gb.v f33420i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final com.zipoapps.ads.a f33421j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ab.c f33422k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ab.a f33423l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final com.zipoapps.premiumhelper.ui.rate.c f33424m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final wa.a f33425n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TotoFeature f33426o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final gb.g f33427p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final id.n<Boolean> f33428q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final id.u<Boolean> f33429r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final SessionManager f33430s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final fa.l f33431t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final jc.e f33432u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final b0 f33433v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d0 f33434w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final bb.e f33435x;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }

        public final h a() {
            h hVar = h.A;
            if (hVar != null) {
                return hVar;
            }
            throw new IllegalStateException("Please call getInstance() with context first".toString());
        }
    }

    public static final class b extends vc.l implements uc.a<w> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Activity f33437d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ fa.s f33438e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f33439f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f33440g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Activity activity, fa.s sVar, boolean z10, boolean z11) {
            super(0);
            this.f33437d = activity;
            this.f33438e = sVar;
            this.f33439f = z10;
            this.f33440g = z11;
        }

        @Override // uc.a
        public w invoke() {
            h hVar = h.this;
            Activity activity = this.f33437d;
            fa.s sVar = this.f33438e;
            boolean z10 = this.f33439f;
            boolean z11 = this.f33440g;
            synchronized (hVar.f33431t) {
                fa.l lVar = hVar.f33431t;
                if (j0.d(lVar.f29485a, fa.l.a.b.f29487a) || j0.d(lVar.f29485a, fa.l.a.C0258a.f29486a)) {
                    fa.l lVar2 = hVar.f33431t;
                    Objects.requireNonNull(lVar2);
                    lVar2.f29485a = fa.l.a.c.f29488a;
                    com.zipoapps.ads.a aVar = hVar.f33421j;
                    j jVar = new j(hVar, sVar, z11);
                    Objects.requireNonNull(aVar);
                    j0.i(activity, "activity");
                    fa.f fVar = aVar.f28030g;
                    fa.k kVar = aVar.f28029f;
                    if (fVar == null) {
                        aVar.d().k(6, null, "showInterstitialAd()-> AdUnitIdProvider is not initialized !", new Object[0]);
                    } else if (kVar == null) {
                        aVar.d().k(6, null, "showInterstitialAd()-> AdManager is not initialized !", new Object[0]);
                    } else {
                        kVar.b(activity, jVar, z10, aVar.f28024a, fVar, aVar.f28027d);
                    }
                } else {
                    hVar.g().g("Interstitial skipped because the previous one is still open: " + hVar.f33431t.f29485a.toString(), new Object[0]);
                    if (sVar != null) {
                        sVar.c(new fa.n(-2, "INTERSTITIAL ALREADY SHOWN", "STATES"));
                    }
                }
            }
            return w.f31842a;
        }
    }

    public static final class c extends vc.l implements uc.a<w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ fa.s f33441c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(fa.s sVar) {
            super(0);
            this.f33441c = sVar;
        }

        @Override // uc.a
        public w invoke() {
            fa.s sVar = this.f33441c;
            if (sVar != null) {
                sVar.c(new fa.n(-2, "CAPPING_SKIP", "CAPPING"));
            }
            return w.f31842a;
        }
    }

    public static final class d extends fa.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uc.a<w> f33442a;

        public d(uc.a<w> aVar) {
            this.f33442a = aVar;
        }

        @Override // fa.s
        public void b() {
            uc.a<w> aVar = this.f33442a;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        @Override // fa.s
        public void c(fa.n nVar) {
            uc.a<w> aVar = this.f33442a;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    @oc.e(c = "com.zipoapps.premiumhelper.PremiumHelper", f = "PremiumHelper.kt", l = {461}, m = "waitForInitComplete")
    public static final class e extends oc.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f33443c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f33444d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f33446f;

        public e(mc.d<? super e> dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.f33444d = obj;
            this.f33446f |= Integer.MIN_VALUE;
            return h.this.r(this);
        }
    }

    @oc.e(c = "com.zipoapps.premiumhelper.PremiumHelper$waitForInitComplete$2", f = "PremiumHelper.kt", l = {477}, m = "invokeSuspend")
    public static final class f extends oc.h implements uc.p<g0, mc.d<? super List<? extends Boolean>>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f33447c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f33448d;

        @oc.e(c = "com.zipoapps.premiumhelper.PremiumHelper$waitForInitComplete$2$1", f = "PremiumHelper.kt", l = {477}, m = "invokeSuspend")
        public static final class a extends oc.h implements uc.p<g0, mc.d<? super List<? extends Boolean>>, Object> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f33450c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ m0<Boolean> f33451d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ m0<Boolean> f33452e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(m0<Boolean> m0Var, m0<Boolean> m0Var2, mc.d<? super a> dVar) {
                super(2, dVar);
                this.f33451d = m0Var;
                this.f33452e = m0Var2;
            }

            @Override // oc.a
            public final mc.d<w> create(Object obj, mc.d<?> dVar) {
                return new a(this.f33451d, this.f33452e, dVar);
            }

            @Override // uc.p
            public Object invoke(g0 g0Var, mc.d<? super List<? extends Boolean>> dVar) {
                return new a(this.f33451d, this.f33452e, dVar).invokeSuspend(w.f31842a);
            }

            @Override // oc.a
            public final Object invokeSuspend(Object obj) {
                nc.a aVar = nc.a.COROUTINE_SUSPENDED;
                int i10 = this.f33450c;
                if (i10 == 0) {
                    h9.d.t(obj);
                    m0[] m0VarArr = {this.f33451d, this.f33452e};
                    this.f33450c = 1;
                    obj = h9.d.d(m0VarArr, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h9.d.t(obj);
                }
                return obj;
            }
        }

        @oc.e(c = "com.zipoapps.premiumhelper.PremiumHelper$waitForInitComplete$2$initActions$1", f = "PremiumHelper.kt", l = {470}, m = "invokeSuspend")
        public static final class b extends oc.h implements uc.p<g0, mc.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f33453c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ h f33454d;

            @oc.e(c = "com.zipoapps.premiumhelper.PremiumHelper$waitForInitComplete$2$initActions$1$1", f = "PremiumHelper.kt", l = {}, m = "invokeSuspend")
            public static final class a extends oc.h implements uc.p<Boolean, mc.d<? super Boolean>, Object> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public /* synthetic */ boolean f33455c;

                public a(mc.d<? super a> dVar) {
                    super(2, dVar);
                }

                @Override // oc.a
                public final mc.d<w> create(Object obj, mc.d<?> dVar) {
                    a aVar = new a(dVar);
                    aVar.f33455c = ((Boolean) obj).booleanValue();
                    return aVar;
                }

                @Override // uc.p
                public Object invoke(Boolean bool, mc.d<? super Boolean> dVar) {
                    Boolean boolValueOf = Boolean.valueOf(bool.booleanValue());
                    a aVar = new a(dVar);
                    aVar.f33455c = boolValueOf.booleanValue();
                    w wVar = w.f31842a;
                    nc.a aVar2 = nc.a.COROUTINE_SUSPENDED;
                    h9.d.t(wVar);
                    return Boolean.valueOf(aVar.f33455c);
                }

                @Override // oc.a
                public final Object invokeSuspend(Object obj) {
                    nc.a aVar = nc.a.COROUTINE_SUSPENDED;
                    h9.d.t(obj);
                    return Boolean.valueOf(this.f33455c);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(h hVar, mc.d<? super b> dVar) {
                super(2, dVar);
                this.f33454d = hVar;
            }

            @Override // oc.a
            public final mc.d<w> create(Object obj, mc.d<?> dVar) {
                return new b(this.f33454d, dVar);
            }

            @Override // uc.p
            public Object invoke(g0 g0Var, mc.d<? super Boolean> dVar) {
                return new b(this.f33454d, dVar).invokeSuspend(w.f31842a);
            }

            @Override // oc.a
            public final Object invokeSuspend(Object obj) {
                nc.a aVar = nc.a.COROUTINE_SUSPENDED;
                int i10 = this.f33453c;
                if (i10 == 0) {
                    h9.d.t(obj);
                    if (!this.f33454d.f33429r.getValue().booleanValue()) {
                        id.u<Boolean> uVar = this.f33454d.f33429r;
                        a aVar2 = new a(null);
                        this.f33453c = 1;
                        if (z.s(uVar, aVar2, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h9.d.t(obj);
                }
                return Boolean.TRUE;
            }
        }

        @oc.e(c = "com.zipoapps.premiumhelper.PremiumHelper$waitForInitComplete$2$minSplashTimeout$1", f = "PremiumHelper.kt", l = {464}, m = "invokeSuspend")
        public static final class c extends oc.h implements uc.p<g0, mc.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f33456c;

            public c(mc.d<? super c> dVar) {
                super(2, dVar);
            }

            @Override // oc.a
            public final mc.d<w> create(Object obj, mc.d<?> dVar) {
                return new c(dVar);
            }

            @Override // uc.p
            public Object invoke(g0 g0Var, mc.d<? super Boolean> dVar) {
                return new c(dVar).invokeSuspend(w.f31842a);
            }

            @Override // oc.a
            public final Object invokeSuspend(Object obj) {
                nc.a aVar = nc.a.COROUTINE_SUSPENDED;
                int i10 = this.f33456c;
                if (i10 == 0) {
                    h9.d.t(obj);
                    this.f33456c = 1;
                    if (z.m(1500L, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h9.d.t(obj);
                }
                return Boolean.TRUE;
            }
        }

        public f(mc.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // oc.a
        public final mc.d<w> create(Object obj, mc.d<?> dVar) {
            f fVar = h.this.new f(dVar);
            fVar.f33448d = obj;
            return fVar;
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, mc.d<? super List<? extends Boolean>> dVar) {
            f fVar = h.this.new f(dVar);
            fVar.f33448d = g0Var;
            return fVar.invokeSuspend(w.f31842a);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.f33447c;
            if (i10 == 0) {
                h9.d.t(obj);
                g0 g0Var = (g0) this.f33448d;
                m0 m0VarE = c0.e(g0Var, null, null, new c(null), 3, null);
                m0 m0VarE2 = c0.e(g0Var, null, null, new b(h.this, null), 3, null);
                h hVar = h.this;
                a aVar2 = h.f33410y;
                Objects.requireNonNull(hVar);
                a aVar3 = new a(m0VarE, m0VarE2, null);
                this.f33447c = 1;
                obj = f2.b(RecyclerView.FOREVER_NS, aVar3, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h9.d.t(obj);
            }
            return obj;
        }
    }

    static {
        vc.t tVar = new vc.t(h.class, "log", "getLog()Lcom/zipoapps/premiumhelper/log/TimberLogger;", 0);
        Objects.requireNonNull(vc.b0.f36991a);
        f33411z = new cd.i[]{tVar};
        f33410y = new a(null);
    }

    public h(Application application, PremiumHelperConfiguration premiumHelperConfiguration, vc.g gVar) {
        this.f33412a = application;
        qa.a aVar = new qa.a();
        this.f33414c = aVar;
        ra.a aVar2 = new ra.a();
        this.f33415d = aVar2;
        gb.e eVar = new gb.e(application);
        this.f33416e = eVar;
        ma.f fVar = new ma.f(application);
        this.f33417f = fVar;
        oa.b bVar = new oa.b(application, aVar, premiumHelperConfiguration, aVar2);
        this.f33418g = bVar;
        this.f33419h = new com.zipoapps.premiumhelper.a(application, bVar, fVar);
        this.f33420i = new gb.v(application);
        this.f33421j = new com.zipoapps.ads.a(application, bVar);
        this.f33422k = new ab.c(application, fVar, bVar);
        this.f33423l = new ab.a(application, bVar);
        com.zipoapps.premiumhelper.ui.rate.c cVar = new com.zipoapps.premiumhelper.ui.rate.c(bVar, fVar);
        this.f33424m = cVar;
        this.f33425n = new wa.a(cVar, bVar, fVar);
        this.f33426o = new TotoFeature(application, bVar, fVar);
        this.f33427p = new gb.g(application, bVar, fVar, eVar);
        id.n<Boolean> nVarA = id.w.a(Boolean.FALSE);
        this.f33428q = nVarA;
        this.f33429r = z.d(nVarA);
        this.f33430s = new SessionManager(application, bVar);
        this.f33431t = new fa.l();
        this.f33432u = jc.f.b(new r(this));
        Objects.requireNonNull(b0.f30184d);
        this.f33433v = new b0(300000L, 0L, true);
        d0.a aVar3 = d0.f30193d;
        long jLongValue = ((Number) bVar.h(oa.b.K)).longValue();
        long jF = fVar.f("toto_get_config_timestamp", 0L);
        Objects.requireNonNull(aVar3);
        this.f33434w = new d0(jLongValue * 3600000, jF, false);
        this.f33435x = new bb.e();
        try {
            y1.k.d(application, new androidx.work.b(new androidx.work.b.a()));
        } catch (Exception unused) {
            xe.a.f37601c.g("WorkManager already initialized", new Object[0]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(h hVar, mc.d dVar) {
        l lVar;
        h hVar2;
        com.zipoapps.premiumhelper.a aVar;
        String str;
        h hVar3;
        StartupPerformanceTracker.StartupData startupData;
        Objects.requireNonNull(hVar);
        if (dVar instanceof l) {
            lVar = (l) dVar;
            int i10 = lVar.f33484g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lVar.f33484g = i10 - Integer.MIN_VALUE;
            } else {
                lVar = new l(hVar, dVar);
            }
        } else {
            lVar = new l(hVar, dVar);
        }
        Object obj = lVar.f33482e;
        nc.a aVar2 = nc.a.COROUTINE_SUSPENDED;
        int i11 = lVar.f33484g;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    aVar = (com.zipoapps.premiumhelper.a) lVar.f33481d;
                    hVar2 = (h) lVar.f33480c;
                    h9.d.t(obj);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    hVar3 = (h) lVar.f33480c;
                    h9.d.t(obj);
                }
                startupData = StartupPerformanceTracker.f28309b.a().f28311a;
                if (startupData != null) {
                    startupData.setAnalyticsEndTimestamp(System.currentTimeMillis());
                }
                hVar3.f33419h.v("ph_first_open_time", new Long(com.zipoapps.premiumhelper.util.c.i(hVar3.f33412a)));
                return w.f31842a;
            }
            h9.d.t(obj);
            com.zipoapps.premiumhelper.a aVar3 = hVar.f33419h;
            gb.e eVar = hVar.f33416e;
            lVar.f33480c = hVar;
            lVar.f33481d = aVar3;
            lVar.f33484g = 1;
            Object objA = eVar.a(lVar);
            if (objA == aVar2) {
                return aVar2;
            }
            hVar2 = hVar;
            aVar = aVar3;
            obj = objA;
            g6.c cVar = g6.c.f30013d;
            if (cVar != null) {
                cVar.e(str);
            }
        } catch (Throwable th) {
            aVar.d().k(6, th, null, new Object[0]);
        }
        str = (String) obj;
        Objects.requireNonNull(aVar);
        j0.i(str, FacebookMediationAdapter.KEY_ID);
        aVar.d().a(i.f.a("Analytics User ID: ", str), new Object[0]);
        aVar.f28260h = str;
        StartupPerformanceTracker.StartupData startupData2 = StartupPerformanceTracker.f28309b.a().f28311a;
        if (startupData2 != null) {
            startupData2.setAnalyticsStartTimestamp(System.currentTimeMillis());
        }
        com.zipoapps.premiumhelper.a aVar4 = hVar2.f33419h;
        lVar.f33480c = hVar2;
        lVar.f33481d = null;
        lVar.f33484g = 2;
        if (aVar4.e(lVar) == aVar2) {
            return aVar2;
        }
        hVar3 = hVar2;
        startupData = StartupPerformanceTracker.f28309b.a().f28311a;
        if (startupData != null) {
            startupData.setAnalyticsEndTimestamp(System.currentTimeMillis());
        }
        hVar3.f33419h.v("ph_first_open_time", new Long(com.zipoapps.premiumhelper.util.c.i(hVar3.f33412a)));
        return w.f31842a;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object b(h hVar, mc.d dVar) {
        m mVar;
        h hVar2;
        x xVar;
        StartupPerformanceTracker.StartupData startupData;
        Objects.requireNonNull(hVar);
        if (dVar instanceof m) {
            mVar = (m) dVar;
            int i10 = mVar.f33489g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                mVar.f33489g = i10 - Integer.MIN_VALUE;
            } else {
                mVar = new m(hVar, dVar);
            }
        } else {
            mVar = new m(hVar, dVar);
        }
        Object objK = mVar.f33487e;
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i11 = mVar.f33489g;
        if (i11 != 0) {
            if (i11 == 1) {
                hVar = (h) mVar.f33485c;
                h9.d.t(objK);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                xVar = (x) mVar.f33486d;
                hVar2 = (h) mVar.f33485c;
                h9.d.t(objK);
            }
            hVar2.f33433v.b();
            startupData = StartupPerformanceTracker.f28309b.a().f28311a;
            if (startupData != null) {
                startupData.setPurchasesEndTimestamp(System.currentTimeMillis());
            }
            boolean z10 = xVar instanceof x.c;
            return w.f31842a;
        }
        h9.d.t(objK);
        StartupPerformanceTracker.StartupData startupData2 = StartupPerformanceTracker.f28309b.a().f28311a;
        if (startupData2 != null) {
            startupData2.setPurchasesStartTimestamp(System.currentTimeMillis());
        }
        mVar.f33485c = hVar;
        mVar.f33489g = 1;
        objK = hVar.f33427p.k(mVar);
        if (objK == aVar) {
            return aVar;
        }
        x xVar2 = (x) objK;
        com.zipoapps.ads.a aVar2 = hVar.f33421j;
        List list = (List) c0.m(xVar2);
        boolean z11 = list != null && (list.isEmpty() ^ true);
        mVar.f33485c = hVar;
        mVar.f33486d = xVar2;
        mVar.f33489g = 2;
        Object objEmit = aVar2.f28034k.emit(Boolean.valueOf(z11), mVar);
        if (objEmit != aVar) {
            objEmit = w.f31842a;
        }
        if (objEmit == aVar) {
            return aVar;
        }
        hVar2 = hVar;
        xVar = xVar2;
        hVar2.f33433v.b();
        startupData = StartupPerformanceTracker.f28309b.a().f28311a;
        if (startupData != null) {
            startupData.setPurchasesEndTimestamp(System.currentTimeMillis());
        }
        boolean z12 = xVar instanceof x.c;
        return w.f31842a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object c(h hVar, mc.d dVar) {
        n nVar;
        Objects.requireNonNull(hVar);
        if (dVar instanceof n) {
            nVar = (n) dVar;
            int i10 = nVar.f33492e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                nVar.f33492e = i10 - Integer.MIN_VALUE;
            } else {
                nVar = new n(hVar, dVar);
            }
        } else {
            nVar = new n(hVar, dVar);
        }
        Object obj = nVar.f33490c;
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i11 = nVar.f33492e;
        if (i11 == 0) {
            h9.d.t(obj);
            StartupPerformanceTracker.StartupData startupData = StartupPerformanceTracker.f28309b.a().f28311a;
            if (startupData != null) {
                startupData.setTestyStartTimestamp(System.currentTimeMillis());
            }
            ra.a aVar2 = hVar.f33415d;
            Application application = hVar.f33412a;
            nVar.f33492e = 1;
            if (aVar2.e(application, nVar) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h9.d.t(obj);
        }
        StartupPerformanceTracker.StartupData startupData2 = StartupPerformanceTracker.f28309b.a().f28311a;
        if (startupData2 != null) {
            startupData2.setTestyEndTimestamp(System.currentTimeMillis());
        }
        return w.f31842a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object d(h hVar, mc.d dVar) {
        o oVar;
        vc.v vVar;
        vc.v vVar2;
        Objects.requireNonNull(hVar);
        if (dVar instanceof o) {
            oVar = (o) dVar;
            int i10 = oVar.f33496f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                oVar.f33496f = i10 - Integer.MIN_VALUE;
            } else {
                oVar = new o(hVar, dVar);
            }
        } else {
            oVar = new o(hVar, dVar);
        }
        Object obj = oVar.f33494d;
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i11 = oVar.f33496f;
        if (i11 == 0) {
            h9.d.t(obj);
            vVar = new vc.v();
            vVar.f37003c = true;
            if (hVar.f33418g.m()) {
                d0 d0Var = hVar.f33434w;
                p pVar = new p(hVar, vVar, null);
                q qVar = new q(hVar, null);
                oVar.f33493c = vVar;
                oVar.f33496f = 1;
                if (d0Var.a(pVar, qVar, oVar) == aVar) {
                    return aVar;
                }
                vVar2 = vVar;
            } else {
                StartupPerformanceTracker.f28309b.a().c("disabled");
            }
            return Boolean.valueOf(vVar.f37003c);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        vVar2 = (vc.v) oVar.f33493c;
        h9.d.t(obj);
        vVar = vVar2;
        return Boolean.valueOf(vVar.f37003c);
    }

    public static final void e(h hVar) {
        if (!com.zipoapps.premiumhelper.util.c.m(hVar.f33412a)) {
            ta.d dVarG = hVar.g();
            StringBuilder sbA = defpackage.a.a("PremiumHelper initialization disabled for process ");
            sbA.append(com.zipoapps.premiumhelper.util.c.k(hVar.f33412a));
            dVarG.b(sbA.toString(), new Object[0]);
            return;
        }
        xe.a.a(hVar.f33418g.l() ? new xe.a.b() : new ta.c(hVar.f33412a));
        xe.a.a(new ta.b(hVar.f33412a, hVar.f33418g.l()));
        try {
            Application application = hVar.f33412a;
            j0.i(application, CoreConstants.CONTEXT_SCOPE_VALUE);
            u4.d.e(application);
            c0.z(c1.f29556c, null, null, new u(hVar, null), 3, null);
        } catch (Exception e10) {
            hVar.g().k(6, e10, "Initialization failed", new Object[0]);
        }
    }

    public static /* synthetic */ void p(h hVar, Activity activity, fa.s sVar, boolean z10, boolean z11, int i10) {
        if ((i10 & 2) != 0) {
            sVar = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        hVar.n(activity, sVar, z10, z11);
    }

    public static void q(h hVar, String str, int i10, int i11, int i12) {
        if ((i12 & 2) != 0) {
            i10 = -1;
        }
        if ((i12 & 4) != 0) {
            i11 = -1;
        }
        j0.i(str, "source");
        ab.c.a aVar = ab.c.f275h;
        Application application = hVar.f33412a;
        Objects.requireNonNull(aVar);
        j0.i(application, CoreConstants.CONTEXT_SCOPE_VALUE);
        Intent intentPutExtra = new Intent(application, (Class<?>) RelaunchPremiumActivity.class).putExtra("source", str).putExtra("theme", i10);
        j0.h(intentPutExtra, "Intent(context, Relaunch…ctivity.ARG_THEME, theme)");
        intentPutExtra.addFlags(268435456);
        if (i11 != -1) {
            intentPutExtra.addFlags(i11);
        }
        application.startActivity(intentPutExtra);
    }

    public final b0 f() {
        return (b0) this.f33432u.getValue();
    }

    public final ta.d g() {
        return this.f33413b.a(this, f33411z[0]);
    }

    public final Object h(oa.b.c.d dVar, mc.d<? super x<ma.e>> dVar2) {
        return this.f33427p.m(dVar, dVar2);
    }

    public final boolean i() {
        return this.f33417f.j();
    }

    public final void j() {
        SharedPreferences.Editor editorEdit = this.f33417f.f33405a.edit();
        editorEdit.putBoolean("is_next_app_start_ignored", true);
        editorEdit.apply();
    }

    public final boolean k() {
        return this.f33418g.l();
    }

    public final boolean l() {
        if (this.f33418g.f34205b.getIntroActivityClass() != null) {
            ma.f fVar = this.f33417f;
            Objects.requireNonNull(fVar);
            if (!oa.a.C0376a.b(fVar, "intro_complete", false)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final id.d<gb.z> m(Activity activity, ma.e eVar) {
        j0.i(activity, "activity");
        j0.i(eVar, "offer");
        gb.g gVar = this.f33427p;
        Objects.requireNonNull(gVar);
        if (activity instanceof androidx.lifecycle.p) {
            c0.z(androidx.activity.i.l((androidx.lifecycle.p) activity), null, null, new gb.l(eVar, gVar, activity, null), 3, null);
        }
        return z.o(gVar.f30216j);
    }

    public final void n(Activity activity, fa.s sVar, boolean z10, boolean z11) {
        j0.i(activity, "activity");
        if (!this.f33417f.j()) {
            f().a(new b(activity, sVar, z10, z11), new c(sVar));
        } else if (sVar != null) {
            sVar.c(new fa.n(-3, "PURCHASED", "PURCHASED"));
        }
    }

    public final void o(Activity activity, uc.a<w> aVar) {
        j0.i(activity, "activity");
        p(this, activity, new d(aVar), false, false, 8);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0093  */
    /* JADX WARN: Code duplicated, block: B:34:0x0094 A[Catch: Exception -> 0x002d, TryCatch #1 {Exception -> 0x002d, blocks: (B:12:0x0029, B:25:0x004e, B:31:0x005f, B:35:0x0097, B:34:0x0094), top: B:39:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object r(mc.d<? super x<w>> dVar) {
        e eVar;
        h hVar;
        StartupPerformanceTracker.StartupData startupData;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i10 = eVar.f33446f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f33446f = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object obj = eVar.f33444d;
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i11 = eVar.f33446f;
        if (i11 == 0) {
            h9.d.t(obj);
            try {
                f fVar = new f(null);
                eVar.f33443c = this;
                eVar.f33446f = 1;
                if (z.l(fVar, eVar) == aVar) {
                    return aVar;
                }
                hVar = this;
            } catch (d2 e10) {
                e = e10;
                hVar = this;
                hVar.g().b("Initialization timeout expired: " + e.getMessage(), new Object[0]);
                hVar.j();
                hVar.f33419h.f28257e = true;
                startupData = StartupPerformanceTracker.f28309b.a().f28311a;
                if (startupData == null) {
                    startupData.setPremiumHelperTimeout(RecyclerView.FOREVER_NS);
                }
                return new x.b(e);
            } catch (Exception e11) {
                e = e11;
                hVar = this;
                hVar.g().k(6, e, null, new Object[0]);
                return new x.b(e);
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = (h) eVar.f33443c;
            try {
                try {
                    h9.d.t(obj);
                } catch (d2 e12) {
                    e = e12;
                    hVar.g().b("Initialization timeout expired: " + e.getMessage(), new Object[0]);
                    hVar.j();
                    hVar.f33419h.f28257e = true;
                    startupData = StartupPerformanceTracker.f28309b.a().f28311a;
                    if (startupData == null) {
                        startupData.setPremiumHelperTimeout(RecyclerView.FOREVER_NS);
                    }
                    return new x.b(e);
                }
            } catch (Exception e13) {
                e = e13;
                hVar.g().k(6, e, null, new Object[0]);
                return new x.b(e);
            }
        }
        hVar.f33419h.f28257e = false;
        return new x.c(w.f31842a);
    }
}
