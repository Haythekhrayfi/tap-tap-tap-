package com.zipoapps.premiumhelper.ui.relaunch;

import ab.c;
import ab.t;
import ab.u;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;
import androidx.activity.i;
import androidx.appcompat.app.AppCompatActivity;
import com.android.billingclient.api.SkuDetails;
import com.applovin.sdk.AppLovinEventParameters;
import com.inscode.autoclicker.R;
import com.zipoapps.premiumhelper.ui.relaunch.RelaunchPremiumActivity;
import fa.m;
import fd.g0;
import fd.j0;
import fd.m0;
import gb.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import jc.w;
import ma.e;
import ma.f;
import ma.h;
import mc.d;
import uc.p;
import vc.g;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class RelaunchPremiumActivity extends AppCompatActivity implements m {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f28371n = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CountDownTimer f28372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f28373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f28374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f28375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f28376g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f28377h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f28378i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h f28379j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e f28380k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f28381l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f28382m;

    public static final class a {
        public a() {
        }

        public a(g gVar) {
        }
    }

    @oc.e(c = "com.zipoapps.premiumhelper.ui.relaunch.RelaunchPremiumActivity$onCreate$3", f = "RelaunchPremiumActivity.kt", l = {101, 106}, m = "invokeSuspend")
    public static final class b extends oc.h implements p<g0, d<? super w>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f28383c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f28384d;

        @oc.e(c = "com.zipoapps.premiumhelper.ui.relaunch.RelaunchPremiumActivity$onCreate$3$offers$1", f = "RelaunchPremiumActivity.kt", l = {102}, m = "invokeSuspend")
        public static final class a extends oc.h implements p<g0, d<? super x<? extends e>>, Object> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f28386c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ RelaunchPremiumActivity f28387d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(RelaunchPremiumActivity relaunchPremiumActivity, d<? super a> dVar) {
                super(2, dVar);
                this.f28387d = relaunchPremiumActivity;
            }

            @Override // oc.a
            public final d<w> create(Object obj, d<?> dVar) {
                return new a(this.f28387d, dVar);
            }

            @Override // uc.p
            public Object invoke(g0 g0Var, d<? super x<? extends e>> dVar) {
                return new a(this.f28387d, dVar).invokeSuspend(w.f31842a);
            }

            @Override // oc.a
            public final Object invokeSuspend(Object obj) {
                nc.a aVar = nc.a.COROUTINE_SUSPENDED;
                int i10 = this.f28386c;
                if (i10 == 0) {
                    h9.d.t(obj);
                    h hVar = this.f28387d.f28379j;
                    if (hVar == null) {
                        j0.r("premiumHelper");
                        throw null;
                    }
                    oa.b.c.d dVar = oa.b.f34181l;
                    this.f28386c = 1;
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
                return obj;
            }
        }

        /* JADX INFO: renamed from: com.zipoapps.premiumhelper.ui.relaunch.RelaunchPremiumActivity$b$b, reason: collision with other inner class name */
        @oc.e(c = "com.zipoapps.premiumhelper.ui.relaunch.RelaunchPremiumActivity$onCreate$3$offers$2", f = "RelaunchPremiumActivity.kt", l = {103}, m = "invokeSuspend")
        public static final class C0240b extends oc.h implements p<g0, d<? super x<? extends e>>, Object> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f28388c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ RelaunchPremiumActivity f28389d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0240b(RelaunchPremiumActivity relaunchPremiumActivity, d<? super C0240b> dVar) {
                super(2, dVar);
                this.f28389d = relaunchPremiumActivity;
            }

            @Override // oc.a
            public final d<w> create(Object obj, d<?> dVar) {
                return new C0240b(this.f28389d, dVar);
            }

            @Override // uc.p
            public Object invoke(g0 g0Var, d<? super x<? extends e>> dVar) {
                return new C0240b(this.f28389d, dVar).invokeSuspend(w.f31842a);
            }

            @Override // oc.a
            public final Object invokeSuspend(Object obj) {
                nc.a aVar = nc.a.COROUTINE_SUSPENDED;
                int i10 = this.f28388c;
                if (i10 == 0) {
                    h9.d.t(obj);
                    h hVar = this.f28389d.f28379j;
                    if (hVar == null) {
                        j0.r("premiumHelper");
                        throw null;
                    }
                    oa.b.c.d dVar = oa.b.f34183m;
                    this.f28388c = 1;
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
                return obj;
            }
        }

        @oc.e(c = "com.zipoapps.premiumhelper.ui.relaunch.RelaunchPremiumActivity$onCreate$3$offers$3", f = "RelaunchPremiumActivity.kt", l = {107}, m = "invokeSuspend")
        public static final class c extends oc.h implements p<g0, d<? super x<? extends e>>, Object> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f28390c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ RelaunchPremiumActivity f28391d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(RelaunchPremiumActivity relaunchPremiumActivity, d<? super c> dVar) {
                super(2, dVar);
                this.f28391d = relaunchPremiumActivity;
            }

            @Override // oc.a
            public final d<w> create(Object obj, d<?> dVar) {
                return new c(this.f28391d, dVar);
            }

            @Override // uc.p
            public Object invoke(g0 g0Var, d<? super x<? extends e>> dVar) {
                return new c(this.f28391d, dVar).invokeSuspend(w.f31842a);
            }

            @Override // oc.a
            public final Object invokeSuspend(Object obj) {
                nc.a aVar = nc.a.COROUTINE_SUSPENDED;
                int i10 = this.f28390c;
                if (i10 == 0) {
                    h9.d.t(obj);
                    h hVar = this.f28391d.f28379j;
                    if (hVar == null) {
                        j0.r("premiumHelper");
                        throw null;
                    }
                    oa.b.c.d dVar = oa.b.f34179k;
                    this.f28390c = 1;
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
                return obj;
            }
        }

        public b(d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // oc.a
        public final d<w> create(Object obj, d<?> dVar) {
            b bVar = RelaunchPremiumActivity.this.new b(dVar);
            bVar.f28384d = obj;
            return bVar;
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, d<? super w> dVar) {
            b bVar = RelaunchPremiumActivity.this.new b(dVar);
            bVar.f28384d = g0Var;
            return bVar.invokeSuspend(w.f31842a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            Object objD;
            boolean z10;
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.f28383c;
            if (i10 == 0) {
                h9.d.t(obj);
                g0 g0Var = (g0) this.f28384d;
                va.e.a aVar2 = va.e.f36781b;
                aVar2.a().c();
                va.e.b bVar = aVar2.a().f36783a;
                if (bVar != null) {
                    bVar.f36787d = "relaunch";
                }
                RelaunchPremiumActivity relaunchPremiumActivity = RelaunchPremiumActivity.this;
                if (relaunchPremiumActivity.f28382m) {
                    va.e.b bVar2 = aVar2.a().f36783a;
                    if (bVar2 != null) {
                        bVar2.f36788e = true;
                    }
                    m0[] m0VarArr = {c0.e(g0Var, null, null, new a(RelaunchPremiumActivity.this, null), 3, null), c0.e(g0Var, null, null, new C0240b(RelaunchPremiumActivity.this, null), 3, null)};
                    this.f28383c = 1;
                    objD = h9.d.d(m0VarArr, this);
                    if (objD == aVar) {
                        return aVar;
                    }
                } else {
                    m0[] m0VarArr2 = {c0.e(g0Var, null, null, new c(relaunchPremiumActivity, null), 3, null)};
                    this.f28383c = 2;
                    objD = h9.d.d(m0VarArr2, this);
                    if (objD == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h9.d.t(obj);
                objD = obj;
            }
            List<x> list = (List) objD;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = true;
                        break;
                    }
                    if (!(((x) it.next()) instanceof x.c)) {
                        z10 = false;
                        break;
                    }
                }
            } else {
                z10 = true;
                break;
            }
            if (z10) {
                RelaunchPremiumActivity relaunchPremiumActivity2 = RelaunchPremiumActivity.this;
                ArrayList arrayList = new ArrayList(kc.m.j(list, 10));
                for (x xVar : list) {
                    j0.g(xVar, "null cannot be cast to non-null type com.zipoapps.premiumhelper.util.PHResult.Success<com.zipoapps.premiumhelper.Offer>");
                    arrayList.add((e) ((x.c) xVar).f30417b);
                }
                int i11 = RelaunchPremiumActivity.f28371n;
                Objects.requireNonNull(relaunchPremiumActivity2);
                relaunchPremiumActivity2.f28380k = (e) arrayList.get(0);
                String str = relaunchPremiumActivity2.f28381l;
                if (str == null) {
                    j0.r("source");
                    throw null;
                }
                if (j0.d(str, "relaunch")) {
                    h hVar = relaunchPremiumActivity2.f28379j;
                    if (hVar == null) {
                        j0.r("premiumHelper");
                        throw null;
                    }
                    com.zipoapps.premiumhelper.a aVar3 = hVar.f33419h;
                    e eVar = relaunchPremiumActivity2.f28380k;
                    if (eVar == null) {
                        j0.r("offer");
                        throw null;
                    }
                    String str2 = eVar.f33402a;
                    Objects.requireNonNull(aVar3);
                    j0.i(str2, AppLovinEventParameters.PRODUCT_IDENTIFIER);
                    aVar3.t("Relaunch", i.a(new jc.h(AppLovinEventParameters.PRODUCT_IDENTIFIER, str2)));
                }
                h hVar2 = relaunchPremiumActivity2.f28379j;
                if (hVar2 == null) {
                    j0.r("premiumHelper");
                    throw null;
                }
                com.zipoapps.premiumhelper.a aVar4 = hVar2.f33419h;
                e eVar2 = relaunchPremiumActivity2.f28380k;
                if (eVar2 == null) {
                    j0.r("offer");
                    throw null;
                }
                String str3 = eVar2.f33402a;
                String str4 = relaunchPremiumActivity2.f28381l;
                if (str4 == null) {
                    j0.r("source");
                    throw null;
                }
                aVar4.n(str3, str4);
                if (relaunchPremiumActivity2.f28382m) {
                    TextView textView = relaunchPremiumActivity2.f28375f;
                    if (textView == null) {
                        j0.r("textPrice");
                        throw null;
                    }
                    SkuDetails skuDetails = ((e) arrayList.get(0)).f33404c;
                    textView.setText(skuDetails != null ? skuDetails.c() : null);
                    TextView textView2 = relaunchPremiumActivity2.f28378i;
                    if (textView2 != null) {
                        SkuDetails skuDetails2 = ((e) arrayList.get(1)).f33404c;
                        textView2.setText(skuDetails2 != null ? skuDetails2.c() : null);
                    }
                    TextView textView3 = relaunchPremiumActivity2.f28378i;
                    if (textView3 != null) {
                        textView3.setVisibility(0);
                    }
                } else {
                    TextView textView4 = relaunchPremiumActivity2.f28375f;
                    if (textView4 == null) {
                        j0.r("textPrice");
                        throw null;
                    }
                    com.zipoapps.premiumhelper.util.c cVar = com.zipoapps.premiumhelper.util.c.f28448a;
                    textView4.setText(cVar.c(relaunchPremiumActivity2, ((e) arrayList.get(0)).f33404c));
                    TextView textView5 = relaunchPremiumActivity2.f28374e;
                    if (textView5 == null) {
                        j0.r("buttonPurchase");
                        throw null;
                    }
                    e eVar3 = relaunchPremiumActivity2.f28380k;
                    if (eVar3 == null) {
                        j0.r("offer");
                        throw null;
                    }
                    textView5.setText(cVar.f(relaunchPremiumActivity2, eVar3));
                }
                View view = relaunchPremiumActivity2.f28373d;
                if (view == null) {
                    j0.r("progressView");
                    throw null;
                }
                view.setVisibility(8);
                TextView textView6 = relaunchPremiumActivity2.f28375f;
                if (textView6 == null) {
                    j0.r("textPrice");
                    throw null;
                }
                textView6.setVisibility(0);
                TextView textView7 = relaunchPremiumActivity2.f28374e;
                if (textView7 == null) {
                    j0.r("buttonPurchase");
                    throw null;
                }
                textView7.setVisibility(0);
                va.e.f36781b.a().b();
                RelaunchPremiumActivity relaunchPremiumActivity3 = RelaunchPremiumActivity.this;
                if (relaunchPremiumActivity3.f28382m) {
                    h hVar3 = relaunchPremiumActivity3.f28379j;
                    if (hVar3 == null) {
                        j0.r("premiumHelper");
                        throw null;
                    }
                    ab.c cVar2 = hVar3.f33422k;
                    if (cVar2.f279b.i() == 0) {
                        f fVar = cVar2.f279b;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        SharedPreferences.Editor editorEdit = fVar.f33405a.edit();
                        editorEdit.putLong("one_time_offer_start_time", jCurrentTimeMillis);
                        editorEdit.apply();
                    }
                    h hVar4 = relaunchPremiumActivity3.f28379j;
                    if (hVar4 == null) {
                        j0.r("premiumHelper");
                        throw null;
                    }
                    u uVar = new u((hVar4.f33417f.i() + 86400000) - System.currentTimeMillis(), relaunchPremiumActivity3);
                    relaunchPremiumActivity3.f28372c = uVar;
                    uVar.start();
                }
            } else {
                RelaunchPremiumActivity relaunchPremiumActivity4 = RelaunchPremiumActivity.this;
                h hVar5 = relaunchPremiumActivity4.f28379j;
                if (hVar5 == null) {
                    j0.r("premiumHelper");
                    throw null;
                }
                relaunchPremiumActivity4.f28380k = new e((String) hVar5.f33418g.h(oa.b.f34179k), null, null);
                va.e.f36781b.a().b();
            }
            return w.f31842a;
        }
    }

    static {
        new a(null);
    }

    @Override // android.app.Activity
    public void finish() {
        String str = this.f28381l;
        if (str == null) {
            j0.r("source");
            throw null;
        }
        if (j0.d(str, "relaunch")) {
            h hVar = this.f28379j;
            if (hVar == null) {
                j0.r("premiumHelper");
                throw null;
            }
            c cVar = hVar.f33422k;
            cVar.f278a.registerActivityLifecycleCallbacks(new ab.g(cVar));
        }
        super.finish();
    }

    @Override // androidx.fragment.app.n, androidx.activity.ComponentActivity, d0.l, android.app.Activity
    public void onCreate(Bundle bundle) {
        int iJ;
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
        getWindow().addFlags(67108864);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 28) {
            getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        }
        super.onCreate(bundle);
        h hVarA = h.f33410y.a();
        this.f28379j = hVarA;
        boolean zD = hVarA.f33422k.d();
        this.f28382m = zD;
        if (zD) {
            h hVar = this.f28379j;
            if (hVar == null) {
                j0.r("premiumHelper");
                throw null;
            }
            iJ = hVar.f33418g.k();
        } else {
            h hVar2 = this.f28379j;
            if (hVar2 == null) {
                j0.r("premiumHelper");
                throw null;
            }
            iJ = hVar2.f33418g.j();
        }
        setContentView(iJ);
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.f();
        }
        Intent intent = getIntent();
        String stringExtra = intent != null ? intent.getStringExtra("source") : null;
        if (stringExtra == null) {
            stringExtra = "relaunch";
        }
        this.f28381l = stringExtra;
        View viewFindViewById = findViewById(R.id.relaunch_premium_progress);
        j0.h(viewFindViewById, "findViewById(R.id.relaunch_premium_progress)");
        this.f28373d = viewFindViewById;
        this.f28377h = (TextView) findViewById(R.id.relaunch_premium_text_time);
        View viewFindViewById2 = findViewById(R.id.relaunch_premium_text_price);
        j0.h(viewFindViewById2, "findViewById(R.id.relaunch_premium_text_price)");
        this.f28375f = (TextView) viewFindViewById2;
        this.f28378i = (TextView) findViewById(R.id.relaunch_premium_text_price_strike);
        View viewFindViewById3 = findViewById(R.id.relaunch_premium_purchase_button);
        j0.h(viewFindViewById3, "findViewById(R.id.relaun…_premium_purchase_button)");
        this.f28374e = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.relaunch_premium_close_button);
        j0.h(viewFindViewById4, "findViewById(R.id.relaunch_premium_close_button)");
        this.f28376g = viewFindViewById4;
        TextView textView = this.f28378i;
        if (textView != null) {
            j0.f(textView);
            textView.setPaintFlags(textView.getPaintFlags() | 16);
        }
        View view = this.f28376g;
        if (view == null) {
            j0.r("buttonClose");
            throw null;
        }
        view.setOnClickListener(new View.OnClickListener(this) { // from class: ab.r

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ RelaunchPremiumActivity f323d;

            {
                this.f323d = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        RelaunchPremiumActivity relaunchPremiumActivity = this.f323d;
                        int i13 = RelaunchPremiumActivity.f28371n;
                        j0.i(relaunchPremiumActivity, "this$0");
                        relaunchPremiumActivity.finish();
                        return;
                    default:
                        RelaunchPremiumActivity relaunchPremiumActivity2 = this.f323d;
                        int i14 = RelaunchPremiumActivity.f28371n;
                        j0.i(relaunchPremiumActivity2, "this$0");
                        ma.e eVar = relaunchPremiumActivity2.f28380k;
                        if (eVar != null) {
                            ma.h hVar3 = relaunchPremiumActivity2.f28379j;
                            if (hVar3 == null) {
                                j0.r("premiumHelper");
                                throw null;
                            }
                            com.zipoapps.premiumhelper.a aVar = hVar3.f33419h;
                            String str = relaunchPremiumActivity2.f28381l;
                            if (str == null) {
                                j0.r("source");
                                throw null;
                            }
                            aVar.o(str, eVar.f33402a);
                            c0.z(androidx.activity.i.l(relaunchPremiumActivity2), null, null, new v(relaunchPremiumActivity2, null), 3, null);
                            return;
                        }
                        return;
                }
            }
        });
        TextView textView2 = this.f28374e;
        if (textView2 == null) {
            j0.r("buttonPurchase");
            throw null;
        }
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: ab.r

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ RelaunchPremiumActivity f323d;

            {
                this.f323d = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        RelaunchPremiumActivity relaunchPremiumActivity = this.f323d;
                        int i13 = RelaunchPremiumActivity.f28371n;
                        j0.i(relaunchPremiumActivity, "this$0");
                        relaunchPremiumActivity.finish();
                        return;
                    default:
                        RelaunchPremiumActivity relaunchPremiumActivity2 = this.f323d;
                        int i14 = RelaunchPremiumActivity.f28371n;
                        j0.i(relaunchPremiumActivity2, "this$0");
                        ma.e eVar = relaunchPremiumActivity2.f28380k;
                        if (eVar != null) {
                            ma.h hVar3 = relaunchPremiumActivity2.f28379j;
                            if (hVar3 == null) {
                                j0.r("premiumHelper");
                                throw null;
                            }
                            com.zipoapps.premiumhelper.a aVar = hVar3.f33419h;
                            String str = relaunchPremiumActivity2.f28381l;
                            if (str == null) {
                                j0.r("source");
                                throw null;
                            }
                            aVar.o(str, eVar.f33402a);
                            c0.z(androidx.activity.i.l(relaunchPremiumActivity2), null, null, new v(relaunchPremiumActivity2, null), 3, null);
                            return;
                        }
                        return;
                }
            }
        });
        View view2 = this.f28373d;
        if (view2 == null) {
            j0.r("progressView");
            throw null;
        }
        view2.setVisibility(0);
        TextView textView3 = this.f28374e;
        if (textView3 == null) {
            j0.r("buttonPurchase");
            throw null;
        }
        textView3.setVisibility(0);
        i.l(this).i(new b(null));
        if (i12 >= 28) {
            View viewFindViewById5 = getWindow().getDecorView().findViewById(android.R.id.content);
            viewFindViewById5.getViewTreeObserver().addOnGlobalLayoutListener(new t(viewFindViewById5, this));
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.n, android.app.Activity
    public void onStop() {
        CountDownTimer countDownTimer = this.f28372c;
        if (countDownTimer != null) {
            if (countDownTimer == null) {
                j0.r("timer");
                throw null;
            }
            countDownTimer.cancel();
        }
        super.onStop();
    }
}
