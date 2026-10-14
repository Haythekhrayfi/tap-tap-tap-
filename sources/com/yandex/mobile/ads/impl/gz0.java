package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class gz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jf f21245a = new jf();

    public final Bitmap a(Drawable drawable) {
        Bitmap bitmapCreateBitmap;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            jf jfVar = this.f21245a;
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            Objects.requireNonNull(jfVar);
            bitmapCreateBitmap = Bitmap.createBitmap(1, 1, config);
        } else {
            jf jfVar2 = this.f21245a;
            Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
            Objects.requireNonNull(jfVar2);
            bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config2);
        }
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }
}
