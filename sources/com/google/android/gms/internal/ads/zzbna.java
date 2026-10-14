package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzbna implements zzcan {
    public final /* synthetic */ zzbmf zza;
    public final /* synthetic */ Object zzb;
    public final /* synthetic */ zzcaj zzc;
    public final /* synthetic */ zzbnd zzd;

    public zzbna(zzbnd zzbndVar, zzbmf zzbmfVar, Object obj, zzcaj zzcajVar) {
        this.zzd = zzbndVar;
        this.zza = zzbmfVar;
        this.zzb = obj;
        this.zzc = zzcajVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzbnd.zzd(this.zzd, this.zza, (zzbmm) obj, this.zzb, this.zzc);
    }
}
