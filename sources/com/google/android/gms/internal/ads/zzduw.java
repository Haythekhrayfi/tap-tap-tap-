package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzduw {
    private final ScheduledExecutorService zza;
    private final zzfwn zzb;
    private final zzfwn zzc;
    private final zzdvn zzd;
    private final zzgvy zze;

    public zzduw(ScheduledExecutorService scheduledExecutorService, zzfwn zzfwnVar, zzfwn zzfwnVar2, zzdvn zzdvnVar, zzgvy zzgvyVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzfwnVar;
        this.zzc = zzfwnVar2;
        this.zzd = zzdvnVar;
        this.zze = zzgvyVar;
    }

    public final /* synthetic */ zzfwm zza(zzbue zzbueVar, int i10, Throwable th) throws Exception {
        return ((zzdyh) this.zze.zzb()).zzd(zzbueVar, i10);
    }

    public final zzfwm zzb(final zzbue zzbueVar) {
        zzfwm zzfwmVarZzb;
        String str = zzbueVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzs.zzy(str)) {
            zzfwmVarZzb = zzfwc.zzg(new zzdwa(1));
        } else {
            zzfwmVarZzb = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzhn)).booleanValue() ? this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzduu
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.zzc(zzbueVar);
                }
            }) : this.zzd.zzb(zzbueVar);
        }
        final int callingUid = Binder.getCallingUid();
        return zzfwc.zzf((zzfvt) zzfwc.zzn(zzfvt.zzv(zzfwmVarZzb), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzfm)).intValue(), TimeUnit.SECONDS, this.zza), Throwable.class, new zzfvj() { // from class: com.google.android.gms.internal.ads.zzduv
            @Override // com.google.android.gms.internal.ads.zzfvj
            public final zzfwm zza(Object obj) {
                return this.zza.zza(zzbueVar, callingUid, (Throwable) obj);
            }
        }, this.zzb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ InputStream zzc(zzbue zzbueVar) throws Exception {
        return (InputStream) this.zzd.zzb(zzbueVar).get(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzfm)).intValue(), TimeUnit.SECONDS);
    }
}
