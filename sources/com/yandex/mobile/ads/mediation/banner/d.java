package com.yandex.mobile.ads.mediation.banner;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.MediationData;
import com.yandex.mobile.ads.impl.ed;
import com.yandex.mobile.ads.impl.id0;
import com.yandex.mobile.ads.impl.k2;
import com.yandex.mobile.ads.impl.md0;
import com.yandex.mobile.ads.impl.qd0;
import com.yandex.mobile.ads.impl.tp0;
import com.yandex.mobile.ads.impl.w3;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements ed {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f27518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final id0<MediatedBannerAdapter, MediatedBannerAdapter.MediatedBannerAdapterListener> f27519b;

    public d(com.yandex.mobile.ads.banner.e eVar, AdResponse<String> adResponse, MediationData mediationData) {
        k2 k2VarD = eVar.d();
        e eVar2 = new e(k2VarD);
        qd0 qd0Var = new qd0(k2VarD, adResponse);
        b bVar = new b(new md0(mediationData.c(), eVar2, qd0Var));
        w3 w3VarE = eVar.e();
        id0<MediatedBannerAdapter, MediatedBannerAdapter.MediatedBannerAdapterListener> id0Var = new id0<>(k2VarD, w3VarE, new c(), qd0Var, bVar, new tp0(eVar, mediationData, w3VarE));
        this.f27519b = id0Var;
        this.f27518a = new a(eVar, id0Var, new h(eVar.y()));
    }

    @Override // com.yandex.mobile.ads.impl.ed
    public final void a(Context context) {
        this.f27519b.a(context);
    }

    @Override // com.yandex.mobile.ads.impl.ed
    public final void a(Context context, AdResponse<String> adResponse) {
        this.f27519b.a(context, this.f27518a);
    }
}
