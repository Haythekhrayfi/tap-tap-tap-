package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbto extends zzatq implements zzbtq {
    public zzbto(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zze(zzbue zzbueVar, zzbua zzbuaVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzd(parcelZza, zzbueVar);
        zzats.zzf(parcelZza, zzbuaVar);
        zzbh(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zzf(zzbue zzbueVar, zzbua zzbuaVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzd(parcelZza, zzbueVar);
        zzats.zzf(parcelZza, zzbuaVar);
        zzbh(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zzg(zzbue zzbueVar, zzbua zzbuaVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzd(parcelZza, zzbueVar);
        zzats.zzf(parcelZza, zzbuaVar);
        zzbh(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zzh(String str, zzbua zzbuaVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzats.zzf(parcelZza, zzbuaVar);
        zzbh(7, parcelZza);
    }
}
