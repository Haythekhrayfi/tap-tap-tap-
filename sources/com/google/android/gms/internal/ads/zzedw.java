package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzedw implements zzecc {
    private final zzcpy zza;
    private final zzedd zzb;
    private final zzfwn zzc;
    private final zzcvi zzd;
    private final ScheduledExecutorService zze;

    public zzedw(zzcpy zzcpyVar, zzedd zzeddVar, zzcvi zzcviVar, ScheduledExecutorService scheduledExecutorService, zzfwn zzfwnVar) {
        this.zza = zzcpyVar;
        this.zzb = zzeddVar;
        this.zzd = zzcviVar;
        this.zze = scheduledExecutorService;
        this.zzc = zzfwnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzecc
    public final zzfwm zza(final zzezz zzezzVar, final zzezn zzeznVar) {
        return this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzedt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc(zzezzVar, zzeznVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzecc
    public final boolean zzb(zzezz zzezzVar, zzezn zzeznVar) {
        return zzezzVar.zza.zza.zza() != null && this.zzb.zzb(zzezzVar, zzeznVar);
    }

    public final /* synthetic */ zzcpb zzc(final zzezz zzezzVar, final zzezn zzeznVar) throws Exception {
        return this.zza.zzb(new zzcrs(zzezzVar, zzeznVar, null), new zzcql(zzezzVar.zza.zza.zza(), new Runnable() { // from class: com.google.android.gms.internal.ads.zzedu
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzf(zzezzVar, zzeznVar);
            }
        })).zza();
    }

    public final /* synthetic */ void zzf(zzezz zzezzVar, zzezn zzeznVar) {
        zzfwc.zzq(zzfwc.zzn(this.zzb.zza(zzezzVar, zzeznVar), zzeznVar.zzS, TimeUnit.SECONDS, this.zze), new zzedv(this), this.zzc);
    }
}
