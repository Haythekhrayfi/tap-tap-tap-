package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzawn extends zzatq {
    public zzawn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final long zze(zzawl zzawlVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzd(parcelZza, zzawlVar);
        Parcel parcelZzbg = zzbg(3, parcelZza);
        long j10 = parcelZzbg.readLong();
        parcelZzbg.recycle();
        return j10;
    }

    public final zzawi zzf(zzawl zzawlVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzd(parcelZza, zzawlVar);
        Parcel parcelZzbg = zzbg(1, parcelZza);
        zzawi zzawiVar = (zzawi) zzats.zza(parcelZzbg, zzawi.CREATOR);
        parcelZzbg.recycle();
        return zzawiVar;
    }

    public final zzawi zzg(zzawl zzawlVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzd(parcelZza, zzawlVar);
        Parcel parcelZzbg = zzbg(2, parcelZza);
        zzawi zzawiVar = (zzawi) zzats.zza(parcelZzbg, zzawi.CREATOR);
        parcelZzbg.recycle();
        return zzawiVar;
    }
}
