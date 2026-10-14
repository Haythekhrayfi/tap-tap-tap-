package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.R;

/* JADX INFO: loaded from: classes3.dex */
public final class j50 {
    public static int a(e50 e50Var) {
        fd.j0.i(e50Var, "instreamDesign");
        int iOrdinal = e50Var.ordinal();
        if (iOrdinal == 0) {
            return R.layout.yandex_ads_internal_instream_skin_v1;
        }
        if (iOrdinal == 1) {
            return R.layout.yandex_ads_internal_instream_skin_v2;
        }
        throw new jc.g();
    }
}
