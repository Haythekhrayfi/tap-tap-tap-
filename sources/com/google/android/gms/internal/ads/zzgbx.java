package com.google.android.gms.internal.ads;

import androidx.activity.j;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgbx extends zzfyu {
    private final zzgbw zza;

    private zzgbx(zzgbw zzgbwVar) {
        this.zza = zzgbwVar;
    }

    public static zzgbx zzb(zzgbw zzgbwVar) {
        return new zzgbx(zzgbwVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzgbx) && ((zzgbx) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgbx.class, this.zza});
    }

    public final String toString() {
        return j.a("ChaCha20Poly1305 Parameters (variant: ", this.zza.toString(), ")");
    }

    public final zzgbw zza() {
        return this.zza;
    }
}
