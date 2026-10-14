package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcrk {
    public final List zza;

    public zzcrk(zzcrd zzcrdVar) {
        this.zza = Collections.singletonList(zzfwc.zzh(zzcrdVar));
    }

    public zzcrk(List list) {
        this.zza = list;
    }

    public static zzecc zza(zzecc zzeccVar) {
        return new zzecd(zzeccVar, new zzfov() { // from class: com.google.android.gms.internal.ads.zzcrj
            @Override // com.google.android.gms.internal.ads.zzfov
            public final Object apply(Object obj) {
                return new zzcrk((zzcrd) obj);
            }
        });
    }
}
