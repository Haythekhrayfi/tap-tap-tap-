package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfkn extends zzatq {
    public zzfkn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzfkl zze(zzfkj zzfkjVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzd(parcelZza, zzfkjVar);
        Parcel parcelZzbg = zzbg(1, parcelZza);
        zzfkl zzfklVar = (zzfkl) zzats.zza(parcelZzbg, zzfkl.CREATOR);
        parcelZzbg.recycle();
        return zzfklVar;
    }

    public final zzfku zzf(zzfks zzfksVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzd(parcelZza, zzfksVar);
        Parcel parcelZzbg = zzbg(3, parcelZza);
        zzfku zzfkuVar = (zzfku) zzats.zza(parcelZzbg, zzfku.CREATOR);
        parcelZzbg.recycle();
        return zzfkuVar;
    }

    public final void zzg(zzfkg zzfkgVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzd(parcelZza, zzfkgVar);
        zzbh(2, parcelZza);
    }
}
