package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzbmq {
    private final Object zza = new Object();
    private final Object zzb = new Object();
    private zzbmz zzc;
    private zzbmz zzd;

    private static final Context zzc(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final zzbmz zza(Context context, zzbzx zzbzxVar, zzfgb zzfgbVar) {
        zzbmz zzbmzVar;
        synchronized (this.zza) {
            if (this.zzc == null) {
                this.zzc = new zzbmz(zzc(context), zzbzxVar, (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zza), zzfgbVar);
            }
            zzbmzVar = this.zzc;
        }
        return zzbmzVar;
    }

    public final zzbmz zzb(Context context, zzbzx zzbzxVar, zzfgb zzfgbVar) {
        zzbmz zzbmzVar;
        synchronized (this.zzb) {
            if (this.zzd == null) {
                this.zzd = new zzbmz(zzc(context), zzbzxVar, (String) zzbdo.zzb.zze(), zzfgbVar);
            }
            zzbmzVar = this.zzd;
        }
        return zzbmzVar;
    }
}
