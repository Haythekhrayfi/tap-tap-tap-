package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public final class q51 implements ki {
    @Override // com.yandex.mobile.ads.impl.ki
    public final long a() {
        return SystemClock.uptimeMillis();
    }

    @Override // com.yandex.mobile.ads.impl.ki
    public final my a(Looper looper, Handler.Callback callback) {
        return new s51(new Handler(looper, callback));
    }

    @Override // com.yandex.mobile.ads.impl.ki
    public final void b() {
    }

    @Override // com.yandex.mobile.ads.impl.ki
    public final long c() {
        return SystemClock.elapsedRealtime();
    }
}
