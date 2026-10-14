package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class to0 {
    public static za1 a(nl nlVar, v1 v1Var) {
        bs0 bs0Var;
        p50 p50VarA = new i21().a(nlVar);
        int iOrdinal = v1Var.ordinal();
        if (iOrdinal == 0) {
            bs0Var = bs0.f19317b;
        } else if (iOrdinal != 1) {
            bs0Var = iOrdinal != 2 ? bs0.f19320e : bs0.f19319d;
        } else {
            bs0Var = bs0.f19318c;
        }
        return p50VarA != null ? za1.a(p50VarA.getSkipOffset() / 1000.0f, bs0Var) : za1.a(bs0Var);
    }
}
