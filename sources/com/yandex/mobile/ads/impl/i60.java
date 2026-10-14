package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class i60 implements lg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s40 f21604a;

    public i60(s40 s40Var) {
        this.f21604a = s40Var;
    }

    @Override // com.yandex.mobile.ads.impl.lg1
    public final List<qc1> a() {
        r40 r40VarA = this.f21604a.a();
        return r40VarA != null ? r40VarA.a() : Collections.emptyList();
    }

    @Override // com.yandex.mobile.ads.impl.lg1
    public final View getView() {
        r40 r40VarA = this.f21604a.a();
        if (r40VarA != null) {
            return r40VarA.b();
        }
        return null;
    }
}
