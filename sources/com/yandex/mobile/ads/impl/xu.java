package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes3.dex */
public final class xu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f26621a;

    public xu(Context context) {
        this.f26621a = context;
    }

    public final ImageView a(int i10, int i11) {
        ImageView imageView = new ImageView(this.f26621a);
        int iA = eh1.a(this.f26621a, 28.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iA, iA);
        layoutParams.gravity = 8388613;
        layoutParams.rightMargin = i10;
        layoutParams.topMargin = i11;
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }
}
