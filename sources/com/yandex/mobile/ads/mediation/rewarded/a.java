package com.yandex.mobile.ads.mediation.rewarded;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.MediationData;
import com.yandex.mobile.ads.impl.by0;
import com.yandex.mobile.ads.impl.dy0;
import com.yandex.mobile.ads.impl.id0;
import com.yandex.mobile.ads.impl.k2;
import com.yandex.mobile.ads.impl.md0;
import com.yandex.mobile.ads.impl.nx;
import com.yandex.mobile.ads.impl.pw;
import com.yandex.mobile.ads.impl.qd0;
import com.yandex.mobile.ads.impl.sd0;
import com.yandex.mobile.ads.impl.tp0;
import com.yandex.mobile.ads.impl.w3;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements pw<by0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final id0<MediatedRewardedAdapter, MediatedRewardedAdapterListener> f27633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f27634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f27635c;

    public a(dy0 dy0Var, AdResponse<String> adResponse, MediationData mediationData) {
        k2 k2VarD = dy0Var.d();
        sd0 sd0Var = new sd0(k2VarD);
        qd0 qd0Var = new qd0(k2VarD, adResponse);
        b bVar = new b(new md0(mediationData.c(), sd0Var, qd0Var));
        w3 w3VarE = dy0Var.e();
        tp0 tp0Var = new tp0(dy0Var, mediationData, w3VarE);
        c cVar = new c();
        this.f27634b = cVar;
        id0<MediatedRewardedAdapter, MediatedRewardedAdapterListener> id0Var = new id0<>(k2VarD, w3VarE, cVar, qd0Var, bVar, tp0Var);
        this.f27633a = id0Var;
        this.f27635c = new d(dy0Var, id0Var);
    }

    @Override // com.yandex.mobile.ads.impl.pw
    public final void a(Context context) {
        this.f27633a.a(context);
    }

    @Override // com.yandex.mobile.ads.impl.pw
    public final void a(Context context, AdResponse<String> adResponse) {
        this.f27633a.a(context, this.f27635c);
    }

    @Override // com.yandex.mobile.ads.impl.pw
    public final void a(nx nxVar) {
        by0 by0Var = (by0) nxVar;
        MediatedRewardedAdapter mediatedRewardedAdapterA = this.f27634b.a();
        if (mediatedRewardedAdapterA != null) {
            this.f27635c.a(by0Var);
            mediatedRewardedAdapterA.showRewardedAd();
        }
    }
}
