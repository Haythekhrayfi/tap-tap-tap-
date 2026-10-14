package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class n20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g20 f23206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final hf f23207b = new hf();

    public n20(g20 g20Var) {
        this.f23206a = g20Var;
    }

    public final boolean a(Drawable drawable, j20 j20Var) {
        Bitmap bitmapA = this.f23206a.a(j20Var);
        if (drawable == null || bitmapA == null) {
            return false;
        }
        Objects.requireNonNull(this.f23207b);
        return hf.a(drawable).a(drawable, bitmapA);
    }
}
