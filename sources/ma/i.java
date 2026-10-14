package ma;

import ab.c;
import ab.i;
import ab.o;
import ab.q;
import android.app.Application;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import androidx.lifecycle.a0;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.tasks.Tasks;
import com.zipoapps.premiumhelper.performance.StartupPerformanceTracker;
import com.zipoapps.premiumhelper.toto.TotoFeature;
import fd.c1;
import fd.g0;
import fd.j0;
import fd.m0;
import fd.n0;
import fd.s0;
import fd.s1;
import fd.z;
import gb.b0;
import gb.d0;
import gb.e0;
import gb.x;
import java.util.List;
import java.util.Objects;
import jc.w;
import ma.h;
import mc.d;
import oc.e;
import uc.p;
import vc.l;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
@oc.e(c = "com.zipoapps.premiumhelper.PremiumHelper$doInitialize$2", f = "PremiumHelper.kt", l = {956, 958, 961, 970, 974, 975}, m = "invokeSuspend")
public final class i extends oc.h implements uc.p<g0, mc.d<? super w>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f33457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f33458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f33459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h f33460f;

    @oc.e(c = "com.zipoapps.premiumhelper.PremiumHelper$doInitialize$2$1", f = "PremiumHelper.kt", l = {945}, m = "invokeSuspend")
    public static final class a extends oc.h implements uc.p<g0, mc.d<? super w>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f33461c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ h f33462d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h hVar, mc.d<? super a> dVar) {
            super(2, dVar);
            this.f33462d = hVar;
        }

        @Override // oc.a
        public final mc.d<w> create(Object obj, mc.d<?> dVar) {
            return new a(this.f33462d, dVar);
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, mc.d<? super w> dVar) {
            return new a(this.f33462d, dVar).invokeSuspend(w.f31842a);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.f33461c;
            if (i10 == 0) {
                h9.d.t(obj);
                h hVar = this.f33462d;
                this.f33461c = 1;
                if (h.a(hVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h9.d.t(obj);
            }
            return w.f31842a;
        }
    }

    @oc.e(c = "com.zipoapps.premiumhelper.PremiumHelper$doInitialize$2$2", f = "PremiumHelper.kt", l = {968}, m = "invokeSuspend")
    public static final class b extends oc.h implements uc.p<g0, mc.d<? super w>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f33463c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ h f33464d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h hVar, mc.d<? super b> dVar) {
            super(2, dVar);
            this.f33464d = hVar;
        }

        @Override // oc.a
        public final mc.d<w> create(Object obj, mc.d<?> dVar) {
            return new b(this.f33464d, dVar);
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, mc.d<? super w> dVar) {
            return new b(this.f33464d, dVar).invokeSuspend(w.f31842a);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.f33463c;
            if (i10 == 0) {
                h9.d.t(obj);
                if (!((Boolean) this.f33464d.f33418g.h(oa.b.f34192q0)).booleanValue()) {
                    xe.a.b("STARTUP_LOGS").a("AdManager async init disabled. Waiting for initialization to complete", new Object[0]);
                    com.zipoapps.ads.a aVar2 = this.f33464d.f33421j;
                    this.f33463c = 1;
                    if (aVar2.l(this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h9.d.t(obj);
            }
            return w.f31842a;
        }
    }

    @oc.e(c = "com.zipoapps.premiumhelper.PremiumHelper$doInitialize$2$3", f = "PremiumHelper.kt", l = {}, m = "invokeSuspend")
    public static final class c extends oc.h implements uc.p<g0, mc.d<? super w>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h f33465c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(h hVar, mc.d<? super c> dVar) {
            super(2, dVar);
            this.f33465c = hVar;
        }

        @Override // oc.a
        public final mc.d<w> create(Object obj, mc.d<?> dVar) {
            return new c(this.f33465c, dVar);
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, mc.d<? super w> dVar) {
            c cVar = new c(this.f33465c, dVar);
            w wVar = w.f31842a;
            cVar.invokeSuspend(wVar);
            return wVar;
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            h9.d.t(obj);
            final h hVar = this.f33465c;
            h.a aVar2 = h.f33410y;
            Objects.requireNonNull(hVar);
            a0.f2161k.f2167h.a(new androidx.lifecycle.c() { // from class: com.zipoapps.premiumhelper.PremiumHelper$registerProcessLifecycleCallbacks$1

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public boolean f28244c;

                public static final class a extends l implements uc.a<w> {

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ h f28246c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public a(h hVar) {
                        super(0);
                        this.f28246c = hVar;
                    }

                    @Override // uc.a
                    public w invoke() {
                        c0.z(c1.f29556c, null, null, new com.zipoapps.premiumhelper.b(this.f28246c, null), 3, null);
                        return w.f31842a;
                    }
                }

                @e(c = "com.zipoapps.premiumhelper.PremiumHelper$registerProcessLifecycleCallbacks$1$onStart$2", f = "PremiumHelper.kt", l = {1029}, m = "invokeSuspend")
                public static final class b extends oc.h implements p<g0, d<? super w>, Object> {

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public int f28247c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ h f28248d;

                    @e(c = "com.zipoapps.premiumhelper.PremiumHelper$registerProcessLifecycleCallbacks$1$onStart$2$1", f = "PremiumHelper.kt", l = {1030}, m = "invokeSuspend")
                    public static final class a extends oc.h implements uc.l<d<? super w>, Object> {

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public int f28249c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        public final /* synthetic */ h f28250d;

                        /* JADX INFO: renamed from: com.zipoapps.premiumhelper.PremiumHelper$registerProcessLifecycleCallbacks$1$b$a$a, reason: collision with other inner class name */
                        public static final class C0234a extends l implements uc.l<Object, w> {

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final /* synthetic */ h f28251c;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public C0234a(h hVar) {
                                super(1);
                                this.f28251c = hVar;
                            }

                            @Override // uc.l
                            public w invoke(Object obj) {
                                j0.i(obj, "it");
                                this.f28251c.f33434w.b();
                                this.f28251c.f33417f.o("toto_get_config_timestamp", Long.valueOf(System.currentTimeMillis()));
                                this.f28251c.f33427p.v();
                                return w.f31842a;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public a(h hVar, d<? super a> dVar) {
                            super(1, dVar);
                            this.f28250d = hVar;
                        }

                        @Override // oc.a
                        public final d<w> create(d<?> dVar) {
                            return new a(this.f28250d, dVar);
                        }

                        @Override // uc.l
                        public Object invoke(d<? super w> dVar) {
                            return new a(this.f28250d, dVar).invokeSuspend(w.f31842a);
                        }

                        @Override // oc.a
                        public final Object invokeSuspend(Object obj) {
                            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
                            int i10 = this.f28249c;
                            if (i10 == 0) {
                                h9.d.t(obj);
                                TotoFeature totoFeature = this.f28250d.f33426o;
                                this.f28249c = 1;
                                obj = totoFeature.getConfig(this);
                                if (obj == aVar) {
                                    return aVar;
                                }
                            } else {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                h9.d.t(obj);
                            }
                            c0.D((x) obj, new C0234a(this.f28250d));
                            return w.f31842a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public b(h hVar, d<? super b> dVar) {
                        super(2, dVar);
                        this.f28248d = hVar;
                    }

                    @Override // oc.a
                    public final d<w> create(Object obj, d<?> dVar) {
                        return new b(this.f28248d, dVar);
                    }

                    @Override // uc.p
                    public Object invoke(g0 g0Var, d<? super w> dVar) {
                        return new b(this.f28248d, dVar).invokeSuspend(w.f31842a);
                    }

                    @Override // oc.a
                    public final Object invokeSuspend(Object obj) {
                        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
                        int i10 = this.f28247c;
                        if (i10 == 0) {
                            h9.d.t(obj);
                            h hVar = this.f28248d;
                            d0 d0Var = hVar.f33434w;
                            a aVar2 = new a(hVar, null);
                            this.f28247c = 1;
                            Objects.requireNonNull(d0Var);
                            Object objA = d0Var.a(aVar2, new e0(null), this);
                            if (objA != aVar) {
                                objA = w.f31842a;
                            }
                            if (objA == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h9.d.t(obj);
                        }
                        return w.f31842a;
                    }
                }

                @Override // androidx.lifecycle.c, androidx.lifecycle.f
                public void b(androidx.lifecycle.p pVar) {
                    j0.i(pVar, "owner");
                    this.f28244c = true;
                }

                @Override // androidx.lifecycle.c, androidx.lifecycle.f
                public void d(androidx.lifecycle.p pVar) {
                    w wVar;
                    j0.i(pVar, "owner");
                    h hVar2 = hVar;
                    h.a aVar3 = h.f33410y;
                    hVar2.g().k(4, null, " *********** APP IS BACKGROUND *********** ", new Object[0]);
                    this.f28244c = false;
                    ab.a aVar4 = hVar.f33423l;
                    gb.b bVar = aVar4.f264c;
                    if (bVar != null) {
                        aVar4.f262a.unregisterActivityLifecycleCallbacks(bVar);
                        aVar4.f264c = null;
                        aVar4.f270i = true;
                        xe.a.b(ab.a.f261j).l("AutoInterstitial callback destroyed.", new Object[0]);
                    }
                    com.zipoapps.ads.a aVar5 = hVar.f33421j;
                    do {
                        Object objR = aVar5.f28037n.r();
                        hd.h.b bVar2 = hd.h.f31100b;
                        if (objR instanceof hd.h.c) {
                            objR = null;
                        }
                        NativeAd nativeAd = (NativeAd) objR;
                        if (nativeAd != null) {
                            ta.d dVarD = aVar5.d();
                            StringBuilder sbA = defpackage.a.a("AdManager: Destroying native ad: ");
                            sbA.append(nativeAd.getHeadline());
                            dVarD.a(sbA.toString(), new Object[0]);
                            nativeAd.destroy();
                            wVar = w.f31842a;
                        } else {
                            wVar = null;
                        }
                    } while (wVar != null);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v20, types: [T, android.app.Application$ActivityLifecycleCallbacks, gb.c] */
                @Override // androidx.lifecycle.c, androidx.lifecycle.f
                public void f(androidx.lifecycle.p pVar) {
                    Application application;
                    ab.d dVar;
                    boolean z10;
                    j0.i(pVar, "owner");
                    h hVar2 = hVar;
                    h.a aVar3 = h.f33410y;
                    ta.d dVarG = hVar2.g();
                    StringBuilder sbA = defpackage.a.a(" *********** APP IS FOREGROUND: ");
                    sbA.append(hVar.f33417f.h());
                    sbA.append(" COLD START: ");
                    sbA.append(this.f28244c);
                    sbA.append(" *********** ");
                    dVarG.g(sbA.toString(), new Object[0]);
                    if (hVar.i()) {
                        h hVar3 = hVar;
                        b0 b0Var = hVar3.f33433v;
                        a aVar4 = new a(hVar3);
                        Objects.requireNonNull(b0Var);
                        b0Var.a(aVar4, gb.c0.f30190c);
                    } else {
                        com.zipoapps.ads.a aVar5 = hVar.f33421j;
                        ia.a aVar6 = aVar5.f28031h;
                        if (aVar6 == null) {
                            aVar6 = new ia.a(aVar5, aVar5.f28024a);
                        }
                        aVar5.f28031h = aVar6;
                        if (!aVar6.c()) {
                            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = aVar6.f31512d;
                            if (activityLifecycleCallbacks != null) {
                                aVar6.f31510b.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
                            }
                        } else if (aVar6.f31512d == null) {
                            ia.b bVar = new ia.b(aVar6);
                            aVar6.f31512d = bVar;
                            aVar6.f31510b.registerActivityLifecycleCallbacks(bVar);
                        }
                        ab.a aVar7 = hVar.f33423l;
                        if (aVar7.f270i) {
                            aVar7.a();
                        }
                    }
                    if (!this.f28244c && hVar.f33418g.m()) {
                        c0.z(c1.f29556c, null, null, new b(hVar, null), 3, null);
                    }
                    if (hVar.f33418g.g(oa.b.H) == oa.b.EnumC0377b.SESSION && !hVar.f33417f.l()) {
                        hVar.f().f30186b = 0L;
                    }
                    if (hVar.f33417f.f33405a.getInt("app_start_counter", 0) == 0) {
                        Application application2 = hVar.f33412a;
                        j0.i(application2, CoreConstants.CONTEXT_SCOPE_VALUE);
                        try {
                            PackageInfo packageInfo = application2.getPackageManager().getPackageInfo(application2.getPackageName(), 0);
                            z10 = packageInfo.firstInstallTime != packageInfo.lastUpdateTime;
                        } catch (Throwable unused) {
                        }
                        if (z10) {
                            hVar.g().k(5, null, "App was just updated - skipping onboarding and intro!", new Object[0]);
                            h hVar4 = hVar;
                            hVar4.f33419h.j(hVar4.f33420i);
                            hVar.f33417f.k();
                            hVar.f33417f.q();
                            hVar.f33417f.o("intro_complete", Boolean.TRUE);
                            c.f(hVar.f33422k, null, true, 1);
                            return;
                        }
                    }
                    if (hVar.f33417f.l()) {
                        SharedPreferences.Editor editorEdit = hVar.f33417f.f33405a.edit();
                        editorEdit.putBoolean("is_next_app_start_ignored", false);
                        editorEdit.apply();
                        return;
                    }
                    h hVar5 = hVar;
                    hVar5.f33419h.j(hVar5.f33420i);
                    c cVar = hVar.f33422k;
                    int iK = cVar.f279b.f33405a.getBoolean("is_onboarding_complete", false) && (cVar.f279b.h() > 0 || h.f33410y.a().l()) ? cVar.f279b.k() : 0;
                    c.f277j = false;
                    cVar.f282e = false;
                    cVar.f283f = false;
                    cVar.f284g = false;
                    if (cVar.f279b.j()) {
                        boolean z11 = iK == 0;
                        application = cVar.f278a;
                        dVar = new ab.d(new q(cVar, z11));
                    } else {
                        if (iK > 0) {
                            if (((Boolean) cVar.f280c.h(oa.b.B)).booleanValue()) {
                                cVar.f278a.registerActivityLifecycleCallbacks(new ab.d(new i(cVar)));
                                return;
                            }
                            vc.a0 a0Var = new vc.a0();
                            ?? cVar2 = new gb.c(cVar.f280c.f34205b.getMainActivityClass(), new ab.h(cVar, a0Var));
                            a0Var.f36988c = cVar2;
                            cVar.f278a.registerActivityLifecycleCallbacks(cVar2);
                            return;
                        }
                        if (((Boolean) cVar.f280c.h(oa.b.A)).booleanValue()) {
                            cVar.f278a.registerActivityLifecycleCallbacks(new ab.d(new o(cVar)));
                            return;
                        } else if (((Number) cVar.f280c.h(oa.b.f34199v)).longValue() != 0) {
                            c.f(cVar, null, true, 1);
                            return;
                        } else {
                            application = cVar.f278a;
                            dVar = new ab.d(new q(cVar, true));
                        }
                    }
                    application.registerActivityLifecycleCallbacks(dVar);
                }
            });
            this.f33465c.f33423l.a();
            return w.f31842a;
        }
    }

    @oc.e(c = "com.zipoapps.premiumhelper.PremiumHelper$doInitialize$2$getPurchasesTask$1", f = "PremiumHelper.kt", l = {950}, m = "invokeSuspend")
    public static final class d extends oc.h implements uc.p<g0, mc.d<? super w>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f33466c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ h f33467d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(h hVar, mc.d<? super d> dVar) {
            super(2, dVar);
            this.f33467d = hVar;
        }

        @Override // oc.a
        public final mc.d<w> create(Object obj, mc.d<?> dVar) {
            return new d(this.f33467d, dVar);
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, mc.d<? super w> dVar) {
            return new d(this.f33467d, dVar).invokeSuspend(w.f31842a);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.f33466c;
            if (i10 == 0) {
                h9.d.t(obj);
                h hVar = this.f33467d;
                this.f33466c = 1;
                if (h.b(hVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h9.d.t(obj);
            }
            return w.f31842a;
        }
    }

    @oc.e(c = "com.zipoapps.premiumhelper.PremiumHelper$doInitialize$2$remoteConfigTask$1", f = "PremiumHelper.kt", l = {947}, m = "invokeSuspend")
    public static final class e extends oc.h implements uc.p<g0, mc.d<? super w>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f33468c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ h f33469d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(h hVar, mc.d<? super e> dVar) {
            super(2, dVar);
            this.f33469d = hVar;
        }

        @Override // oc.a
        public final mc.d<w> create(Object obj, mc.d<?> dVar) {
            return new e(this.f33469d, dVar);
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, mc.d<? super w> dVar) {
            return new e(this.f33469d, dVar).invokeSuspend(w.f31842a);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            com.google.firebase.remoteconfig.a aVarB;
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.f33468c;
            if (i10 == 0) {
                h9.d.t(obj);
                h hVar = this.f33469d;
                this.f33468c = 1;
                qa.a aVar2 = hVar.f33414c;
                Application application = hVar.f33412a;
                boolean zL = hVar.f33418g.l();
                aVar2.f34854c = zL;
                try {
                    aVarB = com.google.firebase.remoteconfig.a.b();
                } catch (IllegalStateException unused) {
                    u4.d.e(application);
                    aVarB = com.google.firebase.remoteconfig.a.b();
                }
                j0.h(aVarB, "try {\n        FirebaseRe…onfig.getInstance()\n    }");
                aVar2.f34852a = aVarB;
                StartupPerformanceTracker.StartupData startupData = StartupPerformanceTracker.f28309b.a().f28311a;
                if (startupData != null) {
                    startupData.setRemoteConfigStartTimestamp(System.currentTimeMillis());
                }
                fd.k kVar = new fd.k(nc.b.c(this), 1);
                kVar.u();
                try {
                    h6.f.b bVar = new h6.f.b();
                    long j10 = zL ? 0L : 43200L;
                    if (j10 < 0) {
                        throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j10 + " is an invalid argument");
                    }
                    bVar.f30933b = j10;
                    h6.f fVar = new h6.f(bVar, null);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    com.google.firebase.remoteconfig.a aVar3 = aVar2.f34852a;
                    if (aVar3 == null) {
                        j0.r("firebaseRemoteConfig");
                        throw null;
                    }
                    Tasks.call(aVar3.f12664b, new d6.i(aVar3, fVar)).continueWithTask(new qa.c(aVar2, jCurrentTimeMillis, zL, kVar));
                    Object objR = kVar.r();
                    nc.a aVar4 = nc.a.COROUTINE_SUSPENDED;
                    if (objR == aVar4) {
                        j0.i(this, "frame");
                    }
                    if (objR != aVar4) {
                        objR = w.f31842a;
                    }
                    if (objR == aVar) {
                        return aVar;
                    }
                } catch (Throwable th) {
                    StartupPerformanceTracker.StartupData startupData2 = StartupPerformanceTracker.f28309b.a().f28311a;
                    if (startupData2 != null) {
                        startupData2.setRemoteConfigEndTimestamp(System.currentTimeMillis());
                    }
                    if (kVar.a()) {
                        jc.i.a aVar5 = jc.i.f31813c;
                        kVar.resumeWith(h9.d.f(th));
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h9.d.t(obj);
            }
            return w.f31842a;
        }
    }

    @oc.e(c = "com.zipoapps.premiumhelper.PremiumHelper$doInitialize$2$testyConfigTask$1", f = "PremiumHelper.kt", l = {949}, m = "invokeSuspend")
    public static final class f extends oc.h implements uc.p<g0, mc.d<? super w>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f33470c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ h f33471d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(h hVar, mc.d<? super f> dVar) {
            super(2, dVar);
            this.f33471d = hVar;
        }

        @Override // oc.a
        public final mc.d<w> create(Object obj, mc.d<?> dVar) {
            return new f(this.f33471d, dVar);
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, mc.d<? super w> dVar) {
            return new f(this.f33471d, dVar).invokeSuspend(w.f31842a);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.f33470c;
            if (i10 == 0) {
                h9.d.t(obj);
                h hVar = this.f33471d;
                this.f33470c = 1;
                if (h.c(hVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h9.d.t(obj);
            }
            return w.f31842a;
        }
    }

    @oc.e(c = "com.zipoapps.premiumhelper.PremiumHelper$doInitialize$2$totoConfigTask$1", f = "PremiumHelper.kt", l = {948}, m = "invokeSuspend")
    public static final class g extends oc.h implements uc.p<g0, mc.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f33472c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ h f33473d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(h hVar, mc.d<? super g> dVar) {
            super(2, dVar);
            this.f33473d = hVar;
        }

        @Override // oc.a
        public final mc.d<w> create(Object obj, mc.d<?> dVar) {
            return new g(this.f33473d, dVar);
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, mc.d<? super Boolean> dVar) {
            return new g(this.f33473d, dVar).invokeSuspend(w.f31842a);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.f33472c;
            if (i10 == 0) {
                h9.d.t(obj);
                h hVar = this.f33473d;
                this.f33472c = 1;
                obj = h.d(hVar, this);
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
    public i(h hVar, mc.d<? super i> dVar) {
        super(2, dVar);
        this.f33460f = hVar;
    }

    @Override // oc.a
    public final mc.d<w> create(Object obj, mc.d<?> dVar) {
        i iVar = new i(this.f33460f, dVar);
        iVar.f33459e = obj;
        return iVar;
    }

    @Override // uc.p
    public Object invoke(g0 g0Var, mc.d<? super w> dVar) {
        i iVar = new i(this.f33460f, dVar);
        iVar.f33459e = g0Var;
        return iVar.invokeSuspend(w.f31842a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:28:0x0110 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x0127  */
    /* JADX WARN: Code duplicated, block: B:35:0x0134  */
    /* JADX WARN: Code duplicated, block: B:39:0x0148  */
    /* JADX WARN: Code duplicated, block: B:41:0x014c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x016c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:50:0x01ab A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x01c0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:62:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:66:0x01fc  */
    @Override // oc.a
    public final Object invokeSuspend(Object obj) {
        m0 m0Var;
        List listC;
        Object objA;
        g0 g0Var;
        m0 m0Var2;
        g0 g0Var2;
        Object objEmit;
        m0 m0VarE;
        Object objL;
        s1 s1Var;
        c cVar;
        h hVar;
        StartupPerformanceTracker.StartupData startupData;
        StartupPerformanceTracker.StartupData startupData2;
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        switch (this.f33458d) {
            case 0:
                h9.d.t(obj);
                g0 g0Var3 = (g0) this.f33459e;
                c0.e(g0Var3, s0.f29619a, null, new a(this.f33460f, null), 2, null);
                fd.c0 c0Var = s0.f29620b;
                m0 m0VarE2 = c0.e(g0Var3, c0Var, null, new e(this.f33460f, null), 2, null);
                m0 m0VarE3 = c0.e(g0Var3, c0Var, null, new g(this.f33460f, null), 2, null);
                m0 m0VarE4 = c0.e(g0Var3, c0Var, null, new f(this.f33460f, null), 2, null);
                m0 m0VarE5 = c0.e(g0Var3, c0Var, null, new d(this.f33460f, null), 2, null);
                if (this.f33460f.f33418g.m()) {
                    listC = kc.l.c(m0VarE3, m0VarE4, m0VarE5);
                    m0Var = m0VarE2;
                } else {
                    m0Var = m0VarE2;
                    listC = kc.l.c(m0VarE3, m0Var, m0VarE4, m0VarE5);
                }
                this.f33459e = g0Var3;
                this.f33457c = m0Var;
                this.f33458d = 1;
                if (listC.isEmpty()) {
                    objA = kc.w.f32009c;
                } else {
                    Object[] array = listC.toArray(new m0[0]);
                    Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    objA = new fd.c((m0[]) array).a(this);
                }
                if (objA == aVar) {
                    return aVar;
                }
                g0Var = g0Var3;
                m0Var2 = m0Var;
                if (j0.d(((List) objA).get(0), Boolean.FALSE)) {
                    xe.a.f37601c.b("Failed to initialize toto config. Waiting to RemoteConfig", new Object[0]);
                    this.f33459e = g0Var;
                    this.f33457c = null;
                    this.f33458d = 2;
                    if (m0Var2.T(this) == aVar) {
                        return aVar;
                    }
                }
                g0Var2 = g0Var;
                xe.a.f37601c.a("Configuration is ready", new Object[0]);
                h hVar2 = this.f33460f;
                com.zipoapps.ads.a aVar2 = hVar2.f33421j;
                boolean z10 = !hVar2.f33418g.l() && this.f33460f.f33418g.f34205b.getAdManagerTestAds();
                this.f33459e = g0Var2;
                this.f33457c = null;
                this.f33458d = 3;
                aVar2.f28027d = z10;
                objEmit = aVar2.f28035l.emit(Boolean.TRUE, this);
                if (objEmit != aVar) {
                    objEmit = w.f31842a;
                }
                if (objEmit == aVar) {
                    return aVar;
                }
                g0 g0Var4 = g0Var2;
                System.currentTimeMillis();
                m0VarE = c0.e(g0Var4, s0.f29620b, null, new b(this.f33460f, null), 2, null);
                this.f33459e = null;
                this.f33458d = 4;
                if (((n0) m0VarE).F(this) == aVar) {
                    return aVar;
                }
                this.f33460f.f33427p.v();
                y1.k kVarC = y1.k.c(this.f33460f.f33412a);
                Objects.requireNonNull(kVarC);
                ((j2.b) kVarC.f38011d).f31695a.execute(new h2.b(kVarC, "InitWorker"));
                com.zipoapps.premiumhelper.util.b bVar = new com.zipoapps.premiumhelper.util.b(this.f33460f.f33412a);
                this.f33458d = 5;
                objL = z.l(new com.zipoapps.premiumhelper.util.a(bVar, null), this);
                if (objL != aVar) {
                    objL = w.f31842a;
                }
                if (objL == aVar) {
                    return aVar;
                }
                fd.c0 c0Var2 = s0.f29619a;
                s1Var = kd.q.f32064a;
                cVar = new c(this.f33460f, null);
                this.f33458d = 6;
                if (c0.V(s1Var, cVar, this) == aVar) {
                    return aVar;
                }
                hVar = this.f33460f;
                h.a aVar3 = h.f33410y;
                if (hVar.k() && com.zipoapps.ads.a.f28023p.contains(hVar.f33421j.f28028e)) {
                    new gb.a0(hVar.f33412a).f30182d = new k(hVar);
                }
                StartupPerformanceTracker startupPerformanceTrackerA = StartupPerformanceTracker.f28309b.a();
                startupData = startupPerformanceTrackerA.f28311a;
                if (startupData != null) {
                    startupData.setLaunchedByUser(startupData.isSplashScreenShown());
                }
                startupData2 = startupPerformanceTrackerA.f28311a;
                if (startupData2 != null) {
                    startupData2.setPhEndTimestamp(System.currentTimeMillis());
                }
                this.f33460f.f33428q.setValue(Boolean.TRUE);
                return w.f31842a;
            case 1:
                m0Var2 = (m0) this.f33457c;
                g0 g0Var5 = (g0) this.f33459e;
                h9.d.t(obj);
                g0Var = g0Var5;
                objA = obj;
                if (j0.d(((List) objA).get(0), Boolean.FALSE)) {
                    xe.a.f37601c.b("Failed to initialize toto config. Waiting to RemoteConfig", new Object[0]);
                    this.f33459e = g0Var;
                    this.f33457c = null;
                    this.f33458d = 2;
                    if (m0Var2.T(this) == aVar) {
                        return aVar;
                    }
                }
                g0Var2 = g0Var;
                xe.a.f37601c.a("Configuration is ready", new Object[0]);
                h hVar3 = this.f33460f;
                com.zipoapps.ads.a aVar4 = hVar3.f33421j;
                if (hVar3.f33418g.l()) {
                }
                this.f33459e = g0Var2;
                this.f33457c = null;
                this.f33458d = 3;
                aVar4.f28027d = z10;
                objEmit = aVar4.f28035l.emit(Boolean.TRUE, this);
                if (objEmit != aVar) {
                    objEmit = w.f31842a;
                }
                if (objEmit == aVar) {
                    return aVar;
                }
                g0 g0Var6 = g0Var2;
                System.currentTimeMillis();
                m0VarE = c0.e(g0Var6, s0.f29620b, null, new b(this.f33460f, null), 2, null);
                this.f33459e = null;
                this.f33458d = 4;
                if (((n0) m0VarE).F(this) == aVar) {
                    return aVar;
                }
                this.f33460f.f33427p.v();
                y1.k kVarC2 = y1.k.c(this.f33460f.f33412a);
                Objects.requireNonNull(kVarC2);
                ((j2.b) kVarC2.f38011d).f31695a.execute(new h2.b(kVarC2, "InitWorker"));
                com.zipoapps.premiumhelper.util.b bVar2 = new com.zipoapps.premiumhelper.util.b(this.f33460f.f33412a);
                this.f33458d = 5;
                objL = z.l(new com.zipoapps.premiumhelper.util.a(bVar2, null), this);
                if (objL != aVar) {
                    objL = w.f31842a;
                }
                if (objL == aVar) {
                    return aVar;
                }
                fd.c0 c0Var3 = s0.f29619a;
                s1Var = kd.q.f32064a;
                cVar = new c(this.f33460f, null);
                this.f33458d = 6;
                if (c0.V(s1Var, cVar, this) == aVar) {
                    return aVar;
                }
                hVar = this.f33460f;
                h.a aVar5 = h.f33410y;
                if (hVar.k()) {
                    new gb.a0(hVar.f33412a).f30182d = new k(hVar);
                }
                StartupPerformanceTracker startupPerformanceTrackerA2 = StartupPerformanceTracker.f28309b.a();
                startupData = startupPerformanceTrackerA2.f28311a;
                if (startupData != null) {
                    startupData.setLaunchedByUser(startupData.isSplashScreenShown());
                }
                startupData2 = startupPerformanceTrackerA2.f28311a;
                if (startupData2 != null) {
                    startupData2.setPhEndTimestamp(System.currentTimeMillis());
                }
                this.f33460f.f33428q.setValue(Boolean.TRUE);
                return w.f31842a;
            case 2:
                g0Var2 = (g0) this.f33459e;
                h9.d.t(obj);
                xe.a.f37601c.a("Configuration is ready", new Object[0]);
                h hVar4 = this.f33460f;
                com.zipoapps.ads.a aVar6 = hVar4.f33421j;
                if (hVar4.f33418g.l()) {
                }
                this.f33459e = g0Var2;
                this.f33457c = null;
                this.f33458d = 3;
                aVar6.f28027d = z10;
                objEmit = aVar6.f28035l.emit(Boolean.TRUE, this);
                if (objEmit != aVar) {
                    objEmit = w.f31842a;
                }
                if (objEmit == aVar) {
                    return aVar;
                }
                g0 g0Var7 = g0Var2;
                System.currentTimeMillis();
                m0VarE = c0.e(g0Var7, s0.f29620b, null, new b(this.f33460f, null), 2, null);
                this.f33459e = null;
                this.f33458d = 4;
                if (((n0) m0VarE).F(this) == aVar) {
                    return aVar;
                }
                this.f33460f.f33427p.v();
                y1.k kVarC3 = y1.k.c(this.f33460f.f33412a);
                Objects.requireNonNull(kVarC3);
                ((j2.b) kVarC3.f38011d).f31695a.execute(new h2.b(kVarC3, "InitWorker"));
                com.zipoapps.premiumhelper.util.b bVar3 = new com.zipoapps.premiumhelper.util.b(this.f33460f.f33412a);
                this.f33458d = 5;
                objL = z.l(new com.zipoapps.premiumhelper.util.a(bVar3, null), this);
                if (objL != aVar) {
                    objL = w.f31842a;
                }
                if (objL == aVar) {
                    return aVar;
                }
                fd.c0 c0Var4 = s0.f29619a;
                s1Var = kd.q.f32064a;
                cVar = new c(this.f33460f, null);
                this.f33458d = 6;
                if (c0.V(s1Var, cVar, this) == aVar) {
                    return aVar;
                }
                hVar = this.f33460f;
                h.a aVar7 = h.f33410y;
                if (hVar.k()) {
                    new gb.a0(hVar.f33412a).f30182d = new k(hVar);
                }
                StartupPerformanceTracker startupPerformanceTrackerA3 = StartupPerformanceTracker.f28309b.a();
                startupData = startupPerformanceTrackerA3.f28311a;
                if (startupData != null) {
                    startupData.setLaunchedByUser(startupData.isSplashScreenShown());
                }
                startupData2 = startupPerformanceTrackerA3.f28311a;
                if (startupData2 != null) {
                    startupData2.setPhEndTimestamp(System.currentTimeMillis());
                }
                this.f33460f.f33428q.setValue(Boolean.TRUE);
                return w.f31842a;
            case 3:
                g0Var2 = (g0) this.f33459e;
                h9.d.t(obj);
                g0 g0Var8 = g0Var2;
                System.currentTimeMillis();
                m0VarE = c0.e(g0Var8, s0.f29620b, null, new b(this.f33460f, null), 2, null);
                this.f33459e = null;
                this.f33458d = 4;
                if (((n0) m0VarE).F(this) == aVar) {
                    return aVar;
                }
                this.f33460f.f33427p.v();
                y1.k kVarC4 = y1.k.c(this.f33460f.f33412a);
                Objects.requireNonNull(kVarC4);
                ((j2.b) kVarC4.f38011d).f31695a.execute(new h2.b(kVarC4, "InitWorker"));
                com.zipoapps.premiumhelper.util.b bVar4 = new com.zipoapps.premiumhelper.util.b(this.f33460f.f33412a);
                this.f33458d = 5;
                objL = z.l(new com.zipoapps.premiumhelper.util.a(bVar4, null), this);
                if (objL != aVar) {
                    objL = w.f31842a;
                }
                if (objL == aVar) {
                    return aVar;
                }
                fd.c0 c0Var5 = s0.f29619a;
                s1Var = kd.q.f32064a;
                cVar = new c(this.f33460f, null);
                this.f33458d = 6;
                if (c0.V(s1Var, cVar, this) == aVar) {
                    return aVar;
                }
                hVar = this.f33460f;
                h.a aVar8 = h.f33410y;
                if (hVar.k()) {
                    new gb.a0(hVar.f33412a).f30182d = new k(hVar);
                }
                StartupPerformanceTracker startupPerformanceTrackerA4 = StartupPerformanceTracker.f28309b.a();
                startupData = startupPerformanceTrackerA4.f28311a;
                if (startupData != null) {
                    startupData.setLaunchedByUser(startupData.isSplashScreenShown());
                }
                startupData2 = startupPerformanceTrackerA4.f28311a;
                if (startupData2 != null) {
                    startupData2.setPhEndTimestamp(System.currentTimeMillis());
                }
                this.f33460f.f33428q.setValue(Boolean.TRUE);
                return w.f31842a;
            case 4:
                h9.d.t(obj);
                this.f33460f.f33427p.v();
                y1.k kVarC5 = y1.k.c(this.f33460f.f33412a);
                Objects.requireNonNull(kVarC5);
                ((j2.b) kVarC5.f38011d).f31695a.execute(new h2.b(kVarC5, "InitWorker"));
                com.zipoapps.premiumhelper.util.b bVar5 = new com.zipoapps.premiumhelper.util.b(this.f33460f.f33412a);
                this.f33458d = 5;
                objL = z.l(new com.zipoapps.premiumhelper.util.a(bVar5, null), this);
                if (objL != aVar) {
                    objL = w.f31842a;
                }
                if (objL == aVar) {
                    return aVar;
                }
                fd.c0 c0Var6 = s0.f29619a;
                s1Var = kd.q.f32064a;
                cVar = new c(this.f33460f, null);
                this.f33458d = 6;
                if (c0.V(s1Var, cVar, this) == aVar) {
                    return aVar;
                }
                hVar = this.f33460f;
                h.a aVar9 = h.f33410y;
                if (hVar.k()) {
                    new gb.a0(hVar.f33412a).f30182d = new k(hVar);
                }
                StartupPerformanceTracker startupPerformanceTrackerA5 = StartupPerformanceTracker.f28309b.a();
                startupData = startupPerformanceTrackerA5.f28311a;
                if (startupData != null) {
                    startupData.setLaunchedByUser(startupData.isSplashScreenShown());
                }
                startupData2 = startupPerformanceTrackerA5.f28311a;
                if (startupData2 != null) {
                    startupData2.setPhEndTimestamp(System.currentTimeMillis());
                }
                this.f33460f.f33428q.setValue(Boolean.TRUE);
                return w.f31842a;
            case 5:
                h9.d.t(obj);
                fd.c0 c0Var7 = s0.f29619a;
                s1Var = kd.q.f32064a;
                cVar = new c(this.f33460f, null);
                this.f33458d = 6;
                if (c0.V(s1Var, cVar, this) == aVar) {
                    return aVar;
                }
                hVar = this.f33460f;
                h.a aVar10 = h.f33410y;
                if (hVar.k()) {
                    new gb.a0(hVar.f33412a).f30182d = new k(hVar);
                }
                StartupPerformanceTracker startupPerformanceTrackerA6 = StartupPerformanceTracker.f28309b.a();
                startupData = startupPerformanceTrackerA6.f28311a;
                if (startupData != null) {
                    startupData.setLaunchedByUser(startupData.isSplashScreenShown());
                }
                startupData2 = startupPerformanceTrackerA6.f28311a;
                if (startupData2 != null) {
                    startupData2.setPhEndTimestamp(System.currentTimeMillis());
                }
                this.f33460f.f33428q.setValue(Boolean.TRUE);
                return w.f31842a;
            case 6:
                h9.d.t(obj);
                hVar = this.f33460f;
                h.a aVar11 = h.f33410y;
                if (hVar.k()) {
                    new gb.a0(hVar.f33412a).f30182d = new k(hVar);
                }
                StartupPerformanceTracker startupPerformanceTrackerA7 = StartupPerformanceTracker.f28309b.a();
                startupData = startupPerformanceTrackerA7.f28311a;
                if (startupData != null) {
                    startupData.setLaunchedByUser(startupData.isSplashScreenShown());
                }
                startupData2 = startupPerformanceTrackerA7.f28311a;
                if (startupData2 != null) {
                    startupData2.setPhEndTimestamp(System.currentTimeMillis());
                }
                this.f33460f.f33428q.setValue(Boolean.TRUE);
                return w.f31842a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
