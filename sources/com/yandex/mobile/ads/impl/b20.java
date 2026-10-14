package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
final class b20 implements gx0.b<Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f19087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e20 f19088b;

    public b20(e20 e20Var, String str) {
        this.f19088b = e20Var;
        this.f19087a = str;
    }

    @Override // com.yandex.mobile.ads.impl.gx0.b
    public final void a(Bitmap bitmap) {
        this.f19088b.a(this.f19087a, bitmap);
    }
}
