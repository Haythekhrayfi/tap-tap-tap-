package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.model.AdUnitIdBiddingSettings;
import com.yandex.mobile.ads.base.model.BiddingSettings;

/* JADX INFO: loaded from: classes3.dex */
final class n6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BiddingSettings f23238a;

    public n6(BiddingSettings biddingSettings) {
        this.f23238a = biddingSettings;
    }

    public final AdUnitIdBiddingSettings a(String str) {
        for (AdUnitIdBiddingSettings adUnitIdBiddingSettings : this.f23238a.c()) {
            if (adUnitIdBiddingSettings.c().equals(str)) {
                return adUnitIdBiddingSettings;
            }
        }
        return null;
    }
}
