package com.yandex.mobile.ads.impl;

import android.widget.FrameLayout;
import android.widget.ImageView;
import com.yandex.mobile.ads.nativeads.MediaView;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class cd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i20 f19447a = new i20();

    public final kl1 a(MediaView mediaView, g20 g20Var, k2 k2Var) {
        ImageView imageView = new ImageView(mediaView.getContext());
        Objects.requireNonNull(this.f19447a);
        mediaView.removeAllViews();
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        mediaView.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
        return new kl1(mediaView, new r20(imageView, g20Var), k2Var);
    }
}
