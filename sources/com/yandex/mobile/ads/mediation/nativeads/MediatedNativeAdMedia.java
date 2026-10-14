package com.yandex.mobile.ads.mediation.nativeads;

/* JADX INFO: loaded from: classes3.dex */
final class MediatedNativeAdMedia {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f27580a;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f27581a;

        public Builder(float f10) {
            this.f27581a = f10;
        }

        public MediatedNativeAdMedia build() {
            return new MediatedNativeAdMedia(this);
        }
    }

    private MediatedNativeAdMedia(Builder builder) {
        this.f27580a = builder.f27581a;
    }

    public float getAspectRatio() {
        return this.f27580a;
    }
}
