package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzbmb implements zzcal {
    public final /* synthetic */ zzbmk zza;
    public final /* synthetic */ zzffn zzb;
    public final /* synthetic */ zzbml zzc;

    public zzbmb(zzbml zzbmlVar, zzbmk zzbmkVar, zzffn zzffnVar) {
        this.zzc = zzbmlVar;
        this.zza = zzbmkVar;
        this.zzb = zzffnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcal
    public final void zza() {
        synchronized (this.zzc.zza) {
            this.zzc.zzi = 1;
            com.google.android.gms.ads.internal.util.zze.zza("Failed loading new engine. Marking new engine destroyable.");
            this.zza.zzb();
            if (((Boolean) zzbcy.zzd.zze()).booleanValue()) {
                zzbml zzbmlVar = this.zzc;
                if (zzbmlVar.zze != null) {
                    zzfgb zzfgbVar = zzbmlVar.zze;
                    zzffn zzffnVar = this.zzb;
                    zzffnVar.zzc("Failed loading new engine");
                    zzffnVar.zzf(false);
                    zzfgbVar.zzb(zzffnVar.zzl());
                }
            }
        }
    }
}
