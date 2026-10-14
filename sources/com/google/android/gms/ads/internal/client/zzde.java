package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzatq;
import com.google.android.gms.internal.ads.zzats;

/* JADX INFO: loaded from: classes.dex */
public final class zzde extends zzatq implements zzdg {
    public zzde(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdg
    public final void zze(zzs zzsVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzd(parcelZza, zzsVar);
        zzbh(1, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdg
    public final boolean zzf() throws RemoteException {
        Parcel parcelZzbg = zzbg(2, zza());
        boolean zZzg = zzats.zzg(parcelZzbg);
        parcelZzbg.recycle();
        return zZzg;
    }
}
