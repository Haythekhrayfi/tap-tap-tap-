package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdImage;
import com.yandex.mobile.ads.nativeads.NativeAdMedia;

/* JADX INFO: loaded from: classes3.dex */
public final class ya0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NativeAdAssets f26750a;

    public ya0(NativeAdAssets nativeAdAssets) {
        this.f26750a = nativeAdAssets;
    }

    public final Float a() {
        float width;
        NativeAdMedia media = this.f26750a.getMedia();
        NativeAdImage image = this.f26750a.getImage();
        if (media != null) {
            width = media.getAspectRatio();
        } else {
            if (image == null || image.getWidth() <= 0 || image.getHeight() <= 0) {
                return null;
            }
            width = image.getWidth() / image.getHeight();
        }
        return Float.valueOf(width);
    }
}
