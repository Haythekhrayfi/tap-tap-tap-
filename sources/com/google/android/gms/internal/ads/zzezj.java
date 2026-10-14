package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* JADX INFO: loaded from: classes2.dex */
final class zzezj implements OnAdMetadataChangedListener {
    public final /* synthetic */ com.google.android.gms.ads.internal.client.zzby zza;
    public final /* synthetic */ zzezk zzb;

    public zzezj(zzezk zzezkVar, com.google.android.gms.ads.internal.client.zzby zzbyVar) {
        this.zzb = zzezkVar;
        this.zza = zzbyVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        if (this.zzb.zzd != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e10) {
                zzbzr.zzl("#007 Could not call remote method.", e10);
            }
        }
    }
}
