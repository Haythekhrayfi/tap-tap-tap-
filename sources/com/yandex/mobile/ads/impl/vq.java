package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class vq implements gf<Drawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gz0 f26061a = new gz0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final jf f26062b = new jf();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f26063a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f26064b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f26065c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f26066d;

        public a(int i10) {
            this.f26063a = Color.alpha(i10);
            this.f26064b = Color.red(i10);
            this.f26065c = Color.green(i10);
            this.f26066d = Color.blue(i10);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f26063a == aVar.f26063a && this.f26064b == aVar.f26064b && this.f26065c == aVar.f26065c && this.f26066d == aVar.f26066d;
        }

        public final int hashCode() {
            return (((((this.f26063a * 31) + this.f26064b) * 31) + this.f26065c) * 31) + this.f26066d;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0012  */
    @Override // com.yandex.mobile.ads.impl.gf
    public final boolean a(Drawable drawable, Bitmap bitmap) {
        Bitmap bitmapA;
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                bitmapA = bitmapDrawable.getBitmap();
            } else {
                bitmapA = this.f26061a.a(drawable);
            }
        } else {
            bitmapA = this.f26061a.a(drawable);
        }
        Objects.requireNonNull(this.f26062b);
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapA, 1, 1, true);
        Objects.requireNonNull(this.f26062b);
        Bitmap bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(bitmap, 1, 1, true);
        a aVar = new a(bitmapCreateScaledBitmap.getPixel(0, 0));
        a aVar2 = new a(bitmapCreateScaledBitmap2.getPixel(0, 0));
        return Math.abs(aVar.f26063a - aVar2.f26063a) <= 20 && Math.abs(aVar.f26064b - aVar2.f26064b) <= 20 && Math.abs(aVar.f26065c - aVar2.f26065c) <= 20 && Math.abs(aVar.f26066d - aVar2.f26066d) <= 20;
    }
}
