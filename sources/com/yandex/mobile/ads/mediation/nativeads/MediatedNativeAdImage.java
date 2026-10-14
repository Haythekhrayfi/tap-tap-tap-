package com.yandex.mobile.ads.mediation.nativeads;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
final class MediatedNativeAdImage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f27573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f27574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Drawable f27575d;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f27576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f27577b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f27578c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Drawable f27579d;

        public Builder(String str) {
            this.f27578c = str;
        }

        public MediatedNativeAdImage build() {
            return new MediatedNativeAdImage(this);
        }

        public Builder setDrawable(Drawable drawable) {
            this.f27579d = drawable;
            return this;
        }

        public Builder setHeight(int i10) {
            this.f27577b = i10;
            return this;
        }

        public Builder setWidth(int i10) {
            this.f27576a = i10;
            return this;
        }
    }

    private MediatedNativeAdImage(Builder builder) {
        this.f27574c = builder.f27578c;
        this.f27572a = builder.f27576a;
        this.f27573b = builder.f27577b;
        this.f27575d = builder.f27579d;
    }

    public Drawable getDrawable() {
        return this.f27575d;
    }

    public int getHeight() {
        return this.f27573b;
    }

    public String getUrl() {
        return this.f27574c;
    }

    public int getWidth() {
        return this.f27572a;
    }
}
