package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzagk implements zzagh {
    private final zzfa zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private int zze;

    public zzagk(zzagd zzagdVar) {
        zzfa zzfaVar = zzagdVar.zza;
        this.zza = zzfaVar;
        zzfaVar.zzF(12);
        this.zzc = zzfaVar.zzn() & 255;
        this.zzb = zzfaVar.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final int zza() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final int zzc() {
        int i10 = this.zzc;
        if (i10 == 8) {
            return this.zza.zzk();
        }
        if (i10 == 16) {
            return this.zza.zzo();
        }
        int i11 = this.zzd;
        this.zzd = i11 + 1;
        if (i11 % 2 != 0) {
            return this.zze & 15;
        }
        int iZzk = this.zza.zzk();
        this.zze = iZzk;
        return (iZzk & 240) >> 4;
    }
}
