package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class qj0 implements xh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qi0 f24521a = new qi0();

    @Override // com.yandex.mobile.ads.impl.xh0
    public final void a(Context context, wh0 wh0Var, g20 g20Var, com.yandex.mobile.ads.nativeads.j jVar, pi0 pi0Var, fi0 fi0Var) {
        ArrayList arrayList = new ArrayList();
        List<qh0> listD = wh0Var.c().d();
        if (listD != null) {
            Iterator<qh0> it = listD.iterator();
            while (it.hasNext()) {
                com.yandex.mobile.ads.nativeads.h hVarA = this.f24521a.a(context, wh0Var, g20Var, jVar, pi0Var, it.next());
                if (hVarA != null) {
                    arrayList.add(hVarA);
                }
            }
        }
        if (arrayList.isEmpty()) {
            fi0Var.a(v4.f25818a);
        } else {
            fi0Var.a(arrayList);
        }
    }
}
