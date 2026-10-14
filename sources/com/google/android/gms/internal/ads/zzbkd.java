package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: loaded from: classes2.dex */
final class zzbkd implements BaseGmsClient.BaseOnConnectionFailedListener {
    public final /* synthetic */ zzcaj zza;

    public zzbkd(zzbke zzbkeVar, zzcaj zzcajVar) {
        this.zza = zzcajVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.zza.zze(new RuntimeException("Connection failed."));
    }
}
