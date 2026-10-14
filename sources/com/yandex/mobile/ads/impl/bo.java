package com.yandex.mobile.ads.impl;

import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes3.dex */
final class bo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a50 f19298a;

    public bo(or0 or0Var) {
        boolean z10;
        a50.a aVar = new a50.a();
        float volume = or0Var.getVolume();
        if (volume == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            aVar.a(1.0f);
            z10 = true;
        } else {
            aVar.a(volume);
            z10 = false;
        }
        aVar.b(z10);
        this.f19298a = aVar.a();
    }

    public final a50 a() {
        return this.f19298a;
    }
}
