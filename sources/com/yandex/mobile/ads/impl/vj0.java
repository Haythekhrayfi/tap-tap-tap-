package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;

/* JADX INFO: loaded from: classes3.dex */
final class vj0 {
    public static long a(AdResponse adResponse) {
        l6 l6VarN = adResponse.n();
        Long lU = adResponse.u();
        if (lU == null) {
            lU = Long.valueOf(l6VarN == l6.f22629d ? 5000L : 0L);
        }
        return lU.longValue();
    }
}
