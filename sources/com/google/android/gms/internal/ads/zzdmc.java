package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdmc {
    private final zzcve zza;
    private final zzcwn zzb;
    private final zzcxa zzc;
    private final zzcxm zzd;
    private final zzdaa zze;
    private final zzdcs zzf;

    public zzdmc(zzcve zzcveVar, zzcwn zzcwnVar, zzcxa zzcxaVar, zzcxm zzcxmVar, zzdaa zzdaaVar, zzdcs zzdcsVar) {
        this.zza = zzcveVar;
        this.zzb = zzcwnVar;
        this.zzc = zzcxaVar;
        this.zzd = zzcxmVar;
        this.zze = zzdaaVar;
        this.zzf = zzdcsVar;
    }

    public final void zza(zzdmd zzdmdVar) {
        zzdma zzdmaVar = zzdmdVar.zza;
        zzcve zzcveVar = this.zza;
        zzcxa zzcxaVar = this.zzc;
        zzcxm zzcxmVar = this.zzd;
        zzdaa zzdaaVar = this.zze;
        final zzcwn zzcwnVar = this.zzb;
        Objects.requireNonNull(zzcwnVar);
        zzdmaVar.zzi(zzcveVar, zzcxaVar, zzcxmVar, zzdaaVar, new com.google.android.gms.ads.internal.overlay.zzz() { // from class: com.google.android.gms.internal.ads.zzdmb
            @Override // com.google.android.gms.ads.internal.overlay.zzz
            public final void zzg() {
                zzcwnVar.zzb();
            }
        }, this.zzf);
    }
}
