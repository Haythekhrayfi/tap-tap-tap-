package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaqz extends zzapc {
    public long zza;
    public long zzb;

    public zzaqz() {
        this.zza = -1L;
        this.zzb = -1L;
    }

    public zzaqz(String str) {
        this.zza = -1L;
        this.zzb = -1L;
        HashMap mapZza = zzapc.zza(str);
        if (mapZza != null) {
            this.zza = ((Long) mapZza.get(0)).longValue();
            this.zzb = ((Long) mapZza.get(1)).longValue();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapc
    public final HashMap zzb() {
        HashMap map = new HashMap();
        map.put(0, Long.valueOf(this.zza));
        map.put(1, Long.valueOf(this.zzb));
        return map;
    }
}
