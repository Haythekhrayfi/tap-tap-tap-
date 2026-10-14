package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgae extends zzfyu {
    private final int zza;
    private final int zzb;
    private final int zzc = 16;
    private final zzgac zzd;

    public /* synthetic */ zzgae(int i10, int i11, int i12, zzgac zzgacVar, zzgad zzgadVar) {
        this.zza = i10;
        this.zzb = i11;
        this.zzd = zzgacVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgae)) {
            return false;
        }
        zzgae zzgaeVar = (zzgae) obj;
        return zzgaeVar.zza == this.zza && zzgaeVar.zzb == this.zzb && zzgaeVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgae.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), 16, this.zzd});
    }

    public final String toString() {
        return "AesEax Parameters (variant: " + String.valueOf(this.zzd) + ", " + this.zzb + "-byte IV, 16-byte tag, and " + this.zza + "-byte key)";
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zza;
    }

    public final zzgac zzc() {
        return this.zzd;
    }

    public final boolean zzd() {
        return this.zzd != zzgac.zzc;
    }
}
