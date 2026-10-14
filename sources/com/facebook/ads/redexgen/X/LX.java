package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class LX {
    public static Bitmap A00(Bitmap bitmap) {
        Matrix matrix = new Matrix();
        matrix.setScale(-1.0f, 1.0f);
        matrix.postTranslate(bitmap.getWidth(), StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static Bitmap A01(LW lw) {
        byte[] bArrDecode = Base64.decode(lw.A00(Kn.A02), 0);
        return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
    }

    public static Bitmap A02(LW lw) {
        byte[] bArrDecode = Base64.decode(lw.A00(Kn.A02), 0);
        return A00(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
    }

    public static Drawable A03(C1337Xw c1337Xw, LW lw) {
        return new BitmapDrawable(c1337Xw.getResources(), A01(lw));
    }
}
