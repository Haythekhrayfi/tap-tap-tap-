package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6T, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C6T {
    public static byte[] A00;

    static {
        A04();
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 86);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{92, 88, 84, 82, 80};
    }

    public static int A00(BitmapFactory.Options options, int halfWidth, int i10) {
        int width = options.outHeight;
        int height = options.outWidth;
        int halfHeight = 1;
        if (width > i10 || height > halfWidth) {
            int inSampleSize = width / 2;
            int width2 = height / 2;
            while (inSampleSize / halfHeight >= i10 && width2 / halfHeight >= halfWidth) {
                halfHeight *= 2;
            }
        }
        return halfHeight;
    }

    public static Bitmap A01(InputStream inputStream, int i10, int i11) throws IOException {
        if (Build.VERSION.SDK_INT < 19) {
            return BitmapFactory.decodeStream(inputStream);
        }
        C0N c0n = new C0N(inputStream);
        c0n.mark(8192);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(c0n, null, options);
        c0n.reset();
        if (!c0n.A00()) {
            options.inSampleSize = A00(options, i11, i10);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeStream(c0n, null, options);
        }
        return BitmapFactory.decodeStream(c0n);
    }

    public static Bitmap A02(String str, int i10, int i11, C7Q c7q) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            options.inSampleSize = A00(options, i11, i10);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeFile(str, options);
        } catch (Throwable t10) {
            c7q.A07().A9K(A03(0, 5, 99), C06937v.A1g, new C06947w(t10));
            return null;
        }
    }
}
