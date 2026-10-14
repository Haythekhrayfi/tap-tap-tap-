package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzejq implements com.google.android.gms.ads.internal.client.zza, zzdcu {
    private com.google.android.gms.ads.internal.client.zzbe zza;

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        com.google.android.gms.ads.internal.client.zzbe zzbeVar = this.zza;
        if (zzbeVar != null) {
            try {
                zzbeVar.zzb();
            } catch (RemoteException e10) {
                zzbzr.zzk("Remote Exception at onAdClicked.", e10);
            }
        }
    }

    public final synchronized void zza(com.google.android.gms.ads.internal.client.zzbe zzbeVar) {
        this.zza = zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdcu
    public final synchronized void zzr() {
        com.google.android.gms.ads.internal.client.zzbe zzbeVar = this.zza;
        if (zzbeVar != null) {
            try {
                zzbeVar.zzb();
            } catch (RemoteException e10) {
                zzbzr.zzk("Remote Exception at onPhysicalClick.", e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcu
    public final synchronized void zzs() {
    }
}
