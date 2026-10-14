package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;

/* JADX INFO: loaded from: classes2.dex */
final class zzrt {
    public static void zza(zzrn zzrnVar, zzoc zzocVar) {
        LogSessionId logSessionIdZza = zzocVar.zza();
        if (logSessionIdZza.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        zzrnVar.zzb.setString("log-session-id", logSessionIdZza.getStringId());
    }
}
