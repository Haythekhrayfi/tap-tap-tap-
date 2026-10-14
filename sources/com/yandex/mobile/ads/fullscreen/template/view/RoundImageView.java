package com.yandex.mobile.ads.fullscreen.template.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.ll;

/* JADX INFO: loaded from: classes.dex */
public class RoundImageView extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ll f18747a;

    public RoundImageView(Context context) {
        this(context, null, 0);
    }

    public RoundImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @SuppressLint({"CustomViewStyleable"})
    public RoundImageView(Context context, AttributeSet attributeSet, int i10) {
        float dimensionPixelSize;
        super(context, attributeSet, i10);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.YandexAdsInternalRoundImageView, i10, 0);
            dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.YandexAdsInternalRoundImageView_yandex_corner_radius, 0);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            dimensionPixelSize = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        }
        this.f18747a = new ll(this, dimensionPixelSize);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        this.f18747a.a(canvas);
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f18747a.a();
    }
}
