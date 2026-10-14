package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbkt extends zzatr implements zzbku {
    public zzbkt() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.zzatr
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        IInterface iInterfaceZzb;
        zzbkx zzbkvVar;
        if (i10 != 3) {
            if (i10 == 4) {
                zzd();
            } else if (i10 == 5) {
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzbkvVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                    zzbkvVar = iInterfaceQueryLocalInterface instanceof zzbkx ? (zzbkx) iInterfaceQueryLocalInterface : new zzbkv(strongBinder);
                }
                zzats.zzc(parcel);
                zzf(iObjectWrapperAsInterface, zzbkvVar);
            } else if (i10 == 6) {
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzats.zzc(parcel);
                zze(iObjectWrapperAsInterface2);
            } else {
                if (i10 != 7) {
                    return false;
                }
                iInterfaceZzb = zzc();
            }
            parcel2.writeNoException();
            return true;
        }
        iInterfaceZzb = zzb();
        parcel2.writeNoException();
        zzats.zzf(parcel2, iInterfaceZzb);
        return true;
    }
}
