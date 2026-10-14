package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzagj implements zzagh {
    private final int zza;
    private final int zzb;
    private final zzfa zzc;

    public zzagj(zzagd zzagdVar, zzam zzamVar) {
        zzfa zzfaVar = zzagdVar.zza;
        this.zzc = zzfaVar;
        zzfaVar.zzF(12);
        int iZzn = zzfaVar.zzn();
        if ("audio/raw".equals(zzamVar.zzm)) {
            int iZzk = zzfj.zzk(zzamVar.zzB, zzamVar.zzz);
            if (iZzn == 0 || iZzn % iZzk != 0) {
                zzer.zzf("AtomParsers", "Audio sample size mismatch. stsd sample size: " + iZzk + ", stsz sample size: " + iZzn);
                iZzn = iZzk;
            }
        }
        this.zza = iZzn == 0 ? -1 : iZzn;
        this.zzb = zzfaVar.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final int zzc() {
        int i10 = this.zza;
        return i10 == -1 ? this.zzc.zzn() : i10;
    }
}
