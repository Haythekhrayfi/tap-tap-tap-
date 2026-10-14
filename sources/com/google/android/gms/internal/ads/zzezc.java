package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* JADX INFO: loaded from: classes2.dex */
final class zzezc implements OnAdMetadataChangedListener {
    public final /* synthetic */ com.google.android.gms.ads.internal.client.zzdd zza;
    public final /* synthetic */ zzeze zzb;

    public zzezc(zzeze zzezeVar, com.google.android.gms.ads.internal.client.zzdd zzddVar) {
        this.zzb = zzezeVar;
        this.zza = zzddVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        if (this.zzb.zzi != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e10) {
                zzbzr.zzl("#007 Could not call remote method.", e10);
            }
        }
    }
}
