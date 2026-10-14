package ha;

import android.app.Activity;
import android.app.Application;
import ch.qos.logback.core.CoreConstants;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.google.android.gms.ads.AdError;
import fa.s;
import fd.c0;
import fd.c1;
import fd.f2;
import fd.g0;
import fd.j0;
import fd.s0;
import fd.s1;
import fd.z;
import gb.x;
import id.u;
import java.util.Objects;
import jc.w;
import kd.q;
import kotlin.reflect.KProperty;
import l8.a1;
import uc.p;
import vc.b0;
import vc.t;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements fa.k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f31010e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ta.e f31011a = new ta.e("AppLovin");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final id.n<x<MaxInterstitialAd>> f31012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u<x<MaxInterstitialAd>> f31013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f31014d;

    @oc.e(c = "com.zipoapps.ads.applovin.AppLovinInterstitialManager$loadInterstitial$1", f = "AppLovinInterstitialManager.kt", l = {58, 77}, m = "invokeSuspend")
    public static final class a extends oc.h implements p<g0, mc.d<? super w>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f31015c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f31016d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ fa.f f31018f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f31019g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Activity f31020h;

        /* JADX INFO: renamed from: ha.d$a$a, reason: collision with other inner class name */
        @oc.e(c = "com.zipoapps.ads.applovin.AppLovinInterstitialManager$loadInterstitial$1$result$1", f = "AppLovinInterstitialManager.kt", l = {65}, m = "invokeSuspend")
        public static final class C0304a extends oc.h implements p<g0, mc.d<? super x<? extends MaxInterstitialAd>>, Object> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f31021c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ fa.f f31022d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ boolean f31023e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ d f31024f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ Activity f31025g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0304a(fa.f fVar, boolean z10, d dVar, Activity activity, mc.d<? super C0304a> dVar2) {
                super(2, dVar2);
                this.f31022d = fVar;
                this.f31023e = z10;
                this.f31024f = dVar;
                this.f31025g = activity;
            }

            @Override // oc.a
            public final mc.d<w> create(Object obj, mc.d<?> dVar) {
                return new C0304a(this.f31022d, this.f31023e, this.f31024f, this.f31025g, dVar);
            }

            @Override // uc.p
            public Object invoke(g0 g0Var, mc.d<? super x<? extends MaxInterstitialAd>> dVar) {
                return new C0304a(this.f31022d, this.f31023e, this.f31024f, this.f31025g, dVar).invokeSuspend(w.f31842a);
            }

            @Override // oc.a
            public final Object invokeSuspend(Object obj) {
                nc.a aVar = nc.a.COROUTINE_SUSPENDED;
                int i10 = this.f31021c;
                if (i10 == 0) {
                    h9.d.t(obj);
                    String strA = this.f31022d.a(com.zipoapps.ads.a.EnumC0215a.INTERSTITIAL, false, this.f31023e);
                    d dVar = this.f31024f;
                    KProperty<Object>[] kPropertyArr = d.f31010e;
                    dVar.e().a(a1.a("AppLovinInterstitialManager: Loading interstitial ad: (", strA, CoreConstants.RIGHT_PARENTHESIS_CHAR), new Object[0]);
                    g gVar = new g(strA);
                    Activity activity = this.f31025g;
                    this.f31021c = 1;
                    fd.k kVar = new fd.k(nc.b.c(this), 1);
                    kVar.u();
                    try {
                        MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd(gVar.f31052a, activity);
                        maxInterstitialAd.setRevenueListener(e.f31048c);
                        maxInterstitialAd.setListener(new f(kVar, maxInterstitialAd, activity));
                        maxInterstitialAd.loadAd();
                    } catch (Exception e10) {
                        if (kVar.a()) {
                            jc.i.a aVar2 = jc.i.f31813c;
                            kVar.resumeWith(new x.b(e10));
                        }
                    }
                    obj = kVar.r();
                    if (obj == nc.a.COROUTINE_SUSPENDED) {
                        j0.i(this, "frame");
                    }
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fa.f fVar, boolean z10, Activity activity, mc.d<? super a> dVar) {
            super(2, dVar);
            this.f31018f = fVar;
            this.f31019g = z10;
            this.f31020h = activity;
        }

        @Override // oc.a
        public final mc.d<w> create(Object obj, mc.d<?> dVar) {
            return d.this.new a(this.f31018f, this.f31019g, this.f31020h, dVar);
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, mc.d<? super w> dVar) {
            return d.this.new a(this.f31018f, this.f31019g, this.f31020h, dVar).invokeSuspend(w.f31842a);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            x<MaxInterstitialAd> xVar;
            long jCurrentTimeMillis;
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.f31016d;
            try {
                try {
                    if (i10 != 0) {
                        if (i10 == 1) {
                            jCurrentTimeMillis = this.f31015c;
                            h9.d.t(obj);
                        } else {
                            if (i10 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h9.d.t(obj);
                        }
                        return w.f31842a;
                    }
                    h9.d.t(obj);
                    if (d.this.f31012b.getValue() != null && !(d.this.f31012b.getValue() instanceof x.c)) {
                        d.this.f31012b.setValue(null);
                    }
                    va.a.f36772c.a().f36775b++;
                    jCurrentTimeMillis = System.currentTimeMillis();
                    c0 c0Var = s0.f29619a;
                    s1 s1Var = q.f32064a;
                    C0304a c0304a = new C0304a(this.f31018f, this.f31019g, d.this, this.f31020h, null);
                    this.f31015c = jCurrentTimeMillis;
                    this.f31016d = 1;
                    obj = y8.c0.V(s1Var, c0304a, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    xVar = (x) obj;
                    d.this.f31014d = false;
                    va.a.f36772c.a().b(System.currentTimeMillis() - jCurrentTimeMillis);
                } catch (Exception e10) {
                    d dVar = d.this;
                    KProperty<Object>[] kPropertyArr = d.f31010e;
                    dVar.e().k(6, e10, "AppLovinInterstitialManager: Failed to load interstitial ad", new Object[0]);
                    fa.l lVar = ma.h.f33410y.a().f33431t;
                    Objects.requireNonNull(lVar);
                    lVar.f29485a = fa.l.a.b.f29487a;
                    x.b bVar = new x.b(e10);
                    d.this.f31014d = false;
                    va.a.f36772c.a().b(System.currentTimeMillis() - jCurrentTimeMillis);
                    xVar = bVar;
                }
                fa.l lVar2 = ma.h.f33410y.a().f33431t;
                Objects.requireNonNull(lVar2);
                lVar2.f29485a = fa.l.a.C0258a.f29486a;
                d dVar2 = d.this;
                KProperty<Object>[] kPropertyArr2 = d.f31010e;
                dVar2.e().k(3, null, "loadInterstitial()-> interstitial loaded", new Object[0]);
                id.n<x<MaxInterstitialAd>> nVar = d.this.f31012b;
                this.f31016d = 2;
                if (nVar.emit(xVar, this) == aVar) {
                    return aVar;
                }
                return w.f31842a;
            } catch (Throwable th) {
                d.this.f31014d = false;
                va.a.f36772c.a().b(System.currentTimeMillis() - jCurrentTimeMillis);
                throw th;
            }
        }
    }

    @oc.e(c = "com.zipoapps.ads.applovin.AppLovinInterstitialManager$showInterstitialAd$1", f = "AppLovinInterstitialManager.kt", l = {124, 168}, m = "invokeSuspend")
    public static final class b extends oc.h implements p<g0, mc.d<? super w>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f31026c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f31027d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f31028e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f31029f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Object f31030g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f31031h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f31032i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f31033j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ s f31035l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Activity f31036m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ fa.f f31037n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ boolean f31038o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final /* synthetic */ boolean f31039p;

        public static final class a implements MaxAdListener {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d f31040c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ s f31041d;

            public a(d dVar, s sVar) {
                this.f31040c = dVar;
                this.f31041d = sVar;
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdClicked(MaxAd maxAd) {
                d dVar = this.f31040c;
                KProperty<Object>[] kPropertyArr = d.f31010e;
                dVar.e().k(3, null, "showInterstitialAd()-> adClicked", new Object[0]);
                s sVar = this.f31041d;
                if (sVar != null) {
                    sVar.a();
                }
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
                s sVar = this.f31041d;
                if (sVar != null) {
                    int code = maxError != null ? maxError.getCode() : 3;
                    String message = maxError != null ? maxError.getMessage() : null;
                    if (message == null) {
                        message = "";
                    }
                    sVar.c(new fa.n(code, message, AdError.UNDEFINED_DOMAIN));
                }
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdDisplayed(MaxAd maxAd) {
                d dVar = this.f31040c;
                KProperty<Object>[] kPropertyArr = d.f31010e;
                dVar.e().k(3, null, "showInterstitialAd()-> adDisplayed", new Object[0]);
                s sVar = this.f31041d;
                if (sVar != null) {
                    sVar.d();
                }
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdHidden(MaxAd maxAd) {
                d dVar = this.f31040c;
                KProperty<Object>[] kPropertyArr = d.f31010e;
                dVar.e().k(3, null, "showInterstitialAd()-> adHidden", new Object[0]);
                s sVar = this.f31041d;
                if (sVar != null) {
                    sVar.b();
                }
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoadFailed(String str, MaxError maxError) {
                s sVar = this.f31041d;
                if (sVar != null) {
                    int code = maxError != null ? maxError.getCode() : 2;
                    String message = maxError != null ? maxError.getMessage() : null;
                    if (message == null) {
                        message = "";
                    }
                    sVar.c(new fa.n(code, message, AdError.UNDEFINED_DOMAIN));
                }
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoaded(MaxAd maxAd) {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(s sVar, Activity activity, fa.f fVar, boolean z10, boolean z11, mc.d<? super b> dVar) {
            super(2, dVar);
            this.f31035l = sVar;
            this.f31036m = activity;
            this.f31037n = fVar;
            this.f31038o = z10;
            this.f31039p = z11;
        }

        @Override // oc.a
        public final mc.d<w> create(Object obj, mc.d<?> dVar) {
            b bVar = d.this.new b(this.f31035l, this.f31036m, this.f31037n, this.f31038o, this.f31039p, dVar);
            bVar.f31033j = obj;
            return bVar;
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, mc.d<? super w> dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(w.f31842a);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x00c5  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            g0 g0Var;
            x xVar;
            d dVar;
            Activity activity;
            fa.f fVar;
            boolean z10;
            String message;
            MaxInterstitialAd maxInterstitialAd;
            d dVar2;
            Activity activity2;
            fa.f fVar2;
            boolean z11;
            MaxInterstitialAd maxInterstitialAd2;
            Activity activity3;
            fa.f fVar3;
            boolean z12;
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.f31032i;
            w wVar = null;
            if (i10 != 0) {
                if (i10 == 1) {
                    g0Var = (g0) this.f31033j;
                    h9.d.t(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z12 = this.f31031h;
                    maxInterstitialAd2 = (MaxInterstitialAd) this.f31030g;
                    fVar3 = (fa.f) this.f31029f;
                    activity3 = (Activity) this.f31028e;
                    dVar2 = (d) this.f31027d;
                    xVar = (x) this.f31026c;
                    h9.d.t(obj);
                }
                z11 = z12;
                maxInterstitialAd = maxInterstitialAd2;
                fVar2 = fVar3;
                activity2 = activity3;
                maxInterstitialAd.showAd();
                dVar2.c(activity2, fVar2, z11);
                wVar = w.f31842a;
                if (wVar == null) {
                    dVar = d.this;
                    activity = this.f31036m;
                    fVar = this.f31037n;
                    z10 = this.f31038o;
                    KProperty<Object>[] kPropertyArr = d.f31010e;
                    ta.d dVarE = dVar.e();
                    StringBuilder sbA = defpackage.a.a("showInterstitialAd()-> Can't show interstitial ad: ");
                    x.c cVar = (x.c) xVar;
                    sbA.append(cVar.f30417b);
                    sbA.append(" is Ready: ");
                    sbA.append(((MaxInterstitialAd) cVar.f30417b).isReady());
                    dVarE.b(sbA.toString(), new Object[0]);
                    dVar.c(activity, fVar, z10);
                }
                return w.f31842a;
            }
            h9.d.t(obj);
            g0Var = (g0) this.f31033j;
            id.l lVar = new id.l(d.this.f31013c);
            this.f31033j = g0Var;
            this.f31032i = 1;
            obj = z.r(lVar, this);
            if (obj == aVar) {
                return aVar;
            }
            xVar = (x) obj;
            if (xVar instanceof x.c) {
                d dVar3 = d.this;
                KProperty<Object>[] kPropertyArr2 = d.f31010e;
                dVar3.e().k(3, null, "showInterstitialAd()-> PHResult.Success", new Object[0]);
                Object obj2 = ((x.c) xVar).f30417b;
                if (!((MaxInterstitialAd) obj2).isReady()) {
                    obj2 = null;
                }
                maxInterstitialAd = (MaxInterstitialAd) obj2;
                if (maxInterstitialAd != null) {
                    boolean z13 = this.f31039p;
                    dVar2 = d.this;
                    activity2 = this.f31036m;
                    fVar2 = this.f31037n;
                    z11 = this.f31038o;
                    maxInterstitialAd.setListener(new a(dVar2, this.f31035l));
                    if (z13) {
                        this.f31033j = g0Var;
                        this.f31026c = xVar;
                        this.f31027d = dVar2;
                        this.f31028e = activity2;
                        this.f31029f = fVar2;
                        this.f31030g = maxInterstitialAd;
                        this.f31031h = z11;
                        this.f31032i = 2;
                        if (z.m(1000L, this) == aVar) {
                            return aVar;
                        }
                        maxInterstitialAd2 = maxInterstitialAd;
                        activity3 = activity2;
                        fVar3 = fVar2;
                        z12 = z11;
                        z11 = z12;
                        maxInterstitialAd = maxInterstitialAd2;
                        fVar2 = fVar3;
                        activity2 = activity3;
                    }
                    maxInterstitialAd.showAd();
                    dVar2.c(activity2, fVar2, z11);
                    wVar = w.f31842a;
                    if (wVar == null) {
                        dVar = d.this;
                        activity = this.f31036m;
                        fVar = this.f31037n;
                        z10 = this.f31038o;
                        KProperty<Object>[] kPropertyArr3 = d.f31010e;
                        ta.d dVarE2 = dVar.e();
                        StringBuilder sbA2 = defpackage.a.a("showInterstitialAd()-> Can't show interstitial ad: ");
                        x.c cVar2 = (x.c) xVar;
                        sbA2.append(cVar2.f30417b);
                        sbA2.append(" is Ready: ");
                        sbA2.append(((MaxInterstitialAd) cVar2.f30417b).isReady());
                        dVarE2.b(sbA2.toString(), new Object[0]);
                        dVar.c(activity, fVar, z10);
                    }
                } else if (wVar == null) {
                    dVar = d.this;
                    activity = this.f31036m;
                    fVar = this.f31037n;
                    z10 = this.f31038o;
                    KProperty<Object>[] kPropertyArr4 = d.f31010e;
                    ta.d dVarE3 = dVar.e();
                    StringBuilder sbA3 = defpackage.a.a("showInterstitialAd()-> Can't show interstitial ad: ");
                    x.c cVar3 = (x.c) xVar;
                    sbA3.append(cVar3.f30417b);
                    sbA3.append(" is Ready: ");
                    sbA3.append(((MaxInterstitialAd) cVar3.f30417b).isReady());
                    dVarE3.b(sbA3.toString(), new Object[0]);
                    dVar.c(activity, fVar, z10);
                }
            } else if (xVar instanceof x.b) {
                d dVar4 = d.this;
                KProperty<Object>[] kPropertyArr5 = d.f31010e;
                dVar4.e().k(6, null, "showInterstitialAd()-> PHResult.Failure", new Object[0]);
                s sVar = this.f31035l;
                if (sVar != null) {
                    Exception exc = ((x.b) xVar).f30416b;
                    if (exc == null || (message = exc.getMessage()) == null) {
                        message = "";
                    }
                    sVar.c(new fa.n(-1, message, AdError.UNDEFINED_DOMAIN));
                }
                dVar = d.this;
                activity = this.f31036m;
                fVar = this.f31037n;
                z10 = this.f31038o;
                dVar.c(activity, fVar, z10);
            }
            return w.f31842a;
        }
    }

    @oc.e(c = "com.zipoapps.ads.applovin.AppLovinInterstitialManager", f = "AppLovinInterstitialManager.kt", l = {94}, m = "waitForInterstitial")
    public static final class c extends oc.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f31042c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f31043d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f31045f;

        public c(mc.d<? super c> dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.f31043d = obj;
            this.f31045f |= Integer.MIN_VALUE;
            return d.this.a(0L, this);
        }
    }

    /* JADX INFO: renamed from: ha.d$d, reason: collision with other inner class name */
    @oc.e(c = "com.zipoapps.ads.applovin.AppLovinInterstitialManager$waitForInterstitial$2", f = "AppLovinInterstitialManager.kt", l = {95}, m = "invokeSuspend")
    public static final class C0305d extends oc.h implements p<g0, mc.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f31046c;

        public C0305d(mc.d<? super C0305d> dVar) {
            super(2, dVar);
        }

        @Override // oc.a
        public final mc.d<w> create(Object obj, mc.d<?> dVar) {
            return d.this.new C0305d(dVar);
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, mc.d<? super Boolean> dVar) {
            return d.this.new C0305d(dVar).invokeSuspend(w.f31842a);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.f31046c;
            if (i10 == 0) {
                h9.d.t(obj);
                id.l lVar = new id.l(d.this.f31012b);
                this.f31046c = 1;
                obj = z.r(lVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h9.d.t(obj);
            }
            x<MaxInterstitialAd> xVar = (x) obj;
            if (y8.c0.x(xVar)) {
                d dVar = d.this;
                KProperty<Object>[] kPropertyArr = d.f31010e;
                dVar.e().k(3, null, "waitForInterstitial()-> Interstitial received", new Object[0]);
                d.this.f31012b.setValue(xVar);
            }
            return Boolean.TRUE;
        }
    }

    static {
        t tVar = new t(d.class, "log", "getLog()Lcom/zipoapps/premiumhelper/log/TimberLogger;", 0);
        Objects.requireNonNull(b0.f36991a);
        f31010e = new cd.i[]{tVar};
    }

    public d() {
        id.n<x<MaxInterstitialAd>> nVarA = id.w.a(null);
        this.f31012b = nVarA;
        this.f31013c = z.d(nVarA);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // fa.k
    public Object a(long j10, mc.d<? super Boolean> dVar) {
        c cVar;
        d dVar2;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f31045f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f31045f = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object objC = cVar.f31043d;
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i11 = cVar.f31045f;
        if (i11 == 0) {
            h9.d.t(objC);
            C0305d c0305d = new C0305d(null);
            cVar.f31042c = this;
            cVar.f31045f = 1;
            objC = f2.c(j10, c0305d, cVar);
            if (objC == aVar) {
                return aVar;
            }
            dVar2 = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar2 = (d) cVar.f31042c;
            h9.d.t(objC);
        }
        Boolean bool = (Boolean) objC;
        boolean zBooleanValue = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            dVar2.e().k(6, null, "waitForInterstitial()-> AppLovinInterstitialManager: Can't load interstitial. Timeout reached", new Object[0]);
        }
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fa.k
    public void b(Activity activity, s sVar, boolean z10, Application application, fa.f fVar, boolean z11) {
        j0.i(application, "application");
        boolean z12 = false;
        e().k(3, null, "showInterstitialAd()-> called", new Object[0]);
        if (!d()) {
            e().k(3, null, "showInterstitialAd()-> isInterstitialLoaded = false", new Object[0]);
            c(activity, fVar, z11);
        }
        if (!((Boolean) ma.h.f33410y.a().f33418g.h(oa.b.T)).booleanValue() || d()) {
            z12 = true;
        } else {
            if (sVar != null) {
                sVar.c(new fa.n(-1, "Ad-fraud protection", ""));
            }
            e().k(5, null, "Interstitial Ad skipped due to ad-fraud protection", new Object[0]);
        }
        if (z12 && (activity instanceof androidx.lifecycle.p)) {
            y8.c0.z(androidx.activity.i.l((androidx.lifecycle.p) activity), null, null, new b(sVar, activity, fVar, z11, z10, null), 3, null);
        }
    }

    @Override // fa.k
    public void c(Activity activity, fa.f fVar, boolean z10) {
        j0.i(activity, "activity");
        j0.i(fVar, "adUnitIdProvider");
        if (this.f31014d) {
            return;
        }
        this.f31014d = true;
        y8.c0.z(c1.f29556c, null, null, new a(fVar, z10, activity, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fa.k
    public boolean d() {
        x<MaxInterstitialAd> value = this.f31012b.getValue();
        return value != null && (value instanceof x.c) && ((MaxInterstitialAd) ((x.c) value).f30417b).isReady();
    }

    public final ta.d e() {
        return this.f31011a.a(this, f31010e[0]);
    }
}
