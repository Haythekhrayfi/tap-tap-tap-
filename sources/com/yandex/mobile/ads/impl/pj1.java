package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class pj1 {
    public static hh1 a(ac1 ac1Var, ac1 ac1Var2) {
        fd.j0.i(ac1Var, "inlineVideoAd");
        fd.j0.i(ac1Var2, "wrapperVideoAd");
        List listC = kc.l.c(ac1Var, ac1Var2);
        ArrayList arrayList = new ArrayList();
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            hh1 hh1VarM = ((ac1) it.next()).m();
            List<String> listA = hh1VarM != null ? hh1VarM.a() : null;
            if (listA == null) {
                listA = kc.w.f32009c;
            }
            kc.q.l(arrayList, listA);
        }
        return new hh1(arrayList);
    }
}
