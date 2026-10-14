package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzavs extends zzatr implements zzavt {
    public zzavs() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzatr
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        IInterface iInterfaceZze;
        zzawa zzavyVar;
        switch (i10) {
            case 2:
                iInterfaceZze = zze();
                parcel2.writeNoException();
                zzats.zzf(parcel2, iInterfaceZze);
                return true;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    if (iInterfaceQueryLocalInterface instanceof zzavx) {
                    }
                }
                zzats.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 == null) {
                    zzavyVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    zzavyVar = iInterfaceQueryLocalInterface2 instanceof zzawa ? (zzawa) iInterfaceQueryLocalInterface2 : new zzavy(strongBinder2);
                }
                zzats.zzc(parcel);
                zzi(iObjectWrapperAsInterface, zzavyVar);
                parcel2.writeNoException();
                return true;
            case 5:
                iInterfaceZze = zzf();
                parcel2.writeNoException();
                zzats.zzf(parcel2, iInterfaceZze);
                return true;
            case 6:
                boolean zZzg = zzats.zzg(parcel);
                zzats.zzc(parcel);
                zzg(zZzg);
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.ads.internal.client.zzdg zzdgVarZzb = com.google.android.gms.ads.internal.client.zzdf.zzb(parcel.readStrongBinder());
                zzats.zzc(parcel);
                zzh(zzdgVarZzb);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
