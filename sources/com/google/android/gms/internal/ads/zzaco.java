package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzaco implements zzaci {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    private zzaco(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.zza = i10;
        this.zzb = i12;
        this.zzc = i13;
        this.zzd = i14;
        this.zze = i15;
    }

    public static zzaco zzb(zzfa zzfaVar) {
        int iZzg = zzfaVar.zzg();
        zzfaVar.zzG(12);
        int iZzg2 = zzfaVar.zzg();
        int iZzg3 = zzfaVar.zzg();
        int iZzg4 = zzfaVar.zzg();
        zzfaVar.zzG(4);
        int iZzg5 = zzfaVar.zzg();
        int iZzg6 = zzfaVar.zzg();
        zzfaVar.zzG(8);
        return new zzaco(iZzg, iZzg2, iZzg3, iZzg4, iZzg5, iZzg6);
    }

    @Override // com.google.android.gms.internal.ads.zzaci
    public final int zza() {
        return 1752331379;
    }
}
