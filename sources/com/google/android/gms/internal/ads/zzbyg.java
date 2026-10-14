package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbyg extends zzatq implements zzbyi {
    public zzbyg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzbyi
    public final void zze(IObjectWrapper iObjectWrapper, zzbym zzbymVar, zzbyf zzbyfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, iObjectWrapper);
        zzats.zzd(parcelZza, zzbymVar);
        zzats.zzf(parcelZza, zzbyfVar);
        zzbh(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyi
    public final void zzf(zzbsr zzbsrVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzd(parcelZza, zzbsrVar);
        zzbh(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyi
    public final void zzg(List list, IObjectWrapper iObjectWrapper, zzbsi zzbsiVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzats.zzf(parcelZza, iObjectWrapper);
        zzats.zzf(parcelZza, zzbsiVar);
        zzbh(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyi
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbsi zzbsiVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzats.zzf(parcelZza, iObjectWrapper);
        zzats.zzf(parcelZza, zzbsiVar);
        zzbh(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyi
    public final void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, iObjectWrapper);
        zzbh(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyi
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, iObjectWrapper);
        zzbh(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyi
    public final void zzk(List list, IObjectWrapper iObjectWrapper, zzbsi zzbsiVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzats.zzf(parcelZza, iObjectWrapper);
        zzats.zzf(parcelZza, zzbsiVar);
        zzbh(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyi
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbsi zzbsiVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzats.zzf(parcelZza, iObjectWrapper);
        zzats.zzf(parcelZza, zzbsiVar);
        zzbh(5, parcelZza);
    }
}
