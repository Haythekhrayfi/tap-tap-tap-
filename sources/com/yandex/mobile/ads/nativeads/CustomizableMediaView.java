package com.yandex.mobile.ads.nativeads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.vf1;

/* JADX INFO: loaded from: classes3.dex */
public class CustomizableMediaView extends FrameLayout {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f27642e = R.layout.yandex_ads_internal_outstream_controls_default;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f27643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f27644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f27645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f27646d;

    public CustomizableMediaView(Context context) {
        this(context, null);
    }

    public CustomizableMediaView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @SuppressLint({"CustomViewStyleable"})
    public CustomizableMediaView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        if (attributeSet == null) {
            this.f27643a = f27642e;
            this.f27644b = 0;
        } else {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.YandexAdsInternalMediaView);
            this.f27643a = typedArrayObtainStyledAttributes.getResourceId(R.styleable.YandexAdsInternalMediaView_yandex_video_controls_layout, f27642e);
            this.f27644b = vf1.a(typedArrayObtainStyledAttributes);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final int a() {
        return this.f27643a;
    }

    public final int b() {
        return this.f27644b;
    }

    public int getHeightMeasureSpec() {
        return this.f27646d;
    }

    public int getWidthMeasureSpec() {
        return this.f27645c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f27645c = i10;
        this.f27646d = i11;
    }

    public void setVideoControls(int i10) {
        this.f27643a = i10;
    }
}
