package com.yandex.mobile.ads.mediation.banner;

import android.content.Context;
import com.yandex.mobile.ads.impl.ld0;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class c implements ld0<MediatedBannerAdapter, MediatedBannerAdapter.MediatedBannerAdapterListener> {
    @Override // com.yandex.mobile.ads.impl.ld0
    public final void a(Context context, com.yandex.mobile.ads.mediation.base.a aVar, Object obj, Map map, Map map2) {
        ((MediatedBannerAdapter) aVar).loadBanner(context, (MediatedBannerAdapter.MediatedBannerAdapterListener) obj, map, map2);
    }

    @Override // com.yandex.mobile.ads.impl.ld0
    public final void a(com.yandex.mobile.ads.mediation.base.a aVar) {
        ((MediatedBannerAdapter) aVar).onInvalidate();
    }
}
