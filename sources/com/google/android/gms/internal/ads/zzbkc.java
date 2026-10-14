package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: loaded from: classes2.dex */
final class zzbkc implements BaseGmsClient.BaseConnectionCallbacks {
    public final /* synthetic */ zzcaj zza;
    public final /* synthetic */ zzbke zzb;

    public zzbkc(zzbke zzbkeVar, zzcaj zzcajVar) {
        this.zzb = zzbkeVar;
        this.zza = zzcajVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        try {
            this.zza.zzd(this.zzb.zza.zzp());
        } catch (DeadObjectException e10) {
            this.zza.zze(e10);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        this.zza.zze(new RuntimeException(android.support.v4.media.a.a("onConnectionSuspended: ", i10)));
    }
}
