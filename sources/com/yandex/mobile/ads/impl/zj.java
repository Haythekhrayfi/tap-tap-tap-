package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;

/* JADX INFO: loaded from: classes3.dex */
public final class zj implements gx<InterstitialAdEventListener>, ww<d70> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final st0 f27344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final tt0 f27345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z60 f27346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d70 f27347d;

    public /* synthetic */ zj(Context context) {
        w3 w3Var = new w3();
        st0 st0Var = new st0(context, w3Var);
        tt0 tt0Var = new tt0();
        this(context, w3Var, st0Var, tt0Var, new pz(), new e70(context, tt0Var), new a70());
    }

    public zj(Context context, w3 w3Var, st0 st0Var, tt0 tt0Var, pz pzVar, e70 e70Var, a70 a70Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(w3Var, "adLoadingPhasesManager");
        fd.j0.i(st0Var, "adLoadListener");
        fd.j0.i(tt0Var, "adShowListener");
        fd.j0.i(pzVar, "htmlAdResponseReportManager");
        fd.j0.i(e70Var, "adContentFactory");
        fd.j0.i(a70Var, "adLoadControllerFactory");
        this.f27344a = st0Var;
        this.f27345b = tt0Var;
        z60 z60VarA = a70.a(context, w3Var, pzVar, e70Var, this);
        this.f27346c = z60VarA;
        k2 k2VarD = z60VarA.d();
        fd.j0.h(k2VarD, "loadController.adConfiguration");
        st0Var.a(k2VarD);
        st0Var.a(pzVar);
    }

    @Override // com.yandex.mobile.ads.impl.gx
    public final void a(AdRequest adRequest) {
        fd.j0.i(adRequest, "adRequest");
        this.f27346c.b(adRequest);
    }

    @Override // com.yandex.mobile.ads.impl.ww
    public final void a(nx nxVar) {
        d70 d70Var = (d70) nxVar;
        fd.j0.i(d70Var, "ad");
        this.f27347d = d70Var;
        this.f27344a.onAdLoaded();
    }

    @Override // com.yandex.mobile.ads.impl.ww
    public final void a(t2 t2Var) {
        fd.j0.i(t2Var, "error");
        this.f27344a.onAdFailedToLoad(new AdRequestError(t2Var.a(), t2Var.b()));
    }

    @Override // com.yandex.mobile.ads.impl.gx
    public final void a(InterstitialAdEventListener interstitialAdEventListener) {
        InterstitialAdEventListener interstitialAdEventListener2 = interstitialAdEventListener;
        this.f27344a.a(interstitialAdEventListener2);
        this.f27345b.a(interstitialAdEventListener2);
    }

    @Override // com.yandex.mobile.ads.impl.gx
    public final void a(String str) {
        this.f27346c.a(str);
    }

    @Override // com.yandex.mobile.ads.impl.gx
    public final boolean a() {
        return this.f27347d != null;
    }

    @Override // com.yandex.mobile.ads.impl.gx
    public final void b() {
        d70 d70Var = this.f27347d;
        if (d70Var != null) {
            d70Var.q();
        }
        this.f27346c.r();
        this.f27347d = null;
    }

    @Override // com.yandex.mobile.ads.impl.gx
    public final void c() {
        this.f27346c.u();
        d70 d70Var = this.f27347d;
        if (d70Var != null) {
            d70Var.m();
        }
        this.f27345b.a((InterstitialAdEventListener) null);
        this.f27344a.a((InterstitialAdEventListener) null);
        this.f27347d = null;
    }

    @Override // com.yandex.mobile.ads.impl.gx
    public final z3 d() {
        z3 z3VarG = this.f27346c.g();
        fd.j0.h(z3VarG, "loadController.adLoadingState");
        return z3VarG;
    }

    @Override // com.yandex.mobile.ads.impl.gx
    public final void setShouldOpenLinksInApp(boolean z10) {
        this.f27346c.a(z10);
    }
}
