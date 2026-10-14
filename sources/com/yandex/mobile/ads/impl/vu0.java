package com.yandex.mobile.ads.impl;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
final class vu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x1 f26086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final iz0 f26087b;

    public vu0(iz0 iz0Var, x1 x1Var) {
        this.f26087b = iz0Var;
        this.f26086a = x1Var;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    public final w50 a(long j10) {
        boolean z10;
        ArrayList arrayListA = this.f26087b.a();
        int i10 = 0;
        while (i10 < arrayListA.size()) {
            w50 w50VarA = ((rr0) arrayListA.get(i10)).a();
            if (i10 <= 0 ? j10 < 0 : j10 <= ((rr0) arrayListA.get(i10 + (-1))).b()) {
                z10 = true;
            } else {
                if (j10 > ((rr0) arrayListA.get(i10)).b()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if ((z10 ^ true) && w1.f26124a.equals(this.f26086a.a(w50VarA))) {
                return w50VarA;
            }
            i10++;
        }
        return null;
    }
}
