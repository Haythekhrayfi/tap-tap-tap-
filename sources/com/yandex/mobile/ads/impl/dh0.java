package com.yandex.mobile.ads.impl;

import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.mobile.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.nativeads.MediaView;
import com.yandex.mobile.ads.nativeads.view.pager.MultiBannerControlsContainer;

/* JADX INFO: loaded from: classes3.dex */
public final class dh0 {
    public static void a(MediaView mediaView, ExtendedViewContainer extendedViewContainer, ViewPager2 viewPager2, MultiBannerControlsContainer multiBannerControlsContainer) {
        fd.j0.i(mediaView, "mediaView");
        fd.j0.i(extendedViewContainer, "container");
        fd.j0.i(viewPager2, "viewPager");
        mediaView.removeAllViews();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        extendedViewContainer.addView(viewPager2, layoutParams);
        if (multiBannerControlsContainer != null) {
            extendedViewContainer.addView(multiBannerControlsContainer, layoutParams);
        }
        mediaView.addView(extendedViewContainer, layoutParams);
    }
}
