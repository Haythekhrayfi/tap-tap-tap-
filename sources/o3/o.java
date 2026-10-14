package o3;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public class o extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f33923b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(d3.c.f28632a);

    @Override // d3.c
    public void a(MessageDigest messageDigest) {
        messageDigest.update(f33923b);
    }

    @Override // o3.e
    public Bitmap c(h3.d dVar, Bitmap bitmap, int i10, int i11) {
        return u.b(dVar, bitmap, i10, i11);
    }

    @Override // d3.c
    public boolean equals(Object obj) {
        return obj instanceof o;
    }

    @Override // d3.c
    public int hashCode() {
        return 1572326941;
    }
}
