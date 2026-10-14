package com.yandex.mobile.ads.impl;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zm0 implements ym0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final td f27369a = new td();

    @Override // com.yandex.mobile.ads.impl.ym0
    public final String a(fx0 fx0Var) {
        if (fx0Var.a().a() == null) {
            return null;
        }
        td tdVar = this.f27369a;
        byte[] bArrA = fx0Var.a().a();
        Objects.requireNonNull(tdVar);
        return td.a(bArrA);
    }
}
