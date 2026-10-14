package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.MediationData;

/* JADX INFO: loaded from: classes3.dex */
final class rd0 implements fd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdResponse<String> f24673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MediationData f24674b;

    public rd0(AdResponse<String> adResponse, MediationData mediationData) {
        this.f24673a = adResponse;
        this.f24674b = mediationData;
    }

    @Override // com.yandex.mobile.ads.impl.fd
    public final ed a(com.yandex.mobile.ads.banner.e eVar) {
        return new com.yandex.mobile.ads.mediation.banner.d(eVar, this.f24673a, this.f24674b);
    }
}
