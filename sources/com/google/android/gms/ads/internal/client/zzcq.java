package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzatq;

/* JADX INFO: loaded from: classes.dex */
public final class zzcq extends zzatq implements zzcs {
    public zzcq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    public final void zze() throws RemoteException {
        zzbh(1, zza());
    }
}
