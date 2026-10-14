package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.a;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes.dex */
public final class zzq extends com.google.android.gms.internal.common.zza {
    public zzq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int zze() throws RemoteException {
        Parcel parcelZzB = zzB(6, zza());
        int i10 = parcelZzB.readInt();
        parcelZzB.recycle();
        return i10;
    }

    public final int zzf(IObjectWrapper iObjectWrapper, String str, boolean z10) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.zzc.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        com.google.android.gms.internal.common.zzc.zzc(parcelZza, z10);
        Parcel parcelZzB = zzB(3, parcelZza);
        int i10 = parcelZzB.readInt();
        parcelZzB.recycle();
        return i10;
    }

    public final int zzg(IObjectWrapper iObjectWrapper, String str, boolean z10) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.zzc.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        com.google.android.gms.internal.common.zzc.zzc(parcelZza, z10);
        Parcel parcelZzB = zzB(5, parcelZza);
        int i10 = parcelZzB.readInt();
        parcelZzB.recycle();
        return i10;
    }

    public final IObjectWrapper zzh(IObjectWrapper iObjectWrapper, String str, int i10) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.zzc.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(i10);
        return a.a(zzB(2, parcelZza));
    }

    public final IObjectWrapper zzi(IObjectWrapper iObjectWrapper, String str, int i10, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.zzc.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(i10);
        com.google.android.gms.internal.common.zzc.zzf(parcelZza, iObjectWrapper2);
        return a.a(zzB(8, parcelZza));
    }

    public final IObjectWrapper zzj(IObjectWrapper iObjectWrapper, String str, int i10) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.zzc.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(i10);
        return a.a(zzB(4, parcelZza));
    }

    public final IObjectWrapper zzk(IObjectWrapper iObjectWrapper, String str, boolean z10, long j10) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.zzc.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        com.google.android.gms.internal.common.zzc.zzc(parcelZza, z10);
        parcelZza.writeLong(j10);
        return a.a(zzB(7, parcelZza));
    }
}
