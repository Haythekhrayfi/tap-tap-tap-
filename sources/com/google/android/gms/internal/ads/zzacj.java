package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzacj implements zzabv {
    public final /* synthetic */ zzacm zza;
    private final long zzb;

    public zzacj(zzacm zzacmVar, long j10) {
        this.zza = zzacmVar;
        this.zzb = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final long zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final zzabt zzg(long j10) {
        zzabt zzabtVarZza = this.zza.zzg[0].zza(j10);
        int i10 = 1;
        while (true) {
            zzacm zzacmVar = this.zza;
            if (i10 >= zzacmVar.zzg.length) {
                return zzabtVarZza;
            }
            zzabt zzabtVarZza2 = zzacmVar.zzg[i10].zza(j10);
            if (zzabtVarZza2.zza.zzc < zzabtVarZza.zza.zzc) {
                zzabtVarZza = zzabtVarZza2;
            }
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final boolean zzh() {
        return true;
    }
}
