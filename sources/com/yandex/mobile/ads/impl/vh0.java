package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.mobile.ads.nativeads.MediaView;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class vh0 implements th0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zy0 f25981a = new zy0();

    @Override // com.yandex.mobile.ads.impl.th0
    public final View a(View view, String str) {
        zy0 zy0Var = this.f25981a;
        View viewFindViewWithTag = view.findViewWithTag(str);
        Objects.requireNonNull(zy0Var);
        return (View) zy0.a(View.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.th0
    public final TextView a(View view) {
        zy0 zy0Var = this.f25981a;
        View viewFindViewWithTag = view.findViewWithTag("body");
        Objects.requireNonNull(zy0Var);
        return (TextView) zy0.a(TextView.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.th0
    public final MediaView b(View view) {
        zy0 zy0Var = this.f25981a;
        View viewFindViewWithTag = view.findViewWithTag("media");
        Objects.requireNonNull(zy0Var);
        return (MediaView) zy0.a(MediaView.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.th0
    public final TextView c(View view) {
        zy0 zy0Var = this.f25981a;
        View viewFindViewWithTag = view.findViewWithTag("price");
        Objects.requireNonNull(zy0Var);
        return (TextView) zy0.a(TextView.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.th0
    public final TextView d(View view) {
        zy0 zy0Var = this.f25981a;
        View viewFindViewWithTag = view.findViewWithTag("call_to_action");
        Objects.requireNonNull(zy0Var);
        return (TextView) zy0.a(TextView.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.th0
    public final TextView e(View view) {
        zy0 zy0Var = this.f25981a;
        View viewFindViewWithTag = view.findViewWithTag("warning");
        Objects.requireNonNull(zy0Var);
        return (TextView) zy0.a(TextView.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.th0
    public final ImageView f(View view) {
        zy0 zy0Var = this.f25981a;
        View viewFindViewWithTag = view.findViewWithTag("favicon");
        Objects.requireNonNull(zy0Var);
        return (ImageView) zy0.a(ImageView.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.th0
    public final TextView g(View view) {
        zy0 zy0Var = this.f25981a;
        View viewFindViewWithTag = view.findViewWithTag("age");
        Objects.requireNonNull(zy0Var);
        return (TextView) zy0.a(TextView.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.th0
    public final View h(View view) {
        zy0 zy0Var = this.f25981a;
        View viewFindViewWithTag = view.findViewWithTag("rating");
        Objects.requireNonNull(zy0Var);
        return (View) zy0.a(View.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.th0
    public final TextView i(View view) {
        zy0 zy0Var = this.f25981a;
        View viewFindViewWithTag = view.findViewWithTag("title");
        Objects.requireNonNull(zy0Var);
        return (TextView) zy0.a(TextView.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.th0
    public final ImageView j(View view) {
        zy0 zy0Var = this.f25981a;
        View viewFindViewWithTag = view.findViewWithTag("feedback");
        Objects.requireNonNull(zy0Var);
        return (ImageView) zy0.a(ImageView.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.th0
    public final TextView k(View view) {
        zy0 zy0Var = this.f25981a;
        View viewFindViewWithTag = view.findViewWithTag("sponsored");
        Objects.requireNonNull(zy0Var);
        return (TextView) zy0.a(TextView.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.th0
    public final TextView l(View view) {
        zy0 zy0Var = this.f25981a;
        View viewFindViewWithTag = view.findViewWithTag("domain");
        Objects.requireNonNull(zy0Var);
        return (TextView) zy0.a(TextView.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.th0
    public final ImageView m(View view) {
        zy0 zy0Var = this.f25981a;
        View viewFindViewWithTag = view.findViewWithTag("icon");
        Objects.requireNonNull(zy0Var);
        return (ImageView) zy0.a(ImageView.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.th0
    public final TextView n(View view) {
        zy0 zy0Var = this.f25981a;
        View viewFindViewWithTag = view.findViewWithTag("review_count");
        Objects.requireNonNull(zy0Var);
        return (TextView) zy0.a(TextView.class, viewFindViewWithTag);
    }
}
