package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcrf implements zzcrg {
    private final Map zza;

    public zzcrf(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzcrg
    public final zzecc zza(int i10, String str) {
        return (zzecc) this.zza.get(str);
    }
}
