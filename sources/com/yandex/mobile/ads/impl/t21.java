package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes3.dex */
public final class t21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w21 f25233a = new w21();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wc f25234b = new wc();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final te f25235c = new te();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private v21 f25236d;

    public final void a(ImageView imageView) {
        fd.j0.i(imageView, "view");
        imageView.removeOnLayoutChangeListener(this.f25236d);
    }

    public final void a(ImageView imageView, j20 j20Var, Bitmap bitmap) {
        fd.j0.i(imageView, "view");
        fd.j0.i(j20Var, "imageValue");
        fd.j0.i(bitmap, "originalBitmap");
        v21 v21Var = new v21(this.f25234b, this.f25235c, this.f25233a, j20Var, bitmap);
        this.f25236d = v21Var;
        imageView.addOnLayoutChangeListener(v21Var);
        if (imageView.getLayoutParams().width == -1 || imageView.getLayoutParams().height == -1 || imageView.getLayoutParams().width == -2 || imageView.getLayoutParams().height == -2) {
            imageView.setImageBitmap(bitmap);
        }
    }
}
