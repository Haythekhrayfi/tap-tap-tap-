package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbvl extends zzatq implements zzbvn {
    public zzbvl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final Bundle zzb() throws RemoteException {
        Parcel parcelZzbg = zzbg(9, zza());
        Bundle bundle = (Bundle) zzats.zza(parcelZzbg, Bundle.CREATOR);
        parcelZzbg.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final com.google.android.gms.ads.internal.client.zzdn zzc() throws RemoteException {
        Parcel parcelZzbg = zzbg(12, zza());
        com.google.android.gms.ads.internal.client.zzdn zzdnVarZzb = com.google.android.gms.ads.internal.client.zzdm.zzb(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return zzdnVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final zzbvk zzd() throws RemoteException {
        zzbvk zzbviVar;
        Parcel parcelZzbg = zzbg(11, zza());
        IBinder strongBinder = parcelZzbg.readStrongBinder();
        if (strongBinder == null) {
            zzbviVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            zzbviVar = iInterfaceQueryLocalInterface instanceof zzbvk ? (zzbvk) iInterfaceQueryLocalInterface : new zzbvi(strongBinder);
        }
        parcelZzbg.recycle();
        return zzbviVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final String zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zzf(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbvu zzbvuVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzd(parcelZza, zzlVar);
        zzats.zzf(parcelZza, zzbvuVar);
        zzbh(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zzg(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbvu zzbvuVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzd(parcelZza, zzlVar);
        zzats.zzf(parcelZza, zzbvuVar);
        zzbh(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zzh(boolean z10) throws RemoteException {
        Parcel parcelZza = zza();
        int i10 = zzats.zza;
        parcelZza.writeInt(z10 ? 1 : 0);
        zzbh(15, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zzi(com.google.android.gms.ads.internal.client.zzdd zzddVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, zzddVar);
        zzbh(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zzj(com.google.android.gms.ads.internal.client.zzdg zzdgVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, zzdgVar);
        zzbh(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zzk(zzbvq zzbvqVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, zzbvqVar);
        zzbh(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zzl(zzbwb zzbwbVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzd(parcelZza, zzbwbVar);
        zzbh(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, iObjectWrapper);
        zzbh(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zzn(IObjectWrapper iObjectWrapper, boolean z10) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final boolean zzo() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zzp(zzbvv zzbvvVar) throws RemoteException {
        throw null;
    }
}
