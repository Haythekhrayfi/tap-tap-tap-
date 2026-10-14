package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzpp {
    private final zzdr[] zza;
    private final zzqh zzb;
    private final zzdu zzc;

    public zzpp(zzdr... zzdrVarArr) {
        zzqh zzqhVar = new zzqh();
        zzdu zzduVar = new zzdu();
        zzdr[] zzdrVarArr2 = {zzqhVar, zzduVar};
        this.zza = zzdrVarArr2;
        System.arraycopy(zzdrVarArr, 0, zzdrVarArr2, 0, 0);
        this.zzb = zzqhVar;
        this.zzc = zzduVar;
    }

    public final long zza(long j10) {
        return this.zzc.zzi(j10);
    }

    public final long zzb() {
        return this.zzb.zzo();
    }

    public final zzch zzc(zzch zzchVar) {
        this.zzc.zzk(zzchVar.zzc);
        this.zzc.zzj(zzchVar.zzd);
        return zzchVar;
    }

    public final boolean zzd(boolean z10) {
        this.zzb.zzp(z10);
        return z10;
    }

    public final zzdr[] zze() {
        return this.zza;
    }
}
