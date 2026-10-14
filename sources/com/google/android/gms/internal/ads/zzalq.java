package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzalq {
    public final Object zza;
    public final zzakt zzb;
    public final zzalt zzc;
    public boolean zzd;

    private zzalq(zzalt zzaltVar) {
        this.zzd = false;
        this.zza = null;
        this.zzb = null;
        this.zzc = zzaltVar;
    }

    private zzalq(Object obj, zzakt zzaktVar) {
        this.zzd = false;
        this.zza = obj;
        this.zzb = zzaktVar;
        this.zzc = null;
    }

    public static zzalq zza(zzalt zzaltVar) {
        return new zzalq(zzaltVar);
    }

    public static zzalq zzb(Object obj, zzakt zzaktVar) {
        return new zzalq(obj, zzaktVar);
    }

    public final boolean zzc() {
        return this.zzc == null;
    }
}
