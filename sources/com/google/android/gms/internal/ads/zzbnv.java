package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbnv extends zzatr implements zzbnw {
    public zzbnv() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static zzbnw zzf(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return iInterfaceQueryLocalInterface instanceof zzbnw ? (zzbnw) iInterfaceQueryLocalInterface : new zzbnu(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzatr
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        IInterface iInterfaceZzb;
        int iZze;
        if (i10 != 1) {
            if (i10 == 2) {
                String string = parcel.readString();
                zzats.zzc(parcel);
                iZze = zze(string);
            } else if (i10 == 3) {
                String string2 = parcel.readString();
                zzats.zzc(parcel);
                iInterfaceZzb = zzc(string2);
            } else {
                if (i10 != 4) {
                    return false;
                }
                String string3 = parcel.readString();
                zzats.zzc(parcel);
                iZze = zzd(string3);
            }
            parcel2.writeNoException();
            parcel2.writeInt(iZze);
            return true;
        }
        String string4 = parcel.readString();
        zzats.zzc(parcel);
        iInterfaceZzb = zzb(string4);
        parcel2.writeNoException();
        zzats.zzf(parcel2, iInterfaceZzb);
        return true;
    }
}
