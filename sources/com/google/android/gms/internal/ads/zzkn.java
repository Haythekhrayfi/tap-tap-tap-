package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzkn {
    public final zzto zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;

    public zzkn(zzto zztoVar, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = true;
        zzdy.zzd(!z13 || z11);
        if (z12 && !z11) {
            z14 = false;
        }
        zzdy.zzd(z14);
        this.zza = zztoVar;
        this.zzb = j10;
        this.zzc = j11;
        this.zzd = j12;
        this.zze = j13;
        this.zzf = false;
        this.zzg = z11;
        this.zzh = z12;
        this.zzi = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzkn.class == obj.getClass()) {
            zzkn zzknVar = (zzkn) obj;
            if (this.zzb == zzknVar.zzb && this.zzc == zzknVar.zzc && this.zzd == zzknVar.zzd && this.zze == zzknVar.zze && this.zzg == zzknVar.zzg && this.zzh == zzknVar.zzh && this.zzi == zzknVar.zzi && zzfj.zzC(this.zza, zzknVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() + 527;
        int i10 = (int) this.zzb;
        int i11 = (int) this.zzc;
        return (((((((((((((iHashCode * 31) + i10) * 31) + i11) * 31) + ((int) this.zzd)) * 31) + ((int) this.zze)) * 961) + (this.zzg ? 1 : 0)) * 31) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0);
    }

    public final zzkn zza(long j10) {
        return j10 == this.zzc ? this : new zzkn(this.zza, this.zzb, j10, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
    }

    public final zzkn zzb(long j10) {
        return j10 == this.zzb ? this : new zzkn(this.zza, j10, this.zzc, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
    }
}
