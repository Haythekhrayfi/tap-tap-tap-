package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* JADX INFO: loaded from: classes2.dex */
final class zzpk {
    public static void zza(AudioTrack audioTrack, zzoc zzocVar) {
        LogSessionId logSessionIdZza = zzocVar.zza();
        if (logSessionIdZza.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        audioTrack.setLogSessionId(logSessionIdZza);
    }
}
