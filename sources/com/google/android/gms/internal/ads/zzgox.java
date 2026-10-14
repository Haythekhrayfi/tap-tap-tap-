package com.google.android.gms.internal.ads;

import okhttp3.internal.http2.Settings;

/* JADX INFO: loaded from: classes2.dex */
final class zzgox {
    private final Object zza;
    private final int zzb;

    public zzgox(Object obj, int i10) {
        this.zza = obj;
        this.zzb = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgox)) {
            return false;
        }
        zzgox zzgoxVar = (zzgox) obj;
        return this.zza == zzgoxVar.zza && this.zzb == zzgoxVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.zzb;
    }
}
