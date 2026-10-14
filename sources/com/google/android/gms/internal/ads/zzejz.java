package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzejz {
    private final zzdhl zza;
    private final zzejm zzb;
    private final zzcvj zzc;

    public zzejz(zzdhl zzdhlVar, zzfev zzfevVar) {
        this.zza = zzdhlVar;
        final zzejm zzejmVar = new zzejm(zzfevVar);
        this.zzb = zzejmVar;
        final zzbla zzblaVarZzg = zzdhlVar.zzg();
        this.zzc = new zzcvj() { // from class: com.google.android.gms.internal.ads.zzejy
            @Override // com.google.android.gms.internal.ads.zzcvj
            public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
                zzejm zzejmVar2 = zzejmVar;
                zzbla zzblaVar = zzblaVarZzg;
                zzejmVar2.zza(zzeVar);
                if (zzblaVar != null) {
                    try {
                        zzblaVar.zzf(zzeVar);
                    } catch (RemoteException e10) {
                        zzbzr.zzl("#007 Could not call remote method.", e10);
                    }
                }
                if (zzblaVar != null) {
                    try {
                        zzblaVar.zze(zzeVar.zza);
                    } catch (RemoteException e11) {
                        zzbzr.zzl("#007 Could not call remote method.", e11);
                    }
                }
            }
        };
    }

    public final zzcvj zza() {
        return this.zzc;
    }

    public final zzcwu zzb() {
        return this.zzb;
    }

    public final zzdff zzc() {
        return new zzdff(this.zza, this.zzb.zzc());
    }

    public final zzejm zzd() {
        return this.zzb;
    }

    public final void zze(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        this.zzb.zze(zzbhVar);
    }
}
