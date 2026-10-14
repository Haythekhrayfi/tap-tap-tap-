package com.zipoapps.ads;

import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import ch.qos.logback.core.CoreConstants;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.sdk.AppLovinMediationProvider;
import com.applovin.sdk.AppLovinPrivacySettings;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkSettings;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.zipoapps.ads.config.PHAdSize;
import com.zipoapps.premiumhelper.performance.StartupPerformanceTracker;
import fd.c1;
import fd.f2;
import fd.g0;
import fd.j0;
import fd.j1;
import fd.m0;
import fd.s0;
import fd.s1;
import fd.z;
import gb.x;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import jc.w;
import kotlin.reflect.KProperty;
import vc.b0;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f28022o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final List<oa.b.a> f28023p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f28024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oa.b f28025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ta.e f28026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f28027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public oa.b.a f28028e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public fa.k f28029f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public fa.f f28030g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ia.a f28031h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final jc.e f28032i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final id.n<Boolean> f28033j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final id.n<Boolean> f28034k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final id.n<Boolean> f28035l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public fa.h f28036m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final hd.f<NativeAd> f28037n;

    /* JADX INFO: renamed from: com.zipoapps.ads.a$a, reason: collision with other inner class name */
    public enum EnumC0215a {
        INTERSTITIAL,
        BANNER,
        NATIVE,
        REWARDED,
        BANNER_MEDIUM_RECT
    }

    public static final class b {
        public b() {
        }

        public b(vc.g gVar) {
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28038a;

        static {
            int[] iArr = new int[oa.b.a.values().length];
            try {
                iArr[oa.b.a.ADMOB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[oa.b.a.APPLOVIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f28038a = iArr;
        }
    }

    @oc.e(c = "com.zipoapps.ads.AdManager", f = "AdManager.kt", l = {84, 86, 89}, m = "askForConsentIfRequired$premium_helper_4_4_2_alpha5_regularRelease")
    public static final class d extends oc.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f28039c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f28040d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f28041e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f28042f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f28044h;

        public d(mc.d<? super d> dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.f28042f = obj;
            this.f28044h |= Integer.MIN_VALUE;
            return a.this.b(null, null, this);
        }
    }

    public static final class e extends vc.l implements uc.l<com.zipoapps.ads.c.C0231c, w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ uc.a<w> f28045c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a f28046d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(uc.a<w> aVar, a aVar2) {
            super(1);
            this.f28045c = aVar;
            this.f28046d = aVar2;
        }

        @Override // uc.l
        public w invoke(com.zipoapps.ads.c.C0231c c0231c) {
            j0.i(c0231c, "it");
            c0.z(z.a(s0.f29620b), null, null, new com.zipoapps.ads.b(this.f28046d, null), 3, null);
            this.f28045c.invoke();
            return w.f31842a;
        }
    }

    public static final class f extends vc.l implements uc.a<com.zipoapps.ads.c> {
        public f() {
            super(0);
        }

        @Override // uc.a
        public com.zipoapps.ads.c invoke() {
            return new com.zipoapps.ads.c(a.this.f28024a);
        }
    }

    @oc.e(c = "com.zipoapps.ads.AdManager", f = "AdManager.kt", l = {109, 117}, m = "initializeAdSDK")
    public static final class g extends oc.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f28048c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f28049d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f28051f;

        public g(mc.d<? super g> dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.f28049d = obj;
            this.f28051f |= Integer.MIN_VALUE;
            a aVar = a.this;
            KProperty<Object>[] kPropertyArr = a.f28022o;
            return aVar.e(this);
        }
    }

    @oc.e(c = "com.zipoapps.ads.AdManager$initializeAdSDK$2", f = "AdManager.kt", l = {}, m = "invokeSuspend")
    public static final class h extends oc.h implements uc.p<g0, mc.d<? super j1>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f28052c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ long f28054e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f28055f;

        /* JADX INFO: renamed from: com.zipoapps.ads.a$h$a, reason: collision with other inner class name */
        @oc.e(c = "com.zipoapps.ads.AdManager$initializeAdSDK$2$1", f = "AdManager.kt", l = {122, 138, 145, 165}, m = "invokeSuspend")
        public static final class C0216a extends oc.h implements uc.p<g0, mc.d<? super w>, Object> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public Object f28056c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f28057d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ a f28058e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ long f28059f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ String f28060g;

            /* JADX INFO: renamed from: com.zipoapps.ads.a$h$a$a, reason: collision with other inner class name */
            @oc.e(c = "com.zipoapps.ads.AdManager$initializeAdSDK$2$1$1", f = "AdManager.kt", l = {745}, m = "invokeSuspend")
            public static final class C0217a extends oc.h implements uc.p<g0, mc.d<? super InitializationStatus>, Object> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public Object f28061c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public int f28062d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public /* synthetic */ Object f28063e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ a f28064f;

                /* JADX INFO: renamed from: com.zipoapps.ads.a$h$a$a$a, reason: collision with other inner class name */
                @oc.e(c = "com.zipoapps.ads.AdManager$initializeAdSDK$2$1$1$1$1", f = "AdManager.kt", l = {148, 149}, m = "invokeSuspend")
                public static final class C0218a extends oc.h implements uc.p<g0, mc.d<? super w>, Object> {

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public int f28065c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ a f28066d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ fd.i<InitializationStatus> f28067e;

                    /* JADX INFO: renamed from: com.zipoapps.ads.a$h$a$a$a$a, reason: collision with other inner class name */
                    @oc.e(c = "com.zipoapps.ads.AdManager$initializeAdSDK$2$1$1$1$1$1", f = "AdManager.kt", l = {}, m = "invokeSuspend")
                    public static final class C0219a extends oc.h implements uc.p<g0, mc.d<? super w>, Object> {

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ fd.i<InitializationStatus> f28068c;

                        /* JADX INFO: renamed from: com.zipoapps.ads.a$h$a$a$a$a$a, reason: collision with other inner class name */
                        public static final class C0220a implements InitializationStatus {

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public static final C0220a f28069a = new C0220a();

                            @Override // com.google.android.gms.ads.initialization.InitializationStatus
                            public final Map<String, AdapterStatus> getAdapterStatusMap() {
                                return new LinkedHashMap();
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public C0219a(fd.i<? super InitializationStatus> iVar, mc.d<? super C0219a> dVar) {
                            super(2, dVar);
                            this.f28068c = iVar;
                        }

                        @Override // oc.a
                        public final mc.d<w> create(Object obj, mc.d<?> dVar) {
                            return new C0219a(this.f28068c, dVar);
                        }

                        @Override // uc.p
                        public Object invoke(g0 g0Var, mc.d<? super w> dVar) {
                            C0219a c0219a = new C0219a(this.f28068c, dVar);
                            w wVar = w.f31842a;
                            c0219a.invokeSuspend(wVar);
                            return wVar;
                        }

                        @Override // oc.a
                        public final Object invokeSuspend(Object obj) {
                            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
                            h9.d.t(obj);
                            if (this.f28068c.a()) {
                                fd.i<InitializationStatus> iVar = this.f28068c;
                                jc.i.a aVar2 = jc.i.f31813c;
                                iVar.resumeWith(C0220a.f28069a);
                            }
                            return w.f31842a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0218a(a aVar, fd.i<? super InitializationStatus> iVar, mc.d<? super C0218a> dVar) {
                        super(2, dVar);
                        this.f28066d = aVar;
                        this.f28067e = iVar;
                    }

                    @Override // oc.a
                    public final mc.d<w> create(Object obj, mc.d<?> dVar) {
                        return new C0218a(this.f28066d, this.f28067e, dVar);
                    }

                    @Override // uc.p
                    public Object invoke(g0 g0Var, mc.d<? super w> dVar) {
                        return new C0218a(this.f28066d, this.f28067e, dVar).invokeSuspend(w.f31842a);
                    }

                    @Override // oc.a
                    public final Object invokeSuspend(Object obj) {
                        String[] stringArray;
                        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
                        int i10 = this.f28065c;
                        if (i10 != 0) {
                            if (i10 == 1) {
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
                        a aVar2 = this.f28066d;
                        this.f28065c = 1;
                        KProperty<Object>[] kPropertyArr = a.f28022o;
                        Objects.requireNonNull(aVar2);
                        mc.i iVar = new mc.i(nc.b.c(this));
                        AppLovinPrivacySettings.setHasUserConsent(true, aVar2.f28024a);
                        AppLovinPrivacySettings.setIsAgeRestrictedUser(false, aVar2.f28024a);
                        AppLovinSdkSettings appLovinSdkSettings = new AppLovinSdkSettings(aVar2.f28024a);
                        Bundle debugData = aVar2.f28025b.f34205b.getDebugData();
                        if (debugData != null && (stringArray = debugData.getStringArray("test_advertising_ids")) != null) {
                            appLovinSdkSettings.setTestDeviceAdvertisingIds(kc.j.B(stringArray));
                        }
                        AppLovinSdk appLovinSdk = AppLovinSdk.getInstance(appLovinSdkSettings, aVar2.f28024a);
                        appLovinSdk.setMediationProvider(AppLovinMediationProvider.MAX);
                        appLovinSdk.initializeSdk(new fa.a(aVar2, iVar));
                        if (iVar.b() == aVar) {
                            return aVar;
                        }
                        fd.c0 c0Var = s0.f29620b;
                        C0219a c0219a = new C0219a(this.f28067e, null);
                        this.f28065c = 2;
                        if (c0.V(c0Var, c0219a, this) == aVar) {
                            return aVar;
                        }
                        return w.f31842a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0217a(a aVar, mc.d<? super C0217a> dVar) {
                    super(2, dVar);
                    this.f28064f = aVar;
                }

                @Override // oc.a
                public final mc.d<w> create(Object obj, mc.d<?> dVar) {
                    C0217a c0217a = new C0217a(this.f28064f, dVar);
                    c0217a.f28063e = obj;
                    return c0217a;
                }

                @Override // uc.p
                public Object invoke(g0 g0Var, mc.d<? super InitializationStatus> dVar) {
                    C0217a c0217a = new C0217a(this.f28064f, dVar);
                    c0217a.f28063e = g0Var;
                    return c0217a.invokeSuspend(w.f31842a);
                }

                @Override // oc.a
                public final Object invokeSuspend(Object obj) {
                    nc.a aVar = nc.a.COROUTINE_SUSPENDED;
                    int i10 = this.f28062d;
                    if (i10 == 0) {
                        h9.d.t(obj);
                        g0 g0Var = (g0) this.f28063e;
                        a aVar2 = this.f28064f;
                        this.f28063e = g0Var;
                        this.f28061c = aVar2;
                        this.f28062d = 1;
                        fd.k kVar = new fd.k(nc.b.c(this), 1);
                        kVar.u();
                        fd.c0 c0Var = s0.f29619a;
                        c0.z(g0Var, kd.q.f32064a, null, new C0218a(aVar2, kVar, null), 2, null);
                        obj = kVar.r();
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

            /* JADX INFO: renamed from: com.zipoapps.ads.a$h$a$b */
            public /* synthetic */ class b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f28070a;

                static {
                    int[] iArr = new int[oa.b.a.values().length];
                    try {
                        iArr[oa.b.a.ADMOB.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[oa.b.a.APPLOVIN.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    f28070a = iArr;
                }
            }

            /* JADX INFO: renamed from: com.zipoapps.ads.a$h$a$c */
            @oc.e(c = "com.zipoapps.ads.AdManager$initializeAdSDK$2$1$status$1", f = "AdManager.kt", l = {745}, m = "invokeSuspend")
            public static final class c extends oc.h implements uc.p<g0, mc.d<? super InitializationStatus>, Object> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public Object f28071c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public int f28072d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ a f28073e;

                /* JADX INFO: renamed from: com.zipoapps.ads.a$h$a$c$a, reason: collision with other inner class name */
                public static final class C0221a implements OnInitializationCompleteListener {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ fd.i<InitializationStatus> f28074a;

                    /* JADX WARN: Multi-variable type inference failed */
                    public C0221a(fd.i<? super InitializationStatus> iVar) {
                        this.f28074a = iVar;
                    }

                    @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
                    public final void onInitializationComplete(InitializationStatus initializationStatus) {
                        j0.i(initializationStatus, "status");
                        if (this.f28074a.a()) {
                            fd.i<InitializationStatus> iVar = this.f28074a;
                            jc.i.a aVar = jc.i.f31813c;
                            iVar.resumeWith(initializationStatus);
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(a aVar, mc.d<? super c> dVar) {
                    super(2, dVar);
                    this.f28073e = aVar;
                }

                @Override // oc.a
                public final mc.d<w> create(Object obj, mc.d<?> dVar) {
                    return new c(this.f28073e, dVar);
                }

                @Override // uc.p
                public Object invoke(g0 g0Var, mc.d<? super InitializationStatus> dVar) {
                    return new c(this.f28073e, dVar).invokeSuspend(w.f31842a);
                }

                @Override // oc.a
                public final Object invokeSuspend(Object obj) {
                    nc.a aVar = nc.a.COROUTINE_SUSPENDED;
                    int i10 = this.f28072d;
                    if (i10 == 0) {
                        h9.d.t(obj);
                        a aVar2 = this.f28073e;
                        this.f28071c = aVar2;
                        this.f28072d = 1;
                        fd.k kVar = new fd.k(nc.b.c(this), 1);
                        kVar.u();
                        MobileAds.initialize(aVar2.f28024a, new C0221a(kVar));
                        obj = kVar.r();
                        if (obj == aVar) {
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
            public C0216a(a aVar, long j10, String str, mc.d<? super C0216a> dVar) {
                super(2, dVar);
                this.f28058e = aVar;
                this.f28059f = j10;
                this.f28060g = str;
            }

            @Override // oc.a
            public final mc.d<w> create(Object obj, mc.d<?> dVar) {
                return new C0216a(this.f28058e, this.f28059f, this.f28060g, dVar);
            }

            @Override // uc.p
            public Object invoke(g0 g0Var, mc.d<? super w> dVar) {
                return new C0216a(this.f28058e, this.f28059f, this.f28060g, dVar).invokeSuspend(w.f31842a);
            }

            /* JADX WARN: Code duplicated, block: B:27:0x0095  */
            /* JADX WARN: Code duplicated, block: B:30:0x00af A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:40:0x00f2  */
            /* JADX WARN: Code duplicated, block: B:43:0x010e A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:44:0x010f  */
            /* JADX WARN: Code duplicated, block: B:48:0x014a A[LOOP:0: B:46:0x0144->B:48:0x014a, LOOP_END] */
            /* JADX WARN: Instruction removed from duplicated block: B:48:0x014a, please report this as an issue */
            @Override // oc.a
            public final Object invokeSuspend(Object obj) {
                InitializationStatus initializationStatus;
                StartupPerformanceTracker.StartupData startupData;
                id.n<Boolean> nVar;
                Boolean bool;
                InitializationStatus initializationStatus2;
                StringBuilder sb2;
                StartupPerformanceTracker.StartupData startupData2;
                id.n<Boolean> nVar2;
                Boolean bool2;
                nc.a aVar = nc.a.COROUTINE_SUSPENDED;
                int i10 = this.f28057d;
                try {
                    try {
                        if (i10 == 0) {
                            h9.d.t(obj);
                            int i11 = b.f28070a[this.f28058e.f28028e.ordinal()];
                            if (i11 == 1) {
                                long j10 = this.f28059f;
                                c cVar = new c(this.f28058e, null);
                                this.f28057d = 1;
                                obj = f2.b(j10, cVar, this);
                                if (obj == aVar) {
                                    return aVar;
                                }
                                initializationStatus = (InitializationStatus) obj;
                                a aVar2 = this.f28058e;
                                a aVar3 = this.f28058e;
                                aVar2.f28036m = new fa.h(aVar3.f28028e, aVar3.f28024a, this.f28060g);
                                startupData = StartupPerformanceTracker.f28309b.a().f28311a;
                                if (startupData != null) {
                                    startupData.setAdManagerEndTimeStamp(System.currentTimeMillis());
                                }
                                a.a(this.f28058e);
                                nVar = this.f28058e.f28033j;
                                bool = Boolean.TRUE;
                                this.f28056c = initializationStatus;
                                this.f28057d = 2;
                                if (nVar.emit(bool, this) == aVar) {
                                    return aVar;
                                }
                                initializationStatus2 = initializationStatus;
                                Log.d("SHUHI_TEST", "initializeAdSDK finished: ");
                                a aVar4 = this.f28058e;
                                KProperty<Object>[] kPropertyArr = a.f28022o;
                                ta.d dVarD = aVar4.d();
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("AdManager with AdMob initialized:\n");
                                j0.i(initializationStatus2, "<this>");
                                sb2 = new StringBuilder();
                                Map<String, AdapterStatus> adapterStatusMap = initializationStatus2.getAdapterStatusMap();
                                j0.h(adapterStatusMap, "adapterStatusMap");
                                for (Map.Entry<String, AdapterStatus> entry : adapterStatusMap.entrySet()) {
                                    sb2.append(entry.getKey() + CoreConstants.COLON_CHAR + entry.getValue().getInitializationState());
                                    sb2.append('\n');
                                }
                                String string = sb2.toString();
                                j0.h(string, "with(StringBuilder()) {\n…\n        toString()\n    }");
                                sb3.append(string);
                                dVarD.a(sb3.toString(), new Object[0]);
                            } else if (i11 == 2) {
                                long j11 = this.f28059f;
                                C0217a c0217a = new C0217a(this.f28058e, null);
                                this.f28057d = 3;
                                if (f2.b(j11, c0217a, this) == aVar) {
                                    return aVar;
                                }
                                a aVar5 = this.f28058e;
                                KProperty<Object>[] kPropertyArr2 = a.f28022o;
                                aVar5.d().k(3, null, "AdManager with AppLovin initialized", new Object[0]);
                                a aVar6 = this.f28058e;
                                a aVar7 = this.f28058e;
                                aVar6.f28036m = new fa.h(aVar7.f28028e, aVar7.f28024a, this.f28060g);
                                startupData2 = StartupPerformanceTracker.f28309b.a().f28311a;
                                if (startupData2 != null) {
                                    startupData2.setAdManagerEndTimeStamp(System.currentTimeMillis());
                                }
                                a.a(this.f28058e);
                                nVar2 = this.f28058e.f28033j;
                                bool2 = Boolean.TRUE;
                                this.f28057d = 4;
                                if (nVar2.emit(bool2, this) == aVar) {
                                    return aVar;
                                }
                            }
                        } else if (i10 == 1) {
                            h9.d.t(obj);
                            initializationStatus = (InitializationStatus) obj;
                            a aVar8 = this.f28058e;
                            a aVar9 = this.f28058e;
                            aVar8.f28036m = new fa.h(aVar9.f28028e, aVar9.f28024a, this.f28060g);
                            startupData = StartupPerformanceTracker.f28309b.a().f28311a;
                            if (startupData != null) {
                                startupData.setAdManagerEndTimeStamp(System.currentTimeMillis());
                            }
                            a.a(this.f28058e);
                            nVar = this.f28058e.f28033j;
                            bool = Boolean.TRUE;
                            this.f28056c = initializationStatus;
                            this.f28057d = 2;
                            if (nVar.emit(bool, this) == aVar) {
                                return aVar;
                            }
                            initializationStatus2 = initializationStatus;
                            Log.d("SHUHI_TEST", "initializeAdSDK finished: ");
                            a aVar10 = this.f28058e;
                            KProperty<Object>[] kPropertyArr3 = a.f28022o;
                            ta.d dVarD2 = aVar10.d();
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("AdManager with AdMob initialized:\n");
                            j0.i(initializationStatus2, "<this>");
                            sb2 = new StringBuilder();
                            Map<String, AdapterStatus> adapterStatusMap2 = initializationStatus2.getAdapterStatusMap();
                            j0.h(adapterStatusMap2, "adapterStatusMap");
                            while (r0.hasNext()) {
                                sb2.append(entry.getKey() + CoreConstants.COLON_CHAR + entry.getValue().getInitializationState());
                                sb2.append('\n');
                            }
                            String string2 = sb2.toString();
                            j0.h(string2, "with(StringBuilder()) {\n…\n        toString()\n    }");
                            sb4.append(string2);
                            dVarD2.a(sb4.toString(), new Object[0]);
                        } else if (i10 == 2) {
                            initializationStatus2 = (InitializationStatus) this.f28056c;
                            h9.d.t(obj);
                            Log.d("SHUHI_TEST", "initializeAdSDK finished: ");
                            a aVar11 = this.f28058e;
                            KProperty<Object>[] kPropertyArr4 = a.f28022o;
                            ta.d dVarD3 = aVar11.d();
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("AdManager with AdMob initialized:\n");
                            j0.i(initializationStatus2, "<this>");
                            sb2 = new StringBuilder();
                            Map<String, AdapterStatus> adapterStatusMap3 = initializationStatus2.getAdapterStatusMap();
                            j0.h(adapterStatusMap3, "adapterStatusMap");
                            while (r0.hasNext()) {
                                sb2.append(entry.getKey() + CoreConstants.COLON_CHAR + entry.getValue().getInitializationState());
                                sb2.append('\n');
                            }
                            String string3 = sb2.toString();
                            j0.h(string3, "with(StringBuilder()) {\n…\n        toString()\n    }");
                            sb5.append(string3);
                            dVarD3.a(sb5.toString(), new Object[0]);
                        } else if (i10 == 3) {
                            h9.d.t(obj);
                            a aVar12 = this.f28058e;
                            KProperty<Object>[] kPropertyArr5 = a.f28022o;
                            aVar12.d().k(3, null, "AdManager with AppLovin initialized", new Object[0]);
                            a aVar13 = this.f28058e;
                            a aVar14 = this.f28058e;
                            aVar13.f28036m = new fa.h(aVar14.f28028e, aVar14.f28024a, this.f28060g);
                            startupData2 = StartupPerformanceTracker.f28309b.a().f28311a;
                            if (startupData2 != null) {
                                startupData2.setAdManagerEndTimeStamp(System.currentTimeMillis());
                            }
                            a.a(this.f28058e);
                            nVar2 = this.f28058e.f28033j;
                            bool2 = Boolean.TRUE;
                            this.f28057d = 4;
                            if (nVar2.emit(bool2, this) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i10 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h9.d.t(obj);
                        }
                    } catch (Exception unused) {
                        a aVar15 = this.f28058e;
                        KProperty<Object>[] kPropertyArr6 = a.f28022o;
                        aVar15.d().k(6, null, "AppLovinManager: initialize timeout!", new Object[0]);
                    }
                } catch (Exception unused2) {
                    a aVar16 = this.f28058e;
                    KProperty<Object>[] kPropertyArr7 = a.f28022o;
                    aVar16.d().k(6, null, "AdManager: initialize timeout!", new Object[0]);
                    initializationStatus = new InitializationStatus() { // from class: fa.b
                        @Override // com.google.android.gms.ads.initialization.InitializationStatus
                        public final Map getAdapterStatusMap() {
                            return new LinkedHashMap();
                        }
                    };
                }
                return w.f31842a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(long j10, String str, mc.d<? super h> dVar) {
            super(2, dVar);
            this.f28054e = j10;
            this.f28055f = str;
        }

        @Override // oc.a
        public final mc.d<w> create(Object obj, mc.d<?> dVar) {
            h hVar = a.this.new h(this.f28054e, this.f28055f, dVar);
            hVar.f28052c = obj;
            return hVar;
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, mc.d<? super j1> dVar) {
            h hVar = a.this.new h(this.f28054e, this.f28055f, dVar);
            hVar.f28052c = g0Var;
            return hVar.invokeSuspend(w.f31842a);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            h9.d.t(obj);
            return c0.z((g0) this.f28052c, s0.f29620b, null, new C0216a(a.this, this.f28054e, this.f28055f, null), 2, null);
        }
    }

    @oc.e(c = "com.zipoapps.ads.AdManager", f = "AdManager.kt", l = {321}, m = "isAdEnabled")
    public static final class i extends oc.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f28075c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f28076d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f28077e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f28078f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f28080h;

        public i(mc.d<? super i> dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.f28078f = obj;
            this.f28080h |= Integer.MIN_VALUE;
            return a.this.f(null, false, this);
        }
    }

    @oc.e(c = "com.zipoapps.ads.AdManager", f = "AdManager.kt", l = {419, 745}, m = "loadAndGetAppLovinNativeAd")
    public static final class j extends oc.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f28081c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f28082d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f28083e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f28084f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f28086h;

        public j(mc.d<? super j> dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.f28084f = obj;
            this.f28086h |= Integer.MIN_VALUE;
            return a.this.g(false, null, this);
        }
    }

    @oc.e(c = "com.zipoapps.ads.AdManager$loadAndGetAppLovinNativeAd$2$1", f = "AdManager.kt", l = {438}, m = "invokeSuspend")
    public static final class k extends oc.h implements uc.p<g0, mc.d<? super w>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f28087c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ fd.i<x<ha.h>> f28089e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f28090f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f28091g;

        /* JADX INFO: renamed from: com.zipoapps.ads.a$k$a, reason: collision with other inner class name */
        public static final class C0222a extends fa.o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ fd.i<x<ha.h>> f28092a;

            /* JADX WARN: Multi-variable type inference failed */
            public C0222a(fd.i<? super x<ha.h>> iVar) {
                this.f28092a = iVar;
            }

            @Override // fa.o
            public void c(fa.t tVar) {
                fd.i<x<ha.h>> iVar = this.f28092a;
                jc.i.a aVar = jc.i.f31813c;
                iVar.resumeWith(new x.b(new IllegalStateException(tVar.f29504b)));
            }
        }

        public static final class b extends ha.o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ fd.i<x<ha.h>> f28093a;

            /* JADX WARN: Multi-variable type inference failed */
            public b(fd.i<? super x<ha.h>> iVar) {
                this.f28093a = iVar;
            }

            @Override // ha.o
            public void a(MaxNativeAdLoader maxNativeAdLoader, MaxAd maxAd) {
                w wVar;
                j0.i(maxNativeAdLoader, "loader");
                if (this.f28093a.a()) {
                    if (maxAd != null) {
                        fd.i<x<ha.h>> iVar = this.f28093a;
                        jc.i.a aVar = jc.i.f31813c;
                        iVar.resumeWith(new x.c(new ha.h(maxNativeAdLoader, maxAd)));
                        wVar = w.f31842a;
                    } else {
                        wVar = null;
                    }
                    if (wVar == null) {
                        fd.i<x<ha.h>> iVar2 = this.f28093a;
                        jc.i.a aVar2 = jc.i.f31813c;
                        iVar2.resumeWith(new x.b(new IllegalStateException("The ad is empty")));
                    }
                }
            }
        }

        public /* synthetic */ class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f28094a;

            static {
                int[] iArr = new int[oa.b.a.values().length];
                try {
                    iArr[oa.b.a.ADMOB.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[oa.b.a.APPLOVIN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f28094a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(fd.i<? super x<ha.h>> iVar, String str, boolean z10, mc.d<? super k> dVar) {
            super(2, dVar);
            this.f28089e = iVar;
            this.f28090f = str;
            this.f28091g = z10;
        }

        @Override // oc.a
        public final mc.d<w> create(Object obj, mc.d<?> dVar) {
            return a.this.new k(this.f28089e, this.f28090f, this.f28091g, dVar);
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, mc.d<? super w> dVar) {
            return a.this.new k(this.f28089e, this.f28090f, this.f28091g, dVar).invokeSuspend(w.f31842a);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            fd.i<x<ha.h>> iVar;
            x.b bVar;
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.f28087c;
            if (i10 == 0) {
                h9.d.t(obj);
                int i11 = c.f28094a[a.this.f28028e.ordinal()];
                if (i11 == 1) {
                    iVar = this.f28089e;
                    jc.i.a aVar2 = jc.i.f31813c;
                    bVar = new x.b(new IllegalStateException("This function is used to load AppLovin native apps only. For AdMob use loadAndGetNativeAd()"));
                } else if (i11 == 2) {
                    if (this.f28090f.length() == 0) {
                        iVar = this.f28089e;
                        jc.i.a aVar3 = jc.i.f31813c;
                        bVar = new x.b(new IllegalStateException("No ad unitId defined"));
                    } else {
                        ha.k kVar = new ha.k(this.f28090f);
                        Application application = a.this.f28024a;
                        C0222a c0222a = new C0222a(this.f28089e);
                        b bVar2 = new b(this.f28089e);
                        boolean z10 = this.f28091g;
                        this.f28087c = 1;
                        fd.k kVar2 = new fd.k(nc.b.c(this), 1);
                        kVar2.u();
                        try {
                            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(kVar.f31061a, application);
                            maxNativeAdLoader.setRevenueListener(new ha.i(z10, c0222a));
                            maxNativeAdLoader.setNativeAdListener(new ha.j(bVar2, maxNativeAdLoader, c0222a, kVar2));
                            maxNativeAdLoader.loadAd();
                        } catch (Exception e10) {
                            if (kVar2.a()) {
                                jc.i.a aVar4 = jc.i.f31813c;
                                kVar2.resumeWith(new x.b(e10));
                            }
                        }
                        Object objR = kVar2.r();
                        if (objR == nc.a.COROUTINE_SUSPENDED) {
                            j0.i(this, "frame");
                        }
                        if (objR == aVar) {
                            return aVar;
                        }
                    }
                }
                iVar.resumeWith(bVar);
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h9.d.t(obj);
            }
            return w.f31842a;
        }
    }

    @oc.e(c = "com.zipoapps.ads.AdManager", f = "AdManager.kt", l = {376, 745}, m = "loadAndGetNativeAd")
    public static final class l extends oc.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f28095c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f28096d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f28097e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f28098f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f28100h;

        public l(mc.d<? super l> dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.f28098f = obj;
            this.f28100h |= Integer.MIN_VALUE;
            return a.this.h(false, null, this);
        }
    }

    @oc.e(c = "com.zipoapps.ads.AdManager$loadAndGetNativeAd$2$1", f = "AdManager.kt", l = {389}, m = "invokeSuspend")
    public static final class m extends oc.h implements uc.p<g0, mc.d<? super w>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f28101c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f28103e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f28104f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ fd.i<x<? extends NativeAd>> f28105g;

        /* JADX INFO: renamed from: com.zipoapps.ads.a$m$a, reason: collision with other inner class name */
        public static final class C0223a extends fa.o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ fd.i<x<? extends NativeAd>> f28106a;

            /* JADX WARN: Multi-variable type inference failed */
            public C0223a(fd.i<? super x<? extends NativeAd>> iVar) {
                this.f28106a = iVar;
            }

            @Override // fa.o
            public void c(fa.t tVar) {
                fd.i<x<? extends NativeAd>> iVar = this.f28106a;
                jc.i.a aVar = jc.i.f31813c;
                iVar.resumeWith(new x.b(new IllegalStateException(tVar.f29504b)));
            }
        }

        public static final class b implements NativeAd.OnNativeAdLoadedListener {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ fd.i<x<? extends NativeAd>> f28107c;

            /* JADX WARN: Multi-variable type inference failed */
            public b(fd.i<? super x<? extends NativeAd>> iVar) {
                this.f28107c = iVar;
            }

            @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
            public final void onNativeAdLoaded(NativeAd nativeAd) {
                j0.i(nativeAd, "ad");
                if (this.f28107c.a()) {
                    fd.i<x<? extends NativeAd>> iVar = this.f28107c;
                    jc.i.a aVar = jc.i.f31813c;
                    iVar.resumeWith(new x.c(nativeAd));
                }
            }
        }

        public /* synthetic */ class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f28108a;

            static {
                int[] iArr = new int[oa.b.a.values().length];
                try {
                    iArr[oa.b.a.ADMOB.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[oa.b.a.APPLOVIN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f28108a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public m(String str, boolean z10, fd.i<? super x<? extends NativeAd>> iVar, mc.d<? super m> dVar) {
            super(2, dVar);
            this.f28103e = str;
            this.f28104f = z10;
            this.f28105g = iVar;
        }

        @Override // oc.a
        public final mc.d<w> create(Object obj, mc.d<?> dVar) {
            return a.this.new m(this.f28103e, this.f28104f, this.f28105g, dVar);
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, mc.d<? super w> dVar) {
            return a.this.new m(this.f28103e, this.f28104f, this.f28105g, dVar).invokeSuspend(w.f31842a);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.f28101c;
            if (i10 == 0) {
                h9.d.t(obj);
                int i11 = c.f28108a[a.this.f28028e.ordinal()];
                if (i11 == 1) {
                    ga.j jVar = new ga.j(this.f28103e);
                    Application application = a.this.f28024a;
                    C0223a c0223a = new C0223a(this.f28105g);
                    b bVar = new b(this.f28105g);
                    boolean z10 = this.f28104f;
                    this.f28101c = 1;
                    fd.k kVar = new fd.k(nc.b.c(this), 1);
                    kVar.u();
                    try {
                        AdLoader adLoaderBuild = new AdLoader.Builder(application, jVar.f30172a).forNativeAd(new ga.h(bVar, z10, jVar)).withAdListener(new ga.i(kVar, c0223a, application)).withNativeAdOptions(new NativeAdOptions.Builder().setVideoOptions(new VideoOptions.Builder().setStartMuted(true).build()).setRequestMultipleImages(true).build()).build();
                        j0.h(adLoaderBuild, "suspend fun load(context…      }\n\n        }\n\n    }");
                        adLoaderBuild.loadAds(new AdRequest.Builder().build(), 1);
                    } catch (Exception e10) {
                        if (kVar.a()) {
                            jc.i.a aVar2 = jc.i.f31813c;
                            kVar.resumeWith(new x.b(e10));
                        }
                    }
                    Object objR = kVar.r();
                    if (objR == nc.a.COROUTINE_SUSPENDED) {
                        j0.i(this, "frame");
                    }
                    if (objR == aVar) {
                        return aVar;
                    }
                } else if (i11 == 2) {
                    fd.i<x<? extends NativeAd>> iVar = this.f28105g;
                    jc.i.a aVar3 = jc.i.f31813c;
                    iVar.resumeWith(new x.b(new IllegalStateException("This function is used to load AdMob native apps only. For AppLovin use loadAndGetAppLovinNativeAd()")));
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

    @oc.e(c = "com.zipoapps.ads.AdManager", f = "AdManager.kt", l = {268}, m = "loadBanner")
    public static final class n extends oc.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f28109c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f28110d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f28112f;

        public n(mc.d<? super n> dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.f28110d = obj;
            this.f28112f |= Integer.MIN_VALUE;
            return a.this.i(null, null, null, false, null, this);
        }
    }

    @oc.e(c = "com.zipoapps.ads.AdManager$loadBanner$result$1", f = "AdManager.kt", l = {269, 282, 301}, m = "invokeSuspend")
    public static final class o extends oc.h implements uc.p<g0, mc.d<? super x<? extends View>>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f28113c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f28115e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f28116f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ PHAdSize f28117g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ fa.o f28118h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ PHAdSize.SizeType f28119i;

        /* JADX INFO: renamed from: com.zipoapps.ads.a$o$a, reason: collision with other inner class name */
        public /* synthetic */ class C0224a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f28120a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f28121b;

            static {
                int[] iArr = new int[PHAdSize.SizeType.values().length];
                try {
                    iArr[PHAdSize.SizeType.ADAPTIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PHAdSize.SizeType.MEDIUM_RECTANGLE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f28120a = iArr;
                int[] iArr2 = new int[oa.b.a.values().length];
                try {
                    iArr2[oa.b.a.ADMOB.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[oa.b.a.APPLOVIN.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                f28121b = iArr2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str, boolean z10, PHAdSize pHAdSize, fa.o oVar, PHAdSize.SizeType sizeType, mc.d<? super o> dVar) {
            super(2, dVar);
            this.f28115e = str;
            this.f28116f = z10;
            this.f28117g = pHAdSize;
            this.f28118h = oVar;
            this.f28119i = sizeType;
        }

        @Override // oc.a
        public final mc.d<w> create(Object obj, mc.d<?> dVar) {
            return a.this.new o(this.f28115e, this.f28116f, this.f28117g, this.f28118h, this.f28119i, dVar);
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, mc.d<? super x<? extends View>> dVar) {
            return ((o) create(g0Var, dVar)).invokeSuspend(w.f31842a);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.f28113c;
            if (i10 != 0) {
                if (i10 == 1) {
                    h9.d.t(obj);
                } else {
                    if (i10 != 2 && i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h9.d.t(obj);
                }
                return (x) obj;
            }
            h9.d.t(obj);
            a aVar2 = a.this;
            this.f28113c = 1;
            if (aVar2.l(this) == aVar) {
                return aVar;
            }
            int i11 = C0224a.f28121b[a.this.f28028e.ordinal()];
            if (i11 == 1) {
                String strA = this.f28115e;
                if (strA == null) {
                    a aVar3 = a.this;
                    fa.f fVar = aVar3.f28030g;
                    strA = fVar != null ? fVar.a(EnumC0215a.BANNER, this.f28116f, aVar3.f28027d) : null;
                    if (strA == null) {
                        return new x.b(new IllegalStateException("Can't get adUnitId. adUnitIdProvider wasn't initialised"));
                    }
                }
                a.this.d().a(androidx.recyclerview.widget.s.a(androidx.activity.result.c.a("AdManager: Loading banner ad: (", strA, ", "), this.f28116f, CoreConstants.RIGHT_PARENTHESIS_CHAR), new Object[0]);
                fa.h hVar = a.this.f28036m;
                if (hVar == null) {
                    j0.r("bannerViewCache");
                    throw null;
                }
                PHAdSize pHAdSize = this.f28117g;
                if (pHAdSize == null) {
                    pHAdSize = PHAdSize.BANNER;
                }
                fa.o oVar = this.f28118h;
                this.f28113c = 2;
                obj = hVar.a(strA, pHAdSize, oVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 2) {
                    throw new jc.g();
                }
                int i12 = C0224a.f28120a[this.f28119i.ordinal()];
                EnumC0215a enumC0215a = (i12 == 1 || i12 == 2) ? EnumC0215a.BANNER_MEDIUM_RECT : EnumC0215a.BANNER;
                String strA2 = this.f28115e;
                if (strA2 == null) {
                    a aVar4 = a.this;
                    fa.f fVar2 = aVar4.f28030g;
                    strA2 = fVar2 != null ? fVar2.a(enumC0215a, this.f28116f, aVar4.f28027d) : null;
                    if (strA2 == null) {
                        return new x.b(new IllegalStateException("Can't get adUnitId. adUnitIdProvider wasn't initialised"));
                    }
                }
                a.this.d().a(androidx.recyclerview.widget.s.a(androidx.activity.result.c.a("AdManager: Loading applovin banner ad. AdUnitId: ", strA2, " is Exit: ("), this.f28116f, CoreConstants.RIGHT_PARENTHESIS_CHAR), new Object[0]);
                if (strA2.length() == 0) {
                    StringBuilder sbA = defpackage.a.a("Ad unit id is empty. Size: ");
                    sbA.append(enumC0215a.name());
                    throw new IllegalArgumentException(sbA.toString());
                }
                fa.h hVar2 = a.this.f28036m;
                if (hVar2 == null) {
                    j0.r("bannerViewCache");
                    throw null;
                }
                PHAdSize pHAdSize2 = this.f28117g;
                if (pHAdSize2 == null) {
                    pHAdSize2 = PHAdSize.BANNER;
                }
                fa.o oVar2 = this.f28118h;
                this.f28113c = 3;
                obj = hVar2.a(strA2, pHAdSize2, oVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return (x) obj;
        }
    }

    @oc.e(c = "com.zipoapps.ads.AdManager", f = "AdManager.kt", l = {713}, m = "waitForConfiguration")
    public static final class p extends oc.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f28122c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f28124e;

        public p(mc.d<? super p> dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.f28122c = obj;
            this.f28124e |= Integer.MIN_VALUE;
            a aVar = a.this;
            KProperty<Object>[] kPropertyArr = a.f28022o;
            return aVar.k(this);
        }
    }

    @oc.e(c = "com.zipoapps.ads.AdManager$waitForConfiguration$2", f = "AdManager.kt", l = {722}, m = "invokeSuspend")
    public static final class q extends oc.h implements uc.p<g0, mc.d<? super x.c<w>>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f28125c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f28126d;

        /* JADX INFO: renamed from: com.zipoapps.ads.a$q$a, reason: collision with other inner class name */
        @oc.e(c = "com.zipoapps.ads.AdManager$waitForConfiguration$2$initProcess$1", f = "AdManager.kt", l = {717}, m = "invokeSuspend")
        public static final class C0225a extends oc.h implements uc.p<g0, mc.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f28128c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ a f28129d;

            /* JADX INFO: renamed from: com.zipoapps.ads.a$q$a$a, reason: collision with other inner class name */
            @oc.e(c = "com.zipoapps.ads.AdManager$waitForConfiguration$2$initProcess$1$1", f = "AdManager.kt", l = {}, m = "invokeSuspend")
            public static final class C0226a extends oc.h implements uc.p<Boolean, mc.d<? super Boolean>, Object> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public /* synthetic */ Object f28130c;

                public C0226a(mc.d<? super C0226a> dVar) {
                    super(2, dVar);
                }

                @Override // oc.a
                public final mc.d<w> create(Object obj, mc.d<?> dVar) {
                    C0226a c0226a = new C0226a(dVar);
                    c0226a.f28130c = obj;
                    return c0226a;
                }

                @Override // uc.p
                public Object invoke(Boolean bool, mc.d<? super Boolean> dVar) {
                    C0226a c0226a = new C0226a(dVar);
                    c0226a.f28130c = bool;
                    return c0226a.invokeSuspend(w.f31842a);
                }

                @Override // oc.a
                public final Object invokeSuspend(Object obj) {
                    nc.a aVar = nc.a.COROUTINE_SUSPENDED;
                    h9.d.t(obj);
                    return Boolean.valueOf(((Boolean) this.f28130c) != null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0225a(a aVar, mc.d<? super C0225a> dVar) {
                super(2, dVar);
                this.f28129d = aVar;
            }

            @Override // oc.a
            public final mc.d<w> create(Object obj, mc.d<?> dVar) {
                return new C0225a(this.f28129d, dVar);
            }

            @Override // uc.p
            public Object invoke(g0 g0Var, mc.d<? super Boolean> dVar) {
                return new C0225a(this.f28129d, dVar).invokeSuspend(w.f31842a);
            }

            @Override // oc.a
            public final Object invokeSuspend(Object obj) {
                nc.a aVar = nc.a.COROUTINE_SUSPENDED;
                int i10 = this.f28128c;
                if (i10 == 0) {
                    h9.d.t(obj);
                    if (this.f28129d.f28035l.getValue() == null) {
                        id.n<Boolean> nVar = this.f28129d.f28035l;
                        C0226a c0226a = new C0226a(null);
                        this.f28128c = 1;
                        if (z.s(nVar, c0226a, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h9.d.t(obj);
                }
                xe.a.b("PhConsentManager").a("Waiting for configuration complete", new Object[0]);
                return Boolean.TRUE;
            }
        }

        public q(mc.d<? super q> dVar) {
            super(2, dVar);
        }

        @Override // oc.a
        public final mc.d<w> create(Object obj, mc.d<?> dVar) {
            q qVar = a.this.new q(dVar);
            qVar.f28126d = obj;
            return qVar;
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, mc.d<? super x.c<w>> dVar) {
            q qVar = a.this.new q(dVar);
            qVar.f28126d = g0Var;
            return qVar.invokeSuspend(w.f31842a);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.f28125c;
            if (i10 == 0) {
                h9.d.t(obj);
                g0 g0Var = (g0) this.f28126d;
                xe.a.b("PhConsentManager").a("Start to wait for configuration", new Object[0]);
                m0[] m0VarArr = {c0.e(g0Var, null, null, new C0225a(a.this, null), 3, null)};
                this.f28125c = 1;
                if (h9.d.d(m0VarArr, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h9.d.t(obj);
            }
            return new x.c(w.f31842a);
        }
    }

    @oc.e(c = "com.zipoapps.ads.AdManager", f = "AdManager.kt", l = {677}, m = "waitForInitComplete")
    public static final class r extends oc.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f28131c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f28133e;

        public r(mc.d<? super r> dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.f28131c = obj;
            this.f28133e |= Integer.MIN_VALUE;
            return a.this.l(this);
        }
    }

    @oc.e(c = "com.zipoapps.ads.AdManager$waitForInitComplete$2", f = "AdManager.kt", l = {684}, m = "invokeSuspend")
    public static final class s extends oc.h implements uc.p<g0, mc.d<? super x.c<w>>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f28134c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f28135d;

        /* JADX INFO: renamed from: com.zipoapps.ads.a$s$a, reason: collision with other inner class name */
        @oc.e(c = "com.zipoapps.ads.AdManager$waitForInitComplete$2$initProcess$1", f = "AdManager.kt", l = {680}, m = "invokeSuspend")
        public static final class C0227a extends oc.h implements uc.p<g0, mc.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f28137c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ a f28138d;

            /* JADX INFO: renamed from: com.zipoapps.ads.a$s$a$a, reason: collision with other inner class name */
            @oc.e(c = "com.zipoapps.ads.AdManager$waitForInitComplete$2$initProcess$1$1", f = "AdManager.kt", l = {}, m = "invokeSuspend")
            public static final class C0228a extends oc.h implements uc.p<Boolean, mc.d<? super Boolean>, Object> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public /* synthetic */ boolean f28139c;

                public C0228a(mc.d<? super C0228a> dVar) {
                    super(2, dVar);
                }

                @Override // oc.a
                public final mc.d<w> create(Object obj, mc.d<?> dVar) {
                    C0228a c0228a = new C0228a(dVar);
                    c0228a.f28139c = ((Boolean) obj).booleanValue();
                    return c0228a;
                }

                @Override // uc.p
                public Object invoke(Boolean bool, mc.d<? super Boolean> dVar) {
                    Boolean boolValueOf = Boolean.valueOf(bool.booleanValue());
                    C0228a c0228a = new C0228a(dVar);
                    c0228a.f28139c = boolValueOf.booleanValue();
                    w wVar = w.f31842a;
                    nc.a aVar = nc.a.COROUTINE_SUSPENDED;
                    h9.d.t(wVar);
                    return Boolean.valueOf(c0228a.f28139c);
                }

                @Override // oc.a
                public final Object invokeSuspend(Object obj) {
                    nc.a aVar = nc.a.COROUTINE_SUSPENDED;
                    h9.d.t(obj);
                    return Boolean.valueOf(this.f28139c);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0227a(a aVar, mc.d<? super C0227a> dVar) {
                super(2, dVar);
                this.f28138d = aVar;
            }

            @Override // oc.a
            public final mc.d<w> create(Object obj, mc.d<?> dVar) {
                return new C0227a(this.f28138d, dVar);
            }

            @Override // uc.p
            public Object invoke(g0 g0Var, mc.d<? super Boolean> dVar) {
                return new C0227a(this.f28138d, dVar).invokeSuspend(w.f31842a);
            }

            @Override // oc.a
            public final Object invokeSuspend(Object obj) {
                nc.a aVar = nc.a.COROUTINE_SUSPENDED;
                int i10 = this.f28137c;
                if (i10 == 0) {
                    h9.d.t(obj);
                    if (!this.f28138d.f28033j.getValue().booleanValue()) {
                        id.n<Boolean> nVar = this.f28138d.f28033j;
                        C0228a c0228a = new C0228a(null);
                        this.f28137c = 1;
                        if (z.s(nVar, c0228a, this) == aVar) {
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

        public s(mc.d<? super s> dVar) {
            super(2, dVar);
        }

        @Override // oc.a
        public final mc.d<w> create(Object obj, mc.d<?> dVar) {
            s sVar = a.this.new s(dVar);
            sVar.f28135d = obj;
            return sVar;
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, mc.d<? super x.c<w>> dVar) {
            s sVar = a.this.new s(dVar);
            sVar.f28135d = g0Var;
            return sVar.invokeSuspend(w.f31842a);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.f28134c;
            if (i10 == 0) {
                h9.d.t(obj);
                m0[] m0VarArr = {c0.e((g0) this.f28135d, null, null, new C0227a(a.this, null), 3, null)};
                this.f28134c = 1;
                if (h9.d.d(m0VarArr, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h9.d.t(obj);
            }
            return new x.c(w.f31842a);
        }
    }

    @oc.e(c = "com.zipoapps.ads.AdManager", f = "AdManager.kt", l = {695}, m = "waitForPremiumStatus")
    public static final class t extends oc.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f28140c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f28142e;

        public t(mc.d<? super t> dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.f28140c = obj;
            this.f28142e |= Integer.MIN_VALUE;
            a aVar = a.this;
            KProperty<Object>[] kPropertyArr = a.f28022o;
            return aVar.m(this);
        }
    }

    @oc.e(c = "com.zipoapps.ads.AdManager$waitForPremiumStatus$2", f = "AdManager.kt", l = {702}, m = "invokeSuspend")
    public static final class u extends oc.h implements uc.p<g0, mc.d<? super x.c<w>>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f28143c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f28144d;

        /* JADX INFO: renamed from: com.zipoapps.ads.a$u$a, reason: collision with other inner class name */
        @oc.e(c = "com.zipoapps.ads.AdManager$waitForPremiumStatus$2$initProcess$1", f = "AdManager.kt", l = {698}, m = "invokeSuspend")
        public static final class C0229a extends oc.h implements uc.p<g0, mc.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f28146c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ a f28147d;

            /* JADX INFO: renamed from: com.zipoapps.ads.a$u$a$a, reason: collision with other inner class name */
            @oc.e(c = "com.zipoapps.ads.AdManager$waitForPremiumStatus$2$initProcess$1$1", f = "AdManager.kt", l = {}, m = "invokeSuspend")
            public static final class C0230a extends oc.h implements uc.p<Boolean, mc.d<? super Boolean>, Object> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public /* synthetic */ Object f28148c;

                public C0230a(mc.d<? super C0230a> dVar) {
                    super(2, dVar);
                }

                @Override // oc.a
                public final mc.d<w> create(Object obj, mc.d<?> dVar) {
                    C0230a c0230a = new C0230a(dVar);
                    c0230a.f28148c = obj;
                    return c0230a;
                }

                @Override // uc.p
                public Object invoke(Boolean bool, mc.d<? super Boolean> dVar) {
                    C0230a c0230a = new C0230a(dVar);
                    c0230a.f28148c = bool;
                    return c0230a.invokeSuspend(w.f31842a);
                }

                @Override // oc.a
                public final Object invokeSuspend(Object obj) {
                    nc.a aVar = nc.a.COROUTINE_SUSPENDED;
                    h9.d.t(obj);
                    return Boolean.valueOf(((Boolean) this.f28148c) != null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0229a(a aVar, mc.d<? super C0229a> dVar) {
                super(2, dVar);
                this.f28147d = aVar;
            }

            @Override // oc.a
            public final mc.d<w> create(Object obj, mc.d<?> dVar) {
                return new C0229a(this.f28147d, dVar);
            }

            @Override // uc.p
            public Object invoke(g0 g0Var, mc.d<? super Boolean> dVar) {
                return new C0229a(this.f28147d, dVar).invokeSuspend(w.f31842a);
            }

            @Override // oc.a
            public final Object invokeSuspend(Object obj) {
                nc.a aVar = nc.a.COROUTINE_SUSPENDED;
                int i10 = this.f28146c;
                if (i10 == 0) {
                    h9.d.t(obj);
                    if (this.f28147d.f28034k.getValue() == null) {
                        id.n<Boolean> nVar = this.f28147d.f28034k;
                        C0230a c0230a = new C0230a(null);
                        this.f28146c = 1;
                        if (z.s(nVar, c0230a, this) == aVar) {
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

        public u(mc.d<? super u> dVar) {
            super(2, dVar);
        }

        @Override // oc.a
        public final mc.d<w> create(Object obj, mc.d<?> dVar) {
            u uVar = a.this.new u(dVar);
            uVar.f28144d = obj;
            return uVar;
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, mc.d<? super x.c<w>> dVar) {
            u uVar = a.this.new u(dVar);
            uVar.f28144d = g0Var;
            return uVar.invokeSuspend(w.f31842a);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.f28143c;
            if (i10 == 0) {
                h9.d.t(obj);
                m0[] m0VarArr = {c0.e((g0) this.f28144d, null, null, new C0229a(a.this, null), 3, null)};
                this.f28143c = 1;
                if (h9.d.d(m0VarArr, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h9.d.t(obj);
            }
            return new x.c(w.f31842a);
        }
    }

    static {
        vc.t tVar = new vc.t(a.class, "log", "getLog()Lcom/zipoapps/premiumhelper/log/TimberLogger;", 0);
        Objects.requireNonNull(b0.f36991a);
        f28022o = new cd.i[]{tVar};
        new b(null);
        f28023p = kc.k.a(oa.b.a.APPLOVIN);
    }

    public a(Application application, oa.b bVar) {
        j0.i(application, "application");
        j0.i(bVar, "configuration");
        this.f28024a = application;
        this.f28025b = bVar;
        this.f28026c = new ta.e("PremiumHelper");
        this.f28028e = oa.b.a.ADMOB;
        this.f28032i = jc.f.b(new f());
        this.f28033j = id.w.a(Boolean.FALSE);
        this.f28034k = id.w.a(null);
        this.f28035l = id.w.a(null);
        this.f28037n = fd.f.a(0, null, null, 7);
    }

    public static final void a(a aVar) {
        Objects.requireNonNull(aVar);
        try {
            jc.i.a aVar2 = jc.i.f31813c;
            if (((Boolean) ma.h.f33410y.a().f33418g.h(oa.b.L)).booleanValue()) {
                int i10 = c.f28038a[aVar.f28028e.ordinal()];
                if (i10 == 1) {
                    MobileAds.setAppMuted(true);
                } else if (i10 == 2) {
                    AppLovinSdk.getInstance(aVar.f28024a).getSettings().setMuted(true);
                }
            }
            jc.i.a aVar3 = jc.i.f31813c;
        } catch (Throwable th) {
            jc.i.a aVar4 = jc.i.f31813c;
            h9.d.f(th);
            jc.i.a aVar5 = jc.i.f31813c;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(AppCompatActivity appCompatActivity, uc.a<w> aVar, mc.d<? super w> dVar) {
        d dVar2;
        a aVar2;
        uc.a<w> aVar3;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.f28044h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.f28044h = i10 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object obj = dVar2.f28042f;
        nc.a aVar4 = nc.a.COROUTINE_SUSPENDED;
        int i11 = dVar2.f28044h;
        if (i11 == 0) {
            h9.d.t(obj);
            dVar2.f28039c = this;
            dVar2.f28040d = appCompatActivity;
            dVar2.f28041e = aVar;
            dVar2.f28044h = 1;
            if (m(dVar2) == aVar4) {
                return aVar4;
            }
            aVar2 = this;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h9.d.t(obj);
                    return w.f31842a;
                }
                aVar3 = (uc.a) dVar2.f28039c;
                h9.d.t(obj);
                aVar3.invoke();
                return w.f31842a;
            }
            aVar = (uc.a) dVar2.f28041e;
            appCompatActivity = (AppCompatActivity) dVar2.f28040d;
            aVar2 = (a) dVar2.f28039c;
            h9.d.t(obj);
        }
        if (ma.h.f33410y.a().i()) {
            dVar2.f28039c = aVar;
            dVar2.f28040d = null;
            dVar2.f28041e = null;
            dVar2.f28044h = 2;
            if (aVar2.e(dVar2) == aVar4) {
                return aVar4;
            }
            aVar3 = aVar;
            aVar3.invoke();
            return w.f31842a;
        }
        com.zipoapps.ads.c cVarC = aVar2.c();
        e eVar = new e(aVar, aVar2);
        dVar2.f28039c = null;
        dVar2.f28040d = null;
        dVar2.f28041e = null;
        dVar2.f28044h = 3;
        String str = com.zipoapps.ads.c.f28151h;
        if (cVarC.a(appCompatActivity, false, eVar, dVar2) == aVar4) {
            return aVar4;
        }
        return w.f31842a;
    }

    public final com.zipoapps.ads.c c() {
        return (com.zipoapps.ads.c) this.f28032i.getValue();
    }

    public final ta.d d() {
        return this.f28026c.a(this, f28022o[0]);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(mc.d<? super w> dVar) {
        g gVar;
        a aVar;
        if (dVar instanceof g) {
            gVar = (g) dVar;
            int i10 = gVar.f28051f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f28051f = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(dVar);
            }
        } else {
            gVar = new g(dVar);
        }
        Object obj = gVar.f28049d;
        nc.a aVar2 = nc.a.COROUTINE_SUSPENDED;
        int i11 = gVar.f28051f;
        if (i11 != 0) {
            if (i11 == 1) {
                a aVar3 = (a) gVar.f28048c;
                h9.d.t(obj);
                aVar = aVar3;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h9.d.t(obj);
            }
            return w.f31842a;
        }
        h9.d.t(obj);
        gVar.f28048c = this;
        gVar.f28051f = 1;
        if (k(gVar) == aVar2) {
            return aVar2;
        }
        aVar = this;
        StartupPerformanceTracker.a aVar4 = StartupPerformanceTracker.f28309b;
        StartupPerformanceTracker.StartupData startupData = aVar4.a().f28311a;
        if (startupData != null) {
            startupData.setAdManagerStartTimestamp(System.currentTimeMillis());
        }
        aVar.f28028e = (oa.b.a) aVar.f28025b.g(oa.b.W);
        StartupPerformanceTracker startupPerformanceTrackerA = aVar4.a();
        String strName = aVar.f28028e.name();
        j0.i(strName, "provider");
        StartupPerformanceTracker.StartupData startupData2 = startupPerformanceTrackerA.f28311a;
        if (startupData2 != null) {
            startupData2.setAdProvider(strName);
        }
        oa.b.a aVar5 = aVar.f28028e;
        aVar.d().a("initAdsProvider()-> Provider: " + aVar5, new Object[0]);
        int i12 = c.f28038a[aVar5.ordinal()];
        if (i12 == 1) {
            aVar.d().k(3, null, "initAdsProvider()-> initializing ADMOB provider", new Object[0]);
            aVar.f28030g = new ga.l();
            aVar.f28029f = new ga.d();
            new ga.k();
        } else if (i12 == 2) {
            aVar.d().k(3, null, "initAdsProvider()-> initializing APPLOVIN provider", new Object[0]);
            aVar.f28030g = new ha.n();
            aVar.f28029f = new ha.d();
            new ha.m();
        }
        aVar.d().k(3, null, "initAdsProvider()-> Finished", new Object[0]);
        long jLongValue = ((long) 1000) * ((Number) aVar.f28025b.h(oa.b.f34190p0)).longValue();
        fa.f fVar = aVar.f28030g;
        j0.f(fVar);
        h hVar = aVar.new h(jLongValue, fVar.a(EnumC0215a.BANNER, false, ma.h.f33410y.a().k()), null);
        gVar.f28048c = null;
        gVar.f28051f = 2;
        if (z.l(hVar, gVar) == aVar2) {
            return aVar2;
        }
        return w.f31842a;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(EnumC0215a enumC0215a, boolean z10, mc.d<? super Boolean> dVar) {
        i iVar;
        a aVar;
        String strA;
        if (dVar instanceof i) {
            iVar = (i) dVar;
            int i10 = iVar.f28080h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                iVar.f28080h = i10 - Integer.MIN_VALUE;
            } else {
                iVar = new i(dVar);
            }
        } else {
            iVar = new i(dVar);
        }
        Object obj = iVar.f28078f;
        nc.a aVar2 = nc.a.COROUTINE_SUSPENDED;
        int i11 = iVar.f28080h;
        if (i11 == 0) {
            h9.d.t(obj);
            iVar.f28075c = this;
            iVar.f28076d = enumC0215a;
            iVar.f28077e = z10;
            iVar.f28080h = 1;
            if (l(iVar) == aVar2) {
                return aVar2;
            }
            aVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z10 = iVar.f28077e;
            enumC0215a = (EnumC0215a) iVar.f28076d;
            aVar = (a) iVar.f28075c;
            h9.d.t(obj);
        }
        fa.f fVar = aVar.f28030g;
        if (fVar == null || (strA = fVar.a(enumC0215a, z10, aVar.f28027d)) == null) {
            strA = "disabled";
        } else {
            if (!(strA.length() > 0)) {
                strA = null;
            }
            if (strA == null) {
                strA = "disabled";
            }
        }
        return Boolean.valueOf(!j0.d(strA, "disabled"));
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0073 A[Catch: Exception -> 0x00fb, TryCatch #1 {Exception -> 0x00fb, blocks: (B:30:0x006f, B:32:0x0073, B:36:0x007a, B:39:0x0084, B:41:0x0091, B:45:0x00ad, B:49:0x00df), top: B:64:0x006f }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0077  */
    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    /* JADX WARN: Code duplicated, block: B:37:0x0081  */
    /* JADX WARN: Code duplicated, block: B:39:0x0084 A[Catch: Exception -> 0x00fb, TryCatch #1 {Exception -> 0x00fb, blocks: (B:30:0x006f, B:32:0x0073, B:36:0x007a, B:39:0x0084, B:41:0x0091, B:45:0x00ad, B:49:0x00df), top: B:64:0x006f }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:47:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00de  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:64:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object g(boolean z10, String str, mc.d<? super x<ha.h>> dVar) {
        j jVar;
        a aVar;
        String strA;
        boolean z11;
        a aVar2;
        fa.f fVar;
        boolean z12;
        boolean z13;
        boolean z14;
        a aVar3;
        if (dVar instanceof j) {
            jVar = (j) dVar;
            int i10 = jVar.f28086h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jVar.f28086h = i10 - Integer.MIN_VALUE;
            } else {
                jVar = new j(dVar);
            }
        } else {
            jVar = new j(dVar);
        }
        Object objR = jVar.f28084f;
        nc.a aVar4 = nc.a.COROUTINE_SUSPENDED;
        int i11 = jVar.f28086h;
        if (i11 == 0) {
            h9.d.t(objR);
            try {
                jVar.f28081c = this;
                strA = str;
                jVar.f28082d = strA;
                z11 = z10;
                jVar.f28083e = z11;
                jVar.f28086h = 1;
                if (l(jVar) == aVar4) {
                    return aVar4;
                }
                aVar2 = this;
                if (strA == null) {
                    fVar = aVar2.f28030g;
                    if (fVar != null) {
                        EnumC0215a enumC0215a = EnumC0215a.NATIVE;
                        if (z11) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        strA = fVar.a(enumC0215a, z12, aVar2.f28027d);
                    } else {
                        strA = null;
                    }
                    if (strA == null) {
                        return new x.b(new IllegalStateException("Can't get adUnitId. adUnitIdProvider wasn't initialised"));
                    }
                }
                String str2 = strA;
                ta.d dVarD = aVar2.d();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("AdManager: Loading applovin native ad: (");
                sb2.append(str2);
                sb2.append(", ");
                if (z11) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                sb2.append(z13);
                sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                dVarD.a(sb2.toString(), new Object[0]);
                jVar.f28081c = aVar2;
                jVar.f28082d = str2;
                jVar.f28083e = z11;
                jVar.f28086h = 2;
                fd.k kVar = new fd.k(nc.b.c(jVar), 1);
                kVar.u();
                c1 c1Var = c1.f29556c;
                if (z11) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                c0.z(c1Var, null, null, aVar2.new k(kVar, str2, z14, null), 3, null);
                objR = kVar.r();
                if (objR == aVar4) {
                    return aVar4;
                }
                aVar3 = aVar2;
                return (x) objR;
            } catch (Exception e10) {
                e = e10;
                aVar = this;
                aVar.d().k(6, e, "AdManager: Failed to load native ad", new Object[0]);
                return new x.b(e);
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar3 = (a) jVar.f28081c;
            try {
                h9.d.t(objR);
                return (x) objR;
            } catch (Exception e11) {
                e = e11;
                aVar = aVar3;
                aVar.d().k(6, e, "AdManager: Failed to load native ad", new Object[0]);
                return new x.b(e);
            }
        }
        z11 = jVar.f28083e;
        String str3 = (String) jVar.f28082d;
        aVar = (a) jVar.f28081c;
        try {
            h9.d.t(objR);
            strA = str3;
            aVar2 = aVar;
            if (strA == null) {
                try {
                    fVar = aVar2.f28030g;
                    if (fVar != null) {
                        EnumC0215a enumC0215a2 = EnumC0215a.NATIVE;
                        if (z11) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        strA = fVar.a(enumC0215a2, z12, aVar2.f28027d);
                    } else {
                        strA = null;
                    }
                    if (strA == null) {
                        return new x.b(new IllegalStateException("Can't get adUnitId. adUnitIdProvider wasn't initialised"));
                    }
                } catch (Exception e12) {
                    e = e12;
                    aVar = aVar2;
                    aVar.d().k(6, e, "AdManager: Failed to load native ad", new Object[0]);
                    return new x.b(e);
                }
            }
            String str4 = strA;
            ta.d dVarD2 = aVar2.d();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("AdManager: Loading applovin native ad: (");
            sb3.append(str4);
            sb3.append(", ");
            if (z11) {
                z13 = true;
            } else {
                z13 = false;
            }
            sb3.append(z13);
            sb3.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            dVarD2.a(sb3.toString(), new Object[0]);
            jVar.f28081c = aVar2;
            jVar.f28082d = str4;
            jVar.f28083e = z11;
            jVar.f28086h = 2;
            fd.k kVar2 = new fd.k(nc.b.c(jVar), 1);
            kVar2.u();
            c1 c1Var2 = c1.f29556c;
            if (z11) {
                z14 = true;
            } else {
                z14 = false;
            }
            c0.z(c1Var2, null, null, aVar2.new k(kVar2, str4, z14, null), 3, null);
            objR = kVar2.r();
            if (objR == aVar4) {
                return aVar4;
            }
            aVar3 = aVar2;
            return (x) objR;
        } catch (Exception e13) {
            e = e13;
            aVar.d().k(6, e, "AdManager: Failed to load native ad", new Object[0]);
            return new x.b(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0073 A[Catch: Exception -> 0x00fb, TryCatch #1 {Exception -> 0x00fb, blocks: (B:30:0x006f, B:32:0x0073, B:36:0x007a, B:39:0x0084, B:41:0x0091, B:45:0x00ad, B:49:0x00df), top: B:64:0x006f }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0077  */
    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    /* JADX WARN: Code duplicated, block: B:37:0x0081  */
    /* JADX WARN: Code duplicated, block: B:39:0x0084 A[Catch: Exception -> 0x00fb, TryCatch #1 {Exception -> 0x00fb, blocks: (B:30:0x006f, B:32:0x0073, B:36:0x007a, B:39:0x0084, B:41:0x0091, B:45:0x00ad, B:49:0x00df), top: B:64:0x006f }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:47:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00de  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:64:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object h(boolean z10, String str, mc.d<? super x<? extends NativeAd>> dVar) {
        l lVar;
        a aVar;
        String strA;
        boolean z11;
        a aVar2;
        fa.f fVar;
        boolean z12;
        boolean z13;
        boolean z14;
        a aVar3;
        if (dVar instanceof l) {
            lVar = (l) dVar;
            int i10 = lVar.f28100h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lVar.f28100h = i10 - Integer.MIN_VALUE;
            } else {
                lVar = new l(dVar);
            }
        } else {
            lVar = new l(dVar);
        }
        Object objR = lVar.f28098f;
        nc.a aVar4 = nc.a.COROUTINE_SUSPENDED;
        int i11 = lVar.f28100h;
        if (i11 == 0) {
            h9.d.t(objR);
            try {
                lVar.f28095c = this;
                strA = str;
                lVar.f28096d = strA;
                z11 = z10;
                lVar.f28097e = z11;
                lVar.f28100h = 1;
                if (l(lVar) == aVar4) {
                    return aVar4;
                }
                aVar2 = this;
                if (strA == null) {
                    fVar = aVar2.f28030g;
                    if (fVar != null) {
                        EnumC0215a enumC0215a = EnumC0215a.NATIVE;
                        if (z11) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        strA = fVar.a(enumC0215a, z12, aVar2.f28027d);
                    } else {
                        strA = null;
                    }
                    if (strA == null) {
                        return new x.b(new IllegalStateException("Can't get adUnitId. adUnitIdProvider wasn't initialised"));
                    }
                }
                String str2 = strA;
                ta.d dVarD = aVar2.d();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("AdManager: Loading native ad: (");
                sb2.append(str2);
                sb2.append(", ");
                if (z11) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                sb2.append(z13);
                sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                dVarD.a(sb2.toString(), new Object[0]);
                lVar.f28095c = aVar2;
                lVar.f28096d = str2;
                lVar.f28097e = z11;
                lVar.f28100h = 2;
                fd.k kVar = new fd.k(nc.b.c(lVar), 1);
                kVar.u();
                c1 c1Var = c1.f29556c;
                if (z11) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                c0.z(c1Var, null, null, aVar2.new m(str2, z14, kVar, null), 3, null);
                objR = kVar.r();
                if (objR == aVar4) {
                    return aVar4;
                }
                aVar3 = aVar2;
                return (x) objR;
            } catch (Exception e10) {
                e = e10;
                aVar = this;
                aVar.d().k(6, e, "AdManager: Failed to load native ad", new Object[0]);
                return new x.b(e);
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar3 = (a) lVar.f28095c;
            try {
                h9.d.t(objR);
                return (x) objR;
            } catch (Exception e11) {
                e = e11;
                aVar = aVar3;
                aVar.d().k(6, e, "AdManager: Failed to load native ad", new Object[0]);
                return new x.b(e);
            }
        }
        z11 = lVar.f28097e;
        String str3 = (String) lVar.f28096d;
        aVar = (a) lVar.f28095c;
        try {
            h9.d.t(objR);
            strA = str3;
            aVar2 = aVar;
            if (strA == null) {
                try {
                    fVar = aVar2.f28030g;
                    if (fVar != null) {
                        EnumC0215a enumC0215a2 = EnumC0215a.NATIVE;
                        if (z11) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        strA = fVar.a(enumC0215a2, z12, aVar2.f28027d);
                    } else {
                        strA = null;
                    }
                    if (strA == null) {
                        return new x.b(new IllegalStateException("Can't get adUnitId. adUnitIdProvider wasn't initialised"));
                    }
                } catch (Exception e12) {
                    e = e12;
                    aVar = aVar2;
                    aVar.d().k(6, e, "AdManager: Failed to load native ad", new Object[0]);
                    return new x.b(e);
                }
            }
            String str4 = strA;
            ta.d dVarD2 = aVar2.d();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("AdManager: Loading native ad: (");
            sb3.append(str4);
            sb3.append(", ");
            if (z11) {
                z13 = true;
            } else {
                z13 = false;
            }
            sb3.append(z13);
            sb3.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            dVarD2.a(sb3.toString(), new Object[0]);
            lVar.f28095c = aVar2;
            lVar.f28096d = str4;
            lVar.f28097e = z11;
            lVar.f28100h = 2;
            fd.k kVar2 = new fd.k(nc.b.c(lVar), 1);
            kVar2.u();
            c1 c1Var2 = c1.f29556c;
            if (z11) {
                z14 = true;
            } else {
                z14 = false;
            }
            c0.z(c1Var2, null, null, aVar2.new m(str4, z14, kVar2, null), 3, null);
            objR = kVar2.r();
            if (objR == aVar4) {
                return aVar4;
            }
            aVar3 = aVar2;
            return (x) objR;
        } catch (Exception e13) {
            e = e13;
            aVar.d().k(6, e, "AdManager: Failed to load native ad", new Object[0]);
            return new x.b(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object i(PHAdSize.SizeType sizeType, PHAdSize pHAdSize, fa.o oVar, boolean z10, String str, mc.d<? super View> dVar) throws Throwable {
        n nVar;
        a aVar;
        x bVar;
        if (dVar instanceof n) {
            nVar = (n) dVar;
            int i10 = nVar.f28112f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                nVar.f28112f = i10 - Integer.MIN_VALUE;
            } else {
                nVar = new n(dVar);
            }
        } else {
            nVar = new n(dVar);
        }
        n nVar2 = nVar;
        Object objV = nVar2.f28110d;
        nc.a aVar2 = nc.a.COROUTINE_SUSPENDED;
        int i11 = nVar2.f28112f;
        if (i11 == 0) {
            h9.d.t(objV);
            try {
                fd.c0 c0Var = s0.f29619a;
                s1 s1Var = kd.q.f32064a;
                o oVar2 = new o(str, z10, pHAdSize, oVar, sizeType, null);
                nVar2.f28109c = this;
                nVar2.f28112f = 1;
                objV = c0.V(s1Var, oVar2, nVar2);
                if (objV == aVar2) {
                    return aVar2;
                }
                aVar = this;
            } catch (Exception e10) {
                e = e10;
                aVar = this;
                bVar = new x.b(e);
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (a) nVar2.f28109c;
            try {
                h9.d.t(objV);
            } catch (Exception e11) {
                e = e11;
                bVar = new x.b(e);
            }
        }
        bVar = (x) objV;
        if (bVar instanceof x.c) {
            return (View) ((x.c) bVar).f30417b;
        }
        if (!(bVar instanceof x.b)) {
            throw new jc.g();
        }
        aVar.d().k(6, ((x.b) bVar).f30416b, "AdManager: Failed to load banner ad", new Object[0]);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(mc.d<? super x<w>> dVar) {
        p pVar;
        if (dVar instanceof p) {
            pVar = (p) dVar;
            int i10 = pVar.f28124e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                pVar.f28124e = i10 - Integer.MIN_VALUE;
            } else {
                pVar = new p(dVar);
            }
        } else {
            pVar = new p(dVar);
        }
        Object objL = pVar.f28122c;
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i11 = pVar.f28124e;
        try {
            if (i11 == 0) {
                h9.d.t(objL);
                q qVar = new q(null);
                pVar.f28124e = 1;
                objL = z.l(qVar, pVar);
                if (objL == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h9.d.t(objL);
            }
            return (x) objL;
        } catch (Exception e10) {
            xe.a.b("PremiumHelper").b("Exception while waiting for configuration", new Object[0]);
            return new x.b(e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(mc.d<? super x<w>> dVar) {
        r rVar;
        if (dVar instanceof r) {
            rVar = (r) dVar;
            int i10 = rVar.f28133e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                rVar.f28133e = i10 - Integer.MIN_VALUE;
            } else {
                rVar = new r(dVar);
            }
        } else {
            rVar = new r(dVar);
        }
        Object objL = rVar.f28131c;
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i11 = rVar.f28133e;
        try {
            if (i11 == 0) {
                h9.d.t(objL);
                s sVar = new s(null);
                rVar.f28133e = 1;
                objL = z.l(sVar, rVar);
                if (objL == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h9.d.t(objL);
            }
            return (x) objL;
        } catch (Exception e10) {
            xe.a.b("PremiumHelper").d(e10, "Exception while initializing AdManager", new Object[0]);
            return new x.b(e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(mc.d<? super x<w>> dVar) {
        t tVar;
        if (dVar instanceof t) {
            tVar = (t) dVar;
            int i10 = tVar.f28142e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                tVar.f28142e = i10 - Integer.MIN_VALUE;
            } else {
                tVar = new t(dVar);
            }
        } else {
            tVar = new t(dVar);
        }
        Object objL = tVar.f28140c;
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i11 = tVar.f28142e;
        try {
            if (i11 == 0) {
                h9.d.t(objL);
                u uVar = new u(null);
                tVar.f28142e = 1;
                objL = z.l(uVar, tVar);
                if (objL == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h9.d.t(objL);
            }
            return (x) objL;
        } catch (Exception e10) {
            xe.a.b("PremiumHelper").b("Exception while waiting for premium status", new Object[0]);
            return new x.b(e10);
        }
    }
}
