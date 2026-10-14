package com.yandex.mobile.ads.appopenad;

import android.content.Context;
import com.yandex.mobile.ads.common.AdRequestConfiguration;
import com.yandex.mobile.ads.impl.ka;

/* JADX INFO: loaded from: classes2.dex */
final class AppOpenAdLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ka f18131a;

    public AppOpenAdLoader(Context context) {
        this.f18131a = new ka(context);
    }

    public void cancelLoading() {
        this.f18131a.a();
    }

    public void loadAd(AdRequestConfiguration adRequestConfiguration) {
        this.f18131a.a(adRequestConfiguration);
    }

    public void setAdLoadListener(AppOpenAdLoadListener appOpenAdLoadListener) {
        this.f18131a.a(appOpenAdLoadListener);
    }
}
