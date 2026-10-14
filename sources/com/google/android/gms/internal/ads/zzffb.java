package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzffb implements zzfev {
    private final zzfff zza;
    private final zzffd zzb;
    private final zzfes zzc;

    public zzffb(zzfes zzfesVar, zzfff zzfffVar, zzffd zzffdVar) {
        this.zzc = zzfesVar;
        this.zza = zzfffVar;
        this.zzb = zzffdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfev
    public final String zza(zzfeu zzfeuVar) {
        zzfff zzfffVar = this.zza;
        Map mapZzj = zzfeuVar.zzj();
        this.zzb.zza(mapZzj);
        return zzfffVar.zza(mapZzj);
    }

    @Override // com.google.android.gms.internal.ads.zzfev
    public final void zzb(zzfeu zzfeuVar) {
        this.zzc.zzb(zza(zzfeuVar));
    }
}
