package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzatr;
import com.google.android.gms.internal.ads.zzats;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzch extends zzatr implements zzci {
    public zzch() {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzatr
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zze zzeVar = (zze) zzats.zza(parcel, zze.CREATOR);
            zzats.zzc(parcel);
            zzd(zzeVar);
        } else if (i10 == 2) {
            zzf();
        } else if (i10 == 3) {
            zzc();
        } else if (i10 == 4) {
            zze();
        } else {
            if (i10 != 5) {
                return false;
            }
            zzb();
        }
        parcel2.writeNoException();
        return true;
    }
}
