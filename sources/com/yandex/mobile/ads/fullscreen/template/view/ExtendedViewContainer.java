package com.yandex.mobile.ads.fullscreen.template.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.ak;
import com.yandex.mobile.ads.impl.ll;
import com.yandex.mobile.ads.impl.q11;
import com.yandex.mobile.ads.impl.qa0;
import com.yandex.mobile.ads.impl.ra0;
import com.yandex.mobile.ads.impl.sa0;

/* JADX INFO: loaded from: classes.dex */
public class ExtendedViewContainer extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ll f18744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sa0 f18745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private sa0 f18746c;

    public ExtendedViewContainer(Context context) {
        this(context, null);
    }

    public ExtendedViewContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @SuppressLint({"CustomViewStyleable"})
    public ExtendedViewContainer(Context context, AttributeSet attributeSet, int i10) {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int dimensionPixelSize3;
        int dimensionPixelSize4;
        super(context, attributeSet, i10);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.YandexAdsInternalExtendedViewContainer, i10, 0);
            int dimensionPixelSize5 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.YandexAdsInternalExtendedViewContainer_yandex_corner_radius, 0);
            dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.YandexAdsInternalExtendedViewContainer_yandex_top_left_corner_radius, dimensionPixelSize5);
            dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.YandexAdsInternalExtendedViewContainer_yandex_top_right_corner_radius, dimensionPixelSize5);
            dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.YandexAdsInternalExtendedViewContainer_yandex_bottom_right_corner_radius, dimensionPixelSize5);
            dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.YandexAdsInternalExtendedViewContainer_yandex_bottom_left_corner_radius, dimensionPixelSize5);
            this.f18745b = a(typedArrayObtainStyledAttributes.getFloat(R.styleable.YandexAdsInternalExtendedViewContainer_yandex_max_screen_width, 1.0f), typedArrayObtainStyledAttributes.getFloat(R.styleable.YandexAdsInternalExtendedViewContainer_yandex_max_screen_height, 1.0f));
            typedArrayObtainStyledAttributes.recycle();
        } else {
            this.f18745b = new q11();
            dimensionPixelSize = 0;
            dimensionPixelSize2 = 0;
            dimensionPixelSize3 = 0;
            dimensionPixelSize4 = 0;
        }
        this.f18746c = this.f18745b;
        this.f18744a = new ll(this, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize);
        setWillNotDraw(false);
    }

    private ak a(float f10, float f11) {
        return new ak(new ra0(this, f10), new qa0(this, f11));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.f18744a.a(canvas);
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        sa0.a aVarA = this.f18746c.a(i10, i11);
        super.onMeasure(aVarA.f25006a, aVarA.f25007b);
        this.f18744a.a();
    }

    public void setMeasureSpecProvider(sa0 sa0Var) {
        this.f18746c = new ak(this.f18745b, sa0Var);
        requestLayout();
        invalidate();
    }
}
