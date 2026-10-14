package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfnr extends zzatq implements zzfnt {
    public zzfnr(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // com.google.android.gms.internal.ads.zzfnt
    public final void zze(Bundle bundle, zzfnv zzfnvVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzd(parcelZza, bundle);
        zzats.zzf(parcelZza, zzfnvVar);
        zzbi(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzfnt
    public final void zzf(String str, Bundle bundle, zzfnv zzfnvVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzats.zzd(parcelZza, bundle);
        zzats.zzf(parcelZza, zzfnvVar);
        zzbi(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzfnt
    public final void zzg(Bundle bundle, zzfnv zzfnvVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzd(parcelZza, bundle);
        zzats.zzf(parcelZza, zzfnvVar);
        zzbi(3, parcelZza);
    }
}
