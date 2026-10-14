package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAd;

/* JADX INFO: loaded from: classes3.dex */
public final class c60 {
    public static v50 a(InstreamAd instreamAd) {
        if (instreamAd instanceof v50) {
            return (v50) instreamAd;
        }
        throw new IllegalArgumentException("You should pass InstreamAd received from InstreamAdLoader");
    }
}
