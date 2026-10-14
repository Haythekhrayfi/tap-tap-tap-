package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzdsb extends zzbki {
    public final /* synthetic */ Object zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ zzffn zzd;
    public final /* synthetic */ zzcaj zze;
    public final /* synthetic */ zzdsc zzf;

    public zzdsb(zzdsc zzdscVar, Object obj, String str, long j10, zzffn zzffnVar, zzcaj zzcajVar) {
        this.zzf = zzdscVar;
        this.zza = obj;
        this.zzb = str;
        this.zzc = j10;
        this.zzd = zzffnVar;
        this.zze = zzcajVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkj
    public final void zze(String str) {
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, false, str, (int) (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zzc));
            this.zzf.zzl.zzb(this.zzb, "error");
            this.zzf.zzo.zzb(this.zzb, "error");
            zzfgb zzfgbVar = this.zzf.zzp;
            zzffn zzffnVar = this.zzd;
            zzffnVar.zzc(str);
            zzffnVar.zzf(false);
            zzfgbVar.zzb(zzffnVar.zzl());
            this.zze.zzd(Boolean.FALSE);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbkj
    public final void zzf() {
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, true, "", (int) (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zzc));
            this.zzf.zzl.zzd(this.zzb);
            this.zzf.zzo.zzd(this.zzb);
            zzfgb zzfgbVar = this.zzf.zzp;
            zzffn zzffnVar = this.zzd;
            zzffnVar.zzf(true);
            zzfgbVar.zzb(zzffnVar.zzl());
            this.zze.zzd(Boolean.TRUE);
        }
    }
}
