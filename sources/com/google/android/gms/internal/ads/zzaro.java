package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaro extends zzapc {
    public Long zza;
    public Long zzb;

    public zzaro() {
    }

    public zzaro(String str) {
        HashMap mapZza = zzapc.zza(str);
        if (mapZza != null) {
            this.zza = (Long) mapZza.get(0);
            this.zzb = (Long) mapZza.get(1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapc
    public final HashMap zzb() {
        HashMap map = new HashMap();
        map.put(0, this.zza);
        map.put(1, this.zzb);
        return map;
    }
}
