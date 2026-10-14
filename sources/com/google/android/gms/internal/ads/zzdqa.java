package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class zzdqa {
    private final zzdqf zza;
    private final Executor zzb;
    private final Map zzc;

    public zzdqa(zzdqf zzdqfVar, Executor executor) {
        this.zza = zzdqfVar;
        this.zzc = zzdqfVar.zza();
        this.zzb = executor;
    }

    public final zzdpz zza() {
        zzdpz zzdpzVar = new zzdpz(this);
        zzdpz.zza(zzdpzVar);
        return zzdpzVar;
    }

    public final void zze() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzjZ)).booleanValue()) {
            zzdpz zzdpzVarZza = zza();
            zzdpzVarZza.zzb("action", "pecr");
            zzdpzVarZza.zzg();
        }
    }
}
