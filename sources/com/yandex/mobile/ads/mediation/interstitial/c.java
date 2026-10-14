package com.yandex.mobile.ads.mediation.interstitial;

import android.content.Context;
import com.yandex.mobile.ads.impl.ld0;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class c implements ld0<MediatedInterstitialAdapter, MediatedInterstitialAdapter.MediatedInterstitialAdapterListener> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MediatedInterstitialAdapter f27540a;

    public final MediatedInterstitialAdapter a() {
        return this.f27540a;
    }

    @Override // com.yandex.mobile.ads.impl.ld0
    public final void a(Context context, com.yandex.mobile.ads.mediation.base.a aVar, Object obj, Map map, Map map2) {
        MediatedInterstitialAdapter mediatedInterstitialAdapter = (MediatedInterstitialAdapter) aVar;
        this.f27540a = mediatedInterstitialAdapter;
        mediatedInterstitialAdapter.loadInterstitial(context, (MediatedInterstitialAdapter.MediatedInterstitialAdapterListener) obj, map, map2);
    }

    @Override // com.yandex.mobile.ads.impl.ld0
    public final void a(com.yandex.mobile.ads.mediation.base.a aVar) {
        ((MediatedInterstitialAdapter) aVar).onInvalidate();
    }
}
