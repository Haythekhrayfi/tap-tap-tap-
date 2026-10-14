package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.MediationData;

/* JADX INFO: loaded from: classes3.dex */
public final class rw {
    public static qw a(AdResponse adResponse) {
        MediationData mediationDataA = adResponse.A();
        if (mediationDataA != null) {
            return new td0(adResponse, mediationDataA);
        }
        return cl.f19542b.equals(adResponse.v()) ? new tl1() : new il1();
    }
}
