package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdlt {
    private final zzcve zza;
    private final zzcwn zzb;
    private final zzcxa zzc;
    private final zzcxm zzd;
    private final zzdaa zze;
    private final zzezn zzf;
    private final zzezq zzg;

    public zzdlt(zzcve zzcveVar, zzcwn zzcwnVar, zzcxa zzcxaVar, zzcxm zzcxmVar, zzdaa zzdaaVar, zzezn zzeznVar, zzezq zzezqVar) {
        this.zza = zzcveVar;
        this.zzb = zzcwnVar;
        this.zzc = zzcxaVar;
        this.zzd = zzcxmVar;
        this.zze = zzdaaVar;
        this.zzf = zzeznVar;
        this.zzg = zzezqVar;
    }

    public final void zza(zzdlx zzdlxVar) {
        zzdlk zzdlkVar = zzdlxVar.zza;
        zzcve zzcveVar = this.zza;
        zzcxa zzcxaVar = this.zzc;
        zzcxm zzcxmVar = this.zzd;
        zzdaa zzdaaVar = this.zze;
        final zzcwn zzcwnVar = this.zzb;
        Objects.requireNonNull(zzcwnVar);
        zzdlkVar.zzh(zzcveVar, zzcxaVar, zzcxmVar, zzdaaVar, new com.google.android.gms.ads.internal.overlay.zzz() { // from class: com.google.android.gms.internal.ads.zzdls
            @Override // com.google.android.gms.ads.internal.overlay.zzz
            public final void zzg() {
                zzcwnVar.zzb();
            }
        });
        zzdlxVar.zze(this.zzf, this.zzg);
    }
}
