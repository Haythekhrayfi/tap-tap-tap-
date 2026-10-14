package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbrl extends zzatr implements zzbrm {
    public zzbrl() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public static zzbrm zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        return iInterfaceQueryLocalInterface instanceof zzbrm ? (zzbrm) iInterfaceQueryLocalInterface : new zzbrk(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzatr
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            Intent intent = (Intent) zzats.zza(parcel, Intent.CREATOR);
            zzats.zzc(parcel);
            zze(intent);
        } else if (i10 == 2) {
            IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            String string = parcel.readString();
            String string2 = parcel.readString();
            zzats.zzc(parcel);
            zzi(iObjectWrapperAsInterface, string, string2);
        } else if (i10 == 3) {
            zzh();
        } else if (i10 == 4) {
            IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzats.zzc(parcel);
            zzg(iObjectWrapperAsInterface2);
        } else {
            if (i10 != 5) {
                return false;
            }
            String[] strArrCreateStringArray = parcel.createStringArray();
            int[] iArrCreateIntArray = parcel.createIntArray();
            IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzats.zzc(parcel);
            zzf(strArrCreateStringArray, iArrCreateIntArray, iObjectWrapperAsInterface3);
        }
        parcel2.writeNoException();
        return true;
    }
}
