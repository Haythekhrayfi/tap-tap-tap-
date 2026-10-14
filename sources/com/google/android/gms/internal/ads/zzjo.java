package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;

/* JADX INFO: loaded from: classes2.dex */
final class zzjo {
    public static zzoc zza(Context context, zzjx zzjxVar, boolean z10) {
        zzny zznyVarZzb = zzny.zzb(context);
        if (zznyVarZzb == null) {
            zzer.zzf("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return new zzoc(LogSessionId.LOG_SESSION_ID_NONE);
        }
        if (z10) {
            zzjxVar.zzz(zznyVarZzb);
        }
        return new zzoc(zznyVarZzb.zza());
    }
}
