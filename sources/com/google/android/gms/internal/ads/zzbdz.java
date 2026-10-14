package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbdz extends zzatq {
    public zzbdz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }

    public final void zze(zzbtd zzbtdVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, zzbtdVar);
        zzbh(1, parcelZza);
    }
}
