package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public interface RemoteCall<T, U> {
    @KeepForSdk
    void accept(T t10, U u10) throws RemoteException;
}
