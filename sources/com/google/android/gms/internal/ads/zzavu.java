package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzavu extends zzatq implements zzavw {
    public zzavu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzavw
    public final void zzb(int i10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i10);
        zzbh(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzavw
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzd(parcelZza, zzeVar);
        zzbh(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzavw
    public final void zzd(zzavt zzavtVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, zzavtVar);
        zzbh(1, parcelZza);
    }
}
