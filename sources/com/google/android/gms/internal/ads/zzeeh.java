package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
final class zzeeh implements zzdew {
    private final zzezn zza;
    private final zzbpt zzb;
    private final AdFormat zzc;
    private zzcvy zzd = null;

    public zzeeh(zzezn zzeznVar, zzbpt zzbptVar, AdFormat adFormat) {
        this.zza = zzeznVar;
        this.zzb = zzbptVar;
        this.zzc = adFormat;
    }

    @Override // com.google.android.gms.internal.ads.zzdew
    public final void zza(boolean z10, Context context, zzcvt zzcvtVar) throws zzdev {
        boolean zZzs;
        try {
            AdFormat adFormat = AdFormat.BANNER;
            int iOrdinal = this.zzc.ordinal();
            if (iOrdinal == 1) {
                zZzs = this.zzb.zzs(ObjectWrapper.wrap(context));
            } else {
                if (iOrdinal != 2) {
                    if (iOrdinal == 6) {
                        zZzs = this.zzb.zzr(ObjectWrapper.wrap(context));
                    }
                    throw new zzdev("Adapter failed to show.");
                }
                zZzs = this.zzb.zzt(ObjectWrapper.wrap(context));
            }
            if (zZzs) {
                if (this.zzd == null) {
                    return;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbs)).booleanValue() || this.zza.zzZ != 2) {
                    return;
                }
                this.zzd.zza();
                return;
            }
            throw new zzdev("Adapter failed to show.");
        } catch (Throwable th) {
            throw new zzdev(th);
        }
    }

    public final void zzb(zzcvy zzcvyVar) {
        this.zzd = zzcvyVar;
    }
}
