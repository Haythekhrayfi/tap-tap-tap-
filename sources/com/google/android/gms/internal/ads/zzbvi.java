package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbvi extends zzatq implements zzbvk {
    public zzbvi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final int zze() throws RemoteException {
        Parcel parcelZzbg = zzbg(2, zza());
        int i10 = parcelZzbg.readInt();
        parcelZzbg.recycle();
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final String zzf() throws RemoteException {
        Parcel parcelZzbg = zzbg(1, zza());
        String string = parcelZzbg.readString();
        parcelZzbg.recycle();
        return string;
    }
}
