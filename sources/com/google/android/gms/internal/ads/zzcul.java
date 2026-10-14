package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcul implements zzgwe {
    private final zzgwr zza;
    private final zzgwr zzb;
    private final zzgwr zzc;
    private final zzgwr zzd;
    private final zzgwr zze;
    private final zzgwr zzf;
    private final zzgwr zzg;
    private final zzgwr zzh;
    private final zzgwr zzi;
    private final zzgwr zzj;
    private final zzgwr zzk;

    public zzcul(zzgwr zzgwrVar, zzgwr zzgwrVar2, zzgwr zzgwrVar3, zzgwr zzgwrVar4, zzgwr zzgwrVar5, zzgwr zzgwrVar6, zzgwr zzgwrVar7, zzgwr zzgwrVar8, zzgwr zzgwrVar9, zzgwr zzgwrVar10, zzgwr zzgwrVar11) {
        this.zza = zzgwrVar;
        this.zzb = zzgwrVar2;
        this.zzc = zzgwrVar3;
        this.zzd = zzgwrVar4;
        this.zze = zzgwrVar5;
        this.zzf = zzgwrVar6;
        this.zzg = zzgwrVar7;
        this.zzh = zzgwrVar8;
        this.zzi = zzgwrVar9;
        this.zzj = zzgwrVar10;
        this.zzk = zzgwrVar11;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcuk zzb() {
        zzfel zzfelVar = (zzfel) this.zza.zzb();
        zzbzx zzbzxVarZza = ((zzchm) this.zzb).zza();
        ApplicationInfo applicationInfoZzb = ((zzduj) this.zzc).zzb();
        String strZzb = ((zzdup) this.zzd).zzb();
        zzbbe zzbbeVar = zzbbm.zza;
        return new zzcuk(zzfelVar, zzbzxVarZza, applicationInfoZzb, strZzb, com.google.android.gms.ads.internal.client.zzba.zza().zza(), (PackageInfo) this.zzf.zzb(), zzgwd.zza(this.zzg), ((zzcgy) this.zzh).zzb(), (String) this.zzi.zzb(), ((zzerc) this.zzj).zzb(), ((zzcux) this.zzk).zza());
    }
}
