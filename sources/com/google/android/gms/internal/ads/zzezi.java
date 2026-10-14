package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzezi implements zzekb {
    public final /* synthetic */ zzezk zza;

    public zzezi(zzezk zzezkVar) {
        this.zza = zzezkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzekb
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzd = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzekb
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        synchronized (this.zza) {
            this.zza.zzd = (zzdmm) obj;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzdh)).booleanValue()) {
                ((zzdmm) obj).zzd().zza = this.zza.zzc;
            }
            this.zza.zzd.zzj();
        }
    }
}
