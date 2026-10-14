package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;

/* JADX INFO: loaded from: classes3.dex */
public final class cb0 implements zo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ya0 f19437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f19438b;

    public cb0(NativeAdAssets nativeAdAssets, int i10) {
        this.f19438b = i10;
        this.f19437a = new ya0(nativeAdAssets);
    }

    @Override // com.yandex.mobile.ads.impl.zo
    public final boolean a(Context context) {
        int i10 = eh1.f20253b;
        int i11 = context.getResources().getDisplayMetrics().heightPixels;
        int i12 = context.getResources().getDisplayMetrics().widthPixels;
        Float fA = this.f19437a.a();
        return i12 - (fA != null ? Math.round(fA.floatValue() * ((float) i11)) : 0) >= this.f19438b;
    }
}
