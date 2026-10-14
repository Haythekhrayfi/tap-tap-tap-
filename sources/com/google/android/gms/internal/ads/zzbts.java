package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbts extends zzatq implements zzbtu {
    public zzbts(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override // com.google.android.gms.internal.ads.zzbtu
    public final void zze(zzbtm zzbtmVar, zzbtx zzbtxVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzd(parcelZza, zzbtmVar);
        zzats.zzf(parcelZza, zzbtxVar);
        zzbh(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtu
    public final void zzf(zzbti zzbtiVar, zzbtx zzbtxVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzd(parcelZza, zzbtiVar);
        zzats.zzf(parcelZza, zzbtxVar);
        zzbh(1, parcelZza);
    }
}
