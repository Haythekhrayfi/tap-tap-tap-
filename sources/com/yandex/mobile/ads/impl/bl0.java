package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class bl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xc0 f19289a = new xc0();

    public final boolean a(wh0 wh0Var) {
        fd.j0.i(wh0Var, "nativeAdBlock");
        List<qh0> listD = wh0Var.c().d();
        fd.j0.h(listD, "nativeAdBlock.nativeAdResponse.nativeAds");
        ArrayList arrayList = new ArrayList();
        for (qh0 qh0Var : listD) {
            Objects.requireNonNull(this.f19289a);
            HashSet hashSetA = xc0.a(qh0Var);
            fd.j0.h(hashSetA, "mediaValuesProvider.getMediaValues(nativeAd)");
            kc.q.l(arrayList, hashSetA);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zb1 zb1VarC = ((vc0) it.next()).c();
            List<sc1<vl0>> listB = zb1VarC != null ? zb1VarC.b() : null;
            if (listB == null) {
                listB = kc.w.f32009c;
            }
            kc.q.l(arrayList2, listB);
        }
        if (!arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ArrayList arrayListD = ((sc1) it2.next()).e().d();
                fd.j0.h(arrayListD, "videoAdInfo.vastVideoAd.adVerifications");
                if (!arrayListD.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }
}
