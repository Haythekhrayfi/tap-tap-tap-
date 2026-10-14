package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzatr;
import com.google.android.gms.internal.ads.zzats;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzds extends zzatr implements zzdt {
    public zzds() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.internal.ads.zzatr
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzi();
        } else if (i10 == 2) {
            zzh();
        } else if (i10 == 3) {
            zzg();
        } else if (i10 == 4) {
            zze();
        } else {
            if (i10 != 5) {
                return false;
            }
            boolean zZzg = zzats.zzg(parcel);
            zzats.zzc(parcel);
            zzf(zZzg);
        }
        parcel2.writeNoException();
        return true;
    }
}
