package com.zipoapps.premiumhelper.ui.splash;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateManagerFactory;
import com.google.android.play.core.tasks.OnFailureListener;
import com.google.android.play.core.tasks.Task;
import com.inscode.autoclicker.R;
import com.zipoapps.premiumhelper.performance.StartupPerformanceTracker;
import com.zipoapps.premiumhelper.ui.startlikepro.StartLikeProActivity;
import fa.k;
import fa.m;
import fd.d2;
import fd.g0;
import fd.j0;
import fd.s0;
import fd.z;
import gb.x;
import hm.mod.update.up;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import jc.i;
import jc.w;
import kd.q;
import kotlin.reflect.KProperty;
import ma.h;
import ma.v;
import mc.d;
import oc.e;
import uc.p;
import vc.g;
import vc.l;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public class PHSplashActivity extends AppCompatActivity implements m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f28400e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f28401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f28402d;

    public static final class a {
        public a() {
        }

        public a(g gVar) {
        }
    }

    @e(c = "com.zipoapps.premiumhelper.ui.splash.PHSplashActivity$onCreate$6", f = "PHSplashActivity.kt", l = {114}, m = "invokeSuspend")
    public static final class b extends oc.h implements p<g0, d<? super w>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f28403c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f28404d;

        public static final class a extends l implements uc.a<w> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ PHSplashActivity f28406c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PHSplashActivity pHSplashActivity) {
                super(0);
                this.f28406c = pHSplashActivity;
            }

            @Override // uc.a
            public w invoke() {
                w wVar;
                ViewPropertyAnimator viewPropertyAnimatorAnimate;
                ViewPropertyAnimator viewPropertyAnimatorAlpha;
                ViewPropertyAnimator duration;
                ViewPropertyAnimator viewPropertyAnimatorWithEndAction;
                PHSplashActivity pHSplashActivity = this.f28406c;
                int i10 = PHSplashActivity.f28400e;
                if (pHSplashActivity.getResources().getIdentifier("screen_shader", FacebookMediationAdapter.KEY_ID, pHSplashActivity.getPackageName()) != 0) {
                    try {
                        View viewFindViewById = pHSplashActivity.findViewById(R.id.screen_shader);
                        if (viewFindViewById == null || (viewPropertyAnimatorAnimate = viewFindViewById.animate()) == null || (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(1.0f)) == null || (duration = viewPropertyAnimatorAlpha.setDuration(500L)) == null || (viewPropertyAnimatorWithEndAction = duration.withEndAction(new androidx.activity.c(pHSplashActivity))) == null) {
                            wVar = null;
                        } else {
                            viewPropertyAnimatorWithEndAction.start();
                            wVar = w.f31842a;
                        }
                        if (wVar == null) {
                            pHSplashActivity.h();
                        }
                    } catch (Throwable th) {
                        xe.a.f37601c.c(th);
                    }
                } else {
                    xe.a.f37601c.b("Resource ID not found for my_shader", new Object[0]);
                    pHSplashActivity.h();
                }
                return w.f31842a;
            }
        }

        public b(d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // oc.a
        public final d<w> create(Object obj, d<?> dVar) {
            return PHSplashActivity.this.new b(dVar);
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, d<? super w> dVar) {
            return PHSplashActivity.this.new b(dVar).invokeSuspend(w.f31842a);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0083  */
        /* JADX WARN: Code duplicated, block: B:22:0x009d  */
        /* JADX WARN: Code duplicated, block: B:25:0x00c8  */
        /* JADX WARN: Code duplicated, block: B:27:0x00d8  */
        /* JADX WARN: Code duplicated, block: B:29:0x00dc  */
        /* JADX WARN: Code duplicated, block: B:30:0x00e2  */
        /* JADX WARN: Code duplicated, block: B:32:0x00e6  */
        /* JADX WARN: Code duplicated, block: B:34:0x00ea  */
        /* JADX WARN: Code duplicated, block: B:36:0x00f6  */
        /* JADX WARN: Code duplicated, block: B:38:0x00fa  */
        /* JADX WARN: Code duplicated, block: B:40:0x0100  */
        /* JADX WARN: Code duplicated, block: B:41:0x0102  */
        /* JADX WARN: Code duplicated, block: B:44:0x0108  */
        /* JADX WARN: Code duplicated, block: B:45:0x0113  */
        /* JADX WARN: Code duplicated, block: B:47:0x0117  */
        /* JADX WARN: Code duplicated, block: B:49:0x011f  */
        /* JADX WARN: Code duplicated, block: B:51:0x0125  */
        /* JADX WARN: Code duplicated, block: B:52:0x0137  */
        /* JADX WARN: Code duplicated, block: B:54:0x013b  */
        /* JADX WARN: Code duplicated, block: B:56:0x0141  */
        /* JADX WARN: Code duplicated, block: B:60:0x0161  */
        /* JADX WARN: Code duplicated, block: B:62:0x0165  */
        /* JADX WARN: Code duplicated, block: B:64:0x0169  */
        /* JADX WARN: Code duplicated, block: B:66:0x016d  */
        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            PHSplashActivity pHSplashActivity;
            h hVar;
            h hVar2;
            h hVar3;
            h hVar4;
            h hVar5;
            h hVar6;
            h hVar7;
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.f28404d;
            boolean z10 = false;
            if (i10 == 0) {
                h9.d.t(obj);
                com.zipoapps.ads.a aVar2 = h.f33410y.a().f33421j;
                PHSplashActivity pHSplashActivity2 = PHSplashActivity.this;
                a aVar3 = new a(pHSplashActivity2);
                KProperty<Object>[] kPropertyArr = com.zipoapps.ads.a.f28022o;
                Objects.requireNonNull(aVar2);
                j0.i(pHSplashActivity2, "activity");
                xe.a.b("PhConsentManager").a("AdManager.prepareConsentInfo()-> Start to prepare consent info", new Object[0]);
                aVar2.c().e(pHSplashActivity2, aVar3, new fa.e(aVar2));
                PHSplashActivity pHSplashActivity3 = PHSplashActivity.this;
                this.f28403c = pHSplashActivity3;
                this.f28404d = 1;
                Object objG = PHSplashActivity.g(pHSplashActivity3, this);
                if (objG == aVar) {
                    return aVar;
                }
                pHSplashActivity = pHSplashActivity3;
                obj = objG;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pHSplashActivity = (PHSplashActivity) this.f28403c;
                h9.d.t(obj);
            }
            x xVar = (x) obj;
            Objects.requireNonNull(pHSplashActivity);
            j0.i(xVar, "result");
            if (xVar instanceof x.b) {
                Exception exc = ((x.b) xVar).f30416b;
                if (!(exc instanceof CancellationException) || (exc instanceof d2)) {
                    j0.i(pHSplashActivity, "activity");
                    if (((Boolean) h.f33410y.a().f33418g.h(oa.b.V)).booleanValue()) {
                        AppUpdateManager appUpdateManagerCreate = AppUpdateManagerFactory.create(pHSplashActivity);
                        j0.h(appUpdateManagerCreate, "create(activity)");
                        Task<AppUpdateInfo> appUpdateInfo = appUpdateManagerCreate.getAppUpdateInfo();
                        j0.h(appUpdateInfo, "appUpdateManager.appUpdateInfo");
                        appUpdateInfo.addOnSuccessListener(new fb.c(new fb.e(appUpdateManagerCreate, pHSplashActivity), 1));
                        appUpdateInfo.addOnFailureListener(new OnFailureListener() { // from class: fb.b
                            @Override // com.google.android.play.core.tasks.OnFailureListener
                            public final void onFailure(Exception exc2) {
                                xe.a.b("PremiumHelper").c(exc2);
                            }
                        });
                    }
                    hVar = pHSplashActivity.f28401c;
                    if (hVar != null) {
                        j0.r("premiumHelper");
                        throw null;
                    }
                    if (((Boolean) hVar.f33418g.h(oa.b.O)).booleanValue()) {
                        hVar7 = pHSplashActivity.f28401c;
                        if (hVar7 != null) {
                            j0.r("premiumHelper");
                            throw null;
                        }
                        hVar7.f33417f.q();
                    } else {
                        hVar2 = pHSplashActivity.f28401c;
                        if (hVar2 != null) {
                            j0.r("premiumHelper");
                            throw null;
                        }
                        if (!hVar2.f33417f.f33405a.getBoolean("is_onboarding_complete", false)) {
                            hVar3 = pHSplashActivity.f28401c;
                            if (hVar3 != null) {
                                j0.r("premiumHelper");
                                throw null;
                            }
                            if (!hVar3.i()) {
                                z10 = true;
                            }
                        }
                    }
                    if (z10) {
                        pHSplashActivity.startActivity(new Intent(pHSplashActivity, (Class<?>) StartLikeProActivity.class));
                    } else {
                        hVar4 = pHSplashActivity.f28401c;
                        if (hVar4 != null) {
                            j0.r("premiumHelper");
                            throw null;
                        }
                        if (hVar4.l()) {
                            hVar6 = pHSplashActivity.f28401c;
                            if (hVar6 != null) {
                                j0.r("premiumHelper");
                                throw null;
                            }
                            Intent intent = new Intent(pHSplashActivity, hVar6.f33418g.f34205b.getMainActivityClass());
                            intent.putExtra("from_splash", true);
                            pHSplashActivity.startActivity(intent);
                        } else {
                            hVar5 = pHSplashActivity.f28401c;
                            if (hVar5 != null) {
                                j0.r("premiumHelper");
                                throw null;
                            }
                            Intent intent2 = new Intent(pHSplashActivity, hVar5.f33418g.f34205b.getIntroActivityClass());
                            intent2.putExtra("from_splash", true);
                            pHSplashActivity.startActivity(intent2);
                        }
                    }
                    StartupPerformanceTracker.f28309b.a().b();
                    pHSplashActivity.finish();
                } else {
                    StartupPerformanceTracker.f28309b.a().b();
                }
            } else {
                j0.i(pHSplashActivity, "activity");
                if (((Boolean) h.f33410y.a().f33418g.h(oa.b.V)).booleanValue()) {
                    AppUpdateManager appUpdateManagerCreate2 = AppUpdateManagerFactory.create(pHSplashActivity);
                    j0.h(appUpdateManagerCreate2, "create(activity)");
                    Task<AppUpdateInfo> appUpdateInfo2 = appUpdateManagerCreate2.getAppUpdateInfo();
                    j0.h(appUpdateInfo2, "appUpdateManager.appUpdateInfo");
                    appUpdateInfo2.addOnSuccessListener(new fb.c(new fb.e(appUpdateManagerCreate2, pHSplashActivity), 1));
                    appUpdateInfo2.addOnFailureListener(new OnFailureListener() { // from class: fb.b
                        @Override // com.google.android.play.core.tasks.OnFailureListener
                        public final void onFailure(Exception exc2) {
                            xe.a.b("PremiumHelper").c(exc2);
                        }
                    });
                }
                hVar = pHSplashActivity.f28401c;
                if (hVar != null) {
                    j0.r("premiumHelper");
                    throw null;
                }
                if (((Boolean) hVar.f33418g.h(oa.b.O)).booleanValue()) {
                    hVar7 = pHSplashActivity.f28401c;
                    if (hVar7 != null) {
                        j0.r("premiumHelper");
                        throw null;
                    }
                    hVar7.f33417f.q();
                } else {
                    hVar2 = pHSplashActivity.f28401c;
                    if (hVar2 != null) {
                        j0.r("premiumHelper");
                        throw null;
                    }
                    if (!hVar2.f33417f.f33405a.getBoolean("is_onboarding_complete", false)) {
                        hVar3 = pHSplashActivity.f28401c;
                        if (hVar3 != null) {
                            j0.r("premiumHelper");
                            throw null;
                        }
                        if (!hVar3.i()) {
                            z10 = true;
                        }
                    }
                }
                if (z10) {
                    pHSplashActivity.startActivity(new Intent(pHSplashActivity, (Class<?>) StartLikeProActivity.class));
                } else {
                    hVar4 = pHSplashActivity.f28401c;
                    if (hVar4 != null) {
                        j0.r("premiumHelper");
                        throw null;
                    }
                    if (hVar4.l()) {
                        hVar6 = pHSplashActivity.f28401c;
                        if (hVar6 != null) {
                            j0.r("premiumHelper");
                            throw null;
                        }
                        Intent intent3 = new Intent(pHSplashActivity, hVar6.f33418g.f34205b.getMainActivityClass());
                        intent3.putExtra("from_splash", true);
                        pHSplashActivity.startActivity(intent3);
                    } else {
                        hVar5 = pHSplashActivity.f28401c;
                        if (hVar5 != null) {
                            j0.r("premiumHelper");
                            throw null;
                        }
                        Intent intent4 = new Intent(pHSplashActivity, hVar5.f33418g.f34205b.getIntroActivityClass());
                        intent4.putExtra("from_splash", true);
                        pHSplashActivity.startActivity(intent4);
                    }
                }
                StartupPerformanceTracker.f28309b.a().b();
                pHSplashActivity.finish();
            }
            return w.f31842a;
        }
    }

    @e(c = "com.zipoapps.premiumhelper.ui.splash.PHSplashActivity$readyForConsentCheck$1", f = "PHSplashActivity.kt", l = {139}, m = "invokeSuspend")
    public static final class c extends oc.h implements p<g0, d<? super w>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f28407c;

        public static final class a extends l implements uc.a<w> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f28409c = new a();

            public a() {
                super(0);
            }

            @Override // uc.a
            public w invoke() {
                xe.a.b("PhConsentManager").a("PHSplashActivity.onCreate()-> consent done", new Object[0]);
                return w.f31842a;
            }
        }

        public c(d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // oc.a
        public final d<w> create(Object obj, d<?> dVar) {
            return PHSplashActivity.this.new c(dVar);
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, d<? super w> dVar) {
            return PHSplashActivity.this.new c(dVar).invokeSuspend(w.f31842a);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.f28407c;
            if (i10 == 0) {
                h9.d.t(obj);
                com.zipoapps.ads.a aVar2 = h.f33410y.a().f33421j;
                PHSplashActivity pHSplashActivity = PHSplashActivity.this;
                a aVar3 = a.f28409c;
                this.f28407c = 1;
                if (aVar2.b(pHSplashActivity, aVar3, this) == aVar) {
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

    static {
        new a(null);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x012e  */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public static final Object g(PHSplashActivity pHSplashActivity, d dVar) {
        db.a aVar;
        x xVar;
        Object objA;
        long j10;
        x xVar2;
        h.a aVar2;
        com.zipoapps.ads.c cVarC;
        StartupPerformanceTracker.StartupData startupData;
        PHSplashActivity pHSplashActivity2 = pHSplashActivity;
        Objects.requireNonNull(pHSplashActivity);
        if (dVar instanceof db.a) {
            aVar = (db.a) dVar;
            int i10 = aVar.f28923g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f28923g = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new db.a(pHSplashActivity2, dVar);
            }
        } else {
            aVar = new db.a(pHSplashActivity2, dVar);
        }
        Object objR = aVar.f28921e;
        nc.a aVar3 = nc.a.COROUTINE_SUSPENDED;
        int i11 = aVar.f28923g;
        Boolean bool = null;
        if (i11 != 0) {
            if (i11 == 1) {
                pHSplashActivity2 = (PHSplashActivity) aVar.f28919c;
                h9.d.t(objR);
            } else {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    x xVar3 = (x) aVar.f28919c;
                    h9.d.t(objR);
                    return xVar3;
                }
                j10 = aVar.f28920d;
                xVar2 = (x) aVar.f28919c;
                h9.d.t(objR);
            }
            if (j0.d(objR, Boolean.FALSE) && (startupData = StartupPerformanceTracker.f28309b.a().f28311a) != null) {
                startupData.setInterstitialTimeout(j10);
            }
            xVar = xVar2;
            aVar2 = h.f33410y;
            if (!aVar2.a().i()) {
                cVarC = aVar2.a().f33421j.c();
                aVar.f28919c = xVar;
                aVar.f28923g = 3;
                if (cVarC.h(aVar) == aVar3) {
                    return aVar3;
                }
            }
            return xVar;
        }
        h9.d.t(objR);
        h hVar = pHSplashActivity2.f28401c;
        if (hVar == null) {
            j0.r("premiumHelper");
            throw null;
        }
        aVar.f28919c = pHSplashActivity2;
        aVar.f28923g = 1;
        objR = hVar.r(aVar);
        if (objR == aVar3) {
            return aVar3;
        }
        xVar = (x) objR;
        h.a aVar4 = h.f33410y;
        if (!aVar4.a().i() && c0.x(xVar)) {
            com.zipoapps.ads.a aVar5 = aVar4.a().f33421j;
            Objects.requireNonNull(aVar5);
            j0.i(pHSplashActivity2, "activity");
            c0.z(z.a(s0.f29619a), null, null, new fa.c(aVar5, pHSplashActivity2, null), 3, null);
            if (((Boolean) aVar4.a().f33418g.h(oa.b.T)).booleanValue() && ((Boolean) aVar4.a().f33418g.h(oa.b.f34194r0)).booleanValue()) {
                xe.a.f37601c.m("Ad-fraud: Waiting for Interstitial Ad", new Object[0]);
                long millis = TimeUnit.SECONDS.toMillis(((Number) aVar4.a().f33418g.h(oa.b.f34173g0)).longValue());
                com.zipoapps.ads.a aVar6 = aVar4.a().f33421j;
                aVar.f28919c = xVar;
                aVar.f28920d = millis;
                aVar.f28923g = 2;
                k kVar = aVar6.f28029f;
                if (kVar == null) {
                    objA = bool;
                } else {
                    objA = kVar.a(millis, aVar);
                    if (objA != aVar3) {
                        bool = (Boolean) objA;
                        objA = bool;
                    }
                }
                if (objA == aVar3) {
                    return aVar3;
                }
                j10 = millis;
                objR = objA;
                xVar2 = xVar;
                if (j0.d(objR, Boolean.FALSE)) {
                    startupData.setInterstitialTimeout(j10);
                }
                xVar = xVar2;
            }
        }
        aVar2 = h.f33410y;
        if (!aVar2.a().i()) {
            cVarC = aVar2.a().f33421j.c();
            aVar.f28919c = xVar;
            aVar.f28923g = 3;
            if (cVarC.h(aVar) == aVar3) {
                return aVar3;
            }
        }
        return xVar;
    }

    public final void h() {
        fd.c0 c0Var = s0.f29619a;
        c0.z(z.a(q.f32064a), null, null, new c(null), 3, null);
    }

    @Override // androidx.fragment.app.n, android.app.Activity
    public void onResume() {
        super.onResume();
        fa.h.b bVar = fa.h.f29446h;
        int i10 = getResources().getConfiguration().screenWidthDp - (this.f28402d * 2);
        Objects.requireNonNull(bVar);
        fa.h.f29449k = i10;
    }

    @Override // androidx.fragment.app.n, androidx.activity.ComponentActivity, d0.l, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object objF;
        up.process(this);
        StartupPerformanceTracker.StartupData startupData = StartupPerformanceTracker.f28309b.a().f28311a;
        if (startupData != null) {
            startupData.setSplashScreenShown(true);
        }
        getWindow().setFlags(1024, 1024);
        int i10 = Build.VERSION.SDK_INT;
        getWindow().addFlags(67108864);
        if (i10 >= 28) {
            getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        }
        super.onCreate(bundle);
        setContentView(R.layout.ph_activity_splash);
        ImageView imageView = (ImageView) findViewById(R.id.ph_splash_logo_image);
        TextView textView = (TextView) findViewById(R.id.ph_splash_title_text);
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.ph_splash_progress);
        View childAt = ((ViewGroup) findViewById(android.R.id.content)).getChildAt(0);
        TypedArray typedArrayObtainStyledAttributes = obtainStyledAttributes(v.f33520d);
        j0.h(typedArrayObtainStyledAttributes, "obtainStyledAttributes(R.styleable.Splash)");
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(1);
        ColorStateList colorStateList2 = typedArrayObtainStyledAttributes.getColorStateList(0);
        this.f28402d = (int) (typedArrayObtainStyledAttributes.getDimension(2, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) / getResources().getDisplayMetrics().density);
        typedArrayObtainStyledAttributes.recycle();
        if (childAt != null && colorStateList2 != null) {
            childAt.setBackgroundColor(colorStateList2.getDefaultColor());
        }
        if (imageView != null) {
            Context applicationContext = getApplicationContext();
            j0.h(applicationContext, "applicationContext");
            imageView.setImageResource(applicationContext.getApplicationInfo().icon);
        }
        if (textView != null) {
            Context applicationContext2 = getApplicationContext();
            j0.h(applicationContext2, "applicationContext");
            textView.setText(com.zipoapps.premiumhelper.util.c.e(applicationContext2));
        }
        if (colorStateList != null && textView != null) {
            textView.setTextColor(colorStateList);
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 1.0f);
        alphaAnimation.setDuration(700L);
        if (imageView != null) {
            imageView.startAnimation(alphaAnimation);
        }
        if (textView != null) {
            textView.startAnimation(alphaAnimation);
        }
        if (progressBar != null) {
            try {
                i.a aVar = i.f31813c;
                Object obj = e0.a.f28964a;
                progressBar.getIndeterminateDrawable().setColorFilter(h0.a.a(e0.a.d.a(this, R.color.progress_light), h0.b.SRC_ATOP));
                objF = w.f31842a;
            } catch (Throwable th) {
                i.a aVar2 = i.f31813c;
                objF = h9.d.f(th);
            }
            Throwable thA = i.a(objF);
            if (thA != null) {
                xe.a.f37601c.c(thA);
            }
            progressBar.setAlpha(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
            progressBar.setVisibility(0);
            ViewPropertyAnimator viewPropertyAnimatorAnimate = progressBar.animate();
            viewPropertyAnimatorAnimate.alpha(1.0f);
            viewPropertyAnimatorAnimate.setDuration(300L);
            viewPropertyAnimatorAnimate.setStartDelay(5000L);
            viewPropertyAnimatorAnimate.start();
        }
        this.f28401c = h.f33410y.a();
        androidx.activity.i.l(this).i(new b(null));
    }
}
