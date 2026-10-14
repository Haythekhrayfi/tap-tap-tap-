package com.yandex.mobile.ads.impl;

import ch.qos.logback.core.spi.AbstractComponentTracker;

/* JADX INFO: loaded from: classes3.dex */
public final class sz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nz0 f25210a;

    public sz(nz0 nz0Var) {
        this.f25210a = nz0Var;
    }

    public final long a() {
        nz0 nz0Var = this.f25210a;
        Long lValueOf = nz0Var != null ? Long.valueOf(nz0Var.l()) : null;
        return (lValueOf == null || lValueOf.longValue() == 0) ? AbstractComponentTracker.LINGERING_TIMEOUT : lValueOf.longValue();
    }
}
