package com.yandex.mobile.ads.mediation.interstitial;

import android.content.Context;
import com.yandex.mobile.ads.impl.hd0;
import com.yandex.mobile.ads.impl.jd0;
import com.yandex.mobile.ads.impl.md0;

/* JADX INFO: loaded from: classes3.dex */
final class b implements jd0<MediatedInterstitialAdapter> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final md0<MediatedInterstitialAdapter> f27539a;

    public b(md0<MediatedInterstitialAdapter> md0Var) {
        this.f27539a = md0Var;
    }

    @Override // com.yandex.mobile.ads.impl.jd0
    public final hd0<MediatedInterstitialAdapter> a(Context context) {
        return this.f27539a.a(context, MediatedInterstitialAdapter.class);
    }
}
