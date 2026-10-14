package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbrs extends zzatr implements zzbrt {
    public zzbrs() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public static zzbrt zzH(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return iInterfaceQueryLocalInterface instanceof zzbrt ? (zzbrt) iInterfaceQueryLocalInterface : new zzbrr(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzatr
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                Bundle bundle = (Bundle) zzats.zza(parcel, Bundle.CREATOR);
                zzats.zzc(parcel);
                zzl(bundle);
                break;
            case 2:
                break;
            case 3:
                zzt();
                break;
            case 4:
                zzr();
                break;
            case 5:
                zzo();
                break;
            case 6:
                Bundle bundle2 = (Bundle) zzats.zza(parcel, Bundle.CREATOR);
                zzats.zzc(parcel);
                zzs(bundle2);
                parcel2.writeNoException();
                zzats.zze(parcel2, bundle2);
                return true;
            case 7:
                zzu();
                break;
            case 8:
                zzm();
                break;
            case 9:
                zzx();
                break;
            case 10:
                zzi();
                break;
            case 11:
                boolean zZzG = zzG();
                parcel2.writeNoException();
                int i12 = zzats.zza;
                parcel2.writeInt(zZzG ? 1 : 0);
                return true;
            case 12:
                parcel.readInt();
                parcel.readInt();
                zzats.zzc(parcel);
                break;
            case 13:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzats.zzc(parcel);
                zzk(iObjectWrapperAsInterface);
                break;
            case 14:
                zzv();
                break;
            case 15:
                int i13 = parcel.readInt();
                String[] strArrCreateStringArray = parcel.createStringArray();
                int[] iArrCreateIntArray = parcel.createIntArray();
                zzats.zzc(parcel);
                zzp(i13, strArrCreateStringArray, iArrCreateIntArray);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
