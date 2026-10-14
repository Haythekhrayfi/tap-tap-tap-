package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzchv implements zzgwe {
    private final zzgwr zza;
    private final zzgwr zzb;

    public zzchv(zzgwr zzgwrVar, zzgwr zzgwrVar2) {
        this.zza = zzgwrVar;
        this.zzb = zzgwrVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbup zzb() {
        Context contextZza = ((zzcha) this.zza).zza();
        zzfgb zzfgbVar = (zzfgb) this.zzb.zzb();
        zzbmz zzbmzVarZzb = com.google.android.gms.ads.internal.zzt.zzf().zzb(contextZza, zzbzx.zza(), zzfgbVar);
        zzbmt zzbmtVar = zzbmw.zza;
        zzbmzVarZzb.zza("google.afma.request.getAdDictionary", zzbmtVar, zzbmtVar);
        return new zzbuo(contextZza, com.google.android.gms.ads.internal.zzt.zzf().zzb(contextZza, zzbzx.zza(), zzfgbVar).zza("google.afma.sdkConstants.getSdkConstants", zzbmtVar, zzbmtVar));
    }
}
