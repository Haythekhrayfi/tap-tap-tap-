package ga;

import android.app.Activity;
import android.app.Application;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.interstitial.InterstitialAd;
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
import id.n;
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
    public static final /* synthetic */ KProperty<Object>[] f30126e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n<x<InterstitialAd>> f30127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u<x<InterstitialAd>> f30128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ta.e f30129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f30130d;

    @oc.e(c = "com.zipoapps.ads.admob.AdMobInterstitialManager$loadInterstitial$1", f = "AdMobInterstitialManager.kt", l = {59, 77}, m = "invokeSuspend")
    public static final class a extends oc.h implements p<g0, mc.d<? super w>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f30131c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f30132d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ fa.f f30134f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f30135g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Activity f30136h;

        /* JADX INFO: renamed from: ga.d$a$a, reason: collision with other inner class name */
        @oc.e(c = "com.zipoapps.ads.admob.AdMobInterstitialManager$loadInterstitial$1$result$1", f = "AdMobInterstitialManager.kt", l = {66}, m = "invokeSuspend")
        public static final class C0274a extends oc.h implements p<g0, mc.d<? super x<? extends InterstitialAd>>, Object> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f30137c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ fa.f f30138d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ boolean f30139e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ d f30140f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ Activity f30141g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0274a(fa.f fVar, boolean z10, d dVar, Activity activity, mc.d<? super C0274a> dVar2) {
                super(2, dVar2);
                this.f30138d = fVar;
                this.f30139e = z10;
                this.f30140f = dVar;
                this.f30141g = activity;
            }

            @Override // oc.a
            public final mc.d<w> create(Object obj, mc.d<?> dVar) {
                return new C0274a(this.f30138d, this.f30139e, this.f30140f, this.f30141g, dVar);
            }

            @Override // uc.p
            public Object invoke(g0 g0Var, mc.d<? super x<? extends InterstitialAd>> dVar) {
                return new C0274a(this.f30138d, this.f30139e, this.f30140f, this.f30141g, dVar).invokeSuspend(w.f31842a);
            }

            @Override // oc.a
            public final Object invokeSuspend(Object obj) {
                nc.a aVar = nc.a.COROUTINE_SUSPENDED;
                int i10 = this.f30137c;
                if (i10 == 0) {
                    h9.d.t(obj);
                    String strA = this.f30138d.a(com.zipoapps.ads.a.EnumC0215a.INTERSTITIAL, false, this.f30139e);
                    d dVar = this.f30140f;
                    KProperty<Object>[] kPropertyArr = d.f30126e;
                    dVar.e().a(a1.a("AdManager: Loading interstitial ad: (", strA, CoreConstants.RIGHT_PARENTHESIS_CHAR), new Object[0]);
                    g gVar = new g(strA);
                    Activity activity = this.f30141g;
                    this.f30137c = 1;
                    fd.k kVar = new fd.k(nc.b.c(this), 1);
                    kVar.u();
                    try {
                        InterstitialAd.load(activity, gVar.f30162a, new AdRequest.Builder().build(), new f(kVar, gVar, activity));
                    } catch (Exception e10) {
                        if (kVar.a()) {
                            jc.i.a aVar2 = jc.i.f31813c;
                            kVar.resumeWith(new x.b(e10));
                        }
                    }
                    obj = kVar.r();
                    nc.a aVar3 = nc.a.COROUTINE_SUSPENDED;
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
            this.f30134f = fVar;
            this.f30135g = z10;
            this.f30136h = activity;
        }

        @Override // oc.a
        public final mc.d<w> create(Object obj, mc.d<?> dVar) {
            return d.this.new a(this.f30134f, this.f30135g, this.f30136h, dVar);
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, mc.d<? super w> dVar) {
            return d.this.new a(this.f30134f, this.f30135g, this.f30136h, dVar).invokeSuspend(w.f31842a);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            x<InterstitialAd> xVar;
            long jCurrentTimeMillis;
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.f30132d;
            try {
                try {
                    if (i10 != 0) {
                        if (i10 == 1) {
                            jCurrentTimeMillis = this.f30131c;
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
                    if (d.this.f30127a.getValue() != null && !(d.this.f30127a.getValue() instanceof x.c)) {
                        d.this.f30127a.setValue(null);
                    }
                    va.a.f36772c.a().f36775b++;
                    jCurrentTimeMillis = System.currentTimeMillis();
                    c0 c0Var = s0.f29619a;
                    s1 s1Var = q.f32064a;
                    C0274a c0274a = new C0274a(this.f30134f, this.f30135g, d.this, this.f30136h, null);
                    this.f30131c = jCurrentTimeMillis;
                    this.f30132d = 1;
                    obj = y8.c0.V(s1Var, c0274a, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    xVar = (x) obj;
                    d.this.f30130d = false;
                    va.a.f36772c.a().b(System.currentTimeMillis() - jCurrentTimeMillis);
                } catch (Exception e10) {
                    d dVar = d.this;
                    KProperty<Object>[] kPropertyArr = d.f30126e;
                    dVar.e().k(6, e10, "AdManager: Failed to load interstitial ad", new Object[0]);
                    fa.l lVar = ma.h.f33410y.a().f33431t;
                    Objects.requireNonNull(lVar);
                    lVar.f29485a = fa.l.a.b.f29487a;
                    x.b bVar = new x.b(e10);
                    d.this.f30130d = false;
                    va.a.f36772c.a().b(System.currentTimeMillis() - jCurrentTimeMillis);
                    xVar = bVar;
                }
                fa.l lVar2 = ma.h.f33410y.a().f33431t;
                Objects.requireNonNull(lVar2);
                lVar2.f29485a = fa.l.a.C0258a.f29486a;
                n<x<InterstitialAd>> nVar = d.this.f30127a;
                this.f30132d = 2;
                if (nVar.emit(xVar, this) == aVar) {
                    return aVar;
                }
                return w.f31842a;
            } catch (Throwable th) {
                d.this.f30130d = false;
                va.a.f36772c.a().b(System.currentTimeMillis() - jCurrentTimeMillis);
                throw th;
            }
        }
    }

    @oc.e(c = "com.zipoapps.ads.admob.AdMobInterstitialManager$showInterstitialAd$1", f = "AdMobInterstitialManager.kt", l = {116, 119, 150, 157}, m = "invokeSuspend")
    public static final class b extends oc.h implements p<g0, mc.d<? super w>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f30142c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f30143d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f30145f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Activity f30146g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ fa.f f30147h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ boolean f30148i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ s f30149j;

        public static final class a extends FullScreenContentCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ s f30150a;

            public a(s sVar) {
                this.f30150a = sVar;
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdClicked() {
                s sVar = this.f30150a;
                if (sVar != null) {
                    sVar.a();
                }
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdDismissedFullScreenContent() {
                s sVar = this.f30150a;
                if (sVar != null) {
                    sVar.b();
                }
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdFailedToShowFullScreenContent(AdError adError) {
                j0.i(adError, "error");
                s sVar = this.f30150a;
                if (sVar != null) {
                    int code = adError.getCode();
                    String message = adError.getMessage();
                    j0.h(message, "error.message");
                    String domain = adError.getDomain();
                    j0.h(domain, "error.domain");
                    sVar.c(new fa.n(code, message, domain));
                }
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdImpression() {
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdShowedFullScreenContent() {
                s sVar = this.f30150a;
                if (sVar != null) {
                    sVar.d();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z10, Activity activity, fa.f fVar, boolean z11, s sVar, mc.d<? super b> dVar) {
            super(2, dVar);
            this.f30145f = z10;
            this.f30146g = activity;
            this.f30147h = fVar;
            this.f30148i = z11;
            this.f30149j = sVar;
        }

        @Override // oc.a
        public final mc.d<w> create(Object obj, mc.d<?> dVar) {
            return d.this.new b(this.f30145f, this.f30146g, this.f30147h, this.f30148i, this.f30149j, dVar);
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, mc.d<? super w> dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(w.f31842a);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0077  */
        /* JADX WARN: Code duplicated, block: B:26:0x0083 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:27:0x0084  */
        /* JADX WARN: Code duplicated, block: B:39:0x00af  */
        /* JADX WARN: Code duplicated, block: B:43:0x00be  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            x xVar;
            InterstitialAd interstitialAd;
            InterstitialAd interstitialAd2;
            s sVar;
            Exception exc;
            String message;
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.f30143d;
            if (i10 == 0) {
                h9.d.t(obj);
                id.l lVar = new id.l(d.this.f30128b);
                this.f30143d = 1;
                obj = z.r(lVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    if (i10 == 2) {
                        InterstitialAd interstitialAd3 = (InterstitialAd) this.f30142c;
                        h9.d.t(obj);
                        interstitialAd = interstitialAd3;
                        interstitialAd.setFullScreenContentCallback(new a(this.f30149j));
                        if (this.f30145f) {
                            this.f30142c = interstitialAd;
                            this.f30143d = 3;
                            if (z.m(1000L, this) == aVar) {
                                return aVar;
                            }
                            interstitialAd2 = interstitialAd;
                        }
                        interstitialAd.show(this.f30146g);
                        d.this.c(this.f30146g, this.f30147h, this.f30148i);
                        return w.f31842a;
                    }
                    if (i10 != 3) {
                        if (i10 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        xVar = (x) this.f30142c;
                        h9.d.t(obj);
                        sVar = this.f30149j;
                        if (sVar != null) {
                            exc = ((x.b) xVar).f30416b;
                            if (exc != null || (message = exc.getMessage()) == null) {
                                message = "";
                            }
                            sVar.c(new fa.n(-1, message, AdError.UNDEFINED_DOMAIN));
                        }
                        d.this.c(this.f30146g, this.f30147h, this.f30148i);
                        return w.f31842a;
                    }
                    interstitialAd2 = (InterstitialAd) this.f30142c;
                    h9.d.t(obj);
                    interstitialAd = interstitialAd2;
                    interstitialAd.show(this.f30146g);
                    d.this.c(this.f30146g, this.f30147h, this.f30148i);
                    return w.f31842a;
                }
                h9.d.t(obj);
            }
            x xVar2 = (x) obj;
            if (xVar2 instanceof x.c) {
                interstitialAd = (InterstitialAd) ((x.c) xVar2).f30417b;
                n<x<InterstitialAd>> nVar = d.this.f30127a;
                this.f30142c = interstitialAd;
                this.f30143d = 2;
                if (nVar.emit(null, this) == aVar) {
                    return aVar;
                }
                interstitialAd.setFullScreenContentCallback(new a(this.f30149j));
                if (this.f30145f) {
                    this.f30142c = interstitialAd;
                    this.f30143d = 3;
                    if (z.m(1000L, this) == aVar) {
                        return aVar;
                    }
                    interstitialAd2 = interstitialAd;
                    interstitialAd = interstitialAd2;
                }
                interstitialAd.show(this.f30146g);
                d.this.c(this.f30146g, this.f30147h, this.f30148i);
            } else if (xVar2 instanceof x.b) {
                n<x<InterstitialAd>> nVar2 = d.this.f30127a;
                this.f30142c = xVar2;
                this.f30143d = 4;
                if (nVar2.emit(null, this) == aVar) {
                    return aVar;
                }
                xVar = xVar2;
                sVar = this.f30149j;
                if (sVar != null) {
                    exc = ((x.b) xVar).f30416b;
                    if (exc != null) {
                        message = "";
                    } else {
                        message = "";
                    }
                    sVar.c(new fa.n(-1, message, AdError.UNDEFINED_DOMAIN));
                }
                d.this.c(this.f30146g, this.f30147h, this.f30148i);
            }
            return w.f31842a;
        }
    }

    @oc.e(c = "com.zipoapps.ads.admob.AdMobInterstitialManager", f = "AdMobInterstitialManager.kt", l = {90}, m = "waitForInterstitial")
    public static final class c extends oc.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f30151c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f30152d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f30154f;

        public c(mc.d<? super c> dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.f30152d = obj;
            this.f30154f |= Integer.MIN_VALUE;
            return d.this.a(0L, this);
        }
    }

    /* JADX INFO: renamed from: ga.d$d, reason: collision with other inner class name */
    @oc.e(c = "com.zipoapps.ads.admob.AdMobInterstitialManager$waitForInterstitial$2", f = "AdMobInterstitialManager.kt", l = {91}, m = "invokeSuspend")
    public static final class C0275d extends oc.h implements p<g0, mc.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f30155c;

        public C0275d(mc.d<? super C0275d> dVar) {
            super(2, dVar);
        }

        @Override // oc.a
        public final mc.d<w> create(Object obj, mc.d<?> dVar) {
            return d.this.new C0275d(dVar);
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, mc.d<? super Boolean> dVar) {
            return d.this.new C0275d(dVar).invokeSuspend(w.f31842a);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.f30155c;
            if (i10 == 0) {
                h9.d.t(obj);
                id.l lVar = new id.l(d.this.f30127a);
                this.f30155c = 1;
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
            x<InterstitialAd> xVar = (x) obj;
            if (y8.c0.x(xVar)) {
                d.this.f30127a.setValue(xVar);
            }
            return Boolean.TRUE;
        }
    }

    static {
        t tVar = new t(d.class, "log", "getLog()Lcom/zipoapps/premiumhelper/log/TimberLogger;", 0);
        Objects.requireNonNull(b0.f36991a);
        f30126e = new cd.i[]{tVar};
    }

    public d() {
        n<x<InterstitialAd>> nVarA = id.w.a(null);
        this.f30127a = nVarA;
        this.f30128b = z.d(nVarA);
        this.f30129c = new ta.e("PremiumHelper");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // fa.k
    public Object a(long j10, mc.d<? super Boolean> dVar) {
        c cVar;
        d dVar2;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f30154f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f30154f = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object objC = cVar.f30152d;
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i11 = cVar.f30154f;
        if (i11 == 0) {
            h9.d.t(objC);
            C0275d c0275d = new C0275d(null);
            cVar.f30151c = this;
            cVar.f30154f = 1;
            objC = f2.c(j10, c0275d, cVar);
            if (objC == aVar) {
                return aVar;
            }
            dVar2 = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar2 = (d) cVar.f30151c;
            h9.d.t(objC);
        }
        Boolean bool = (Boolean) objC;
        boolean zBooleanValue = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            dVar2.e().k(6, null, "Can't load interstitial. Timeout reached", new Object[0]);
        }
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fa.k
    public void b(Activity activity, s sVar, boolean z10, Application application, fa.f fVar, boolean z11) {
        boolean z12;
        j0.i(application, "application");
        if (!d()) {
            c(activity, fVar, z11);
        }
        if (!((Boolean) ma.h.f33410y.a().f33418g.h(oa.b.T)).booleanValue() || d()) {
            z12 = true;
        } else {
            if (sVar != null) {
                sVar.c(new fa.n(-1, "Ad-fraud protection", ""));
            }
            z12 = false;
            e().k(5, null, "Interstitial Ad skipped due to ad-fraud protection", new Object[0]);
        }
        if (z12 && (activity instanceof androidx.lifecycle.p)) {
            y8.c0.z(androidx.activity.i.l((androidx.lifecycle.p) activity), null, null, new b(z10, activity, fVar, z11, sVar, null), 3, null);
        }
    }

    @Override // fa.k
    public void c(Activity activity, fa.f fVar, boolean z10) {
        j0.i(activity, "activity");
        j0.i(fVar, "adUnitIdProvider");
        Log.d("SHUHI_TEST", "load interstitial ");
        if (this.f30130d) {
            return;
        }
        this.f30130d = true;
        y8.c0.z(c1.f29556c, null, null, new a(fVar, z10, activity, null), 3, null);
    }

    @Override // fa.k
    public boolean d() {
        x<InterstitialAd> value = this.f30127a.getValue();
        if (value != null) {
            return value instanceof x.c;
        }
        return false;
    }

    public final ta.d e() {
        return this.f30129c.a(this, f30126e[0]);
    }
}
