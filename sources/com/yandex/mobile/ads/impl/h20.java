package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes3.dex */
public final class h20 extends mw0<Bitmap> {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Object f21282v = new Object();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Object f21283p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private gx0.b<Bitmap> f21284q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Bitmap.Config f21285r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f21286s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f21287t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final ImageView.ScaleType f21288u;

    public h20(String str, gx0.b<Bitmap> bVar, int i10, int i11, ImageView.ScaleType scaleType, Bitmap.Config config, gx0.a aVar) {
        super(0, str, aVar);
        this.f21283p = new Object();
        a(new lo(2.0f, 1000, 2));
        this.f21284q = bVar;
        this.f21285r = config;
        this.f21286s = i10;
        this.f21287t = i11;
        this.f21288u = scaleType;
    }

    private static int a(int i10, int i11, int i12, int i13, ImageView.ScaleType scaleType) {
        if (i10 == 0 && i11 == 0) {
            return i12;
        }
        if (scaleType == ImageView.ScaleType.FIT_XY) {
            return i10 == 0 ? i12 : i10;
        }
        if (i10 == 0) {
            return (int) (((double) i12) * (((double) i11) / ((double) i13)));
        }
        if (i11 == 0) {
            return i10;
        }
        double d10 = ((double) i13) / ((double) i12);
        if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            double d11 = i11;
            return ((double) i10) * d10 < d11 ? (int) (d11 / d10) : i10;
        }
        double d12 = i11;
        return ((double) i10) * d10 > d12 ? (int) (d12 / d10) : i10;
    }

    private gx0<Bitmap> b(wm0 wm0Var) {
        Bitmap bitmapDecodeByteArray;
        byte[] bArr = wm0Var.f26320b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.f21286s == 0 && this.f21287t == 0) {
            options.inPreferredConfig = this.f21285r;
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i10 = options.outWidth;
            int i11 = options.outHeight;
            int iA = a(this.f21286s, this.f21287t, i10, i11, this.f21288u);
            int iA2 = a(this.f21287t, this.f21286s, i11, i10, this.f21288u);
            options.inJustDecodeBounds = false;
            float f10 = 1.0f;
            while (true) {
                float f11 = 2.0f * f10;
                if (f11 > Math.min(((double) i10) / ((double) iA), ((double) i11) / ((double) iA2))) {
                    break;
                }
                f10 = f11;
            }
            options.inSampleSize = (int) f10;
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (bitmapDecodeByteArray != null && (bitmapDecodeByteArray.getWidth() > iA || bitmapDecodeByteArray.getHeight() > iA2)) {
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeByteArray, iA, iA2, true);
                bitmapDecodeByteArray.recycle();
                bitmapDecodeByteArray = bitmapCreateScaledBitmap;
            }
        }
        return bitmapDecodeByteArray == null ? gx0.a(new pp0(wm0Var)) : gx0.a(bitmapDecodeByteArray, u00.a(wm0Var));
    }

    @Override // com.yandex.mobile.ads.impl.mw0
    public final gx0<Bitmap> a(wm0 wm0Var) {
        gx0<Bitmap> gx0VarB;
        synchronized (f21282v) {
            try {
                try {
                    gx0VarB = b(wm0Var);
                } catch (OutOfMemoryError e10) {
                    Object[] objArr = {Integer.valueOf(wm0Var.f26320b.length), m()};
                    boolean z10 = ci1.f19511a;
                    x60.c("Caught OOM for %d byte image, url=%s", objArr);
                    return gx0.a(new pp0(e10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gx0VarB;
    }

    @Override // com.yandex.mobile.ads.impl.mw0
    public final void a() {
        super.a();
        synchronized (this.f21283p) {
            this.f21284q = null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.mw0
    public final void a(Bitmap bitmap) {
        gx0.b<Bitmap> bVar;
        Bitmap bitmap2 = bitmap;
        synchronized (this.f21283p) {
            bVar = this.f21284q;
        }
        if (bVar != null) {
            bVar.a(bitmap2);
        }
    }

    @Override // com.yandex.mobile.ads.impl.mw0
    public final int h() {
        return 1;
    }
}
