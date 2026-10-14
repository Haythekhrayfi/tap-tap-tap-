package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class wi {
    public static lw a(AdResponse adResponse, zi ziVar, lk0 lk0Var) {
        pl0 pl0VarA = lk0Var.a();
        om0 om0VarB = lk0Var.b();
        if (pl0VarA != null) {
            return new nl0(adResponse, pl0VarA, ziVar);
        }
        return om0VarB != null ? new mm0(om0VarB, ziVar) : new uj0(adResponse, ziVar);
    }
}
