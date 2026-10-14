package com.google.android.gms.ads.internal.util;

import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zzbc {
    public final String zza;
    public final double zzb;
    public final double zzc;
    public final double zzd;
    public final int zze;

    public zzbc(String str, double d10, double d11, double d12, int i10) {
        this.zza = str;
        this.zzc = d10;
        this.zzb = d11;
        this.zzd = d12;
        this.zze = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbc)) {
            return false;
        }
        zzbc zzbcVar = (zzbc) obj;
        return Objects.equal(this.zza, zzbcVar.zza) && this.zzb == zzbcVar.zzb && this.zzc == zzbcVar.zzc && this.zze == zzbcVar.zze && Double.compare(this.zzd, zzbcVar.zzd) == 0;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, Double.valueOf(this.zzb), Double.valueOf(this.zzc), Double.valueOf(this.zzd), Integer.valueOf(this.zze));
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("name", this.zza).add("minBound", Double.valueOf(this.zzc)).add("maxBound", Double.valueOf(this.zzb)).add("percent", Double.valueOf(this.zzd)).add("count", Integer.valueOf(this.zze)).toString();
    }
}
