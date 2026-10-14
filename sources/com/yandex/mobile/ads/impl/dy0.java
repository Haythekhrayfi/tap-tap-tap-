package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.reward.RewardData;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class dy0 extends vw<by0> {
    private final yx0 D;

    public /* synthetic */ dy0(Context context, ww wwVar, w3 w3Var, pz pzVar, cy0 cy0Var) {
        this(context, wwVar, w3Var, pzVar, cy0Var, new yx0());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy0(Context context, ww<by0> wwVar, w3 w3Var, pz pzVar, cy0 cy0Var, yx0 yx0Var) {
        super(context, l6.f22629d, wwVar, w3Var, cy0Var, pzVar);
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(wwVar, "loadEventListener");
        fd.j0.i(w3Var, "adLoadingPhasesManager");
        fd.j0.i(pzVar, "htmlAdResponseReportManager");
        fd.j0.i(cy0Var, "rewardedAdContentControllerFactory");
        fd.j0.i(yx0Var, "rewardDataValidator");
        this.D = yx0Var;
    }

    @Override // com.yandex.mobile.ads.impl.vw
    public final pw<by0> a(qw qwVar) {
        fd.j0.i(qwVar, "controllerFactory");
        pw<by0> pwVarA = qwVar.a(this);
        fd.j0.h(pwVarA, "controllerFactory.createRewardedAdController(this)");
        return pwVarA;
    }

    @Override // com.yandex.mobile.ads.impl.mz, com.yandex.mobile.ads.impl.ae, com.yandex.mobile.ads.impl.gx0.b
    public final void a(AdResponse<String> adResponse) {
        fd.j0.i(adResponse, "adResponse");
        RewardData rewardDataD = adResponse.D();
        Objects.requireNonNull(this.D);
        if (yx0.a(rewardDataD)) {
            super.a(adResponse);
        } else {
            b(v4.f25821d);
        }
    }
}
