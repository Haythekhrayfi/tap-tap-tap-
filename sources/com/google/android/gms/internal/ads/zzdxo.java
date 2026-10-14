package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdxo extends zzdxr {
    private zzbti zzh;

    public zzdxo(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zze = context;
        this.zzf = com.google.android.gms.ads.internal.zzt.zzt().zzb();
        this.zzg = scheduledExecutorService;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final synchronized void onConnected(Bundle bundle) {
        if (this.zzc) {
            return;
        }
        this.zzc = true;
        try {
            try {
                this.zzd.zzp().zzf(this.zzh, new zzdxq(this));
            } catch (RemoteException unused) {
                this.zza.zze(new zzdwa(1));
            }
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "RemoteAdsServiceSignalClientTask.onConnected");
            this.zza.zze(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdxr, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        String str = String.format(Locale.US, "Remote ad service connection suspended, cause: %d.", Integer.valueOf(i10));
        zzbzr.zze(str);
        this.zza.zze(new zzdwa(1, str));
    }

    public final synchronized zzfwm zza(zzbti zzbtiVar, long j10) {
        if (this.zzb) {
            return zzfwc.zzn(this.zza, j10, TimeUnit.MILLISECONDS, this.zzg);
        }
        this.zzb = true;
        this.zzh = zzbtiVar;
        zzb();
        zzfwm zzfwmVarZzn = zzfwc.zzn(this.zza, j10, TimeUnit.MILLISECONDS, this.zzg);
        zzfwmVarZzn.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdxn
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzc();
            }
        }, zzcae.zzf);
        return zzfwmVarZzn;
    }
}
