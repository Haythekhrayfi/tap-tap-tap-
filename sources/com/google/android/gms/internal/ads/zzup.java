package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzup {
    public final int zza;
    public final boolean zzb;

    public zzup(int i10, boolean z10) {
        this.zza = i10;
        this.zzb = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzup.class == obj.getClass()) {
            zzup zzupVar = (zzup) obj;
            if (this.zza == zzupVar.zza && this.zzb == zzupVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza * 31) + (this.zzb ? 1 : 0);
    }
}
