package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.MediationData;

/* JADX INFO: loaded from: classes3.dex */
final class td0 implements qw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdResponse<String> f25342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MediationData f25343b;

    public td0(AdResponse<String> adResponse, MediationData mediationData) {
        this.f25342a = adResponse;
        this.f25343b = mediationData;
    }

    @Override // com.yandex.mobile.ads.impl.qw
    public final pw<by0> a(dy0 dy0Var) {
        return new com.yandex.mobile.ads.mediation.rewarded.a(dy0Var, this.f25342a, this.f25343b);
    }

    @Override // com.yandex.mobile.ads.impl.qw
    public final pw<d70> a(vw<d70> vwVar) {
        return new com.yandex.mobile.ads.mediation.interstitial.d(vwVar, this.f25342a, this.f25343b);
    }

    @Override // com.yandex.mobile.ads.impl.qw
    public final pw<ha> b(vw<ha> vwVar) {
        return new com.yandex.mobile.ads.mediation.interstitial.d(vwVar, this.f25342a, this.f25343b);
    }
}
