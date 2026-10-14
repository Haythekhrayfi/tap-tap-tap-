package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzfjh extends zzfjd {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;

    public /* synthetic */ zzfjh(String str, boolean z10, boolean z11, zzfjg zzfjgVar) {
        this.zza = str;
        this.zzb = z10;
        this.zzc = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfjd) {
            zzfjd zzfjdVar = (zzfjd) obj;
            if (this.zza.equals(zzfjdVar.zzb()) && this.zzb == zzfjdVar.zzd() && this.zzc == zzfjdVar.zzc()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() ^ 1000003;
        return (((iHashCode * 1000003) ^ (true != this.zzb ? 1237 : 1231)) * 1000003) ^ (true == this.zzc ? 1231 : 1237);
    }

    public final String toString() {
        return "AdShield2Options{clientVersion=" + this.zza + ", shouldGetAdvertisingId=" + this.zzb + ", isGooglePlayServicesAvailable=" + this.zzc + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzfjd
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfjd
    public final boolean zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfjd
    public final boolean zzd() {
        return this.zzb;
    }
}
