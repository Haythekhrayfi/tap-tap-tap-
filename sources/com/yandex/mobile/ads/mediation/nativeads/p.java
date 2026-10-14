package com.yandex.mobile.ads.mediation.nativeads;

import android.content.Context;
import com.yandex.mobile.ads.impl.eb;
import com.yandex.mobile.ads.impl.fb;
import com.yandex.mobile.ads.impl.qa;
import com.yandex.mobile.ads.impl.za;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f27608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f27609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final za f27610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final fb f27611d;

    public p(Context context) {
        a aVar = new a(context, new c());
        this.f27608a = aVar;
        this.f27609b = new d(aVar);
        this.f27610c = new za();
        this.f27611d = new fb();
    }

    private qa a(Object obj, String str) {
        Objects.requireNonNull(this.f27611d);
        eb ebVarA = fb.a(str);
        if (obj == null || !ebVarA.a(obj)) {
            return null;
        }
        Objects.requireNonNull(this.f27610c);
        return za.a(str).a(obj, str);
    }

    public final ArrayList a(MediatedNativeAdAssets mediatedNativeAdAssets, Map map) {
        ArrayList<qa> arrayList = new ArrayList();
        arrayList.add(a(mediatedNativeAdAssets.getAge(), "age"));
        arrayList.add(a(mediatedNativeAdAssets.getBody(), "body"));
        arrayList.add(a(mediatedNativeAdAssets.getCallToAction(), "call_to_action"));
        arrayList.add(a(mediatedNativeAdAssets.getDomain(), "domain"));
        arrayList.add(a(this.f27608a.a(map, mediatedNativeAdAssets.getFavicon()), "favicon"));
        arrayList.add(a(this.f27608a.a(map, mediatedNativeAdAssets.getIcon()), "icon"));
        arrayList.add(a(this.f27609b.a(map, mediatedNativeAdAssets.getImage(), mediatedNativeAdAssets.getMedia()), "media"));
        arrayList.add(a(mediatedNativeAdAssets.getPrice(), "price"));
        arrayList.add(a(String.valueOf(mediatedNativeAdAssets.getRating()), "rating"));
        arrayList.add(a(mediatedNativeAdAssets.getReviewCount(), "review_count"));
        arrayList.add(a(mediatedNativeAdAssets.getSponsored(), "sponsored"));
        arrayList.add(a(mediatedNativeAdAssets.getTitle(), "title"));
        arrayList.add(a(mediatedNativeAdAssets.getWarning(), "warning"));
        ArrayList arrayList2 = new ArrayList();
        for (qa qaVar : arrayList) {
            if (qaVar != null) {
                arrayList2.add(qaVar);
            }
        }
        return arrayList2;
    }
}
