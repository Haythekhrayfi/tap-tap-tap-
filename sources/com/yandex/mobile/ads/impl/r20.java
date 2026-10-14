package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes3.dex */
public final class r20 extends og1<ImageView, j20> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g20 f24588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n20 f24589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final t21 f24590d;

    public r20(ImageView imageView, g20 g20Var) {
        super(imageView);
        this.f24588b = g20Var;
        this.f24589c = new n20(g20Var);
        this.f24590d = new t21();
    }

    @Override // com.yandex.mobile.ads.impl.og1
    public final void a(View view) {
        ImageView imageView = (ImageView) view;
        imageView.setImageDrawable(null);
        this.f24590d.a(imageView);
        super.a(imageView);
    }

    public final void a(ImageView imageView) {
        imageView.setImageDrawable(null);
        this.f24590d.a(imageView);
        super.a(imageView);
    }

    @Override // com.yandex.mobile.ads.impl.og1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void b(ImageView imageView, j20 j20Var) {
        Bitmap bitmapA = this.f24588b.a(j20Var);
        if (bitmapA != null) {
            if (j20Var.c() != null) {
                this.f24590d.a(imageView, j20Var, bitmapA);
            } else {
                imageView.setImageBitmap(bitmapA);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.og1
    public final boolean a(View view, j20 j20Var) {
        Drawable drawable = ((ImageView) view).getDrawable();
        return this.f24589c.a(drawable, j20Var);
    }
}
