package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzflf extends zzatr implements zzflg {
    public zzflf() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzatr
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 2:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                parcel.readString();
                zzats.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 3:
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.createIntArray();
                zzats.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.createByteArray();
                zzats.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
            case 7:
                parcel.readInt();
                zzats.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 8:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                zzats.zzc(parcel);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
