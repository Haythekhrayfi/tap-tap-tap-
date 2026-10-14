package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzux implements zzxj {
    public long zza;
    public long zzb;
    public zzxi zzc;
    public zzux zzd;

    public zzux(long j10, int i10) {
        zze(j10, 65536);
    }

    public final int zza(long j10) {
        long j11 = j10 - this.zza;
        int i10 = this.zzc.zzb;
        return (int) j11;
    }

    public final zzux zzb() {
        this.zzc = null;
        zzux zzuxVar = this.zzd;
        this.zzd = null;
        return zzuxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final zzxi zzc() {
        zzxi zzxiVar = this.zzc;
        Objects.requireNonNull(zzxiVar);
        return zzxiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final zzxj zzd() {
        zzux zzuxVar = this.zzd;
        if (zzuxVar == null || zzuxVar.zzc == null) {
            return null;
        }
        return zzuxVar;
    }

    public final void zze(long j10, int i10) {
        zzdy.zzf(this.zzc == null);
        this.zza = j10;
        this.zzb = j10 + 65536;
    }
}
