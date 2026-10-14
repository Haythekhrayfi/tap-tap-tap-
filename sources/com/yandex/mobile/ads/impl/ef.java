package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
final class ef implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bitmap f20234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ff.a f20235c;

    public ef(ff.a aVar, Bitmap bitmap) {
        this.f20235c = aVar;
        this.f20234b = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20235c.f20681e.a(this.f20234b);
    }
}
