package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbcg extends zzatr implements zzbch {
    public zzbcg() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzatr
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        String strZzb;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzats.zzc(parcel);
                    zzd(iObjectWrapperAsInterface);
                } else if (i10 == 4) {
                    zze();
                } else {
                    if (i10 != 5) {
                        return false;
                    }
                    zzf();
                }
                parcel2.writeNoException();
            } else {
                strZzb = zzc();
            }
            return true;
        }
        strZzb = zzb();
        parcel2.writeNoException();
        parcel2.writeString(strZzb);
        return true;
    }
}
