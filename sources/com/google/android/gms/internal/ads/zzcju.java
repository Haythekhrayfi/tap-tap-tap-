package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzcju implements zzdrb {
    private final Long zza;
    private final String zzb;
    private final zzciq zzc;
    private final zzcjy zzd;
    private final zzcju zze = this;

    public /* synthetic */ zzcju(zzciq zzciqVar, zzcjy zzcjyVar, Long l10, String str, zzcjt zzcjtVar) {
        this.zzc = zzciqVar;
        this.zzd = zzcjyVar;
        this.zza = l10;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdrb
    public final zzdrl zza() {
        long jLongValue = this.zza.longValue();
        zzcjy zzcjyVar = this.zzd;
        return zzdrm.zza(jLongValue, zzcjyVar.zza, zzdrf.zzc(zzcjyVar.zzb), this.zzc, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdrb
    public final zzdrp zzb() {
        long jLongValue = this.zza.longValue();
        zzcjy zzcjyVar = this.zzd;
        return zzdrq.zza(jLongValue, zzcjyVar.zza, zzdrf.zzc(zzcjyVar.zzb), this.zzc, this.zzb);
    }
}
