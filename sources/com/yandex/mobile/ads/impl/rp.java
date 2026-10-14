package com.yandex.mobile.ads.impl;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class rp {
    public static y9.z1 a(y9.g0 g0Var) {
        List<y9.z1> listL = g0Var.l();
        if (listL == null) {
            return null;
        }
        for (y9.z1 z1Var : listL) {
            if ("view".equals(z1Var.f44585a)) {
                return z1Var;
            }
        }
        return null;
    }
}
