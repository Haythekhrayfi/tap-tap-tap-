package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbtz extends zzatr implements zzbua {
    public zzbtz() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzatr
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzats.zza(parcel, ParcelFileDescriptor.CREATOR);
            zzats.zzc(parcel);
            zzf(parcelFileDescriptor);
        } else {
            if (i10 != 2) {
                return false;
            }
            com.google.android.gms.ads.internal.util.zzaz zzazVar = (com.google.android.gms.ads.internal.util.zzaz) zzats.zza(parcel, com.google.android.gms.ads.internal.util.zzaz.CREATOR);
            zzats.zzc(parcel);
            zze(zzazVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
