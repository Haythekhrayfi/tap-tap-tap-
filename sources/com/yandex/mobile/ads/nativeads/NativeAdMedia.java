package com.yandex.mobile.ads.nativeads;

import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes3.dex */
public final class NativeAdMedia {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f27668a;

    public NativeAdMedia(float f10) {
        this.f27668a = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && NativeAdMedia.class == obj.getClass() && Float.compare(((NativeAdMedia) obj).f27668a, this.f27668a) == 0;
    }

    public float getAspectRatio() {
        return this.f27668a;
    }

    public int hashCode() {
        float f10 = this.f27668a;
        if (f10 != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            return Float.floatToIntBits(f10);
        }
        return 0;
    }
}
