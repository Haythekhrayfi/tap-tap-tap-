package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzezd implements zzekb {
    public final /* synthetic */ zzeze zza;

    public zzezd(zzeze zzezeVar) {
        this.zza = zzezeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzekb
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzekb
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        synchronized (this.zza) {
            this.zza.zzi = (zzdmm) obj;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzdh)).booleanValue()) {
                ((zzdmm) obj).zzd().zza = this.zza.zzd;
            }
            this.zza.zzi.zzj();
        }
    }
}
