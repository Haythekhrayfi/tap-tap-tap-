package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbnu extends zzatq implements zzbnw {
    public zzbnu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final zzbnz zzb(String str) throws RemoteException {
        zzbnz zzbnxVar;
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzbg = zzbg(1, parcelZza);
        IBinder strongBinder = parcelZzbg.readStrongBinder();
        if (strongBinder == null) {
            zzbnxVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            zzbnxVar = iInterfaceQueryLocalInterface instanceof zzbnz ? (zzbnz) iInterfaceQueryLocalInterface : new zzbnx(strongBinder);
        }
        parcelZzbg.recycle();
        return zzbnxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final zzbpt zzc(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzbg = zzbg(3, parcelZza);
        zzbpt zzbptVarZzb = zzbps.zzb(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return zzbptVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final boolean zzd(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzbg = zzbg(4, parcelZza);
        boolean zZzg = zzats.zzg(parcelZzbg);
        parcelZzbg.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final boolean zze(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzbg = zzbg(2, parcelZza);
        boolean zZzg = zzats.zzg(parcelZzbg);
        parcelZzbg.recycle();
        return zZzg;
    }
}
