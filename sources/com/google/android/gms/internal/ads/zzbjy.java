package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbjy extends zzatq {
    public zzbjy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void zze(zzbjs zzbjsVar, zzbjx zzbjxVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzd(parcelZza, zzbjsVar);
        zzats.zzf(parcelZza, zzbjxVar);
        zzbi(2, parcelZza);
    }
}
