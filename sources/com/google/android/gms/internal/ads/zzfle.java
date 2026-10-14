package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfle extends zzatq implements zzflg {
    public zzfle(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzflg
    public final void zze(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeString(null);
        zzbh(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzflg
    public final void zzf() throws RemoteException {
        zzbh(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzflg
    public final void zzg(int i10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i10);
        zzbh(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzflg
    public final void zzh(int[] iArr) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeIntArray(null);
        zzbh(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzflg
    public final void zzi(int i10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i10);
        zzbh(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzflg
    public final void zzj(byte[] bArr) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeByteArray(bArr);
        zzbh(5, parcelZza);
    }
}
