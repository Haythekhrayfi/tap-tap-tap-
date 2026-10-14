package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeub {
    public static zzeqy zza(zzetf zzetfVar, zzeoy zzeoyVar, ScheduledExecutorService scheduledExecutorService, int i10) {
        return i10 == 0 ? new zzepg(zzeoyVar, 0L, scheduledExecutorService) : new zzepg(zzetfVar, 0L, scheduledExecutorService);
    }

    public static zzeqy zzb(zzetp zzetpVar, ScheduledExecutorService scheduledExecutorService) {
        return new zzepg(zzetpVar, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzdO)).longValue(), scheduledExecutorService);
    }

    public static zzeqy zzc(zzeuk zzeukVar, ScheduledExecutorService scheduledExecutorService) {
        return new zzepg(zzeukVar, 0L, scheduledExecutorService);
    }
}
