package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdub {
    private final zzfwn zza;
    private final zzfwn zzb;
    private final zzdvj zzc;
    private final zzgvy zzd;

    public zzdub(zzfwn zzfwnVar, zzfwn zzfwnVar2, zzdvj zzdvjVar, zzgvy zzgvyVar) {
        this.zza = zzfwnVar;
        this.zzb = zzfwnVar2;
        this.zzc = zzdvjVar;
        this.zzd = zzgvyVar;
    }

    public final /* synthetic */ zzfwm zza(zzbue zzbueVar, int i10, zzdwa zzdwaVar) throws Exception {
        return ((zzdyh) this.zzd.zzb()).zzc(zzbueVar, i10);
    }

    public final zzfwm zzb(final zzbue zzbueVar) {
        String str = zzbueVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzp();
        zzfwm zzfwmVarZzg = com.google.android.gms.ads.internal.util.zzs.zzy(str) ? zzfwc.zzg(new zzdwa(1)) : zzfwc.zzf(this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdty
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc(zzbueVar);
            }
        }), ExecutionException.class, new zzfvj() { // from class: com.google.android.gms.internal.ads.zzdtz
            @Override // com.google.android.gms.internal.ads.zzfvj
            public final zzfwm zza(Object obj) {
                return zzfwc.zzg(((ExecutionException) obj).getCause());
            }
        }, this.zzb);
        final int callingUid = Binder.getCallingUid();
        return zzfwc.zzf(zzfwmVarZzg, zzdwa.class, new zzfvj() { // from class: com.google.android.gms.internal.ads.zzdua
            @Override // com.google.android.gms.internal.ads.zzfvj
            public final zzfwm zza(Object obj) {
                return this.zza.zza(zzbueVar, callingUid, (zzdwa) obj);
            }
        }, this.zzb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ InputStream zzc(zzbue zzbueVar) throws Exception {
        zzcaj zzcajVar;
        final zzdvj zzdvjVar = this.zzc;
        synchronized (zzdvjVar.zzb) {
            if (zzdvjVar.zzc) {
                zzcajVar = zzdvjVar.zza;
            } else {
                zzdvjVar.zzc = true;
                zzdvjVar.zze = zzbueVar;
                zzdvjVar.zzf.checkAvailabilityAndConnect();
                zzdvjVar.zza.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdvi
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdvjVar.zza();
                    }
                }, zzcae.zzf);
                zzcajVar = zzdvjVar.zza;
            }
        }
        return (InputStream) zzcajVar.get(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzfm)).intValue(), TimeUnit.SECONDS);
    }
}
