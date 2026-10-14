package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbsk {
    private static zzbyi zza;
    private final Context zzb;
    private final AdFormat zzc;
    private final com.google.android.gms.ads.internal.client.zzdx zzd;

    public zzbsk(Context context, AdFormat adFormat, com.google.android.gms.ads.internal.client.zzdx zzdxVar) {
        this.zzb = context;
        this.zzc = adFormat;
        this.zzd = zzdxVar;
    }

    public static zzbyi zza(Context context) {
        zzbyi zzbyiVar;
        synchronized (zzbsk.class) {
            if (zza == null) {
                zza = com.google.android.gms.ads.internal.client.zzay.zza().zzr(context, new zzbnt());
            }
            zzbyiVar = zza;
        }
        return zzbyiVar;
    }

    public final void zzb(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        String str;
        zzbyi zzbyiVarZza = zza(this.zzb);
        if (zzbyiVarZza == null) {
            str = "Internal Error, query info generator is null.";
        } else {
            IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(this.zzb);
            com.google.android.gms.ads.internal.client.zzdx zzdxVar = this.zzd;
            try {
                zzbyiVarZza.zze(iObjectWrapperWrap, new zzbym(null, this.zzc.name(), null, zzdxVar == null ? new com.google.android.gms.ads.internal.client.zzm().zza() : com.google.android.gms.ads.internal.client.zzp.zza.zza(this.zzb, zzdxVar)), new zzbsj(this, queryInfoGenerationCallback));
                return;
            } catch (RemoteException unused) {
                str = "Internal Error.";
            }
        }
        queryInfoGenerationCallback.onFailure(str);
    }
}
