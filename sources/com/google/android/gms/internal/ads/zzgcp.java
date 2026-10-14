package com.google.android.gms.internal.ads;

import androidx.activity.j;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgcp extends zzfyu {
    private final zzgco zza;

    private zzgcp(zzgco zzgcoVar) {
        this.zza = zzgcoVar;
    }

    public static zzgcp zzb(zzgco zzgcoVar) {
        return new zzgcp(zzgcoVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzgcp) && ((zzgcp) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgcp.class, this.zza});
    }

    public final String toString() {
        return j.a("XChaCha20Poly1305 Parameters (variant: ", this.zza.toString(), ")");
    }

    public final zzgco zza() {
        return this.zza;
    }
}
