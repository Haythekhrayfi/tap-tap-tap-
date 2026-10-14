package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.yandex.mobile.ads.nativeads.NativeAdView;

/* JADX INFO: loaded from: classes3.dex */
public final class ax0 implements yo<NativeAdView> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v0 f19071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19072b;

    public ax0(v0 v0Var, int i10) {
        this.f19071a = v0Var;
        this.f19072b = i10;
    }

    @Override // com.yandex.mobile.ads.impl.yo
    public final void a(ViewGroup viewGroup) {
        a1 a1Var;
        int i10;
        if (this.f19072b == 1) {
            a1Var = (a1) this.f19071a;
            i10 = 7;
        } else {
            a1Var = (a1) this.f19071a;
            i10 = 6;
        }
        a1Var.a(i10);
    }

    @Override // com.yandex.mobile.ads.impl.yo
    public final void c() {
    }
}
