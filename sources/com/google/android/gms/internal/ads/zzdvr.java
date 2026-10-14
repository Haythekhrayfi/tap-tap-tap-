package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdvr extends zzdvl {
    private String zzg;
    private int zzh = 1;

    public zzdvr(Context context) {
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
                    int i10 = this.zzh;
                    if (i10 == 2) {
                        this.zzf.zzp().zze(this.zze, new zzdvk(this));
                    } else if (i10 == 3) {
                        this.zzf.zzp().zzh(this.zzg, new zzdvk(this));
                    } else {
                        this.zza.zze(new zzdwa(1));
                    }
                } catch (RemoteException | IllegalArgumentException unused) {
                    zzcajVar = this.zza;
                    zzdwaVar = new zzdwa(1);
                    zzcajVar.zze(zzdwaVar);
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
                    zzcajVar = this.zza;
                    zzdwaVar = new zzdwa(1);
                    zzcajVar.zze(zzdwaVar);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdvl, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        zzbzr.zze("Cannot connect to remote service, fallback to local instance.");
        this.zza.zze(new zzdwa(1));
    }

    public final zzfwm zzb(zzbue zzbueVar) {
        synchronized (this.zzb) {
            int i10 = this.zzh;
            if (i10 != 1 && i10 != 2) {
                return zzfwc.zzg(new zzdwa(2));
            }
            if (this.zzc) {
                return this.zza;
            }
            this.zzh = 2;
            this.zzc = true;
            this.zze = zzbueVar;
            this.zzf.checkAvailabilityAndConnect();
            this.zza.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdvq
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zza();
                }
            }, zzcae.zzf);
            return this.zza;
        }
    }

    public final zzfwm zzc(String str) {
        synchronized (this.zzb) {
            int i10 = this.zzh;
            if (i10 != 1 && i10 != 3) {
                return zzfwc.zzg(new zzdwa(2));
            }
            if (this.zzc) {
                return this.zza;
            }
            this.zzh = 3;
            this.zzc = true;
            this.zzg = str;
            this.zzf.checkAvailabilityAndConnect();
            this.zza.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdvp
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zza();
                }
            }, zzcae.zzf);
            return this.zza;
        }
    }
}
