package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ng implements g20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f23381a;

    public ng(Context context) {
        this.f23381a = context.getApplicationContext();
    }

    @Override // com.yandex.mobile.ads.impl.g20
    public final Bitmap a(j20 j20Var) {
        hn0.c cVarB = hn0.c(this.f23381a).b();
        String strD = j20Var.d();
        if (strD == null) {
            return null;
        }
        Bitmap bitmapA = cVarB.a(strD);
        if (bitmapA == null || bitmapA.getWidth() != 1 || bitmapA.getHeight() != 1) {
            return bitmapA;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapA, j20Var.e(), j20Var.a(), false);
        cVarB.a(strD, bitmapCreateScaledBitmap);
        return bitmapCreateScaledBitmap;
    }

    @Override // com.yandex.mobile.ads.impl.g20
    public final void a(Map<String, Bitmap> map) {
    }
}
