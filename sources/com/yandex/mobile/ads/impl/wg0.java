package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.FrameLayout;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.nativeads.view.pager.MultiBannerControlsContainer;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class wg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bz0<MultiBannerControlsContainer> f26274a = new bz0<>();

    public final MultiBannerControlsContainer a(Context context) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        bz0<MultiBannerControlsContainer> bz0Var = this.f26274a;
        int i10 = R.layout.yandex_ads_internal_multibanner_controls;
        Objects.requireNonNull(bz0Var);
        MultiBannerControlsContainer multiBannerControlsContainer = (MultiBannerControlsContainer) bz0.a(context, MultiBannerControlsContainer.class, i10, null);
        if (multiBannerControlsContainer != null) {
            multiBannerControlsContainer.setLayoutParams(layoutParams);
        }
        return multiBannerControlsContainer;
    }
}
