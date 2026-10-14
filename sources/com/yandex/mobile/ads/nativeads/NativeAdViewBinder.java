package com.yandex.mobile.ads.nativeads;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.mobile.ads.impl.zy0;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class NativeAdViewBinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f27691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f27692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zy0 f27693c;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f27694a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HashMap f27695b;

        @Deprecated
        public Builder(View view) {
            this.f27694a = view;
            this.f27695b = new HashMap();
        }

        public Builder(NativeAdView nativeAdView) {
            this((View) nativeAdView);
        }

        public final void a(View view, String str) {
            this.f27695b.put(str, view);
        }

        public NativeAdViewBinder build() {
            return new NativeAdViewBinder(this);
        }

        public Builder setAgeView(TextView textView) {
            this.f27695b.put("age", textView);
            return this;
        }

        public Builder setBodyView(TextView textView) {
            this.f27695b.put("body", textView);
            return this;
        }

        public Builder setCallToActionView(TextView textView) {
            this.f27695b.put("call_to_action", textView);
            return this;
        }

        public Builder setDomainView(TextView textView) {
            this.f27695b.put("domain", textView);
            return this;
        }

        public Builder setFaviconView(ImageView imageView) {
            this.f27695b.put("favicon", imageView);
            return this;
        }

        public Builder setFeedbackView(ImageView imageView) {
            this.f27695b.put("feedback", imageView);
            return this;
        }

        public Builder setIconView(ImageView imageView) {
            this.f27695b.put("icon", imageView);
            return this;
        }

        public Builder setMediaView(MediaView mediaView) {
            this.f27695b.put("media", mediaView);
            return this;
        }

        public Builder setPriceView(TextView textView) {
            this.f27695b.put("price", textView);
            return this;
        }

        public <T extends View & Rating> Builder setRatingView(T t10) {
            this.f27695b.put("rating", t10);
            return this;
        }

        public Builder setReviewCountView(TextView textView) {
            this.f27695b.put("review_count", textView);
            return this;
        }

        public Builder setSponsoredView(TextView textView) {
            this.f27695b.put("sponsored", textView);
            return this;
        }

        public Builder setTitleView(TextView textView) {
            this.f27695b.put("title", textView);
            return this;
        }

        public Builder setWarningView(TextView textView) {
            this.f27695b.put("warning", textView);
            return this;
        }
    }

    private NativeAdViewBinder(Builder builder) {
        this.f27691a = builder.f27694a;
        this.f27692b = builder.f27695b;
        this.f27693c = new zy0();
    }

    public TextView getAgeView() {
        zy0 zy0Var = this.f27693c;
        Object obj = this.f27692b.get("age");
        Objects.requireNonNull(zy0Var);
        return (TextView) zy0.a(TextView.class, obj);
    }

    public Map<String, View> getAssetViews() {
        return this.f27692b;
    }

    public TextView getBodyView() {
        zy0 zy0Var = this.f27693c;
        Object obj = this.f27692b.get("body");
        Objects.requireNonNull(zy0Var);
        return (TextView) zy0.a(TextView.class, obj);
    }

    public TextView getCallToActionView() {
        zy0 zy0Var = this.f27693c;
        Object obj = this.f27692b.get("call_to_action");
        Objects.requireNonNull(zy0Var);
        return (TextView) zy0.a(TextView.class, obj);
    }

    public TextView getDomainView() {
        zy0 zy0Var = this.f27693c;
        Object obj = this.f27692b.get("domain");
        Objects.requireNonNull(zy0Var);
        return (TextView) zy0.a(TextView.class, obj);
    }

    public ImageView getFaviconView() {
        zy0 zy0Var = this.f27693c;
        Object obj = this.f27692b.get("favicon");
        Objects.requireNonNull(zy0Var);
        return (ImageView) zy0.a(ImageView.class, obj);
    }

    public ImageView getFeedbackView() {
        zy0 zy0Var = this.f27693c;
        Object obj = this.f27692b.get("feedback");
        Objects.requireNonNull(zy0Var);
        return (ImageView) zy0.a(ImageView.class, obj);
    }

    public ImageView getIconView() {
        zy0 zy0Var = this.f27693c;
        Object obj = this.f27692b.get("icon");
        Objects.requireNonNull(zy0Var);
        return (ImageView) zy0.a(ImageView.class, obj);
    }

    public MediaView getMediaView() {
        zy0 zy0Var = this.f27693c;
        Object obj = this.f27692b.get("media");
        Objects.requireNonNull(zy0Var);
        return (MediaView) zy0.a(MediaView.class, obj);
    }

    public View getNativeAdView() {
        return this.f27691a;
    }

    public TextView getPriceView() {
        zy0 zy0Var = this.f27693c;
        Object obj = this.f27692b.get("price");
        Objects.requireNonNull(zy0Var);
        return (TextView) zy0.a(TextView.class, obj);
    }

    public View getRatingView() {
        zy0 zy0Var = this.f27693c;
        Object obj = this.f27692b.get("rating");
        Objects.requireNonNull(zy0Var);
        return (View) zy0.a(View.class, obj);
    }

    public TextView getReviewCountView() {
        zy0 zy0Var = this.f27693c;
        Object obj = this.f27692b.get("review_count");
        Objects.requireNonNull(zy0Var);
        return (TextView) zy0.a(TextView.class, obj);
    }

    public TextView getSponsoredView() {
        zy0 zy0Var = this.f27693c;
        Object obj = this.f27692b.get("sponsored");
        Objects.requireNonNull(zy0Var);
        return (TextView) zy0.a(TextView.class, obj);
    }

    public TextView getTitleView() {
        zy0 zy0Var = this.f27693c;
        Object obj = this.f27692b.get("title");
        Objects.requireNonNull(zy0Var);
        return (TextView) zy0.a(TextView.class, obj);
    }

    public TextView getWarningView() {
        zy0 zy0Var = this.f27693c;
        Object obj = this.f27692b.get("warning");
        Objects.requireNonNull(zy0Var);
        return (TextView) zy0.a(TextView.class, obj);
    }
}
