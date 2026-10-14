package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdyi implements zzgwe {
    private final zzgwr zza;
    private final zzgwr zzb;
    private final zzgwr zzc;
    private final zzgwr zzd;
    private final zzgwr zze;
    private final zzgwr zzf;
    private final zzgwr zzg;
    private final zzgwr zzh;

    public zzdyi(zzgwr zzgwrVar, zzgwr zzgwrVar2, zzgwr zzgwrVar3, zzgwr zzgwrVar4, zzgwr zzgwrVar5, zzgwr zzgwrVar6, zzgwr zzgwrVar7, zzgwr zzgwrVar8) {
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
    public final /* synthetic */ Object zzb() {
        Context contextZza = ((zzcha) this.zza).zza();
        zzfwn zzfwnVar = zzcae.zza;
        zzgwm.zzb(zzfwnVar);
        return new zzdyh(contextZza, zzfwnVar, new zzbuq(), ((zzchj) this.zzd).zzb(), ((zzdza) this.zze).zzb(), (ArrayDeque) this.zzf.zzb(), new zzdyw(), (zzfgb) this.zzh.zzb());
    }
}
