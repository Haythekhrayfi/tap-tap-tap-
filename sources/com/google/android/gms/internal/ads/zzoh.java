package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzoh {
    public static final zzoh zza = new zzof().zzd();
    public final boolean zzb;
    public final boolean zzc;
    public final boolean zzd;

    public /* synthetic */ zzoh(zzof zzofVar, zzog zzogVar) {
        this.zzb = zzofVar.zza;
        this.zzc = zzofVar.zzb;
        this.zzd = zzofVar.zzc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzoh.class == obj.getClass()) {
            zzoh zzohVar = (zzoh) obj;
            if (this.zzb == zzohVar.zzb && this.zzc == zzohVar.zzc && this.zzd == zzohVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (this.zzb ? 1 : 0) << 2;
        boolean z10 = this.zzc;
        return (z10 ? 1 : 0) + (z10 ? 1 : 0) + i10 + (this.zzd ? 1 : 0);
    }
}
