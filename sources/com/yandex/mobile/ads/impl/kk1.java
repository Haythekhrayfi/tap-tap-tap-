package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class kk1 implements p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdResponse f22435a;

    public kk1(AdResponse adResponse) {
        this.f22435a = adResponse;
    }

    @Override // com.yandex.mobile.ads.impl.p3
    public final b1 a() {
        return new mk1();
    }

    @Override // com.yandex.mobile.ads.impl.p3
    public final q5 b() {
        return new lk1(this.f22435a);
    }
}
