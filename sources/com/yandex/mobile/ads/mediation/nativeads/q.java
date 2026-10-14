package com.yandex.mobile.ads.mediation.nativeads;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.cj0;
import com.yandex.mobile.ads.impl.px0;
import com.yandex.mobile.ads.impl.qh0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f27612a;

    public q(Context context) {
        this.f27612a = new p(context);
    }

    /* JADX WARN: Incorrect types in method signature: (Lcom/yandex/mobile/ads/mediation/nativeads/MediatedNativeAd;Ljava/util/Map<Ljava/lang/String;Landroid/graphics/Bitmap;>;Ljava/lang/Object;)Lcom/yandex/mobile/ads/base/AdResponse<Lcom/yandex/mobile/ads/impl/cj0;>; */
    public final AdResponse a(MediatedNativeAd mediatedNativeAd, Map map, int i10) {
        ArrayList arrayListA = this.f27612a.a(mediatedNativeAd.getMediatedNativeAdAssets(), map);
        qh0 qh0Var = new qh0();
        qh0Var.c(px0.a(i10));
        qh0Var.c(arrayListA);
        cj0 cj0Var = new cj0();
        cj0Var.a(Collections.singletonList(qh0Var));
        return new AdResponse.b().a(cj0Var).a();
    }
}
