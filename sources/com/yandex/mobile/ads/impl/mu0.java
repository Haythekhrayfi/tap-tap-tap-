package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.yandex.mobile.ads.nativeads.Rating;

/* JADX INFO: loaded from: classes3.dex */
public final class mu0 extends FrameLayout implements Rating {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f23146a;

    public mu0(Context context) {
        super(context);
        this.f23146a = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
    }

    public mu0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23146a = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
    }

    public mu0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f23146a = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
    }

    @Override // com.yandex.mobile.ads.nativeads.Rating
    public final float getRating() {
        return this.f23146a;
    }

    @Override // com.yandex.mobile.ads.nativeads.Rating
    public void setRating(float f10) {
        this.f23146a = f10;
    }
}
