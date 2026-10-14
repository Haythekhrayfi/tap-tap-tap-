package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class ay0 {
    public static lw a(AdResponse adResponse, ct0 ct0Var, lk0 lk0Var) {
        pl0 pl0VarA = lk0Var.a();
        om0 om0VarB = lk0Var.b();
        if (pl0VarA != null) {
            return new bm0(adResponse, pl0VarA, ct0Var);
        }
        if (om0VarB == null) {
            return new gk0(adResponse, ct0Var);
        }
        return null;
    }
}
