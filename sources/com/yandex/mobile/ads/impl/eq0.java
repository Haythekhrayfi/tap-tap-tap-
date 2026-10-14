package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class eq0 implements g20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, Bitmap> f20311a;

    @Override // com.yandex.mobile.ads.impl.g20
    public final Bitmap a(j20 j20Var) {
        String strD = j20Var.d();
        Map<String, Bitmap> map = this.f20311a;
        if (map != null) {
            return map.get(strD);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.g20
    public final void a(Map<String, Bitmap> map) {
        this.f20311a = map;
    }
}
