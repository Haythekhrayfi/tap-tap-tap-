package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzavr extends zzatq implements zzavt {
    public zzavr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzavt
    public final com.google.android.gms.ads.internal.client.zzbu zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzavt
    public final com.google.android.gms.ads.internal.client.zzdn zzf() throws RemoteException {
        Parcel parcelZzbg = zzbg(5, zza());
        com.google.android.gms.ads.internal.client.zzdn zzdnVarZzb = com.google.android.gms.ads.internal.client.zzdm.zzb(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return zzdnVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzavt
    public final void zzg(boolean z10) throws RemoteException {
        Parcel parcelZza = zza();
        int i10 = zzats.zza;
        parcelZza.writeInt(z10 ? 1 : 0);
        zzbh(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzavt
    public final void zzh(com.google.android.gms.ads.internal.client.zzdg zzdgVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, zzdgVar);
        zzbh(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzavt
    public final void zzi(IObjectWrapper iObjectWrapper, zzawa zzawaVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, iObjectWrapper);
        zzats.zzf(parcelZza, zzawaVar);
        zzbh(4, parcelZza);
    }
}
