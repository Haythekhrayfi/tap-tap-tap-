package com.yandex.mobile.ads.mediation.nativeads;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.MediationData;
import com.yandex.mobile.ads.impl.cj0;
import com.yandex.mobile.ads.impl.id0;
import com.yandex.mobile.ads.impl.k2;
import com.yandex.mobile.ads.impl.md0;
import com.yandex.mobile.ads.impl.qd0;
import com.yandex.mobile.ads.impl.rj0;
import com.yandex.mobile.ads.impl.sd0;
import com.yandex.mobile.ads.impl.tp0;
import com.yandex.mobile.ads.impl.w3;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements rj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f27599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final id0<MediatedNativeAdapter, MediatedNativeAdapterListener> f27600b;

    public m(com.yandex.mobile.ads.nativeads.o oVar, AdResponse<cj0> adResponse, MediationData mediationData) {
        k2 k2VarD = oVar.d();
        sd0 sd0Var = new sd0(k2VarD);
        qd0 qd0Var = new qd0(k2VarD, adResponse);
        k kVar = new k(new md0(mediationData.c(), sd0Var, qd0Var));
        w3 w3VarE = oVar.e();
        id0<MediatedNativeAdapter, MediatedNativeAdapterListener> id0Var = new id0<>(k2VarD, w3VarE, new l(), qd0Var, kVar, new tp0(oVar, mediationData, w3VarE));
        this.f27600b = id0Var;
        this.f27599a = new s(adResponse, oVar, id0Var);
    }

    @Override // com.yandex.mobile.ads.impl.rj0
    public final void a(Context context, AdResponse<cj0> adResponse) {
        this.f27600b.a(context, this.f27599a);
    }
}
