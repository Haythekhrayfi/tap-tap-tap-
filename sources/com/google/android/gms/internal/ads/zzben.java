package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzben extends zzatr implements zzbeo {
    public zzben() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzatr
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        float fZze;
        IInterface iInterfaceZzi;
        zzbfz zzbfzVar;
        int iZzl;
        switch (i10) {
            case 2:
                fZze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(fZze);
                return true;
            case 3:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzats.zzc(parcel);
                zzj(iObjectWrapperAsInterface);
                parcel2.writeNoException();
                return true;
            case 4:
                iInterfaceZzi = zzi();
                parcel2.writeNoException();
                zzats.zzf(parcel2, iInterfaceZzi);
                return true;
            case 5:
                fZze = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(fZze);
                return true;
            case 6:
                fZze = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(fZze);
                return true;
            case 7:
                iInterfaceZzi = zzh();
                parcel2.writeNoException();
                zzats.zzf(parcel2, iInterfaceZzi);
                return true;
            case 8:
                iZzl = zzl();
                parcel2.writeNoException();
                int i12 = zzats.zza;
                parcel2.writeInt(iZzl);
                return true;
            case 9:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzbfzVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    zzbfzVar = iInterfaceQueryLocalInterface instanceof zzbfz ? (zzbfz) iInterfaceQueryLocalInterface : new zzbfz(strongBinder);
                }
                zzats.zzc(parcel);
                zzm(zzbfzVar);
                parcel2.writeNoException();
                return true;
            case 10:
                iZzl = zzk();
                parcel2.writeNoException();
                int i13 = zzats.zza;
                parcel2.writeInt(iZzl);
                return true;
            default:
                return false;
        }
    }
}
