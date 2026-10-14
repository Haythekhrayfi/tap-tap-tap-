package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: com.yandex.mobile.ads.impl.if, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
final class Cif implements gf<BitmapDrawable> {
    @Override // com.yandex.mobile.ads.impl.gf
    public final boolean a(Drawable drawable, Bitmap bitmap) {
        return bitmap.equals(((BitmapDrawable) drawable).getBitmap());
    }
}
