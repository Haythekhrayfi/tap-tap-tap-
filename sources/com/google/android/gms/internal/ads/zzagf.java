package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzagf {
    public final int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    private final boolean zze;
    private final zzfa zzf;
    private final zzfa zzg;
    private int zzh;
    private int zzi;

    public zzagf(zzfa zzfaVar, zzfa zzfaVar2, boolean z10) throws zzcd {
        this.zzg = zzfaVar;
        this.zzf = zzfaVar2;
        this.zze = z10;
        zzfaVar2.zzF(12);
        this.zza = zzfaVar2.zzn();
        zzfaVar.zzF(12);
        this.zzi = zzfaVar.zzn();
        zzaba.zzb(zzfaVar.zze() == 1, "first_chunk must be 1");
        this.zzb = -1;
    }

    public final boolean zza() {
        int i10 = this.zzb + 1;
        this.zzb = i10;
        if (i10 == this.zza) {
            return false;
        }
        this.zzd = this.zze ? this.zzf.zzt() : this.zzf.zzs();
        if (this.zzb == this.zzh) {
            this.zzc = this.zzg.zzn();
            this.zzg.zzG(4);
            int i11 = this.zzi - 1;
            this.zzi = i11;
            this.zzh = i11 > 0 ? (-1) + this.zzg.zzn() : -1;
        }
        return true;
    }
}
