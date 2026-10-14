package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzatq;
import com.google.android.gms.internal.ads.zzats;

/* JADX INFO: loaded from: classes.dex */
public final class zzbi extends zzatq implements zzbk {
    public zzbi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzb(zze zzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzd(parcelZza, zzeVar);
        zzbh(2, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzc() throws RemoteException {
        zzbh(1, zza());
    }
}
