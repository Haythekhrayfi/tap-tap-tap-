package com.yandex.mobile.ads.mediation.banner;

import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.common.AdRequestError;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
abstract class MediatedBannerAdapter extends com.yandex.mobile.ads.mediation.base.a {

    public interface MediatedBannerAdapterListener {
        void onAdClicked();

        void onAdFailedToLoad(AdRequestError adRequestError);

        void onAdImpression();

        void onAdLeftApplication();

        void onAdLoaded(View view);
    }

    public abstract void loadBanner(Context context, MediatedBannerAdapterListener mediatedBannerAdapterListener, Map<String, Object> map, Map<String, String> map2);

    public abstract void onInvalidate();
}
