package com.yandex.mobile.ads.nativeads;

import android.view.View;
import com.yandex.mobile.ads.impl.th0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<String> f27995a;

    public y() {
        this(new ArrayList());
    }

    public y(List<String> list) {
        this.f27995a = list;
    }

    public final NativeAdViewBinder a(View view, th0 th0Var) {
        NativeAdViewBinder.Builder builder = new NativeAdViewBinder.Builder(view);
        NativeAdViewBinder.Builder priceView = builder.setAgeView(th0Var.g(view)).setBodyView(th0Var.a(view)).setCallToActionView(th0Var.d(view)).setDomainView(th0Var.l(view)).setFaviconView(th0Var.f(view)).setFeedbackView(th0Var.j(view)).setIconView(th0Var.m(view)).setMediaView(th0Var.b(view)).setPriceView(th0Var.c(view));
        View viewH = th0Var.h(view);
        if (!(viewH instanceof Rating)) {
            viewH = null;
        }
        priceView.setRatingView(viewH).setReviewCountView(th0Var.n(view)).setSponsoredView(th0Var.k(view)).setTitleView(th0Var.i(view)).setWarningView(th0Var.e(view));
        for (String str : this.f27995a) {
            View viewA = th0Var.a(view, str);
            if (viewA != null) {
                builder.a(viewA, str);
            }
        }
        return builder.build();
    }
}
