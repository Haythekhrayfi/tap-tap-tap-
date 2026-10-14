package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzfez {
    public final String zza;
    public final String zzb;

    public zzfez(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfez)) {
            return false;
        }
        zzfez zzfezVar = (zzfez) obj;
        return this.zza.equals(zzfezVar.zza) && this.zzb.equals(zzfezVar.zzb);
    }

    public final int hashCode() {
        return String.valueOf(this.zza).concat(String.valueOf(this.zzb)).hashCode();
    }
}
