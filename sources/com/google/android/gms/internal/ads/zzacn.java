package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzacn implements zzaci {
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzacn(int i10, int i11, int i12, int i13) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
    }

    public static zzacn zzb(zzfa zzfaVar) {
        int iZzg = zzfaVar.zzg();
        zzfaVar.zzG(8);
        int iZzg2 = zzfaVar.zzg();
        int iZzg3 = zzfaVar.zzg();
        zzfaVar.zzG(4);
        int iZzg4 = zzfaVar.zzg();
        zzfaVar.zzG(12);
        return new zzacn(iZzg, iZzg2, iZzg3, iZzg4);
    }

    @Override // com.google.android.gms.internal.ads.zzaci
    public final int zza() {
        return 1751742049;
    }
}
