package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdxl extends zzdxr {
    private zzbtm zzh;

    public zzdxl(Context context, ScheduledExecutorService scheduledExecutorService) {
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
                this.zzd.zzp().zze(this.zzh, new zzdxq(this));
            } catch (RemoteException unused) {
                this.zza.zze(new zzdwa(1));
            }
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "RemoteAdsServiceProxyClientTask.onConnected");
            this.zza.zze(th);
        }
    }

    public final synchronized zzfwm zza(zzbtm zzbtmVar, long j10) {
        if (this.zzb) {
            return zzfwc.zzn(this.zza, j10, TimeUnit.MILLISECONDS, this.zzg);
        }
        this.zzb = true;
        this.zzh = zzbtmVar;
        zzb();
        zzfwm zzfwmVarZzn = zzfwc.zzn(this.zza, j10, TimeUnit.MILLISECONDS, this.zzg);
        zzfwmVarZzn.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdxk
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzc();
            }
        }, zzcae.zzf);
        return zzfwmVarZzn;
    }
}
