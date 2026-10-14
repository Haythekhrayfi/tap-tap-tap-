package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class l20 {
    public static boolean a(j20 j20Var, Map map) {
        fd.j0.i(j20Var, "imageValue");
        fd.j0.i(map, "images");
        Bitmap bitmap = (Bitmap) map.get(j20Var.d());
        return bitmap != null && bitmap.getWidth() > 1 && bitmap.getHeight() > 1;
    }
}
