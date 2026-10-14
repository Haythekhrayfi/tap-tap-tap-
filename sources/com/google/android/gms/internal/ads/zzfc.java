package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfc implements zzdz {
    @Override // com.google.android.gms.internal.ads.zzdz
    public final long zza() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final zzei zzb(Looper looper, Handler.Callback callback) {
        return new zzff(new Handler(looper, callback));
    }
}
