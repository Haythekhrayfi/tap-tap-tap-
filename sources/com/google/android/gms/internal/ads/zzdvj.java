package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdvj extends zzdvl {
    public zzdvj(Context context) {
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
                    this.zzf.zzp().zzg(this.zze, new zzdvk(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    zzcajVar = this.zza;
                    zzdwaVar = new zzdwa(1);
                    zzcajVar.zze(zzdwaVar);
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "RemoteAdRequestClientTask.onConnected");
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
}
