package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzdxr implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    public final zzcaj zza = new zzcaj();
    public boolean zzb = false;
    public boolean zzc = false;
    public zzbth zzd;
    public Context zze;
    public Looper zzf;
    public ScheduledExecutorService zzg;

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        String str = String.format(Locale.US, "Remote ad service connection failed, cause: %d.", Integer.valueOf(connectionResult.getErrorCode()));
        zzbzr.zze(str);
        this.zza.zze(new zzdwa(1, str));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public void onConnectionSuspended(int i10) {
        String str = String.format(Locale.US, "Remote ad service connection suspended, cause: %d.", Integer.valueOf(i10));
        zzbzr.zze(str);
        this.zza.zze(new zzdwa(1, str));
    }

    public final synchronized void zzb() {
        if (this.zzd == null) {
            this.zzd = new zzbth(this.zze, this.zzf, this, this);
        }
        this.zzd.checkAvailabilityAndConnect();
    }

    public final synchronized void zzc() {
        this.zzc = true;
        zzbth zzbthVar = this.zzd;
        if (zzbthVar == null) {
            return;
        }
        if (zzbthVar.isConnected() || this.zzd.isConnecting()) {
            this.zzd.disconnect();
        }
        Binder.flushPendingCommands();
    }
}
