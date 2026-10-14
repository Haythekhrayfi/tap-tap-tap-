package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: loaded from: classes2.dex */
final class zzawg implements BaseGmsClient.BaseOnConnectionFailedListener {
    public final /* synthetic */ zzawh zza;

    public zzawg(zzawh zzawhVar) {
        this.zza = zzawhVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        synchronized (this.zza.zzc) {
            this.zza.zzf = null;
            zzawh zzawhVar = this.zza;
            if (zzawhVar.zzd != null) {
                zzawhVar.zzd = null;
            }
            this.zza.zzc.notifyAll();
        }
    }
}
