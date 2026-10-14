package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.MediationData;

/* JADX INFO: loaded from: classes3.dex */
public final class ej0 {
    public static sj0 a(AdResponse adResponse) {
        MediationData mediationDataA = adResponse.A();
        return mediationDataA != null ? new wd0(adResponse, mediationDataA) : new sl1();
    }
}
