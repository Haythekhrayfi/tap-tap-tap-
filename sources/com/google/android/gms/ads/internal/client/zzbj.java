package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzatr;
import com.google.android.gms.internal.ads.zzats;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbj extends zzatr implements zzbk {
    public zzbj() {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzatr
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzc();
        } else {
            if (i10 != 2) {
                return false;
            }
            zze zzeVar = (zze) zzats.zza(parcel, zze.CREATOR);
            zzats.zzc(parcel);
            zzb(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
