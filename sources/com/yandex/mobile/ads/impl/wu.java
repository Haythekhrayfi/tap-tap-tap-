package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.yandex.mobile.ads.R;

/* JADX INFO: loaded from: classes3.dex */
public final class wu extends og1<ImageView, uu> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g20 f26369b;

    public wu(ImageView imageView, g20 g20Var) {
        super(imageView);
        this.f26369b = g20Var;
    }

    @Override // com.yandex.mobile.ads.impl.og1
    public final /* bridge */ /* synthetic */ boolean a(View view, uu uuVar) {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.og1
    public final void b(View view, uu uuVar) {
        ImageView imageView = (ImageView) view;
        j20 j20VarA = uuVar.a();
        if (j20VarA != null) {
            imageView.setForeground(null);
            imageView.setBackground(null);
            Bitmap bitmapA = this.f26369b.a(j20VarA);
            if (bitmapA != null) {
                imageView.setImageBitmap(bitmapA);
                return;
            }
            Context context = imageView.getContext();
            int i10 = R.drawable.yandex_ads_internal_default_adtune_feedback_icon;
            Object obj = e0.a.f28964a;
            imageView.setImageDrawable(e0.a.c.b(context, i10));
        }
    }
}
