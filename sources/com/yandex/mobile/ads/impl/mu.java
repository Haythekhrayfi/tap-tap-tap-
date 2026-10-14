package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;

/* JADX INFO: loaded from: classes3.dex */
public final class mu {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f23141c = Color.parseColor("#66000000");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f23142d = Color.parseColor("#00000000");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f23143e = Color.parseColor("#7f7f7f");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f23144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NativeAdAssets f23145b;

    public mu(Context context, NativeAdAssets nativeAdAssets) {
        this.f23144a = context;
        this.f23145b = nativeAdAssets;
    }

    public final void a(ImageView imageView, FrameLayout frameLayout, int i10) {
        if (!new nu(this.f23145b).a()) {
            int i11 = f23143e;
            Context context = this.f23144a;
            int i12 = R.drawable.yandex_ads_internal_ic_close_gray;
            Object obj = e0.a.f28964a;
            Drawable drawableB = e0.a.c.b(context, i12);
            drawableB.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_ATOP));
            imageView.setImageDrawable(drawableB);
            frameLayout.setPadding(0, 0, 0, 0);
            frameLayout.setBackground(null);
        } else {
            if (this.f23145b.getMedia() != null) {
                int i13 = f23143e;
                Context context2 = this.f23144a;
                int i14 = R.drawable.yandex_ads_internal_ic_close_gray;
                Object obj2 = e0.a.f28964a;
                Drawable drawableB2 = e0.a.c.b(context2, i14);
                drawableB2.setColorFilter(new PorterDuffColorFilter(i13, PorterDuff.Mode.SRC_ATOP));
                imageView.setImageDrawable(drawableB2);
                frameLayout.setPadding(0, 0, 0, 0);
                frameLayout.setBackground(null);
                frameLayout.setVisibility(8);
                return;
            }
            if (this.f23145b.getImage() == null) {
                return;
            }
            Context context3 = this.f23144a;
            int i15 = R.drawable.yandex_ads_internal_ic_close_gray;
            Object obj3 = e0.a.f28964a;
            Drawable drawableB3 = e0.a.c.b(context3, i15);
            drawableB3.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            imageView.setImageDrawable(drawableB3);
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{f23141c, f23142d});
            frameLayout.setPadding(0, 0, 0, i10);
            frameLayout.setBackground(gradientDrawable);
        }
        frameLayout.setVisibility(0);
    }
}
