package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class r60 {
    public static q60 a(al0 al0Var, List list) {
        int i10;
        if (list.isEmpty()) {
            i10 = 50;
        } else {
            int iC = ((g11) list.get(0)).c();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iC = Math.max(iC, ((g11) it.next()).c());
            }
            i10 = iC;
        }
        return new q60(al0Var, i10);
    }
}
