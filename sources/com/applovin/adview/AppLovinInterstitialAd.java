package com.applovin.adview;

import android.content.Context;
import com.applovin.impl.adview.q;
import com.applovin.sdk.AppLovinSdk;

/* JADX INFO: loaded from: classes.dex */
public class AppLovinInterstitialAd {
    public static AppLovinInterstitialAdDialog create(AppLovinSdk appLovinSdk, Context context) {
        if (appLovinSdk == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (context != null) {
            return new q(appLovinSdk, context);
        }
        throw new IllegalArgumentException("No context specified");
    }

    public String toString() {
        return "AppLovinInterstitialAd{}";
    }
}
