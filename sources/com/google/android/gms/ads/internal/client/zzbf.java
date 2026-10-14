package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzatq;
import com.google.android.gms.internal.ads.zzats;

/* JADX INFO: loaded from: classes.dex */
public final class zzbf extends zzatq implements zzbh {
    public zzbf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzc() throws RemoteException {
        zzbh(6, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzd() throws RemoteException {
        zzbh(1, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zze(int i10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i10);
        zzbh(2, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzf(zze zzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzd(parcelZza, zzeVar);
        zzbh(8, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzg() throws RemoteException {
        zzbh(7, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzh() throws RemoteException {
        zzbh(3, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzi() throws RemoteException {
        zzbh(4, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzj() throws RemoteException {
        zzbh(5, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzk() throws RemoteException {
        zzbh(9, zza());
    }
}
