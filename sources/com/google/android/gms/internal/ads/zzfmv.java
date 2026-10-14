package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzfmv extends zzfnn {
    private final int zza;
    private final String zzb;

    public /* synthetic */ zzfmv(int i10, String str, zzfmu zzfmuVar) {
        this.zza = i10;
        this.zzb = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfnn) {
            zzfnn zzfnnVar = (zzfnn) obj;
            if (this.zza == zzfnnVar.zza()) {
                String str = this.zzb;
                String strZzb = zzfnnVar.zzb();
                if (str != null ? str.equals(strZzb) : strZzb == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zza ^ 1000003;
        String str = this.zzb;
        return (i10 * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "OverlayDisplayState{statusCode=" + this.zza + ", sessionToken=" + this.zzb + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzfnn
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfnn
    public final String zzb() {
        return this.zzb;
    }
}
