package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzatq;
import com.google.android.gms.internal.ads.zzats;

/* JADX INFO: loaded from: classes.dex */
public final class zzdr extends zzatq implements zzdt {
    public zzdr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zze() throws RemoteException {
        zzbh(4, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zzf(boolean z10) throws RemoteException {
        Parcel parcelZza = zza();
        int i10 = zzats.zza;
        parcelZza.writeInt(z10 ? 1 : 0);
        zzbh(5, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zzg() throws RemoteException {
        zzbh(3, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zzh() throws RemoteException {
        zzbh(2, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zzi() throws RemoteException {
        zzbh(1, zza());
    }
}
