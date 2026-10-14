package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbft extends zzatq implements zzbfv {
    public zzbft(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbfv
    public final void zze(zzbfl zzbflVar, String str) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, zzbflVar);
        parcelZza.writeString(str);
        zzbh(1, parcelZza);
    }
}
