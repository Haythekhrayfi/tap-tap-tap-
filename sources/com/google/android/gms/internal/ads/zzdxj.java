package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdxj implements zzgwe {
    private final zzgwr zza;
    private final zzgwr zzb;
    private final zzgwr zzc;
    private final zzgwr zzd;
    private final zzgwr zze;
    private final zzgwr zzf;
    private final zzgwr zzg;
    private final zzgwr zzh;
    private final zzgwr zzi;

    public zzdxj(zzgwr zzgwrVar, zzgwr zzgwrVar2, zzgwr zzgwrVar3, zzgwr zzgwrVar4, zzgwr zzgwrVar5, zzgwr zzgwrVar6, zzgwr zzgwrVar7, zzgwr zzgwrVar8, zzgwr zzgwrVar9) {
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
    public final zzdxi zzb() {
        zzcxz zzcxzVarZzb = ((zzcya) this.zza).zzb();
        zzdwq zzdwqVarZzb = ((zzdwr) this.zzb).zzb();
        zzfel zzfelVar = (zzfel) this.zzc.zzb();
        zzfai zzfaiVarZza = ((zzcux) this.zzd).zza();
        zzbzx zzbzxVarZza = ((zzchm) this.zze).zza();
        zzfgb zzfgbVar = (zzfgb) this.zzf.zzb();
        zzffy zzffyVar = (zzffy) this.zzg.zzb();
        Context contextZza = ((zzcha) this.zzh).zza();
        zzfwn zzfwnVar = zzcae.zza;
        zzgwm.zzb(zzfwnVar);
        return new zzdxi(zzcxzVarZzb, zzdwqVarZzb, zzfelVar, zzfaiVarZza, zzbzxVarZza, zzfgbVar, zzffyVar, contextZza, zzfwnVar);
    }
}
