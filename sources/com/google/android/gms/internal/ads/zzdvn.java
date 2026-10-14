package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdvn extends zzdvl {
    public zzdvn(Context context) {
        this.zzf = new zzbte(context, com.google.android.gms.ads.internal.zzt.zzt().zzb(), this, this);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzcaj zzcajVar;
        zzdwa zzdwaVar;
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    this.zzf.zzp().zzf(this.zze, new zzdvk(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    zzcajVar = this.zza;
                    zzdwaVar = new zzdwa(1);
                    zzcajVar.zze(zzdwaVar);
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "RemoteSignalsClientTask.onConnected");
                    zzcajVar = this.zza;
                    zzdwaVar = new zzdwa(1);
                    zzcajVar.zze(zzdwaVar);
                }
            }
        }
    }

    public final zzfwm zzb(zzbue zzbueVar) {
        synchronized (this.zzb) {
            if (this.zzc) {
                return this.zza;
            }
            this.zzc = true;
            this.zze = zzbueVar;
            this.zzf.checkAvailabilityAndConnect();
            this.zza.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdvm
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zza();
                }
            }, zzcae.zzf);
            return this.zza;
        }
    }
}
