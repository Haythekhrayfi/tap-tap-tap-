package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreakPosition;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class c2 {
    public static ArrayList a(String str, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            w50 w50Var = (w50) it.next();
            if (a(w50Var, str)) {
                arrayList2.add(w50Var);
            }
        }
        return arrayList2;
    }

    private static boolean a(w50 w50Var, String str) {
        if (!w50Var.getType().equals(str)) {
            return false;
        }
        return InstreamAdBreakPosition.Type.POSITION.equals(w50Var.getAdBreakPosition().getPositionType());
    }
}
