package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzcjs implements zzdra {
    private final zzciq zza;
    private final zzcjy zzb;
    private Long zzc;
    private String zzd;

    public /* synthetic */ zzcjs(zzciq zzciqVar, zzcjy zzcjyVar, zzcjr zzcjrVar) {
        this.zza = zzciqVar;
        this.zzb = zzcjyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdra
    public final /* synthetic */ zzdra zza(String str) {
        Objects.requireNonNull(str);
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdra
    public final /* bridge */ /* synthetic */ zzdra zzb(long j10) {
        this.zzc = Long.valueOf(j10);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdra
    public final zzdrb zzc() {
        zzgwm.zzc(this.zzc, Long.class);
        zzgwm.zzc(this.zzd, String.class);
        return new zzcju(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
