package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgdx extends zzfyf {
    private final zzgfb zza;

    public zzgdx(zzgfb zzgfbVar) {
        this.zza = zzgfbVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgdx)) {
            return false;
        }
        zzgfb zzgfbVar = ((zzgdx) obj).zza;
        return this.zza.zzb().zzf().equals(zzgfbVar.zzb().zzf()) && this.zza.zzb().zzh().equals(zzgfbVar.zzb().zzh()) && this.zza.zzb().zzg().equals(zzgfbVar.zzb().zzg());
    }

    public final int hashCode() {
        zzgfb zzgfbVar = this.zza;
        return Arrays.hashCode(new Object[]{zzgfbVar.zzb(), zzgfbVar.zzd()});
    }

    public final String toString() {
        String str;
        Object[] objArr = new Object[2];
        objArr[0] = this.zza.zzb().zzh();
        zzglq zzglqVarZzf = this.zza.zzb().zzf();
        zzglq zzglqVar = zzglq.UNKNOWN_PREFIX;
        int iOrdinal = zzglqVarZzf.ordinal();
        if (iOrdinal == 1) {
            str = "TINK";
        } else if (iOrdinal == 2) {
            str = "LEGACY";
        } else if (iOrdinal != 3) {
            str = iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY";
        } else {
            str = "RAW";
        }
        objArr[1] = str;
        return String.format("(typeUrl=%s, outputPrefixType=%s)", objArr);
    }

    public final zzgfb zza() {
        return this.zza;
    }
}
