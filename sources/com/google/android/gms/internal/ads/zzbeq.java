package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbeq extends zzatr implements zzber {
    public zzbeq() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public static zzber zzg(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return iInterfaceQueryLocalInterface instanceof zzber ? (zzber) iInterfaceQueryLocalInterface : new zzbep(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzatr
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        int iZzd;
        if (i10 == 1) {
            IObjectWrapper iObjectWrapperZzf = zzf();
            parcel2.writeNoException();
            zzats.zzf(parcel2, iObjectWrapperZzf);
        } else if (i10 == 2) {
            Uri uriZze = zze();
            parcel2.writeNoException();
            zzats.zze(parcel2, uriZze);
        } else if (i10 != 3) {
            if (i10 == 4) {
                iZzd = zzd();
            } else {
                if (i10 != 5) {
                    return false;
                }
                iZzd = zzc();
            }
            parcel2.writeNoException();
            parcel2.writeInt(iZzd);
        } else {
            double dZzb = zzb();
            parcel2.writeNoException();
            parcel2.writeDouble(dZzb);
        }
        return true;
    }
}
