package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class t41 extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final as f25278a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t41(as asVar) {
        super("stream was reset: " + asVar);
        fd.j0.i(asVar, "errorCode");
        this.f25278a = asVar;
    }
}
