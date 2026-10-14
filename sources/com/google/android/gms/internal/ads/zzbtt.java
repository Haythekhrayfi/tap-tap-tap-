package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbtt extends zzatr implements zzbtu {
    public zzbtt() {
        super("com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override // com.google.android.gms.internal.ads.zzatr
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzbtx zzbtvVar = null;
        if (i10 == 1) {
            zzbti zzbtiVar = (zzbti) zzats.zza(parcel, zzbti.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                zzbtvVar = iInterfaceQueryLocalInterface instanceof zzbtx ? (zzbtx) iInterfaceQueryLocalInterface : new zzbtv(strongBinder);
            }
            zzats.zzc(parcel);
            zzf(zzbtiVar, zzbtvVar);
        } else if (i10 == 2) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                if (iInterfaceQueryLocalInterface2 instanceof zzbtx) {
                }
            }
            zzats.zzc(parcel);
        } else {
            if (i10 != 3) {
                return false;
            }
            zzbtm zzbtmVar = (zzbtm) zzats.zza(parcel, zzbtm.CREATOR);
            IBinder strongBinder3 = parcel.readStrongBinder();
            if (strongBinder3 != null) {
                IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                zzbtvVar = iInterfaceQueryLocalInterface3 instanceof zzbtx ? (zzbtx) iInterfaceQueryLocalInterface3 : new zzbtv(strongBinder3);
            }
            zzats.zzc(parcel);
            zze(zzbtmVar, zzbtvVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
