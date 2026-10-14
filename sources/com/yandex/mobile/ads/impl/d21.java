package com.yandex.mobile.ads.impl;

import android.widget.ImageView;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class d21 extends e20 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final z10 f19743g;

    public d21(xw0 xw0Var, e20.b bVar, z10 z10Var) {
        super(xw0Var, bVar);
        this.f19743g = z10Var;
    }

    @Override // com.yandex.mobile.ads.impl.e20
    public final String a(String str, ImageView.ScaleType scaleType) {
        Objects.requireNonNull(this.f19743g);
        return z10.a(str, scaleType);
    }
}
