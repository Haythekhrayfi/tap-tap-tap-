package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbtp extends zzatr implements zzbtq {
    public zzbtp() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzatr
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzbua zzbtyVar = null;
        if (i10 != 1) {
            if (i10 == 2) {
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    if (iInterfaceQueryLocalInterface instanceof zzbtr) {
                    }
                }
                zzats.zzc(parcel);
            } else if (i10 == 4) {
                zzbue zzbueVar = (zzbue) zzats.zza(parcel, zzbue.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbtyVar = iInterfaceQueryLocalInterface2 instanceof zzbua ? (zzbua) iInterfaceQueryLocalInterface2 : new zzbty(strongBinder2);
                }
                zzats.zzc(parcel);
                zzg(zzbueVar, zzbtyVar);
            } else if (i10 == 5) {
                zzbue zzbueVar2 = (zzbue) zzats.zza(parcel, zzbue.CREATOR);
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbtyVar = iInterfaceQueryLocalInterface3 instanceof zzbua ? (zzbua) iInterfaceQueryLocalInterface3 : new zzbty(strongBinder3);
                }
                zzats.zzc(parcel);
                zzf(zzbueVar2, zzbtyVar);
            } else if (i10 == 6) {
                zzbue zzbueVar3 = (zzbue) zzats.zza(parcel, zzbue.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbtyVar = iInterfaceQueryLocalInterface4 instanceof zzbua ? (zzbua) iInterfaceQueryLocalInterface4 : new zzbty(strongBinder4);
                }
                zzats.zzc(parcel);
                zze(zzbueVar3, zzbtyVar);
            } else {
                if (i10 != 7) {
                    return false;
                }
                String string = parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbtyVar = iInterfaceQueryLocalInterface5 instanceof zzbua ? (zzbua) iInterfaceQueryLocalInterface5 : new zzbty(strongBinder5);
                }
                zzats.zzc(parcel);
                zzh(string, zzbtyVar);
            }
            parcel2.writeNoException();
        } else {
            zzats.zzc(parcel);
            parcel2.writeNoException();
            zzats.zze(parcel2, null);
        }
        return true;
    }
}
