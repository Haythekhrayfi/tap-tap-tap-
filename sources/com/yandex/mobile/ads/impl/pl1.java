package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewTreeObserver;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.SizeInfo;
import com.yandex.mobile.ads.nativeads.NativeAd;

/* JADX INFO: loaded from: classes3.dex */
public final class pl1 implements ed {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.yandex.mobile.ads.banner.e f24081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final uk0 f24082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final nd f24083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final mj0 f24084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final nk1 f24085e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final pj0 f24086f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Handler f24087g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final i01 f24088h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final w60 f24089i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final dd f24090j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f24091k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private AdResponse<String> f24092l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private NativeAd f24093m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f24094n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private md f24095o;

    public final class a implements mx0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f24096a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AdResponse<?> f24097b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ pl1 f24098c;

        public a(pl1 pl1Var, Context context, AdResponse<?> adResponse) {
            fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            fd.j0.i(adResponse, "adResponse");
            this.f24098c = pl1Var;
            this.f24096a = context;
            this.f24097b = adResponse;
        }

        @Override // com.yandex.mobile.ads.impl.mx0
        public final void a() {
            fd.j0.i(v4.f25821d, "adRequestError");
            this.f24098c.f24085e.a(this.f24096a, this.f24097b, this.f24098c.f24084d);
            this.f24098c.f24085e.a(this.f24096a, this.f24097b, (nj0) null);
        }

