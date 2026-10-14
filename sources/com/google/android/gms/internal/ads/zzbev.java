package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public interface zzbev extends IInterface {
    IObjectWrapper zzb(String str) throws RemoteException;

    void zzbs(String str, IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzbt(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzbu(zzbeo zzbeoVar) throws RemoteException;

    void zzbv(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzbw(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzc() throws RemoteException;

    void zzd(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zze(IObjectWrapper iObjectWrapper, int i10) throws RemoteException;
}
