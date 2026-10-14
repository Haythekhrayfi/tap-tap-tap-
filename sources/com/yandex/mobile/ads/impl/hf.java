package com.yandex.mobile.ads.impl;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public final class hf {
    public static gf a(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? new Cif() : new vq();
    }
}
