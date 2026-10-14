package com.applovin.mediation.adapters;

import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class AppLovinAdapterNativeAd extends MaxNativeAd {
    private final AppLovinMediationAdapter parentAdapter;

    public AppLovinAdapterNativeAd(AppLovinMediationAdapter appLovinMediationAdapter, MaxNativeAd.Builder builder) {
        super(builder);
        this.parentAdapter = appLovinMediationAdapter;
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAd
    public boolean prepareForInteraction(List<View> list, ViewGroup viewGroup) {
        AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
        AppLovinNativeAdImpl appLovinNativeAdImpl = (AppLovinNativeAdImpl) appLovinMediationAdapter.loadedNativeAd;
        if (appLovinNativeAdImpl == null) {
            appLovinMediationAdapter.e("Failed to register native ad views: native ad is null");
            return false;
        }
        appLovinMediationAdapter.d("Preparing views for interaction: " + list + " with container: " + viewGroup);
        appLovinNativeAdImpl.registerViewsForInteraction(list, viewGroup);
        return true;
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAd
    public void prepareViewForInteraction(MaxNativeAdView maxNativeAdView) {
        AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
        AppLovinNativeAdImpl appLovinNativeAdImpl = (AppLovinNativeAdImpl) appLovinMediationAdapter.loadedNativeAd;
        if (appLovinNativeAdImpl == null) {
            appLovinMediationAdapter.e("Failed to register native ad view for interaction. Native ad is null");
            return;
        }
        appLovinMediationAdapter.d("Preparing view for interaction: " + maxNativeAdView);
        ArrayList arrayList = new ArrayList(5);
        if (StringUtils.isValidString(getTitle()) && maxNativeAdView.getTitleTextView() != null) {
            AppLovinMediationAdapter appLovinMediationAdapter2 = this.parentAdapter;
            StringBuilder sbA = defpackage.a.a("Adding title TextView: ");
            sbA.append(maxNativeAdView.getTitleTextView());
            appLovinMediationAdapter2.d(sbA.toString());
            arrayList.add(maxNativeAdView.getTitleTextView());
        }
        if (StringUtils.isValidString(getAdvertiser()) && maxNativeAdView.getAdvertiserTextView() != null) {
            AppLovinMediationAdapter appLovinMediationAdapter3 = this.parentAdapter;
            StringBuilder sbA2 = defpackage.a.a("Adding advertiser TextView: ");
            sbA2.append(maxNativeAdView.getAdvertiserTextView());
            appLovinMediationAdapter3.d(sbA2.toString());
            arrayList.add(maxNativeAdView.getAdvertiserTextView());
        }
        if (StringUtils.isValidString(getBody()) && maxNativeAdView.getBodyTextView() != null) {
            AppLovinMediationAdapter appLovinMediationAdapter4 = this.parentAdapter;
            StringBuilder sbA3 = defpackage.a.a("Adding body TextView: ");
            sbA3.append(maxNativeAdView.getBodyTextView());
            appLovinMediationAdapter4.d(sbA3.toString());
            arrayList.add(maxNativeAdView.getBodyTextView());
        }
        if (StringUtils.isValidString(getCallToAction()) && maxNativeAdView.getCallToActionButton() != null) {
            AppLovinMediationAdapter appLovinMediationAdapter5 = this.parentAdapter;
            StringBuilder sbA4 = defpackage.a.a("Adding CTA button: ");
            sbA4.append(maxNativeAdView.getCallToActionButton());
            appLovinMediationAdapter5.d(sbA4.toString());
            AppLovinMediationAdapter appLovinMediationAdapter6 = this.parentAdapter;
            StringBuilder sbA5 = defpackage.a.a("CTA button is clickable: ");
            sbA5.append(maxNativeAdView.getCallToActionButton().isClickable());
            appLovinMediationAdapter6.d(sbA5.toString());
            AppLovinMediationAdapter appLovinMediationAdapter7 = this.parentAdapter;
            StringBuilder sbA6 = defpackage.a.a("CTA button is enabled: ");
            sbA6.append(maxNativeAdView.getCallToActionButton().isEnabled());
            appLovinMediationAdapter7.d(sbA6.toString());
            AppLovinMediationAdapter appLovinMediationAdapter8 = this.parentAdapter;
            StringBuilder sbA7 = defpackage.a.a("CTA button has onClickListeners: ");
            sbA7.append(maxNativeAdView.getCallToActionButton().hasOnClickListeners());
            appLovinMediationAdapter8.d(sbA7.toString());
            arrayList.add(maxNativeAdView.getCallToActionButton());
        }
        if (getIcon() != null && maxNativeAdView.getIconImageView() != null) {
            AppLovinMediationAdapter appLovinMediationAdapter9 = this.parentAdapter;
            StringBuilder sbA8 = defpackage.a.a("Adding icon image view: ");
            sbA8.append(maxNativeAdView.getIconImageView());
            appLovinMediationAdapter9.d(sbA8.toString());
            arrayList.add(maxNativeAdView.getIconImageView());
        }
        appLovinNativeAdImpl.registerViewsForInteraction(arrayList, maxNativeAdView);
    }
}
