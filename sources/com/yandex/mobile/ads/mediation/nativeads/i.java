package com.yandex.mobile.ads.mediation.nativeads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.yandex.mobile.ads.impl.j20;
import com.yandex.mobile.ads.impl.lq0;
import com.yandex.mobile.ads.impl.wq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wq f27595a = new wq();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f27596b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Point f27597c;

    public i(Context context) {
        this.f27597c = lq0.b(context);
    }

    public final HashSet a(ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MediatedNativeAdImage mediatedNativeAdImage = (MediatedNativeAdImage) it.next();
            String url = mediatedNativeAdImage.getUrl();
            int width = mediatedNativeAdImage.getWidth();
            int height = mediatedNativeAdImage.getHeight();
            if (!TextUtils.isEmpty(url)) {
                Objects.requireNonNull(this.f27596b);
                if (!(width > 0 && height > 0)) {
                    j20 j20Var = new j20();
                    j20Var.b(url);
                    j20Var.b(this.f27597c.x);
                    j20Var.a(this.f27597c.y);
                    hashSet.add(j20Var);
                }
            }
        }
        return hashSet;
    }

    public final HashMap b(ArrayList arrayList) {
        Bitmap bitmap;
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MediatedNativeAdImage mediatedNativeAdImage = (MediatedNativeAdImage) it.next();
            Drawable drawable = mediatedNativeAdImage.getDrawable();
            String url = mediatedNativeAdImage.getUrl();
            if (drawable != null && !TextUtils.isEmpty(url)) {
                Objects.requireNonNull(this.f27595a);
                if (drawable instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                } else {
                    int intrinsicWidth = drawable.getIntrinsicWidth();
                    if (intrinsicWidth <= 0) {
                        intrinsicWidth = 128;
                    }
                    int intrinsicHeight = drawable.getIntrinsicHeight();
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight > 0 ? intrinsicHeight : 128, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    drawable.draw(canvas);
                    bitmap = bitmapCreateBitmap;
                }
                if (bitmap != null) {
                    map.put(url, bitmap);
                }
            }
        }
        return map;
    }
}
