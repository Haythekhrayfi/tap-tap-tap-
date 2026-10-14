package com.yandex.mobile.ads.impl;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class jg1 {
    public static ArrayList a(ArrayList arrayList) {
        fd.j0.i(arrayList, "trackingUrls");
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!fd.j0.d((String) obj, "about:blank")) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }
}
