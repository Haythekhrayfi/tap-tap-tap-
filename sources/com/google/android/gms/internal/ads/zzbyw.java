package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzbyw extends com.google.android.gms.ads.internal.util.zzb {
    public final /* synthetic */ zzbza zza;

    public zzbyw(zzbza zzbzaVar) {
        this.zza = zzbzaVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        zzbza zzbzaVar = this.zza;
        zzbbs zzbbsVar = new zzbbs(zzbzaVar.zze, zzbzaVar.zzf.zza);
        synchronized (this.zza.zza) {
            try {
                com.google.android.gms.ads.internal.zzt.zze();
                zzbbv.zza(this.zza.zzh, zzbbsVar);
            } catch (IllegalArgumentException e10) {
                zzbzr.zzk("Cannot config CSI reporter.", e10);
            }
        }
    }
}
