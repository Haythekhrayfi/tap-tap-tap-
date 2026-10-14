package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.SizeInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class qd {
    public static final SizeInfo a(com.yandex.mobile.ads.banner.e eVar) {
        SizeInfo sizeInfoG;
        fd.j0.i(eVar, "<this>");
        AdResponse<String> adResponseH = eVar.h();
        if (adResponseH != null && (sizeInfoG = adResponseH.G()) != null) {
            if (!((sizeInfoG.e() == 0 && sizeInfoG.c() == 0) ? false : true)) {
                sizeInfoG = null;
            }
            if (sizeInfoG != null) {
                return sizeInfoG;
            }
        }
        return eVar.j();
    }
}
