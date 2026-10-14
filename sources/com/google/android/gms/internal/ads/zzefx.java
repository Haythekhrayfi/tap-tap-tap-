package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzefx implements zzgwe {
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

    public zzefx(zzgwr zzgwrVar, zzgwr zzgwrVar2, zzgwr zzgwrVar3, zzgwr zzgwrVar4, zzgwr zzgwrVar5, zzgwr zzgwrVar6, zzgwr zzgwrVar7, zzgwr zzgwrVar8, zzgwr zzgwrVar9, zzgwr zzgwrVar10, zzgwr zzgwrVar11) {
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
    public final zzefw zzb() {
        Context contextZza = ((zzcha) this.zza).zza();
        zzfel zzfelVar = (zzfel) this.zzb.zzb();
        zzefr zzefrVar = (zzefr) this.zzc.zzb();
        zzcvi zzcviVar = (zzcvi) this.zzd.zzb();
        zzfgn zzfgnVar = (zzfgn) this.zze.zzb();
        zzfgr zzfgrVar = (zzfgr) this.zzf.zzb();
        zzcrg zzcrgVar = (zzcrg) this.zzg.zzb();
        zzfwn zzfwnVar = zzcae.zza;
        zzgwm.zzb(zzfwnVar);
        return new zzefw(contextZza, zzfelVar, zzefrVar, zzcviVar, zzfgnVar, zzfgrVar, zzcrgVar, zzfwnVar, (ScheduledExecutorService) this.zzi.zzb(), (zzech) this.zzj.zzb(), (zzffy) this.zzk.zzb());
    }
}
