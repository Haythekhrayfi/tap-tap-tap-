package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeuk implements zzeqy {
    private final zzfwn zza;

    public zzeuk(zzfwn zzfwnVar) {
        this.zza = zzfwnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final int zza() {
        return 51;
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final zzfwm zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeuj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                HashMap map = new HashMap();
                String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzL);
                if (str != null && !str.isEmpty()) {
                    if (Build.VERSION.SDK_INT >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzM)).intValue()) {
                        for (String str2 : str.split(",", -1)) {
                            map.put(str2, com.google.android.gms.ads.internal.util.zzch.zza(str2));
                        }
                    }
                }
                return new zzeul(map);
            }
        });
    }
}
