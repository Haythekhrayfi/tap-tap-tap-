package com.google.android.gms.internal.measurement;

import okhttp3.internal.http2.Settings;

/* JADX INFO: loaded from: classes2.dex */
final class zzjp {
    private final Object zza;
    private final int zzb;

    public zzjp(Object obj, int i10) {
        this.zza = obj;
        this.zzb = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzjp)) {
            return false;
        }
        zzjp zzjpVar = (zzjp) obj;
        return this.zza == zzjpVar.zza && this.zzb == zzjpVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.zzb;
    }
}
