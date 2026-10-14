package com.yandex.mobile.ads.mediation.interstitial;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.MediationData;
import com.yandex.mobile.ads.impl.id0;
import com.yandex.mobile.ads.impl.k2;
import com.yandex.mobile.ads.impl.md0;
import com.yandex.mobile.ads.impl.nx;
import com.yandex.mobile.ads.impl.pw;
import com.yandex.mobile.ads.impl.qd0;
import com.yandex.mobile.ads.impl.sd0;
import com.yandex.mobile.ads.impl.tp0;
import com.yandex.mobile.ads.impl.vw;
import com.yandex.mobile.ads.impl.w3;

/* JADX INFO: loaded from: classes3.dex */
public final class d<T extends nx<T>> implements pw<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final id0<MediatedInterstitialAdapter, MediatedInterstitialAdapter.MediatedInterstitialAdapterListener> f27541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f27542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a<T> f27543c;

    public d(vw<T> vwVar, AdResponse<String> adResponse, MediationData mediationData) {
        k2 k2VarD = vwVar.d();
        sd0 sd0Var = new sd0(k2VarD);
        qd0 qd0Var = new qd0(k2VarD, adResponse);
        b bVar = new b(new md0(mediationData.c(), sd0Var, qd0Var));
        w3 w3VarE = vwVar.e();
        tp0 tp0Var = new tp0(vwVar, mediationData, w3VarE);
        c cVar = new c();
        this.f27542b = cVar;
        id0<MediatedInterstitialAdapter, MediatedInterstitialAdapter.MediatedInterstitialAdapterListener> id0Var = new id0<>(k2VarD, w3VarE, cVar, qd0Var, bVar, tp0Var);
        this.f27541a = id0Var;
        this.f27543c = new a<>(vwVar, id0Var);
    }

    @Override // com.yandex.mobile.ads.impl.pw
    public final void a(Context context) {
        this.f27541a.a(context);
    }

    @Override // com.yandex.mobile.ads.impl.pw
    public final void a(Context context, AdResponse<String> adResponse) {
        this.f27541a.a(context, this.f27543c);
    }

    @Override // com.yandex.mobile.ads.impl.pw
    public final void a(T t10) {
        MediatedInterstitialAdapter mediatedInterstitialAdapterA = this.f27542b.a();
        if (mediatedInterstitialAdapterA != null) {
            this.f27543c.a(t10);
            mediatedInterstitialAdapterA.showInterstitial();
        }
    }
}
