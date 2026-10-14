package com.yandex.mobile.ads.banner;

import android.content.Context;
import android.util.AttributeSet;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.common.VideoController;
import com.yandex.mobile.ads.impl.w3;

/* JADX INFO: loaded from: classes2.dex */
public final class BannerAdView extends g {
    public BannerAdView(Context context) {
        super(context);
    }

    public BannerAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BannerAdView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @Override // com.yandex.mobile.ads.banner.g
    public final e a(Context context, d dVar, w3 w3Var) {
        return new e(context, this, dVar, w3Var);
    }

    @Override // com.yandex.mobile.ads.banner.g
    public void destroy() {
        super.destroy();
    }

    @Override // com.yandex.mobile.ads.banner.g
    public AdSize getAdSize() {
        return super.getAdSize();
    }

    @Override // com.yandex.mobile.ads.banner.g
    public VideoController getVideoController() {
        return super.getVideoController();
    }

    @Override // com.yandex.mobile.ads.banner.g
    public void loadAd(AdRequest adRequest) {
        super.loadAd(adRequest);
    }

    @Override // com.yandex.mobile.ads.banner.g
    public void setAdSize(AdSize adSize) {
        super.setAdSize(adSize);
    }

    @Override // com.yandex.mobile.ads.banner.g
    public void setAdUnitId(String str) {
        super.setAdUnitId(str);
    }

    @Override // com.yandex.mobile.ads.banner.g
    public void setBannerAdEventListener(BannerAdEventListener bannerAdEventListener) {
        super.setBannerAdEventListener(bannerAdEventListener);
    }

    @Override // com.yandex.mobile.ads.banner.g
    public void setShouldOpenLinksInApp(boolean z10) {
        super.setShouldOpenLinksInApp(z10);
    }
}
