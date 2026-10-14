package com.yandex.mobile.ads.mediation.nativeads;

import android.content.Context;
import android.graphics.Bitmap;
import com.yandex.mobile.ads.impl.j20;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f27582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f27583b;

    public a(Context context, c cVar) {
        this.f27582a = cVar;
        this.f27583b = new b(context);
    }

    public final j20 a(Map<String, Bitmap> map, MediatedNativeAdImage mediatedNativeAdImage) {
        if (mediatedNativeAdImage == null) {
            return null;
        }
        String url = mediatedNativeAdImage.getUrl();
        int width = mediatedNativeAdImage.getWidth();
        int height = mediatedNativeAdImage.getHeight();
        Objects.requireNonNull(this.f27582a);
        if (width > 0 && height > 0) {
            String strA = this.f27583b.a(width, height);
            j20 j20Var = new j20();
            j20Var.b(url);
            j20Var.b(width);
            j20Var.a(height);
            j20Var.a(strA);
            return j20Var;
        }
        Bitmap bitmap = map.get(url);
        if (bitmap == null) {
            return null;
        }
        int width2 = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        String strA2 = this.f27583b.a(width2, height2);
        j20 j20Var2 = new j20();
        j20Var2.b(url);
        j20Var2.b(width2);
        j20Var2.a(height2);
        j20Var2.a(strA2);
        return j20Var2;
    }
}
