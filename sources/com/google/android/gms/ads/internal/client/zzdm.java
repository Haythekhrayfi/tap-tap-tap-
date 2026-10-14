package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzatr;
import com.google.android.gms.internal.ads.zzats;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzdm extends zzatr implements zzdn {
    public zzdm() {
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    public static zzdn zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
        return iInterfaceQueryLocalInterface instanceof zzdn ? (zzdn) iInterfaceQueryLocalInterface : new zzdl(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzatr
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        String strZzg;
        Parcelable parcelableZzf;
        switch (i10) {
            case 1:
                strZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeString(strZzg);
                return true;
            case 2:
                strZzg = zzi();
                parcel2.writeNoException();
                parcel2.writeString(strZzg);
                return true;
            case 3:
                List listZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeTypedList(listZzj);
                return true;
            case 4:
                parcelableZzf = zzf();
                parcel2.writeNoException();
                zzats.zze(parcel2, parcelableZzf);
                return true;
            case 5:
                parcelableZzf = zze();
                parcel2.writeNoException();
                zzats.zze(parcel2, parcelableZzf);
                return true;
            case 6:
                strZzg = zzh();
                parcel2.writeNoException();
                parcel2.writeString(strZzg);
                return true;
            default:
                return false;
        }
    }
}
