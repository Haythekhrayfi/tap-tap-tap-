package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.a;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes.dex */
public final class zzr extends com.google.android.gms.internal.common.zza {
    public zzr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final IObjectWrapper zze(IObjectWrapper iObjectWrapper, String str, int i10, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.zzc.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(i10);
        com.google.android.gms.internal.common.zzc.zzf(parcelZza, iObjectWrapper2);
        return a.a(zzB(2, parcelZza));
    }

    public final IObjectWrapper zzf(IObjectWrapper iObjectWrapper, String str, int i10, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.zzc.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(i10);
        com.google.android.gms.internal.common.zzc.zzf(parcelZza, iObjectWrapper2);
        return a.a(zzB(3, parcelZza));
    }
}
