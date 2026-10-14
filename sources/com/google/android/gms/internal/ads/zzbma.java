package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzbma implements zzcan {
    public final /* synthetic */ zzbmk zza;
    public final /* synthetic */ zzffn zzb;
    public final /* synthetic */ zzbml zzc;

    public zzbma(zzbml zzbmlVar, zzbmk zzbmkVar, zzffn zzffnVar) {
        this.zzc = zzbmlVar;
        this.zza = zzbmkVar;
        this.zzb = zzffnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        synchronized (this.zzc.zza) {
            this.zzc.zzi = 0;
            zzbml zzbmlVar = this.zzc;
            if (zzbmlVar.zzh != null && this.zza != zzbmlVar.zzh) {
                com.google.android.gms.ads.internal.util.zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                this.zzc.zzh.zzb();
            }
            this.zzc.zzh = this.zza;
            if (((Boolean) zzbcy.zzd.zze()).booleanValue()) {
                zzbml zzbmlVar2 = this.zzc;
                if (zzbmlVar2.zze != null) {
                    zzfgb zzfgbVar = zzbmlVar2.zze;
                    zzffn zzffnVar = this.zzb;
                    zzffnVar.zzf(true);
                    zzfgbVar.zzb(zzffnVar.zzl());
                }
            }
        }
    }
}
