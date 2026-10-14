package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaiz implements zzaji {
    private zzam zza;
    private zzfh zzb;
    private zzabz zzc;

    public zzaiz(String str) {
        zzak zzakVar = new zzak();
        zzakVar.zzS(str);
        this.zza = zzakVar.zzY();
    }

    @Override // com.google.android.gms.internal.ads.zzaji
    public final void zza(zzfa zzfaVar) {
        zzdy.zzb(this.zzb);
        int i10 = zzfj.zza;
        long jZzd = this.zzb.zzd();
        long jZze = this.zzb.zze();
        if (jZzd == -9223372036854775807L || jZze == -9223372036854775807L) {
            return;
        }
        zzam zzamVar = this.zza;
        if (jZze != zzamVar.zzq) {
            zzak zzakVarZzb = zzamVar.zzb();
            zzakVarZzb.zzW(jZze);
            zzam zzamVarZzY = zzakVarZzb.zzY();
            this.zza = zzamVarZzY;
            this.zzc.zzk(zzamVarZzY);
        }
        int iZza = zzfaVar.zza();
        this.zzc.zzq(zzfaVar, iZza);
        this.zzc.zzs(jZzd, 1, iZza, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaji
    public final void zzb(zzfh zzfhVar, zzaaz zzaazVar, zzajv zzajvVar) {
        this.zzb = zzfhVar;
        zzajvVar.zzc();
        zzabz zzabzVarZzv = zzaazVar.zzv(zzajvVar.zza(), 5);
        this.zzc = zzabzVarZzv;
        zzabzVarZzv.zzk(this.zza);
    }
}
