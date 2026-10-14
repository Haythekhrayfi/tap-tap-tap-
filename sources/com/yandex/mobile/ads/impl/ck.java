package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;

/* JADX INFO: loaded from: classes3.dex */
public final class ck implements gx<RewardedAdEventListener>, ww<by0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ut0 f19531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vt0 f19532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dy0 f19533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private by0 f19534d;

    public /* synthetic */ ck(Context context) {
        w3 w3Var = new w3();
        ut0 ut0Var = new ut0(context, w3Var);
        vt0 vt0Var = new vt0();
        this(context, w3Var, ut0Var, vt0Var, new pz(), new cy0(context, vt0Var), new ey0());
    }

    public ck(Context context, w3 w3Var, ut0 ut0Var, vt0 vt0Var, pz pzVar, cy0 cy0Var, ey0 ey0Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(w3Var, "adLoadingPhasesManager");
        fd.j0.i(ut0Var, "adLoadListener");
        fd.j0.i(vt0Var, "adShowListener");
        fd.j0.i(pzVar, "htmlAdResponseReportManager");
        fd.j0.i(cy0Var, "rewardedAdContentControllerFactory");
        fd.j0.i(ey0Var, "rewardedAdLoadControllerFactory");
        this.f19531a = ut0Var;
        this.f19532b = vt0Var;
        dy0 dy0VarA = ey0.a(context, this, w3Var, pzVar, cy0Var);
        this.f19533c = dy0VarA;
        k2 k2VarD = dy0VarA.d();
        fd.j0.h(k2VarD, "loadController.adConfiguration");
        ut0Var.a(k2VarD);
        ut0Var.a(pzVar);
    }

    @Override // com.yandex.mobile.ads.impl.gx
    public final void a(AdRequest adRequest) {
        fd.j0.i(adRequest, "adRequest");
        this.f19533c.b(adRequest);
    }

    @Override // com.yandex.mobile.ads.impl.ww
    public final void a(nx nxVar) {
        by0 by0Var = (by0) nxVar;
        fd.j0.i(by0Var, "ad");
        this.f19534d = by0Var;
        this.f19531a.onAdLoaded();
    }

    @Override // com.yandex.mobile.ads.impl.ww
    public final void a(t2 t2Var) {
        fd.j0.i(t2Var, "error");
        this.f19531a.onAdFailedToLoad(new AdRequestError(t2Var.a(), t2Var.b()));
    }

    @Override // com.yandex.mobile.ads.impl.gx
    public final void a(RewardedAdEventListener rewardedAdEventListener) {
        RewardedAdEventListener rewardedAdEventListener2 = rewardedAdEventListener;
        this.f19531a.a(rewardedAdEventListener2);
        this.f19532b.a(rewardedAdEventListener2);
    }

    @Override // com.yandex.mobile.ads.impl.gx
    public final void a(String str) {
        this.f19533c.a(str);
    }

    @Override // com.yandex.mobile.ads.impl.gx
    public final boolean a() {
        return this.f19534d != null;
    }

    @Override // com.yandex.mobile.ads.impl.gx
    public final void b() {
        by0 by0Var = this.f19534d;
        if (by0Var != null) {
            by0Var.q();
        }
        this.f19533c.r();
        this.f19534d = null;
    }

    @Override // com.yandex.mobile.ads.impl.gx
    public final void c() {
        this.f19533c.u();
        by0 by0Var = this.f19534d;
        if (by0Var != null) {
            by0Var.m();
        }
        this.f19531a.a((RewardedAdEventListener) null);
        this.f19532b.a((RewardedAdEventListener) null);
        this.f19534d = null;
    }

    @Override // com.yandex.mobile.ads.impl.gx
    public final z3 d() {
        z3 z3VarG = this.f19533c.g();
        fd.j0.h(z3VarG, "loadController.adLoadingState");
        return z3VarG;
    }

    @Override // com.yandex.mobile.ads.impl.gx
    public final void setShouldOpenLinksInApp(boolean z10) {
        this.f19533c.a(z10);
    }
}
