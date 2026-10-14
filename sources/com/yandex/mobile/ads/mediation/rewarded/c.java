package com.yandex.mobile.ads.mediation.rewarded;

import android.content.Context;
import com.yandex.mobile.ads.impl.ld0;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class c implements ld0<MediatedRewardedAdapter, MediatedRewardedAdapterListener> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MediatedRewardedAdapter f27637a;

    public final MediatedRewardedAdapter a() {
        return this.f27637a;
    }

    @Override // com.yandex.mobile.ads.impl.ld0
    public final void a(Context context, com.yandex.mobile.ads.mediation.base.a aVar, Object obj, Map map, Map map2) {
        MediatedRewardedAdapter mediatedRewardedAdapter = (MediatedRewardedAdapter) aVar;
        this.f27637a = mediatedRewardedAdapter;
        mediatedRewardedAdapter.loadRewardedAd(context, (MediatedRewardedAdapterListener) obj, map, map2);
    }

    @Override // com.yandex.mobile.ads.impl.ld0
    public final void a(com.yandex.mobile.ads.mediation.base.a aVar) {
        ((MediatedRewardedAdapter) aVar).onInvalidate();
    }
}
