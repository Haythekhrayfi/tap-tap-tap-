package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdvh implements zzgwe {
    private final zzgwr zza;
    private final zzgwr zzb;
    private final zzgwr zzc;
    private final zzgwr zzd;
    private final zzgwr zze;
    private final zzgwr zzf;
    private final zzgwr zzg;
    private final zzgwr zzh;

    public zzdvh(zzgwr zzgwrVar, zzgwr zzgwrVar2, zzgwr zzgwrVar3, zzgwr zzgwrVar4, zzgwr zzgwrVar5, zzgwr zzgwrVar6, zzgwr zzgwrVar7, zzgwr zzgwrVar8) {
        this.zza = zzgwrVar;
        this.zzb = zzgwrVar2;
        this.zzc = zzgwrVar3;
        this.zzd = zzgwrVar4;
        this.zze = zzgwrVar5;
        this.zzf = zzgwrVar6;
        this.zzg = zzgwrVar7;
        this.zzh = zzgwrVar8;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdvg zzb() {
        zzcgu zzcguVar = (zzcgu) this.zza.zzb();
        Context contextZza = ((zzcha) this.zzb).zza();
        zzbzx zzbzxVarZza = ((zzchm) this.zzc).zza();
        zzfai zzfaiVarZza = ((zzcux) this.zzd).zza();
        zzfwn zzfwnVar = zzcae.zza;
        zzgwm.zzb(zzfwnVar);
        return new zzdvg(zzcguVar, contextZza, zzbzxVarZza, zzfaiVarZza, zzfwnVar, (String) this.zzf.zzb(), (zzffy) this.zzg.zzb(), (zzdpv) this.zzh.zzb());
    }
}
