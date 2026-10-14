package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzboh extends zzatq {
    public zzboh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    public final double zze() throws RemoteException {
        Parcel parcelZzbg = zzbg(7, zza());
        double d10 = parcelZzbg.readDouble();
        parcelZzbg.recycle();
        return d10;
    }

    public final Bundle zzf() throws RemoteException {
        Parcel parcelZzbg = zzbg(15, zza());
        Bundle bundle = (Bundle) zzats.zza(parcelZzbg, Bundle.CREATOR);
        parcelZzbg.recycle();
        return bundle;
    }

    public final com.google.android.gms.ads.internal.client.zzdq zzg() throws RemoteException {
        Parcel parcelZzbg = zzbg(17, zza());
        com.google.android.gms.ads.internal.client.zzdq zzdqVarZzb = com.google.android.gms.ads.internal.client.zzdp.zzb(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return zzdqVarZzb;
    }

    public final zzbej zzh() throws RemoteException {
        Parcel parcelZzbg = zzbg(19, zza());
        zzbej zzbejVarZzj = zzbei.zzj(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return zzbejVarZzj;
    }

    public final zzber zzi() throws RemoteException {
        Parcel parcelZzbg = zzbg(5, zza());
        zzber zzberVarZzg = zzbeq.zzg(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return zzberVarZzg;
    }

    public final IObjectWrapper zzj() throws RemoteException {
        return com.google.android.gms.ads.internal.client.a.a(zzbg(18, zza()));
    }

    public final IObjectWrapper zzk() throws RemoteException {
        return com.google.android.gms.ads.internal.client.a.a(zzbg(20, zza()));
    }

    public final IObjectWrapper zzl() throws RemoteException {
        return com.google.android.gms.ads.internal.client.a.a(zzbg(21, zza()));
    }

    public final String zzm() throws RemoteException {
        Parcel parcelZzbg = zzbg(4, zza());
        String string = parcelZzbg.readString();
        parcelZzbg.recycle();
        return string;
    }

    public final String zzn() throws RemoteException {
        Parcel parcelZzbg = zzbg(6, zza());
        String string = parcelZzbg.readString();
        parcelZzbg.recycle();
        return string;
    }

    public final String zzo() throws RemoteException {
        Parcel parcelZzbg = zzbg(2, zza());
        String string = parcelZzbg.readString();
        parcelZzbg.recycle();
        return string;
    }

    public final String zzp() throws RemoteException {
        Parcel parcelZzbg = zzbg(9, zza());
        String string = parcelZzbg.readString();
        parcelZzbg.recycle();
        return string;
    }

    public final String zzq() throws RemoteException {
        Parcel parcelZzbg = zzbg(8, zza());
        String string = parcelZzbg.readString();
        parcelZzbg.recycle();
        return string;
    }

    public final List zzr() throws RemoteException {
        Parcel parcelZzbg = zzbg(3, zza());
        ArrayList arrayListZzb = zzats.zzb(parcelZzbg);
        parcelZzbg.recycle();
        return arrayListZzb;
    }

    public final void zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, iObjectWrapper);
        zzbh(11, parcelZza);
    }

    public final void zzt() throws RemoteException {
        zzbh(10, zza());
    }

    public final void zzu(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, iObjectWrapper);
        zzbh(12, parcelZza);
    }

    public final void zzv(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, iObjectWrapper);
        zzats.zzf(parcelZza, iObjectWrapper2);
        zzats.zzf(parcelZza, iObjectWrapper3);
        zzbh(22, parcelZza);
    }

    public final void zzw(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, iObjectWrapper);
        zzbh(16, parcelZza);
    }

    public final boolean zzx() throws RemoteException {
        Parcel parcelZzbg = zzbg(14, zza());
        boolean zZzg = zzats.zzg(parcelZzbg);
        parcelZzbg.recycle();
        return zZzg;
    }

    public final boolean zzy() throws RemoteException {
        Parcel parcelZzbg = zzbg(13, zza());
        boolean zZzg = zzats.zzg(parcelZzbg);
        parcelZzbg.recycle();
        return zZzg;
    }
}
