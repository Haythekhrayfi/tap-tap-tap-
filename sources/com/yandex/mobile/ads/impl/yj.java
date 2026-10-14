package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ImageView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdImage;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class yj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NativeAdAssets f26860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final rh0 f26861b = new rh0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f26862c;

    public yj(NativeAdAssets nativeAdAssets, int i10) {
        this.f26860a = nativeAdAssets;
        this.f26862c = i10;
    }

    private ImageView a(View view, int i10, NativeAdImage nativeAdImage) {
        int i11;
        int i12;
        NativeAdImage icon = this.f26860a.getIcon();
        NativeAdImage favicon = this.f26860a.getFavicon();
        if (icon != null) {
            i11 = 2;
        } else {
            i11 = favicon != null ? 1 : 3;
        }
        if (nativeAdImage == null || i11 != i10) {
            return null;
        }
        int width = nativeAdImage.getWidth();
        int height = nativeAdImage.getHeight();
        int i13 = this.f26862c;
        if (i13 > width || i13 > height) {
            Objects.requireNonNull(this.f26861b);
            i12 = R.id.icon_small;
        } else {
            Objects.requireNonNull(this.f26861b);
            i12 = R.id.icon_large;
        }
        return (ImageView) view.findViewById(i12);
    }

    public final ImageView a(View view) {
        return a(view, 1, this.f26860a.getFavicon());
    }

    public final ImageView b(View view) {
        return a(view, 2, this.f26860a.getIcon());
    }
}
