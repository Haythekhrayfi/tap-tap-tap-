package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.nativeads.NativeAd;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class bk0 implements xh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qi0 f19287a = new qi0();

    @Override // com.yandex.mobile.ads.impl.xh0
    public final void a(Context context, wh0 wh0Var, g20 g20Var, com.yandex.mobile.ads.nativeads.j jVar, pi0 pi0Var, fi0 fi0Var) {
        NativeAd nativeAdA;
        List<qh0> listD = wh0Var.c().d();
        if (listD == null || listD.isEmpty()) {
            nativeAdA = null;
        } else if (listD.size() > 1) {
            nativeAdA = jVar.a(context, wh0Var, g20Var, pi0Var);
        } else {
            nativeAdA = this.f19287a.a(context, wh0Var, g20Var, jVar, pi0Var, listD.get(0));
        }
        if (nativeAdA != null) {
            fi0Var.a(nativeAdA);
        } else {
            fi0Var.a(v4.f25818a);
        }
    }
}
