package com.applovin.mediation.hybridAds;

import android.os.Bundle;
import com.applovin.impl.sdk.e.ac;
import com.applovin.impl.sdk.e.r;
import com.applovin.impl.sdk.o;
import com.applovin.mediation.adapter.listeners.MaxAdapterListener;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.R;

/* JADX INFO: loaded from: classes.dex */
public class MaxHybridNativeAdActivity extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private MaxNativeAdView f11483d;

    public void a(c cVar, final MaxNativeAd maxNativeAd, o oVar, MaxAdapterListener maxAdapterListener) {
        super.a(cVar, oVar, maxAdapterListener);
        MaxNativeAdView maxNativeAdView = new MaxNativeAdView(maxNativeAd, new MaxNativeAdViewBinder.Builder(R.layout.max_hybrid_native_ad_view).setTitleTextViewId(R.id.applovin_native_title_text_view).setBodyTextViewId(R.id.applovin_native_body_text_view).setAdvertiserTextViewId(R.id.applovin_native_advertiser_text_view).setIconImageViewId(R.id.applovin_native_icon_image_view).setMediaContentViewGroupId(R.id.applovin_native_media_content_view).setOptionsContentViewGroupId(R.id.applovin_native_options_view).setCallToActionButtonId(R.id.applovin_native_cta_button).build(), this);
        this.f11483d = maxNativeAdView;
        maxNativeAdView.renderCustomNativeAdView(maxNativeAd);
        Runnable runnable = new Runnable() { // from class: com.applovin.mediation.hybridAds.MaxHybridNativeAdActivity.1
            @Override // java.lang.Runnable
            public void run() {
                if (maxNativeAd.prepareForInteraction(MaxHybridNativeAdActivity.this.f11483d.getClickableViews(), MaxHybridNativeAdActivity.this.f11483d)) {
                    return;
                }
                maxNativeAd.prepareViewForInteraction(MaxHybridNativeAdActivity.this.f11483d);
            }
        };
        if (maxNativeAd.shouldPrepareViewForInteractionOnMainThread()) {
            runOnUiThread(runnable);
        } else {
            oVar.G().a(new ac(oVar, "MaxHybridNativeAdPrepareForInteraction", runnable), r.b.MEDIATION_MAIN);
        }
    }

    @Override // com.applovin.mediation.hybridAds.b, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a(this.f11483d, "MaxHybridNativeAdActivity");
    }
}
