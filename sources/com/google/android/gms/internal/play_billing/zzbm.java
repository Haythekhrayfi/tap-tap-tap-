package com.google.android.gms.internal.play_billing;

import okhttp3.internal.http2.Settings;

/* JADX INFO: loaded from: classes2.dex */
final class zzbm {
    private final Object zza;
    private final int zzb;

    public zzbm(Object obj, int i10) {
        this.zza = obj;
        this.zzb = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbm)) {
            return false;
        }
        zzbm zzbmVar = (zzbm) obj;
        return this.zza == zzbmVar.zza && this.zzb == zzbmVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.zzb;
    }
}
