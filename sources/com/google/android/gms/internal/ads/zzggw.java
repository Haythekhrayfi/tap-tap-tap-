package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzggw extends zzghe {
    private final int zza;
    private final int zzb;
    private final zzggu zzc;
    private final zzggt zzd;

    public /* synthetic */ zzggw(int i10, int i11, zzggu zzgguVar, zzggt zzggtVar, zzggv zzggvVar) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = zzgguVar;
        this.zzd = zzggtVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzggw)) {
            return false;
        }
        zzggw zzggwVar = (zzggw) obj;
        return zzggwVar.zza == this.zza && zzggwVar.zzc() == zzc() && zzggwVar.zzc == this.zzc && zzggwVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzggw.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc, this.zzd});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzc);
        String strValueOf2 = String.valueOf(this.zzd);
        int i10 = this.zzb;
        int i11 = this.zza;
        StringBuilder sbA = q2.a.a("HMAC Parameters (variant: ", strValueOf, ", hashType: ", strValueOf2, ", ");
        sbA.append(i10);
        sbA.append("-byte tags, and ");
        sbA.append(i11);
        sbA.append("-byte key)");
        return sbA.toString();
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zza;
    }

    public final int zzc() {
        zzggu zzgguVar = this.zzc;
        if (zzgguVar == zzggu.zzd) {
            return this.zzb;
        }
        if (zzgguVar == zzggu.zza || zzgguVar == zzggu.zzb || zzgguVar == zzggu.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzggt zzd() {
        return this.zzd;
    }

    public final zzggu zze() {
        return this.zzc;
    }

    public final boolean zzf() {
        return this.zzc != zzggu.zzd;
    }
}
