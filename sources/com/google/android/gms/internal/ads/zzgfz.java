package com.google.android.gms.internal.ads;

import android.support.v4.media.b;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgfz extends zzghe {
    private final int zza;
    private final int zzb;
    private final zzgfx zzc;

    public /* synthetic */ zzgfz(int i10, int i11, zzgfx zzgfxVar, zzgfy zzgfyVar) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = zzgfxVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgfz)) {
            return false;
        }
        zzgfz zzgfzVar = (zzgfz) obj;
        return zzgfzVar.zza == this.zza && zzgfzVar.zzc() == zzc() && zzgfzVar.zzc == this.zzc;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgfz.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzc);
        int i10 = this.zzb;
        int i11 = this.zza;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AES-CMAC Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(", ");
        sb2.append(i10);
        sb2.append("-byte tags, and ");
        return b.a(sb2, i11, "-byte key)");
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zza;
    }

    public final int zzc() {
        zzgfx zzgfxVar = this.zzc;
        if (zzgfxVar == zzgfx.zzd) {
            return this.zzb;
        }
        if (zzgfxVar == zzgfx.zza || zzgfxVar == zzgfx.zzb || zzgfxVar == zzgfx.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzgfx zzd() {
        return this.zzc;
    }

    public final boolean zze() {
        return this.zzc != zzgfx.zzd;
    }
}
