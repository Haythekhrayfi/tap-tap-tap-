package com.yandex.mobile.ads.impl;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class eq {
    public static yp a(com.yandex.mobile.ads.nativeads.u uVar) {
        List<yp> listB = uVar.b();
        if (listB == null) {
            return null;
        }
        for (yp ypVar : listB) {
            if (bp.b(3).equals(ypVar.c())) {
                return ypVar;
            }
        }
        return null;
    }
}
