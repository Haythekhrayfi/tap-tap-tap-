package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class zzefk extends zzefh {
    private final zzcgu zza;
    private final zzcuo zzb;
    private final zzehv zzc;
    private final zzdat zzd;
    private final zzdff zze;
    private final zzcxv zzf;
    private final ViewGroup zzg;
    private final zzdac zzh;
    private final zzefr zzi;
    private final zzech zzj;

    public zzefk(zzcgu zzcguVar, zzcuo zzcuoVar, zzehv zzehvVar, zzdat zzdatVar, zzdff zzdffVar, zzcxv zzcxvVar, ViewGroup viewGroup, zzdac zzdacVar, zzefr zzefrVar, zzech zzechVar) {
        this.zza = zzcguVar;
        this.zzb = zzcuoVar;
        this.zzc = zzehvVar;
        this.zzd = zzdatVar;
        this.zze = zzdffVar;
        this.zzf = zzcxvVar;
        this.zzg = viewGroup;
        this.zzh = zzdacVar;
        this.zzi = zzefrVar;
        this.zzj = zzechVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefh
    public final zzfwm zzc(zzfai zzfaiVar, Bundle bundle, zzezn zzeznVar, zzezz zzezzVar) {
        zzcuo zzcuoVar = this.zzb;
        zzcuoVar.zzi(zzfaiVar);
        zzcuoVar.zzf(bundle);
        zzcuoVar.zzg(new zzcui(zzezzVar, zzeznVar, this.zzi));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzdj)).booleanValue()) {
            this.zzb.zzd(this.zzj);
        }
        zzcpx zzcpxVarZzd = this.zza.zzd();
        zzcpxVarZzd.zzi(this.zzb.zzj());
        zzcpxVarZzd.zzf(this.zzd);
        zzcpxVarZzd.zze(this.zzc);
        zzcpxVarZzd.zzd(this.zze);
        zzcpxVarZzd.zzg(new zzcqv(this.zzf, this.zzh));
        zzcpxVarZzd.zzc(new zzcoy(this.zzg));
        zzcsk zzcskVarZzd = zzcpxVarZzd.zzk().zzd();
        return zzcskVarZzd.zzi(zzcskVarZzd.zzj());
    }
}
