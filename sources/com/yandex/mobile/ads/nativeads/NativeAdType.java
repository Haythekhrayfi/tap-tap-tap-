package com.yandex.mobile.ads.nativeads;

import com.applovin.sdk.AppLovinEventTypes;

/* JADX INFO: loaded from: classes3.dex */
public enum NativeAdType {
    CONTENT(AppLovinEventTypes.USER_VIEWED_CONTENT),
    APP_INSTALL("app"),
    MEDIA("media");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27690a;

    NativeAdType(String str) {
        this.f27690a = str;
    }

    public String getValue() {
        return this.f27690a;
    }
}
