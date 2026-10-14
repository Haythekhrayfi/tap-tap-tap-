package com.yandex.mobile.ads.impl;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class y10 implements eb<j20> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w41 f26674a = new w41();

    @Override // com.yandex.mobile.ads.impl.eb
    public final boolean a(j20 j20Var) {
        String strD = j20Var.d();
        if (strD != null) {
            Objects.requireNonNull(this.f26674a);
            if (w41.a2(strD)) {
                return true;
            }
        }
        return false;
    }
}
