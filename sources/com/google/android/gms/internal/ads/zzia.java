package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzia {
    public final String zza;
    public final zzam zzb;
    public final zzam zzc;
    public final int zzd;
    public final int zze;

    public zzia(String str, zzam zzamVar, zzam zzamVar2, int i10, int i11) {
        boolean z10 = false;
        if (i10 == 0) {
            z10 = true;
        } else if (i11 == 0) {
            i11 = 0;
            z10 = true;
        }
        zzdy.zzd(z10);
        zzdy.zzc(str);
        this.zza = str;
        Objects.requireNonNull(zzamVar);
        this.zzb = zzamVar;
        Objects.requireNonNull(zzamVar2);
        this.zzc = zzamVar2;
        this.zzd = i10;
        this.zze = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzia.class == obj.getClass()) {
            zzia zziaVar = (zzia) obj;
            if (this.zzd == zziaVar.zzd && this.zze == zziaVar.zze && this.zza.equals(zziaVar.zza) && this.zzb.equals(zziaVar.zzb) && this.zzc.equals(zziaVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.zzd + 527) * 31) + this.zze) * 31) + this.zza.hashCode()) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode();
    }
}
