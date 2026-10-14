package o3;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public class h extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f33898b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(d3.c.f28632a);

    @Override // d3.c
    public void a(MessageDigest messageDigest) {
        messageDigest.update(f33898b);
    }

    @Override // o3.e
    public Bitmap c(h3.d dVar, Bitmap bitmap, int i10, int i11) {
        Paint paint = u.f33942a;
        if (bitmap.getWidth() > i10 || bitmap.getHeight() > i11) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return u.b(dVar, bitmap, i10, i11);
        }
        if (!Log.isLoggable("TransformationUtils", 2)) {
            return bitmap;
        }
        Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        return bitmap;
    }

    @Override // d3.c
    public boolean equals(Object obj) {
        return obj instanceof h;
    }

    @Override // d3.c
    public int hashCode() {
        return -670243078;
    }
}
