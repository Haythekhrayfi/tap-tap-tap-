package com.zipoapps.premiumhelper.ui.startlikepro;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.activity.i;
import androidx.appcompat.app.AppCompatActivity;
import com.applovin.sdk.AppLovinEventParameters;
import com.inscode.autoclicker.R;
import com.zipoapps.premiumhelper.ui.startlikepro.StartLikeProActivity;
import com.zipoapps.premiumhelper.util.c;
import fa.m;
import fd.c1;
import fd.g0;
import fd.j0;
import gb.x;
import gb.z;
import java.util.Objects;
import jc.w;
import ma.e;
import mc.d;
import oc.h;
import uc.p;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class StartLikeProActivity extends AppCompatActivity implements m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f28410d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f28411c;

    @oc.e(c = "com.zipoapps.premiumhelper.ui.startlikepro.StartLikeProActivity$onCreate$3$1$1", f = "StartLikeProActivity.kt", l = {78}, m = "invokeSuspend")
    public static final class a extends h implements p<g0, d<? super w>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f28412c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ma.h f28413d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ StartLikeProActivity f28414e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ e f28415f;

        /* JADX INFO: renamed from: com.zipoapps.premiumhelper.ui.startlikepro.StartLikeProActivity$a$a, reason: collision with other inner class name */
        public static final class C0241a<T> implements id.e {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ma.h f28416c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ e f28417d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ StartLikeProActivity f28418e;

            public C0241a(ma.h hVar, e eVar, StartLikeProActivity startLikeProActivity) {
                this.f28416c = hVar;
                this.f28417d = eVar;
                this.f28418e = startLikeProActivity;
            }

            @Override // id.e
            public Object emit(Object obj, d dVar) {
                z zVar = (z) obj;
                if (c0.v(zVar.f30421a)) {
                    this.f28416c.f33419h.p(this.f28417d.f33402a);
                    StartLikeProActivity startLikeProActivity = this.f28418e;
                    int i10 = StartLikeProActivity.f28410d;
                    startLikeProActivity.g();
                } else {
                    xe.a.c cVarB = xe.a.b("PremiumHelper");
                    StringBuilder sbA = defpackage.a.a("Purchase failed: ");
                    sbA.append(zVar.f30421a.f3848a);
                    cVarB.b(sbA.toString(), new Object[0]);
                }
                return w.f31842a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ma.h hVar, StartLikeProActivity startLikeProActivity, e eVar, d<? super a> dVar) {
            super(2, dVar);
            this.f28413d = hVar;
            this.f28414e = startLikeProActivity;
            this.f28415f = eVar;
        }

        @Override // oc.a
        public final d<w> create(Object obj, d<?> dVar) {
            return new a(this.f28413d, this.f28414e, this.f28415f, dVar);
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, d<? super w> dVar) {
            return new a(this.f28413d, this.f28414e, this.f28415f, dVar).invokeSuspend(w.f31842a);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.f28412c;
            if (i10 == 0) {
                h9.d.t(obj);
                id.d<z> dVarM = this.f28413d.m(this.f28414e, this.f28415f);
                C0241a c0241a = new C0241a(this.f28413d, this.f28415f, this.f28414e);
                this.f28412c = 1;
                if (dVarM.a(c0241a, this) == aVar) {
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

    @oc.e(c = "com.zipoapps.premiumhelper.ui.startlikepro.StartLikeProActivity$onCreate$5", f = "StartLikeProActivity.kt", l = {105}, m = "invokeSuspend")
    public static final class b extends h implements p<g0, d<? super w>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f28419c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ma.h f28420d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ StartLikeProActivity f28421e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ProgressBar f28422f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ma.h hVar, StartLikeProActivity startLikeProActivity, ProgressBar progressBar, d<? super b> dVar) {
            super(2, dVar);
            this.f28420d = hVar;
            this.f28421e = startLikeProActivity;
            this.f28422f = progressBar;
        }

        @Override // oc.a
        public final d<w> create(Object obj, d<?> dVar) {
            return new b(this.f28420d, this.f28421e, this.f28422f, dVar);
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, d<? super w> dVar) {
            return new b(this.f28420d, this.f28421e, this.f28422f, dVar).invokeSuspend(w.f31842a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.f28419c;
            if (i10 == 0) {
                h9.d.t(obj);
                va.e.a aVar2 = va.e.f36781b;
                aVar2.a().c();
                va.e.b bVar = aVar2.a().f36783a;
                if (bVar != null) {
                    bVar.f36787d = "start_like_pro";
                }
                ma.h hVar = this.f28420d;
                oa.b.c.d dVar = oa.b.f34179k;
                this.f28419c = 1;
                obj = hVar.h(dVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h9.d.t(obj);
            }
            x xVar = (x) obj;
            StartLikeProActivity startLikeProActivity = this.f28421e;
            boolean z10 = xVar instanceof x.c;
            e eVar = z10 ? (e) ((x.c) xVar).f30417b : new e((String) this.f28420d.f33418g.h(oa.b.f34179k), null, null);
            ProgressBar progressBar = this.f28422f;
            StartLikeProActivity startLikeProActivity2 = this.f28421e;
            va.e.f36781b.a().b();
            if (z10) {
                progressBar.setVisibility(8);
                ((TextView) startLikeProActivity2.findViewById(R.id.start_like_pro_price_text)).setText(c.f28448a.c(startLikeProActivity2, eVar.f33404c));
            }
            ((TextView) startLikeProActivity2.findViewById(R.id.start_like_pro_premium_purchase_button)).setText(c.f28448a.f(startLikeProActivity2, eVar));
            startLikeProActivity.f28411c = eVar;
            e eVar2 = this.f28421e.f28411c;
            if (eVar2 != null) {
                this.f28420d.f33419h.n(eVar2.f33402a, "onboarding");
            }
            return w.f31842a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    public final void g() {
        boolean z10;
        ma.h hVarA = ma.h.f33410y.a();
        hVarA.f33417f.q();
        com.zipoapps.premiumhelper.a aVar = hVarA.f33419h;
        e eVar = this.f28411c;
        if (eVar == null) {
            z10 = false;
        } else {
            if ((eVar != null ? eVar.f33404c : null) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        aVar.t("Onboarding_complete", i.a(new jc.h(AppLovinEventParameters.PRODUCT_IDENTIFIER, aVar.f28254b.h(oa.b.f34179k)), new jc.h("offer_loaded", Boolean.valueOf(z10))));
        startActivity(hVarA.l() ? new Intent(this, hVarA.f33418g.f34205b.getMainActivityClass()) : new Intent(this, hVarA.f33418g.f34205b.getIntroActivityClass()));
        finish();
    }

    @Override // androidx.fragment.app.n, androidx.activity.ComponentActivity, d0.l, android.app.Activity
    public void onCreate(Bundle bundle) {
        int iF;
        final int i10 = 1;
        final int i11 = 0;
        TypedArray typedArrayObtainStyledAttributes = obtainStyledAttributes(R.style.PhPremiumOfferingTheme, new int[]{R.attr.premium_offering_style});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        if (resourceId > 0) {
            setTheme(resourceId);
        } else {
            setTheme(R.style.PhPremiumOfferingTheme);
        }
        typedArrayObtainStyledAttributes.recycle();
        getWindow().setFlags(1024, 1024);
        int i12 = Build.VERSION.SDK_INT;
        getWindow().addFlags(67108864);
        if (i12 >= 28) {
            getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        }
        super.onCreate(bundle);
        ma.h hVarA = ma.h.f33410y.a();
        oa.b bVar = hVarA.f33418g;
        if (!(bVar.f34205b.getStartLikeProActivityLayout().length == 0)) {
            iF = bVar.f(bVar.f34205b.getStartLikeProActivityLayout(), oa.b.P);
        } else {
            if (!bVar.l() || !bVar.f34205b.getUseTestLayouts()) {
                throw new IllegalStateException("Start Like Pro layout id is not set in premium-helper configuration!".toString());
            }
            iF = R.layout.ph_sample_activity_start_like_pro;
        }
        setContentView(iF);
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.f();
        }
        TextView textView = (TextView) findViewById(R.id.start_like_pro_terms_text);
        textView.setText(n0.b.a(getString(R.string.ph_terms_and_conditions, new Object[]{(String) hVarA.f33418g.h(oa.b.f34202y), (String) hVarA.f33418g.h(oa.b.f34203z)}), 0));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        com.zipoapps.premiumhelper.a aVar = hVarA.f33419h;
        Objects.requireNonNull(aVar);
        c0.z(c1.f29556c, null, null, new ma.d(aVar, null), 3, null);
        View viewFindViewById = findViewById(R.id.start_like_pro_try_limited_button);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new View.OnClickListener(this) { // from class: eb.a

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ StartLikeProActivity f29125d;

                {
                    this.f29125d = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            StartLikeProActivity startLikeProActivity = this.f29125d;
                            int i13 = StartLikeProActivity.f28410d;
                            j0.i(startLikeProActivity, "this$0");
                            startLikeProActivity.g();
                            break;
                        default:
                            StartLikeProActivity startLikeProActivity2 = this.f29125d;
                            int i14 = StartLikeProActivity.f28410d;
                            j0.i(startLikeProActivity2, "this$0");
                            startLikeProActivity2.g();
                            break;
                    }
                }
            });
        }
        findViewById(R.id.start_like_pro_premium_purchase_button).setOnClickListener(new com.inscode.autoclicker.base.a(this, hVarA));
        View viewFindViewById2 = findViewById(R.id.start_like_pro_progress);
        j0.h(viewFindViewById2, "findViewById(R.id.start_like_pro_progress)");
        ProgressBar progressBar = (ProgressBar) viewFindViewById2;
        progressBar.setVisibility(0);
        View viewFindViewById3 = findViewById(R.id.start_like_pro_close_button);
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(new View.OnClickListener(this) { // from class: eb.a

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ StartLikeProActivity f29125d;

                {
                    this.f29125d = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            StartLikeProActivity startLikeProActivity = this.f29125d;
                            int i13 = StartLikeProActivity.f28410d;
                            j0.i(startLikeProActivity, "this$0");
                            startLikeProActivity.g();
                            break;
                        default:
                            StartLikeProActivity startLikeProActivity2 = this.f29125d;
                            int i14 = StartLikeProActivity.f28410d;
                            j0.i(startLikeProActivity2, "this$0");
                            startLikeProActivity2.g();
                            break;
                    }
                }
            });
            if (i12 >= 28) {
                View viewFindViewById4 = getWindow().getDecorView().findViewById(android.R.id.content);
                viewFindViewById4.getViewTreeObserver().addOnGlobalLayoutListener(new eb.c(viewFindViewById4, viewFindViewById3));
            }
        }
        i.l(this).i(new b(hVarA, this, progressBar, null));
    }
}
