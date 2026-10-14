package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzetf implements zzeqy {
    public final zzfwn zza;
    public final String zzb;
    public final zzbyo zzc;

    public zzetf(zzbyo zzbyoVar, zzfwn zzfwnVar, String str) {
        this.zzc = zzbyoVar;
        this.zza = zzfwnVar;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final int zza() {
        return 47;
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final zzfwm zzb() {
        final zzfwm zzfwmVarZzh = zzfwc.zzh(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzfC)).booleanValue()) {
            zzfwmVarZzh = zzfwc.zzh(null);
        }
        final zzfwm zzfwmVarZzh2 = zzfwc.zzh(null);
        return zzfwc.zzc(zzfwmVarZzh, zzfwmVarZzh2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzete
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzetg((String) zzfwmVarZzh.get(), (String) zzfwmVarZzh2.get());
            }
        }, zzcae.zza);
    }
}
