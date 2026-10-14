package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.base.AdResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class by0 extends nx<by0> {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final iy0 f19351u;

    public /* synthetic */ by0(Context context, AdResponse adResponse, k2 k2Var, pw pwVar, vt0 vt0Var) {
        this(context, adResponse, k2Var, pwVar, vt0Var, new jy0(vt0Var), new pz(), new iw());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public by0(Context context, AdResponse<String> adResponse, k2 k2Var, pw<by0> pwVar, vt0 vt0Var, jy0 jy0Var, pz pzVar, iw iwVar) {
        super(context, adResponse, k2Var, vt0Var, iwVar, pwVar);
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(adResponse, "adResponse");
        fd.j0.i(k2Var, "adConfiguration");
        fd.j0.i(pwVar, "fullScreenController");
        fd.j0.i(vt0Var, "proxyRewardedAdShowListener");
        fd.j0.i(jy0Var, "rewardedExecutorProvider");
        fd.j0.i(pzVar, "htmlAdResponseReportManager");
        fd.j0.i(iwVar, "fullScreenAdVisibilityValidator");
        this.f19351u = jy0Var.a(context, adResponse, k2Var);
        pzVar.a(adResponse);
    }

    @Override // com.yandex.mobile.ads.impl.nx
    public final nx n() {
        return this;
    }

    @Override // com.yandex.mobile.ads.impl.nx, com.yandex.mobile.ads.impl.q71, com.yandex.mobile.ads.impl.o2
    public final void onReceiveResult(int i10, Bundle bundle) {
        if (i10 == 13) {
            r();
        } else {
            super.onReceiveResult(i10, bundle);
        }
    }

    public final void r() {
        iy0 iy0Var = this.f19351u;
        if (iy0Var != null) {
            iy0Var.a();
        }
    }
}
