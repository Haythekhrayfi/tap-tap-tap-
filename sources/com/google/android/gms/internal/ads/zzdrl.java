package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdrl implements zzdqz {
    private final long zza;
    private final zzeju zzb;

    public zzdrl(long j10, Context context, zzdre zzdreVar, zzcgu zzcguVar, String str) {
        this.zza = j10;
        zzexs zzexsVarZzt = zzcguVar.zzt();
        zzexsVarZzt.zzc(context);
        zzexsVarZzt.zza(new com.google.android.gms.ads.internal.client.zzq());
        zzexsVarZzt.zzb(str);
        zzeju zzejuVarZza = zzexsVarZzt.zzd().zza();
        this.zzb = zzejuVarZza;
        zzejuVarZza.zzD(new zzdrk(this, zzdreVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void zza() {
        this.zzb.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void zzb(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        this.zzb.zzaa(zzlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void zzc() {
        this.zzb.zzW(ObjectWrapper.wrap(null));
    }
}
