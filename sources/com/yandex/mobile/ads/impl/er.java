package com.yandex.mobile.ads.impl;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class er extends t11 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final fr f20314m;

    public er(List<byte[]> list) {
        mp0 mp0Var = new mp0(list.get(0));
        this.f20314m = new fr(mp0Var.z(), mp0Var.z());
    }

    @Override // com.yandex.mobile.ads.impl.t11
    public final h51 a(byte[] bArr, int i10, boolean z10) {
        if (z10) {
            this.f20314m.d();
        }
        return new gr(this.f20314m.a(i10, bArr));
    }
}
