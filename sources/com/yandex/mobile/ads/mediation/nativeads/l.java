package com.yandex.mobile.ads.mediation.nativeads;

import android.content.Context;
import com.yandex.mobile.ads.impl.ld0;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class l implements ld0<MediatedNativeAdapter, MediatedNativeAdapterListener> {
    @Override // com.yandex.mobile.ads.impl.ld0
    public final void a(Context context, com.yandex.mobile.ads.mediation.base.a aVar, Object obj, Map map, Map map2) {
        ((MediatedNativeAdapter) aVar).loadAd(context, (MediatedNativeAdapterListener) obj, map, map2);
    }

    @Override // com.yandex.mobile.ads.impl.ld0
    public final /* bridge */ /* synthetic */ void a(com.yandex.mobile.ads.mediation.base.a aVar) {
    }
}
