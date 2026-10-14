package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdgx {
    private zzbeo zza;

    public zzdgx(zzdgj zzdgjVar) {
        this.zza = zzdgjVar;
    }

    public final synchronized zzbeo zza() {
        return this.zza;
    }

    public final synchronized void zzb(zzbeo zzbeoVar) {
        this.zza = zzbeoVar;
    }
}
