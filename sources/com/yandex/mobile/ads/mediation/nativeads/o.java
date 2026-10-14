package com.yandex.mobile.ads.mediation.nativeads;

import com.yandex.mobile.ads.impl.jm0;
import com.yandex.mobile.ads.impl.km0;
import com.yandex.mobile.ads.impl.qh0;
import com.yandex.mobile.ads.impl.xd0;
import com.yandex.mobile.ads.nativeads.s0;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements km0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediatedNativeAd f27605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s0 f27606b = new s0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final xd0 f27607c;

    public o(MediatedNativeAd mediatedNativeAd, xd0 xd0Var) {
        this.f27605a = mediatedNativeAd;
        this.f27607c = xd0Var;
    }

    @Override // com.yandex.mobile.ads.impl.km0
    public final jm0 a(qh0 qh0Var) {
        return new n(this.f27606b.a(qh0Var), this.f27605a, this.f27607c);
    }
}
