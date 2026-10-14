package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzatq;
import com.google.android.gms.internal.ads.zzats;

/* JADX INFO: loaded from: classes.dex */
public final class zzcg extends zzatq implements zzci {
    public zzcg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzb() throws RemoteException {
        zzbh(5, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzc() throws RemoteException {
        zzbh(3, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzd(zze zzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzd(parcelZza, zzeVar);
        zzbh(1, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zze() throws RemoteException {
        zzbh(4, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzf() throws RemoteException {
        zzbh(2, zza());
    }
}
