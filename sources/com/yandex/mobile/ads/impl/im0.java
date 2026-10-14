package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class im0 implements lg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kg1 f21744a;

    public im0(kg1 kg1Var) {
        this.f21744a = kg1Var;
    }

    @Override // com.yandex.mobile.ads.impl.lg1
    public final List<qc1> a() {
        return Collections.emptyList();
    }

    @Override // com.yandex.mobile.ads.impl.lg1
    public final View getView() {
        return this.f21744a.b();
    }
}
