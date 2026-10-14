package o3;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public class g extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f33897b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(d3.c.f28632a);

    @Override // d3.c
    public void a(MessageDigest messageDigest) {
        messageDigest.update(f33897b);
    }

    @Override // o3.e
    public Bitmap c(h3.d dVar, Bitmap bitmap, int i10, int i11) {
        float width;
        float height;
        Paint paint = u.f33942a;
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        int width2 = bitmap.getWidth() * i11;
        int height2 = bitmap.getHeight() * i10;
        float width3 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        if (width2 > height2) {
            width = i11 / bitmap.getHeight();
            width3 = (i10 - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i10 / bitmap.getWidth();
            height = (i11 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width3 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapE = dVar.e(i10, i11, u.c(bitmap));
        bitmapE.setHasAlpha(bitmap.hasAlpha());
        u.a(bitmap, bitmapE, matrix);
        return bitmapE;
    }

    @Override // d3.c
    public boolean equals(Object obj) {
        return obj instanceof g;
    }

    @Override // d3.c
    public int hashCode() {
        return -599754482;
    }
}
