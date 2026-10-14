package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzatr;
import com.google.android.gms.internal.ads.zzats;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbq extends zzatr implements zzbr {
    public zzbq() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // com.google.android.gms.internal.ads.zzatr
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            String string = parcel.readString();
            String string2 = parcel.readString();
            zzats.zzc(parcel);
            boolean zZzf = zzf(iObjectWrapperAsInterface, string, string2);
            parcel2.writeNoException();
            parcel2.writeInt(zZzf ? 1 : 0);
        } else {
            if (i10 != 2) {
                return false;
            }
            IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzats.zzc(parcel);
            zze(iObjectWrapperAsInterface2);
            parcel2.writeNoException();
        }
        return true;
    }
}
