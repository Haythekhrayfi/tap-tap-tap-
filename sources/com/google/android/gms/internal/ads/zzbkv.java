package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbkv extends zzatq implements zzbkx {
    public zzbkv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbkx
    public final void zze(int i10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i10);
        zzbh(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbkx
    public final void zzf() throws RemoteException {
        zzbh(1, zza());
    }
}
