package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
final class zziy implements Runnable {
    public final /* synthetic */ zzq zza;
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zzb;
    public final /* synthetic */ zzjs zzc;

    public zziy(zzjs zzjsVar, zzq zzqVar, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zzc = zzjsVar;
        this.zza = zzqVar;
        this.zzb = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strZzd = null;
        try {
            try {
                if (this.zzc.zzs.zzm().zzc().zzi(zzah.ANALYTICS_STORAGE)) {
                    zzjs zzjsVar = this.zzc;
                    zzee zzeeVar = zzjsVar.zzb;
                    if (zzeeVar == null) {
                        zzjsVar.zzs.zzay().zzd().zza("Failed to get app instance id");
                    } else {
                        Preconditions.checkNotNull(this.zza);
                        strZzd = zzeeVar.zzd(this.zza);
                        if (strZzd != null) {
                            this.zzc.zzs.zzq().zzO(strZzd);
                            this.zzc.zzs.zzm().zze.zzb(strZzd);
                        }
                        this.zzc.zzQ();
                    }
                } else {
                    this.zzc.zzs.zzay().zzl().zza("Analytics storage consent denied; will not get app instance id");
                    this.zzc.zzs.zzq().zzO(null);
                    this.zzc.zzs.zzm().zze.zzb(null);
                }
            } catch (RemoteException e10) {
                this.zzc.zzs.zzay().zzd().zzb("Failed to get app instance id", e10);
            }
        } finally {
            this.zzc.zzs.zzv().zzV(this.zzb, null);
        }
    }
}
