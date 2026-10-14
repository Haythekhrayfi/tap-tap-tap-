package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzcnl implements zzfvy {
    public final /* synthetic */ String zza;
    public final /* synthetic */ zzcnm zzb;

    public zzcnl(zzcnm zzcnmVar, String str) {
        this.zzb = zzcnmVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfvy
    public final void zza(Throwable th) {
        zzcnm zzcnmVar = this.zzb;
        zzcnmVar.zzh.zza(zzcnmVar.zzg.zzd(zzcnmVar.zze, zzcnmVar.zzf, false, this.zza, null, zzcnmVar.zzf.zzd));
    }

    @Override // com.google.android.gms.internal.ads.zzfvy
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        zzcnm zzcnmVar = this.zzb;
        zzcnmVar.zzh.zza(zzcnmVar.zzg.zzd(zzcnmVar.zze, zzcnmVar.zzf, false, this.zza, str, zzcnmVar.zzf.zzd));
    }
}
