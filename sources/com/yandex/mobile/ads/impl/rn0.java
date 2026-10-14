package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.mobile.ads.nativeads.MediaView;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class rn0 implements th0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f24804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zy0 f24805b = new zy0();

    public rn0(int i10) {
        this.f24804a = i10;
    }

    @Override // com.yandex.mobile.ads.impl.th0
    public final View a(View view, String str) {
        zy0 zy0Var = this.f24805b;
        StringBuilder sbA = android.support.v4.media.c.a(str, "_");
        sbA.append(this.f24804a);
        View viewFindViewWithTag = view.findViewWithTag(sbA.toString());
        Objects.requireNonNull(zy0Var);
        return (View) zy0.a(View.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.th0
    public final TextView a(View view) {
        zy0 zy0Var = this.f24805b;
        StringBuilder sbA = v60.a("body_");
        sbA.append(this.f24804a);
        View viewFindViewWithTag = view.findViewWithTag(sbA.toString());
        Objects.requireNonNull(zy0Var);
        return (TextView) zy0.a(TextView.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.th0
    public final MediaView b(View view) {
        zy0 zy0Var = this.f24805b;
        StringBuilder sbA = v60.a("media_");
        sbA.append(this.f24804a);
        View viewFindViewWithTag = view.findViewWithTag(sbA.toString());
        Objects.requireNonNull(zy0Var);
        return (MediaView) zy0.a(MediaView.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.th0
    public final TextView c(View view) {
        zy0 zy0Var = this.f24805b;
        StringBuilder sbA = v60.a("price_");
        sbA.append(this.f24804a);
        View viewFindViewWithTag = view.findViewWithTag(sbA.toString());
        Objects.requireNonNull(zy0Var);
        return (TextView) zy0.a(TextView.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.th0
    public final TextView d(View view) {
        zy0 zy0Var = this.f24805b;
        StringBuilder sbA = v60.a("call_to_action_");
        sbA.append(this.f24804a);
        View viewFindViewWithTag = view.findViewWithTag(sbA.toString());
        Objects.requireNonNull(zy0Var);
        return (TextView) zy0.a(TextView.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.th0
    public final TextView e(View view) {
        zy0 zy0Var = this.f24805b;
        StringBuilder sbA = v60.a("warning_");
        sbA.append(this.f24804a);
        View viewFindViewWithTag = view.findViewWithTag(sbA.toString());
        Objects.requireNonNull(zy0Var);
        return (TextView) zy0.a(TextView.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.th0
    public final ImageView f(View view) {
        zy0 zy0Var = this.f24805b;
        StringBuilder sbA = v60.a("favicon_");
        sbA.append(this.f24804a);
        View viewFindViewWithTag = view.findViewWithTag(sbA.toString());
        Objects.requireNonNull(zy0Var);
        return (ImageView) zy0.a(ImageView.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.th0
    public final TextView g(View view) {
        zy0 zy0Var = this.f24805b;
        StringBuilder sbA = v60.a("age_");
        sbA.append(this.f24804a);
        View viewFindViewWithTag = view.findViewWithTag(sbA.toString());
        Objects.requireNonNull(zy0Var);
        return (TextView) zy0.a(TextView.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.th0
    public final View h(View view) {
        zy0 zy0Var = this.f24805b;
        StringBuilder sbA = v60.a("rating_");
        sbA.append(this.f24804a);
        View viewFindViewWithTag = view.findViewWithTag(sbA.toString());
        Objects.requireNonNull(zy0Var);
        return (View) zy0.a(View.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.th0
    public final TextView i(View view) {
        zy0 zy0Var = this.f24805b;
        StringBuilder sbA = v60.a("title_");
        sbA.append(this.f24804a);
        View viewFindViewWithTag = view.findViewWithTag(sbA.toString());
        Objects.requireNonNull(zy0Var);
        return (TextView) zy0.a(TextView.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.th0
    public final ImageView j(View view) {
        zy0 zy0Var = this.f24805b;
        StringBuilder sbA = v60.a("feedback_");
        sbA.append(this.f24804a);
        View viewFindViewWithTag = view.findViewWithTag(sbA.toString());
        Objects.requireNonNull(zy0Var);
        return (ImageView) zy0.a(ImageView.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.th0
    public final TextView k(View view) {
        zy0 zy0Var = this.f24805b;
        StringBuilder sbA = v60.a("sponsored_");
        sbA.append(this.f24804a);
        View viewFindViewWithTag = view.findViewWithTag(sbA.toString());
        Objects.requireNonNull(zy0Var);
        return (TextView) zy0.a(TextView.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.th0
    public final TextView l(View view) {
        zy0 zy0Var = this.f24805b;
        StringBuilder sbA = v60.a("domain_");
        sbA.append(this.f24804a);
        View viewFindViewWithTag = view.findViewWithTag(sbA.toString());
        Objects.requireNonNull(zy0Var);
        return (TextView) zy0.a(TextView.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.th0
    public final ImageView m(View view) {
        zy0 zy0Var = this.f24805b;
        StringBuilder sbA = v60.a("icon_");
        sbA.append(this.f24804a);
        View viewFindViewWithTag = view.findViewWithTag(sbA.toString());
        Objects.requireNonNull(zy0Var);
        return (ImageView) zy0.a(ImageView.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.th0
    public final TextView n(View view) {
        zy0 zy0Var = this.f24805b;
        StringBuilder sbA = v60.a("review_count_");
        sbA.append(this.f24804a);
        View viewFindViewWithTag = view.findViewWithTag(sbA.toString());
        Objects.requireNonNull(zy0Var);
        return (TextView) zy0.a(TextView.class, viewFindViewWithTag);
    }
}
