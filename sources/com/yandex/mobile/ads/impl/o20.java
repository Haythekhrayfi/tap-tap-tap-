package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class o20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l20 f23684a = new l20();

    public final void a(wh0 wh0Var, Map<String, Bitmap> map) {
        fd.j0.i(wh0Var, "nativeAdBlock");
        fd.j0.i(map, "images");
        Iterator<qh0> it = wh0Var.c().d().iterator();
        while (it.hasNext()) {
            List<qa<?>> listB = it.next().b();
            if (listB != null && (!listB.isEmpty())) {
                a(listB, map);
            }
        }
    }

    public final void a(List<? extends qa<?>> list, Map<String, Bitmap> map) {
        List<j20> listA;
        fd.j0.i(list, "assets");
        fd.j0.i(map, "images");
        for (qa<?> qaVar : list) {
            Object objD = qaVar.d();
            String strC = qaVar.c();
            fd.j0.h(strC, "asset.type");
            if (fd.j0.d(strC, "media") && (objD instanceof vc0) && (listA = ((vc0) objD).a()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listA) {
                    j20 j20Var = (j20) obj;
                    l20 l20Var = this.f23684a;
                    fd.j0.h(j20Var, "imageValue");
                    Objects.requireNonNull(l20Var);
                    if (l20.a(j20Var, map)) {
                        arrayList.add(obj);
                    }
                }
                listA.retainAll(arrayList);
            }
        }
    }
}
