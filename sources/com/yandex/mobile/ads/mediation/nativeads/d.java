package com.yandex.mobile.ads.mediation.nativeads;

import android.graphics.Bitmap;
import com.yandex.mobile.ads.impl.j20;
import com.yandex.mobile.ads.impl.vc0;
import com.yandex.mobile.ads.impl.wa0;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f27585a;

    public d(a aVar) {
        this.f27585a = aVar;
    }

    public final vc0 a(Map<String, Bitmap> map, MediatedNativeAdImage mediatedNativeAdImage, MediatedNativeAdMedia mediatedNativeAdMedia) {
        ArrayList arrayList;
        j20 j20VarA = this.f27585a.a(map, mediatedNativeAdImage);
        wa0 wa0Var = mediatedNativeAdMedia != null ? new wa0(null, mediatedNativeAdMedia.getAspectRatio()) : null;
        if (j20VarA != null) {
            arrayList = new ArrayList();
            arrayList.add(j20VarA);
        } else {
            arrayList = null;
        }
        if (j20VarA == null && wa0Var == null) {
            return null;
        }
        return new vc0(wa0Var, null, arrayList);
    }
}
