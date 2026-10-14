package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class kd0 implements p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdResponse f22391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final hd0 f22392b;

    public kd0(AdResponse adResponse, hd0 hd0Var) {
        this.f22391a = adResponse;
        this.f22392b = hd0Var;
    }

    @Override // com.yandex.mobile.ads.impl.p3
    public final b1 a() {
        return new pd0(this.f22392b);
    }

    @Override // com.yandex.mobile.ads.impl.p3
    public final q5 b() {
        return new nd0(this.f22391a);
    }
}
