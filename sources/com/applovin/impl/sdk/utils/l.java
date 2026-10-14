package com.applovin.impl.sdk.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.io.Closeable;
import java.io.InputStream;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public class l {
    public static void a(final ImageView imageView, final Uri uri, final com.applovin.impl.sdk.o oVar) {
        if (uri == null || imageView == null) {
            return;
        }
        if (imageView.getHeight() <= 0 || imageView.getWidth() <= 0) {
            imageView.post(new Runnable() { // from class: com.applovin.impl.sdk.utils.l.2
                @Override // java.lang.Runnable
                public void run() {
                    l.b(imageView, uri, oVar);
                }
            });
        } else {
            b(imageView, uri, oVar);
        }
    }

    public static void a(final ImageView imageView, final String str, final com.applovin.impl.sdk.o oVar) {
        if (TextUtils.isEmpty(str) || imageView == null) {
            return;
        }
        oVar.F();
        if (com.applovin.impl.sdk.y.a()) {
            oVar.F().b("ImageViewUtils", "Fetching image: " + str + "...");
        }
        oVar.G().c().execute(new Runnable() { // from class: com.applovin.impl.sdk.utils.l.1
            @Override // java.lang.Runnable
            public void run() {
                InputStream inputStreamOpenStream = null;
                try {
                    inputStreamOpenStream = new URL(str).openStream();
                    final Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenStream);
                    AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.l.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            oVar.F();
                            if (com.applovin.impl.sdk.y.a()) {
                                oVar.F().b("ImageViewUtils", "Image fetched");
                            }
                            imageView.setImageDrawable(new BitmapDrawable(com.applovin.impl.sdk.o.au().getResources(), bitmapDecodeStream));
                        }
                    });
                } catch (Throwable th) {
                    try {
                        oVar.F();
                        if (com.applovin.impl.sdk.y.a()) {
                            oVar.F().b("ImageViewUtils", "Failed to fetch image: " + str, th);
                        }
                    } finally {
                        w.a((Closeable) inputStreamOpenStream, oVar);
                    }
                }
            }
        });
    }

    public static void b(final ImageView imageView, final Uri uri, final com.applovin.impl.sdk.o oVar) {
        if (uri == null || imageView == null) {
            return;
        }
        oVar.G().c().execute(new Runnable() { // from class: com.applovin.impl.sdk.utils.l.3
            @Override // java.lang.Runnable
            public void run() {
                BitmapFactory.Options options = new BitmapFactory.Options();
                int i10 = 1;
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(uri.getPath(), options);
                int height = imageView.getHeight();
                int width = imageView.getWidth();
                if (height <= 0 || width <= 0) {
                    Point pointA = h.a(imageView.getContext());
                    height = Math.min(pointA.x, pointA.y);
                    width = height;
                }
                int i11 = options.outHeight;
                int i12 = options.outWidth;
                if (i11 > height || i12 > width) {
                    while (true) {
                        int i13 = i10 * 2;
                        if (i11 / i13 < height && i12 / i13 < width) {
                            break;
                        } else {
                            i10 = i13;
                        }
                    }
                }
                options.inSampleSize = i10;
                options.inJustDecodeBounds = false;
                oVar.F();
                if (com.applovin.impl.sdk.y.a()) {
                    com.applovin.impl.sdk.y yVarF = oVar.F();
                    StringBuilder sbA = defpackage.a.a("Loading image: ");
                    sbA.append(uri.getLastPathSegment());
                    sbA.append("...");
                    yVarF.b("ImageViewUtils", sbA.toString());
                }
                final Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(uri.getPath(), options);
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.l.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        imageView.setImageBitmap(bitmapDecodeFile);
                    }
                });
            }
        });
    }
}
