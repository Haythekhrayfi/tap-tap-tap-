package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzdvl implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    public final zzcaj zza = new zzcaj();
    public final Object zzb = new Object();
    public boolean zzc = false;
    public boolean zzd = false;
    public zzbue zze;
    public zzbte zzf;

    public void onConnectionFailed(ConnectionResult connectionResult) {
        zzbzr.zze("Disconnected from remote ad request service.");
        this.zza.zze(new zzdwa(1));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        zzbzr.zze("Cannot connect to remote service, fallback to local instance.");
    }

    public final void zza() {
        synchronized (this.zzb) {
            this.zzd = true;
            if (this.zzf.isConnected() || this.zzf.isConnecting()) {
                this.zzf.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }
}
