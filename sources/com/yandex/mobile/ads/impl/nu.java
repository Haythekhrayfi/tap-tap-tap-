package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class nu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashSet f23552a;

    public nu(NativeAdAssets nativeAdAssets) {
        this.f23552a = qc.a(nativeAdAssets);
    }

    public final boolean a() {
        return this.f23552a.size() == 2 && (this.f23552a.contains("feedback") && this.f23552a.contains("media"));
    }
}
