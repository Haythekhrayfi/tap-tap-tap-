package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzfnu extends zzatr implements zzfnv {
    public zzfnu() {
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
    }

    @Override // com.google.android.gms.internal.ads.zzatr
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) zzats.zza(parcel, Bundle.CREATOR);
        zzats.zzc(parcel);
        zzb(bundle);
        return true;
    }
}
