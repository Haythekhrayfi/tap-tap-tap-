package com.applovin.mediation.nativeAds;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class MaxNativeAdViewBinder {
    public final int advertiserTextViewId;
    public final int bodyTextViewId;
    public final int callToActionButtonId;
    public final int iconContentViewId;
    public final int iconImageViewId;
    public final int layoutResourceId;
    public final View mainView;
    public final int mediaContentFrameLayoutId;
    public final int mediaContentViewGroupId;
    public final int optionsContentFrameLayoutId;
    public final int optionsContentViewGroupId;
    public final int starRatingContentViewGroupId;
    public final String templateType;
    public final int titleTextViewId;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f11533a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f11534b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f11535c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f11536d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f11537e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f11538f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f11539g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f11540h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f11541i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f11542j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f11543k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f11544l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f11545m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f11546n;

        public Builder(int i10) {
            this(i10, null);
        }

        private Builder(int i10, View view) {
            this.f11535c = -1;
            this.f11536d = -1;
            this.f11537e = -1;
            this.f11538f = -1;
            this.f11539g = -1;
            this.f11540h = -1;
            this.f11541i = -1;
            this.f11542j = -1;
            this.f11543k = -1;
            this.f11544l = -1;
            this.f11545m = -1;
            this.f11534b = i10;
            this.f11533a = view;
        }

        public Builder(View view) {
            this(-1, view);
        }

        public MaxNativeAdViewBinder build() {
            return new MaxNativeAdViewBinder(this.f11533a, this.f11534b, this.f11535c, this.f11536d, this.f11537e, this.f11538f, this.f11539g, this.f11542j, this.f11540h, this.f11541i, this.f11543k, this.f11544l, this.f11545m, this.f11546n);
        }

        public Builder setAdvertiserTextViewId(int i10) {
            this.f11536d = i10;
            return this;
        }

        public Builder setBodyTextViewId(int i10) {
            this.f11537e = i10;
            return this;
        }

        public Builder setCallToActionButtonId(int i10) {
            this.f11545m = i10;
            return this;
        }

        @Deprecated
        public Builder setIconContentViewId(int i10) {
            this.f11539g = i10;
            return this;
        }

        public Builder setIconImageViewId(int i10) {
            this.f11538f = i10;
            return this;
        }

        @Deprecated
        public Builder setMediaContentFrameLayoutId(int i10) {
            this.f11544l = i10;
            return this;
        }

        public Builder setMediaContentViewGroupId(int i10) {
            this.f11543k = i10;
            return this;
        }

        @Deprecated
        public Builder setOptionsContentFrameLayoutId(int i10) {
            this.f11541i = i10;
            return this;
        }

        public Builder setOptionsContentViewGroupId(int i10) {
            this.f11540h = i10;
            return this;
        }

        public Builder setStarRatingContentViewGroupId(int i10) {
            this.f11542j = i10;
            return this;
        }

        public Builder setTemplateType(String str) {
            this.f11546n = str;
            return this;
        }

        public Builder setTitleTextViewId(int i10) {
            this.f11535c = i10;
            return this;
        }
    }

    private MaxNativeAdViewBinder(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, String str) {
        this.mainView = view;
        this.layoutResourceId = i10;
        this.titleTextViewId = i11;
        this.advertiserTextViewId = i12;
        this.bodyTextViewId = i13;
        this.iconImageViewId = i14;
        this.iconContentViewId = i15;
        this.starRatingContentViewGroupId = i16;
        this.optionsContentViewGroupId = i17;
        this.optionsContentFrameLayoutId = i18;
        this.mediaContentViewGroupId = i19;
        this.mediaContentFrameLayoutId = i20;
        this.callToActionButtonId = i21;
        this.templateType = str;
    }
}
