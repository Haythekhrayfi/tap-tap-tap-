package com.yandex.mobile.ads.banner;

import android.content.Context;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* JADX INFO: loaded from: classes2.dex */
public final class AdSize extends f {
    private static final long serialVersionUID = 2680092174282737642L;

    @Deprecated
    public static final AdSize BANNER_240x400 = new AdSize(240, 400);

    @Deprecated
    public static final AdSize BANNER_300x250 = new AdSize(300, BaseTransientBottomBar.ANIMATION_DURATION);

    @Deprecated
    public static final AdSize BANNER_300x300 = new AdSize(300, 300);

    @Deprecated
    public static final AdSize BANNER_320x50 = new AdSize(320, 50);

    @Deprecated
    public static final AdSize BANNER_320x100 = new AdSize(320, 100);

    @Deprecated
    public static final AdSize BANNER_400x240 = new AdSize(400, 240);

    @Deprecated
    public static final AdSize BANNER_728x90 = new AdSize(728, 90);
    public static final AdSize FULL_SCREEN = new AdSize(-1, -2);

    @Deprecated
    public AdSize(int i10, int i11) {
        this(i10, i11, 1);
    }

    public AdSize(int i10, int i11, int i12) {
        super(i10, i11, i12);
    }

    @Deprecated
    public static AdSize flexibleSize(int i10, int i11) {
        return new AdSize(i10, i11, 2);
    }

    public static AdSize inlineSize(int i10, int i11) {
        return new AdSize(i10, i11, 2);
    }

    public static AdSize stickySize(int i10) {
        return new AdSize(i10, 0, 4);
    }

    public static AdSize stickySize(Context context, int i10) {
        return k.a(context, i10);
    }

    @Override // com.yandex.mobile.ads.banner.f
    public int getHeight() {
        return super.getHeight();
    }

    @Override // com.yandex.mobile.ads.banner.f
    public int getHeight(Context context) {
        return super.getHeight(context);
    }

    @Override // com.yandex.mobile.ads.banner.f
    public int getHeightInPixels(Context context) {
        return super.getHeightInPixels(context);
    }

    @Override // com.yandex.mobile.ads.banner.f
    public int getWidth() {
        return super.getWidth();
    }

    @Override // com.yandex.mobile.ads.banner.f
    public int getWidth(Context context) {
        return super.getWidth(context);
    }

    @Override // com.yandex.mobile.ads.banner.f
    public int getWidthInPixels(Context context) {
        return super.getWidthInPixels(context);
    }
}
