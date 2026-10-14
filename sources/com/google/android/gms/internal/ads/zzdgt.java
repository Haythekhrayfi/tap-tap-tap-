package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzdgt implements zzaua {
    public final /* synthetic */ String zza;
    public final /* synthetic */ zzdgv zzb;

    public zzdgt(zzdgv zzdgvVar, String str) {
        this.zzb = zzdgvVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzaua
    public final void zzc(zzatz zzatzVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbD)).booleanValue()) {
            if (zzatzVar.zzj) {
                this.zzb.zzy.put(this.zza, Boolean.TRUE);
                zzdgv zzdgvVar = this.zzb;
                zzdgvVar.zzA(zzdgvVar.zzo.zzf(), this.zzb.zzo.zzl(), this.zzb.zzo.zzm(), true);
                return;
            }
            return;
        }
        synchronized (this) {
            if (zzatzVar.zzj) {
                zzdgv zzdgvVar2 = this.zzb;
                if (zzdgvVar2.zzo == null) {
                    return;
                }
                zzdgvVar2.zzy.put(this.zza, Boolean.TRUE);
                zzdgv zzdgvVar3 = this.zzb;
                zzdgvVar3.zzA(zzdgvVar3.zzo.zzf(), this.zzb.zzo.zzl(), this.zzb.zzo.zzm(), true);
            }
        }
    }
}
