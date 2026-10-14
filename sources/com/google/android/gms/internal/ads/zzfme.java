package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfme {
    private final String zza;
    private final long zzb;

    public zzfme() {
        this.zza = null;
        this.zzb = -1L;
    }

    public zzfme(String str, long j10) {
        this.zza = str;
        this.zzb = j10;
    }

    public final long zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }

    public final boolean zzc() {
        return this.zza != null && this.zzb >= 0;
    }
}
