package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzatr;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzcv extends zzatr implements zzcw {
    public zzcv() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    public static zzcw zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        return iInterfaceQueryLocalInterface instanceof zzcw ? (zzcw) iInterfaceQueryLocalInterface : new zzcu(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzatr
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        String strZze;
        if (i10 == 1) {
            strZze = zze();
        } else {
            if (i10 != 2) {
                return false;
            }
            strZze = zzf();
        }
        parcel2.writeNoException();
        parcel2.writeString(strZze);
        return true;
    }
}
