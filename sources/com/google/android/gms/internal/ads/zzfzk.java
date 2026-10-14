package com.google.android.gms.internal.ads;

import java.util.Arrays;
import v1.b;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfzk extends zzfyu {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final zzfzi zze;
    private final zzfzh zzf;

    public /* synthetic */ zzfzk(int i10, int i11, int i12, int i13, zzfzi zzfziVar, zzfzh zzfzhVar, zzfzj zzfzjVar) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = zzfziVar;
        this.zzf = zzfzhVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzfzk)) {
            return false;
        }
        zzfzk zzfzkVar = (zzfzk) obj;
        return zzfzkVar.zza == this.zza && zzfzkVar.zzb == this.zzb && zzfzkVar.zzc == this.zzc && zzfzkVar.zzd == this.zzd && zzfzkVar.zze == this.zze && zzfzkVar.zzf == this.zzf;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzfzk.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), this.zze, this.zzf});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zze);
        String strValueOf2 = String.valueOf(this.zzf);
        int i10 = this.zzc;
        int i11 = this.zzd;
        int i12 = this.zza;
        int i13 = this.zzb;
        StringBuilder sbA = q2.a.a("AesCtrHmacAead Parameters (variant: ", strValueOf, ", hashType: ", strValueOf2, ", ");
        b.a(sbA, i10, "-byte IV, and ", i11, "-byte tags, and ");
        sbA.append(i12);
        sbA.append("-byte AES key, and ");
        sbA.append(i13);
        sbA.append("-byte HMAC key)");
        return sbA.toString();
    }

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zzc;
    }

    public final int zzd() {
        return this.zzd;
    }

    public final zzfzh zze() {
        return this.zzf;
    }

    public final zzfzi zzf() {
        return this.zze;
    }

    public final boolean zzg() {
        return this.zze != zzfzi.zzc;
    }
}
