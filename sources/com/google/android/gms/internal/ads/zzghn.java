package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzghn {
    public static final zzghn zza = new zzghl().zza();
    private final Map zzb;

    public final boolean equals(Object obj) {
        if (obj instanceof zzghn) {
            return this.zzb.equals(((zzghn) obj).zzb);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final String toString() {
        return this.zzb.toString();
    }

    public final Map zza() {
        return this.zzb;
    }
}
