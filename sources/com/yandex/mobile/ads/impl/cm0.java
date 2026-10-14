package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.nativeads.MediaView;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class cm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.yandex.mobile.ads.nativeads.e f19553a = new com.yandex.mobile.ads.nativeads.e();

    public final int a(MediaView mediaView) {
        Objects.requireNonNull(this.f19553a);
        int iB = com.yandex.mobile.ads.nativeads.e.b(mediaView);
        if (iB != 0) {
            return iB;
        }
        return 2;
    }
}
