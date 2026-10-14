package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbfq extends zzatq implements zzbfs {
    public zzbfq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final void zze(zzbfi zzbfiVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, zzbfiVar);
        zzbh(1, parcelZza);
    }
}
