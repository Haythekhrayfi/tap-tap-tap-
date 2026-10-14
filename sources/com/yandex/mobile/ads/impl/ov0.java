package com.yandex.mobile.ads.impl;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public final class ov0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Long f23926a;

    public final long a() {
        Long l10 = this.f23926a;
        if (l10 == null) {
            return 0L;
        }
        return SystemClock.elapsedRealtime() - l10.longValue();
    }

    public final void b() {
        this.f23926a = Long.valueOf(SystemClock.elapsedRealtime());
    }
}
