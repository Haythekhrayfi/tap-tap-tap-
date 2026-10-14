package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Uf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1245Uf implements HJ {
    @Override // com.facebook.ads.redexgen.X.HJ
    public final C1244Ue A4Y(Looper looper, Handler.Callback callback) {
        return new C1244Ue(new Handler(looper, callback));
    }

    @Override // com.facebook.ads.redexgen.X.HJ
    public final long A5N() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.facebook.ads.redexgen.X.HJ
    public final long AFw() {
        return SystemClock.uptimeMillis();
    }
}
