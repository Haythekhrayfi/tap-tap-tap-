package com.applovin.mediation.nativeAds;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.applovin.impl.mediation.nativeAds.MaxNativeAdImpl;
import com.applovin.mediation.MaxAdFormat;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class MaxNativeAd extends MaxNativeAdImpl {
    private static final float MINIMUM_STARS_TO_RENDER = 3.0f;
    private final String advertiser;
    private final String body;
    private final String callToAction;
    private final MaxAdFormat format;
    private final MaxNativeAdImage icon;
    private final View iconView;
    private boolean isExpired;
    private final MaxNativeAdImage mainImage;
    private final float mediaContentAspectRatio;
    private final View mediaView;
    private MaxNativeAdView nativeAdView;
    private final View optionsView;
    private final Double starRating;
    private final String title;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MaxAdFormat f11499a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f11500b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f11501c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f11502d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f11503e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private MaxNativeAdImage f11504f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private View f11505g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private View f11506h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private View f11507i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private MaxNativeAdImage f11508j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private float f11509k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Double f11510l;

        public MaxNativeAd build() {
            return new MaxNativeAd(this);
        }

        public Builder setAdFormat(MaxAdFormat maxAdFormat) {
            this.f11499a = maxAdFormat;
            return this;
        }

        public Builder setAdvertiser(String str) {
            this.f11501c = str;
            return this;
        }

        public Builder setBody(String str) {
            this.f11502d = str;
            return this;
        }

        public Builder setCallToAction(String str) {
            this.f11503e = str;
            return this;
        }

        public Builder setIcon(MaxNativeAdImage maxNativeAdImage) {
            this.f11504f = maxNativeAdImage;
            return this;
        }

        public Builder setIconView(View view) {
            this.f11505g = view;
            return this;
        }

        public Builder setMainImage(MaxNativeAdImage maxNativeAdImage) {
            this.f11508j = maxNativeAdImage;
            return this;
        }

        public Builder setMediaContentAspectRatio(float f10) {
            this.f11509k = f10;
            return this;
        }

        public Builder setMediaView(View view) {
            this.f11507i = view;
            return this;
        }

        public Builder setOptionsView(View view) {
            this.f11506h = view;
            return this;
        }

        public Builder setStarRating(Double d10) {
            this.f11510l = d10;
            return this;
        }

        public Builder setTitle(String str) {
            this.f11500b = str;
            return this;
        }
    }

    public static class MaxNativeAdImage {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Drawable f11511a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Uri f11512b;

        public MaxNativeAdImage(Drawable drawable) {
            this.f11511a = drawable;
        }

        public MaxNativeAdImage(Uri uri) {
            this.f11512b = uri;
        }

        public Drawable getDrawable() {
            return this.f11511a;
        }

        public Uri getUri() {
            return this.f11512b;
        }
    }

    public MaxNativeAd(Builder builder) {
        this.format = builder.f11499a;
        this.title = builder.f11500b;
        this.advertiser = builder.f11501c;
        this.body = builder.f11502d;
        this.callToAction = builder.f11503e;
        this.icon = builder.f11504f;
        this.iconView = builder.f11505g;
        this.optionsView = builder.f11506h;
        this.mediaView = builder.f11507i;
        this.mainImage = builder.f11508j;
        this.mediaContentAspectRatio = builder.f11509k;
        Double d10 = builder.f11510l;
        this.starRating = (d10 == null || d10.doubleValue() < 3.0d) ? null : d10;
    }

    public final String getAdvertiser() {
        return this.advertiser;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getCallToAction() {
        return this.callToAction;
    }

    public final MaxAdFormat getFormat() {
        return this.format;
    }

    public final MaxNativeAdImage getIcon() {
        return this.icon;
    }

    public final View getIconView() {
        return this.iconView;
    }

    public final MaxNativeAdImage getMainImage() {
        return this.mainImage;
    }

    public final float getMediaContentAspectRatio() {
        return this.mediaContentAspectRatio;
    }

    public final View getMediaView() {
        return this.mediaView;
    }

    public final View getOptionsView() {
        return this.optionsView;
    }

    public final Double getStarRating() {
        return this.starRating;
    }

    public final String getTitle() {
        return this.title;
    }

    public boolean isContainerClickable() {
        return false;
    }

    public final boolean isExpired() {
        return this.isExpired;
    }

    public void performClick() {
        Button callToActionButton;
        MaxNativeAdView maxNativeAdView = this.nativeAdView;
        if (maxNativeAdView == null || (callToActionButton = maxNativeAdView.getCallToActionButton()) == null) {
            return;
        }
        callToActionButton.performClick();
    }

    public boolean prepareForInteraction(List<View> list, ViewGroup viewGroup) {
        return false;
    }

    @Deprecated
    public void prepareViewForInteraction(MaxNativeAdView maxNativeAdView) {
    }

    public void setExpired() {
        this.isExpired = true;
    }

    public void setNativeAdView(MaxNativeAdView maxNativeAdView) {
        this.nativeAdView = maxNativeAdView;
    }

    public boolean shouldPrepareViewForInteractionOnMainThread() {
        return true;
    }
}
