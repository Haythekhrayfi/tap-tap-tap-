package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbkh extends zzatq implements zzbkj {
    public zzbkh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbkj
    public final void zze(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzbh(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbkj
    public final void zzf() throws RemoteException {
        zzbh(2, zza());
    }
}
