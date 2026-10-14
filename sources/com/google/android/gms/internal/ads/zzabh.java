package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzabh implements zzabv {
    private final zzabj zza;
    private final long zzb;

    public zzabh(zzabj zzabjVar, long j10) {
        this.zza = zzabjVar;
        this.zzb = j10;
    }

    private final zzabw zza(long j10, long j11) {
        return new zzabw((j10 * 1000000) / ((long) this.zza.zze), this.zzb + j11);
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final long zze() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final zzabt zzg(long j10) {
        zzdy.zzb(this.zza.zzk);
        zzabj zzabjVar = this.zza;
        zzabi zzabiVar = zzabjVar.zzk;
        long[] jArr = zzabiVar.zza;
        long[] jArr2 = zzabiVar.zzb;
        int iZzc = zzfj.zzc(jArr, zzabjVar.zzb(j10), true, false);
        zzabw zzabwVarZza = zza(iZzc == -1 ? 0L : jArr[iZzc], iZzc != -1 ? jArr2[iZzc] : 0L);
        if (zzabwVarZza.zzb == j10 || iZzc == jArr.length - 1) {
            return new zzabt(zzabwVarZza, zzabwVarZza);
        }
        int i10 = iZzc + 1;
        return new zzabt(zzabwVarZza, zza(jArr[i10], jArr2[i10]));
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final boolean zzh() {
        return true;
    }
}
