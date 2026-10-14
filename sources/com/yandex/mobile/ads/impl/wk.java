package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class wk {
    public static lw a(AdResponse adResponse, h2 h2Var, lk0 lk0Var) {
        pl0 pl0VarA = lk0Var.a();
        om0 om0VarB = lk0Var.b();
        if (pl0VarA != null) {
            return new ol0(adResponse, pl0VarA, h2Var);
        }
        return om0VarB != null ? new nm0(om0VarB, h2Var) : new wj0(adResponse, h2Var);
    }
}
