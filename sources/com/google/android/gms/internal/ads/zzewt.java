package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzewt implements zzexe {
    private zzcun zza;

    @Override // com.google.android.gms.internal.ads.zzexe
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzcun zzd() {
        return this.zza;
    }

    public final synchronized zzfwm zzb(zzexf zzexfVar, zzexd zzexdVar, zzcun zzcunVar) {
        zzcsk zzcskVarZzb;
        try {
            if (zzcunVar != null) {
                this.zza = zzcunVar;
            } else {
                this.zza = (zzcun) zzexdVar.zza(zzexfVar.zzb).zzh();
            }
            zzcskVarZzb = this.zza.zzb();
        } catch (Throwable th) {
            throw th;
        }
        return zzcskVarZzb.zzi(zzcskVarZzb.zzj());
    }

    @Override // com.google.android.gms.internal.ads.zzexe
    public final /* bridge */ /* synthetic */ zzfwm zzc(zzexf zzexfVar, zzexd zzexdVar, Object obj) {
        return zzb(zzexfVar, zzexdVar, null);
    }
}
