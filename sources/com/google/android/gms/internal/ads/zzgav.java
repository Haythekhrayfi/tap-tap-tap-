package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgav extends zzfyu {
    private final int zza;
    private final int zzb = 12;
    private final int zzc = 16;
    private final zzgat zzd;

    public /* synthetic */ zzgav(int i10, int i11, int i12, zzgat zzgatVar, zzgau zzgauVar) {
        this.zza = i10;
        this.zzd = zzgatVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgav)) {
            return false;
        }
        zzgav zzgavVar = (zzgav) obj;
        return zzgavVar.zza == this.zza && zzgavVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgav.class, Integer.valueOf(this.zza), 12, 16, this.zzd});
    }

    public final String toString() {
        return "AesGcm Parameters (variant: " + String.valueOf(this.zzd) + ", 12-byte IV, 16-byte tag, and " + this.zza + "-byte key)";
    }

    public final int zza() {
        return this.zza;
    }

    public final zzgat zzb() {
        return this.zzd;
    }

    public final boolean zzc() {
        return this.zzd != zzgat.zzc;
    }
}
