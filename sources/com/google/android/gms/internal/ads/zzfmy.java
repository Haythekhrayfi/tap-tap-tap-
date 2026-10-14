package com.google.android.gms.internal.ads;

import y.q;

/* JADX INFO: loaded from: classes2.dex */
final class zzfmy extends zzfnq {
    private final String zza;
    private final String zzb;

    public /* synthetic */ zzfmy(String str, String str2, zzfmx zzfmxVar) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfnq) {
            zzfnq zzfnqVar = (zzfnq) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzfnqVar.zzb()) : zzfnqVar.zzb() == null) {
                String str2 = this.zzb;
                String strZza = zzfnqVar.zza();
                if (str2 != null ? str2.equals(strZza) : strZza == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.zzb;
        return ((iHashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return q.a("OverlayDisplayUpdateRequest{sessionToken=", this.zza, ", appId=", this.zzb, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzfnq
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfnq
    public final String zzb() {
        return this.zza;
    }
}
