package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class q20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ru f24299a = new ru();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kb f24300b = new kb();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e31 f24301c = new e31();

    public final HashSet a(List list, m80 m80Var) {
        fd.j0.i(list, "assets");
        Objects.requireNonNull(this.f24300b);
        HashSet hashSetA = kb.a(list);
        fd.j0.h(hashSetA, "assetsImagesProvider.getAssetsImages(assets)");
        for (Object obj : list) {
            if (fd.j0.d(((qa) obj).b(), "feedback")) {
                Objects.requireNonNull(this.f24299a);
                ArrayList arrayListA = ru.a((qa) obj);
                fd.j0.h(arrayListA, "feedbackImageProvider.ge…backImages(feedbackAsset)");
                hashSetA.addAll(arrayListA);
                Objects.requireNonNull(this.f24301c);
                ArrayList arrayListA2 = e31.a(list, m80Var);
                fd.j0.h(arrayListA2, "socialActionImageProvide…ctionImages(assets, link)");
                hashSetA.addAll(arrayListA2);
                return hashSetA;
            }
        }
        obj = null;
        Objects.requireNonNull(this.f24299a);
        ArrayList arrayListA3 = ru.a((qa) obj);
        fd.j0.h(arrayListA3, "feedbackImageProvider.ge…backImages(feedbackAsset)");
        hashSetA.addAll(arrayListA3);
        Objects.requireNonNull(this.f24301c);
        ArrayList arrayListA4 = e31.a(list, m80Var);
        fd.j0.h(arrayListA4, "socialActionImageProvide…ctionImages(assets, link)");
        hashSetA.addAll(arrayListA4);
        return hashSetA;
    }

    public final LinkedHashSet a(List list) {
        fd.j0.i(list, "nativeAds");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qh0 qh0Var = (qh0) it.next();
            List<qa<?>> listB = qh0Var.b();
            fd.j0.h(listB, "it.assets");
            linkedHashSet.addAll(a(listB, qh0Var.e()));
        }
        return linkedHashSet;
    }
}
