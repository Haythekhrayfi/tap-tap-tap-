package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdfq implements zzgwe {
    private final zzgwr zza;
    private final zzgwr zzb;
    private final zzgwr zzc;
    private final zzgwr zzd;
    private final zzgwr zze;
    private final zzgwr zzf;

    public zzdfq(zzgwr zzgwrVar, zzgwr zzgwrVar2, zzgwr zzgwrVar3, zzgwr zzgwrVar4, zzgwr zzgwrVar5, zzgwr zzgwrVar6) {
        this.zza = zzgwrVar;
        this.zzb = zzgwrVar2;
        this.zzc = zzgwrVar3;
        this.zzd = zzgwrVar4;
        this.zze = zzgwrVar5;
        this.zzf = zzgwrVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcgu zzcguVar = (zzcgu) this.zza.zzb();
        zzcuo zzcuoVarZza = ((zzcuy) this.zzb).zza();
        zzdat zzdatVarZza = ((zzdbm) this.zzc).zza();
        zzdff zzdffVarZza = ((zzdfh) this.zzd).zza();
        zzcxv zzcxvVarZzb = ((zzcpa) this.zze).zzb();
        zzefr zzefrVar = (zzefr) this.zzf.zzb();
        zzcpx zzcpxVarZzd = zzcguVar.zzd();
        zzcpxVarZzd.zzi(zzcuoVarZza.zzj());
        zzcpxVarZzd.zzf(zzdatVarZza);
        zzcpxVarZzd.zzd(zzdffVarZza);
        zzcpxVarZzd.zze(new zzehv(null));
        zzcpxVarZzd.zzg(new zzcqv(zzcxvVarZzb, null));
        zzcpxVarZzd.zzc(new zzcoy(null));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzdm)).booleanValue()) {
            zzcpxVarZzd.zzj(zzefy.zzb(zzefrVar));
        }
        zzcrg zzcrgVarZzc = zzcpxVarZzd.zzh().zzc();
        zzgwm.zzb(zzcrgVarZzc);
        return zzcrgVarZzc;
    }
}
