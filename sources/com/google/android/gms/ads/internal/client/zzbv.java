package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzatq;
import com.google.android.gms.internal.ads.zzats;
import com.google.android.gms.internal.ads.zzbnw;

/* JADX INFO: loaded from: classes.dex */
public final class zzbv extends zzatq {
    public zzbv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder zze(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbnw zzbnwVar, int i10, int i11) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, iObjectWrapper);
        zzats.zzd(parcelZza, zzqVar);
        parcelZza.writeString(str);
        zzats.zzf(parcelZza, zzbnwVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        parcelZza.writeInt(i11);
        Parcel parcelZzbg = zzbg(2, parcelZza);
        IBinder strongBinder = parcelZzbg.readStrongBinder();
        parcelZzbg.recycle();
        return strongBinder;
    }
}