        @Override // com.yandex.mobile.ads.impl.mx0
        public final void a(cj0 cj0Var) {
            fd.j0.i(cj0Var, "nativeAdResponse");
            nj0 nj0Var = new nj0(cj0Var);
            this.f24098c.f24085e.a(this.f24096a, this.f24097b, this.f24098c.f24084d);
            this.f24098c.f24085e.a(this.f24096a, this.f24097b, nj0Var);
        }
    }

    public final class b implements uk0.b {
        public b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(pl1 pl1Var) {
            fd.j0.i(pl1Var, "this$0");
            pl1Var.f24081a.p();
            pl1Var.a();
        }

        @Override // com.yandex.mobile.ads.impl.uk0.b
        public final void a(t2 t2Var) {
            fd.j0.i(t2Var, "adRequestError");
            if (pl1.this.f24094n) {
                return;
            }
            pl1.f(pl1.this);
            pl1.this.f24081a.b(t2Var);
        }

        @Override // com.yandex.mobile.ads.impl.uk0.b
        public final void a(NativeAd nativeAd) {
            fd.j0.i(nativeAd, "createdNativeAd");
            if (pl1.this.f24094n) {
                return;
            }
            pl1.this.f24093m = nativeAd;
            pl1.this.f24087g.post(new lp1(pl1.this, 1));
        }
    }

    public /* synthetic */ pl1(com.yandex.mobile.ads.banner.e eVar) {
        uk0 uk0Var = new uk0(eVar.i(), eVar.d(), eVar.e());
        nd ndVar = new nd();
        mj0 mj0Var = new mj0(eVar.d());
        nk1 nk1Var = new nk1(eVar.d());
        pj0 pj0Var = new pj0(eVar);
        Handler handler = new Handler(Looper.getMainLooper());
        i01 i01VarB = i01.b();
        fd.j0.h(i01VarB, "getInstance()");
        Context contextI = eVar.i();
        fd.j0.h(contextI, "loadController.context");
        this(eVar, uk0Var, ndVar, mj0Var, nk1Var, pj0Var, handler, i01VarB, new w60(contextI), new dd());
    }

    public pl1(com.yandex.mobile.ads.banner.e eVar, uk0 uk0Var, nd ndVar, mj0 mj0Var, nk1 nk1Var, pj0 pj0Var, Handler handler, i01 i01Var, w60 w60Var, dd ddVar) {
        fd.j0.i(eVar, "loadController");
        fd.j0.i(uk0Var, "nativeResponseCreator");
        fd.j0.i(ndVar, "contentControllerCreator");
        fd.j0.i(mj0Var, "requestParameterManager");
        fd.j0.i(nk1Var, "yandexAdapterReporter");
        fd.j0.i(pj0Var, "adEventListener");
        fd.j0.i(handler, "handler");
        fd.j0.i(i01Var, "sdkSettings");
        fd.j0.i(w60Var, "sizeInfoController");
        fd.j0.i(ddVar, "sizeValidator");
        this.f24081a = eVar;
        this.f24082b = uk0Var;
        this.f24083c = ndVar;
        this.f24084d = mj0Var;
        this.f24085e = nk1Var;
        this.f24086f = pj0Var;
        this.f24087g = handler;
        this.f24088h = i01Var;
        this.f24089i = w60Var;
        this.f24090j = ddVar;
        this.f24091k = new m9.b(this);
    }

    public static final void f(pl1 pl1Var) {
        pl1Var.f24092l = null;
        pl1Var.f24093m = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(pl1 pl1Var) {
        fd.j0.i(pl1Var, "this$0");
        w60 w60Var = pl1Var.f24089i;
        k2 k2VarD = pl1Var.f24081a.d();
        fd.j0.h(k2VarD, "loadController.adConfiguration");
        w60Var.a(k2VarD, pl1Var.f24081a.y());
        pl1Var.f24087g.postDelayed(new lp1(pl1Var, 0), 50L);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(pl1 pl1Var) {
        fd.j0.i(pl1Var, "this$0");
        sg1.a(pl1Var.f24081a.y(), false);
    }

    public final void a() {
        NativeAd nativeAd;
        if (this.f24094n) {
            return;
        }
        AdResponse<String> adResponse = this.f24092l;
        com.yandex.mobile.ads.banner.g gVarY = this.f24081a.y();
        fd.j0.h(gVarY, "loadController.adView");
        if (adResponse == null || (nativeAd = this.f24093m) == null) {
            return;
        }
        nd ndVar = this.f24083c;
        Context contextI = this.f24081a.i();
        fd.j0.h(contextI, "loadController.context");
        md mdVarA = ndVar.a(contextI, adResponse, (com.yandex.mobile.ads.nativeads.u) nativeAd, gVarY, this.f24086f, this.f24091k);
        this.f24095o = mdVarA;
        mdVarA.b();
    }

    @Override // com.yandex.mobile.ads.impl.ed
    public final void a(Context context) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        md mdVar = this.f24095o;
        if (mdVar != null) {
            mdVar.a();
        }
        this.f24082b.a();
        this.f24092l = null;
        this.f24093m = null;
        this.f24094n = true;
    }

    @Override // com.yandex.mobile.ads.impl.ed
    public final void a(Context context, AdResponse<String> adResponse) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(adResponse, "response");
        nz0 nz0VarA = this.f24088h.a(context);
        if (!(nz0VarA != null ? nz0VarA.R() : false)) {
            this.f24081a.b(v4.f25818a);
            return;
        }
        if (this.f24094n) {
            return;
        }
        SizeInfo sizeInfoJ = this.f24081a.j();
        SizeInfo sizeInfoG = adResponse.G();
        fd.j0.h(sizeInfoG, "response.sizeInfo");
        this.f24092l = adResponse;
        if (sizeInfoJ != null && c21.a(context, adResponse, sizeInfoG, this.f24090j, sizeInfoJ)) {
            this.f24082b.a(adResponse, new b(), new a(this, context, adResponse));
            return;
        }
        t2 t2VarA = v4.a(sizeInfoJ != null ? sizeInfoJ.c(context) : 0, sizeInfoJ != null ? sizeInfoJ.a(context) : 0, sizeInfoG.e(), sizeInfoG.c(), eh1.c(context), eh1.b(context));
        String strB = t2VarA.b();
        fd.j0.h(strB, "error.description");
        o60.a(strB, new Object[0]);
        this.f24081a.b(t2VarA);
    }
}
