package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdix implements zzcwa {
    private final zzdha zza;
    private final zzdhf zzb;

    public zzdix(zzdha zzdhaVar, zzdhf zzdhfVar) {
        this.zza = zzdhaVar;
        this.zzb = zzdhfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcwa
    public final void zzl() {
        zzdha zzdhaVar = this.zza;
        if (zzdhaVar.zzt() == null) {
            return;
        }
        zzcez zzcezVarZzq = zzdhaVar.zzq();
        zzcez zzcezVarZzr = zzdhaVar.zzr();
        if (zzcezVarZzq == null) {
            zzcezVarZzq = zzcezVarZzr == null ? null : zzcezVarZzr;
        }
        if (!this.zzb.zzd() || zzcezVarZzq == null) {
            return;
        }
        zzcezVarZzq.zzd("onSdkImpression", new q.a());
    }
}
