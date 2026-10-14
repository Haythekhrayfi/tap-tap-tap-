package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzefi extends zzefh {
    private final zzcgu zza;
    private final zzcuo zzb;
    private final zzdat zzc;
    private final zzefr zzd;
    private final zzech zze;

    public zzefi(zzcgu zzcguVar, zzcuo zzcuoVar, zzdat zzdatVar, zzefr zzefrVar, zzech zzechVar) {
        this.zza = zzcguVar;
        this.zzb = zzcuoVar;
        this.zzc = zzdatVar;
        this.zzd = zzefrVar;
        this.zze = zzechVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefh
    public final zzfwm zzc(zzfai zzfaiVar, Bundle bundle, zzezn zzeznVar, zzezz zzezzVar) {
        zzcuo zzcuoVar = this.zzb;
        zzcuoVar.zzi(zzfaiVar);
        zzcuoVar.zzf(bundle);
        zzcuoVar.zzg(new zzcui(zzezzVar, zzeznVar, this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzdj)).booleanValue()) {
            this.zzb.zzd(this.zze);
        }
        zzcoo zzcooVarZzc = this.zza.zzc();
        zzcooVarZzc.zzd(this.zzb.zzj());
        zzcooVarZzc.zzc(this.zzc);
        zzcsk zzcskVarZzb = zzcooVarZzc.zze().zzb();
        return zzcskVarZzb.zzi(zzcskVarZzb.zzj());
    }
}
