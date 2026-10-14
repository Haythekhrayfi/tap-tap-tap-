package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.MediationData;

/* JADX INFO: loaded from: classes3.dex */
final class wd0 implements sj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdResponse<cj0> f26257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MediationData f26258b;

    public wd0(AdResponse<cj0> adResponse, MediationData mediationData) {
        this.f26257a = adResponse;
        this.f26258b = mediationData;
    }

    @Override // com.yandex.mobile.ads.impl.sj0
    public final rj0 a(com.yandex.mobile.ads.nativeads.o oVar) {
        return new com.yandex.mobile.ads.mediation.nativeads.m(oVar, this.f26257a, this.f26258b);
    }
}
