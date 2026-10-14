package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzatr;
import com.google.android.gms.internal.ads.zzats;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzdf extends zzatr implements zzdg {
    public zzdf() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static zzdg zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return iInterfaceQueryLocalInterface instanceof zzdg ? (zzdg) iInterfaceQueryLocalInterface : new zzde(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzatr
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzs zzsVar = (zzs) zzats.zza(parcel, zzs.CREATOR);
            zzats.zzc(parcel);
            zze(zzsVar);
            parcel2.writeNoException();
        } else {
            if (i10 != 2) {
                return false;
            }
            boolean zZzf = zzf();
            parcel2.writeNoException();
            int i12 = zzats.zza;
            parcel2.writeInt(zZzf ? 1 : 0);
        }
        return true;
    }
}
