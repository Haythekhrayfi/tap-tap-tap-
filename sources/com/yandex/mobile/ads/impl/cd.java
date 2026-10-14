package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.MediationData;

/* JADX INFO: loaded from: classes3.dex */
public final class cd {
    public static fd a(AdResponse adResponse) {
        fd.j0.i(adResponse, "adResponse");
        MediationData mediationDataA = adResponse.A();
        if (mediationDataA != null) {
            return new rd0(adResponse, mediationDataA);
        }
        return cl.f19542b == adResponse.v() ? new ql1() : new qk1();
    }
}
