package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.parser.vmap.configurator.AdBreakParameters;

/* JADX INFO: loaded from: classes3.dex */
public final class z4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q1 f27215a;

    public z4(q1 q1Var) {
        this.f27215a = q1Var;
    }

    public final i6 a() {
        return this.f27215a.b().a();
    }

    public final String b() {
        AdBreakParameters adBreakParametersE = this.f27215a.e();
        if (adBreakParametersE != null) {
            return adBreakParametersE.c();
        }
        return null;
    }

    public final String c() {
        return this.f27215a.b().b();
    }

    public final String d() {
        AdBreakParameters adBreakParametersE = this.f27215a.e();
        if (adBreakParametersE != null) {
            return adBreakParametersE.d();
        }
        return null;
    }

    public final String e() {
        AdBreakParameters adBreakParametersE = this.f27215a.e();
        if (adBreakParametersE != null) {
            return adBreakParametersE.e();
        }
        return null;
    }
}
