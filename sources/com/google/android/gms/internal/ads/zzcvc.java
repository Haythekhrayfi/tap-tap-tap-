package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcvc implements zzgwe {
    private final zzcvb zza;
    private final zzgwr zzb;
    private final zzgwr zzc;
    private final zzgwr zzd;
    private final zzgwr zze;

    public zzcvc(zzcvb zzcvbVar, zzgwr zzgwrVar, zzgwr zzgwrVar2, zzgwr zzgwrVar3, zzgwr zzgwrVar4) {
        this.zza = zzcvbVar;
        this.zzb = zzgwrVar;
        this.zzc = zzgwrVar2;
        this.zzd = zzgwrVar3;
        this.zze = zzgwrVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    public final /* synthetic */ Object zzb() {
        Context context = (Context) this.zzb.zzb();
        zzbzx zzbzxVarZza = ((zzchm) this.zzc).zza();
        zzezn zzeznVarZza = ((zzcrt) this.zzd).zza();
        zzbwo zzbwoVar = new zzbwo();
        if (zzeznVarZza.zzB == null) {
            return null;
        }
        zzezs zzezsVar = zzeznVarZza.zzt;
        return new zzbwn(context, zzbzxVarZza, zzeznVarZza.zzB, zzezsVar == null ? null : zzezsVar.zzb, zzbwoVar);
    }
}
