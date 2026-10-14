package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class z41 implements qx0<String> {
    @Override // com.yandex.mobile.ads.impl.qx0
    public final String a(fx0 fx0Var) {
        byte[] bArrA = fx0Var.a().a();
        if (bArrA == null) {
            return null;
        }
        try {
            return new String(bArrA, qy.a(fx0Var.b()));
        } catch (Exception unused) {
            return new String(bArrA);
        }
    }
}
