package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
final class zzo implements zzgy {
    public final com.google.android.gms.internal.measurement.zzci zza;
    public final /* synthetic */ AppMeasurementDynamiteService zzb;

    public zzo(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzci zzciVar) {
        this.zzb = appMeasurementDynamiteService;
        this.zza = zzciVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    public final void interceptEvent(String str, String str2, Bundle bundle, long j10) {
        try {
            this.zza.zze(str, str2, bundle, j10);
        } catch (RemoteException e10) {
            zzfy zzfyVar = this.zzb.zza;
            if (zzfyVar != null) {
                zzfyVar.zzay().zzk().zzb("Event interceptor threw exception", e10);
            }
        }
    }
}
