package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzfed {
    private static final zzfwm zza = zzfwc.zzh(null);
    private final zzfwn zzb;
    private final ScheduledExecutorService zzc;
    private final zzfee zzd;

    public zzfed(zzfwn zzfwnVar, ScheduledExecutorService scheduledExecutorService, zzfee zzfeeVar) {
        this.zzb = zzfwnVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfeeVar;
    }

    public final zzfdt zza(Object obj, zzfwm... zzfwmVarArr) {
        return new zzfdt(this, obj, Arrays.asList(zzfwmVarArr), null);
    }

    public final zzfec zzb(Object obj, zzfwm zzfwmVar) {
        return new zzfec(this, obj, zzfwmVar, Collections.singletonList(zzfwmVar), zzfwmVar);
    }

    public abstract String zzf(Object obj);
}
