package com.yandex.mobile.ads.nativeads;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public final class NativeAdImage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Bitmap f27662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f27663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f27664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f27665d;

    public final String a() {
        return this.f27663b;
    }

    public final void a(int i10) {
        this.f27664c = i10;
    }

    public final void a(Bitmap bitmap) {
        this.f27662a = bitmap;
    }

    public final void a(String str) {
        this.f27663b = str;
    }

    public final void b(int i10) {
        this.f27665d = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || NativeAdImage.class != obj.getClass()) {
            return false;
        }
        NativeAdImage nativeAdImage = (NativeAdImage) obj;
        if (this.f27664c != nativeAdImage.f27664c || this.f27665d != nativeAdImage.f27665d) {
            return false;
        }
        Bitmap bitmap = this.f27662a;
        if (bitmap == null ? nativeAdImage.f27662a != null : !bitmap.equals(nativeAdImage.f27662a)) {
            return false;
        }
        String str = this.f27663b;
        String str2 = nativeAdImage.f27663b;
        return str == null ? str2 == null : str.equals(str2);
    }

    public Bitmap getBitmap() {
        return this.f27662a;
    }

    public int getHeight() {
        return this.f27664c;
    }

    public int getWidth() {
        return this.f27665d;
    }

    public final int hashCode() {
        Bitmap bitmap = this.f27662a;
        int iHashCode = (bitmap != null ? bitmap.hashCode() : 0) * 31;
        String str = this.f27663b;
        return ((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f27664c) * 31) + this.f27665d;
    }
}
