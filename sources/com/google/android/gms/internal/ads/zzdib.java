package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdib implements zzgwe {
    private final zzgwr zza;
    private final zzgwr zzb;
    private final zzgwr zzc;
    private final zzgwr zzd;
    private final zzgwr zze;
    private final zzgwr zzf;
    private final zzgwr zzg;
    private final zzgwr zzh;
    private final zzgwr zzi;

    public zzdib(zzgwr zzgwrVar, zzgwr zzgwrVar2, zzgwr zzgwrVar3, zzgwr zzgwrVar4, zzgwr zzgwrVar5, zzgwr zzgwrVar6, zzgwr zzgwrVar7, zzgwr zzgwrVar8, zzgwr zzgwrVar9) {
        this.zza = zzgwrVar;
        this.zzb = zzgwrVar2;
        this.zzc = zzgwrVar3;
        this.zzd = zzgwrVar4;
        this.zze = zzgwrVar5;
        this.zzf = zzgwrVar6;
        this.zzg = zzgwrVar7;
        this.zzh = zzgwrVar8;
        this.zzi = zzgwrVar9;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdia zzb() {
        com.google.android.gms.ads.internal.util.zzg zzgVarZzb = ((zzcgy) this.zza).zzb();
        zzfai zzfaiVarZza = ((zzcux) this.zzb).zza();
        zzdhf zzdhfVar = (zzdhf) this.zzc.zzb();
        zzdha zzdhaVarZza = ((zzdht) this.zzd).zza();
        zzdim zzdimVar = (zzdim) this.zze.zzb();
        zzdiu zzdiuVar = (zzdiu) this.zzf.zzb();
        Executor executor = (Executor) this.zzg.zzb();
        zzfwn zzfwnVar = zzcae.zza;
        zzgwm.zzb(zzfwnVar);
        return new zzdia(zzgVarZzb, zzfaiVarZza, zzdhfVar, zzdhaVarZza, zzdimVar, zzdiuVar, executor, zzfwnVar, (zzdgx) this.zzi.zzb());
    }
}
