package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzatr;
import com.google.android.gms.internal.ads.zzats;
import com.google.android.gms.internal.ads.zzbnw;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzck extends zzatr implements zzcl {
    public zzck() {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public static zzcl asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return iInterfaceQueryLocalInterface instanceof zzcl ? (zzcl) iInterfaceQueryLocalInterface : new zzcj(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzatr
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzen liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            zzats.zze(parcel2, liteSdkVersion);
        } else {
            if (i10 != 2) {
                return false;
            }
            zzbnw adapterCreator = getAdapterCreator();
            parcel2.writeNoException();
            zzats.zzf(parcel2, adapterCreator);
        }
        return true;
    }
}
