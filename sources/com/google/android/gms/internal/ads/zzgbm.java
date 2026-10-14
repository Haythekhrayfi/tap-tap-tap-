package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgbm extends zzfyu {
    private final int zza;
    private final zzgbk zzb;

    public /* synthetic */ zzgbm(int i10, zzgbk zzgbkVar, zzgbl zzgblVar) {
        this.zza = i10;
        this.zzb = zzgbkVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgbm)) {
            return false;
        }
        zzgbm zzgbmVar = (zzgbm) obj;
        return zzgbmVar.zza == this.zza && zzgbmVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgbm.class, Integer.valueOf(this.zza), this.zzb});
    }

    public final String toString() {
        return "AesGcmSiv Parameters (variant: " + String.valueOf(this.zzb) + ", " + this.zza + "-byte key)";
    }

    public final int zza() {
        return this.zza;
    }

    public final zzgbk zzb() {
        return this.zzb;
    }

    public final boolean zzc() {
        return this.zzb != zzgbk.zzc;
    }
}
