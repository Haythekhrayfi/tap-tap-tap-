package com.yandex.mobile.ads.mediation.interstitial;

import android.content.Context;
import com.yandex.mobile.ads.common.AdRequestError;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
abstract class MediatedInterstitialAdapter extends com.yandex.mobile.ads.mediation.base.a {

    public interface MediatedInterstitialAdapterListener {
        void onAdImpression();

        void onInterstitialClicked();

        void onInterstitialDismissed();

        void onInterstitialFailedToLoad(AdRequestError adRequestError);

        void onInterstitialLeftApplication();

        void onInterstitialLoaded();

        void onInterstitialShown();
    }

    public abstract boolean isLoaded();

    public abstract void loadInterstitial(Context context, MediatedInterstitialAdapterListener mediatedInterstitialAdapterListener, Map<String, Object> map, Map<String, String> map2);

    public abstract void onInvalidate();

    public abstract void showInterstitial();
}
