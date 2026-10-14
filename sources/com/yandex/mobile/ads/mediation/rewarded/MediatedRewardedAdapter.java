package com.yandex.mobile.ads.mediation.rewarded;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
abstract class MediatedRewardedAdapter extends com.yandex.mobile.ads.mediation.base.a {
    public abstract boolean isLoaded();

    public abstract void loadRewardedAd(Context context, MediatedRewardedAdapterListener mediatedRewardedAdapterListener, Map<String, Object> map, Map<String, String> map2);

    public abstract void onInvalidate();

    public abstract void showRewardedAd();
}
