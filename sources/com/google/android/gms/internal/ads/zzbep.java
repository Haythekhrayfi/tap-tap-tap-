package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbep extends zzatq implements zzber {
    public zzbep(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final double zzb() throws RemoteException {
        Parcel parcelZzbg = zzbg(3, zza());
        double d10 = parcelZzbg.readDouble();
        parcelZzbg.recycle();
        return d10;
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final int zzc() throws RemoteException {
        Parcel parcelZzbg = zzbg(5, zza());
        int i10 = parcelZzbg.readInt();
        parcelZzbg.recycle();
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final int zzd() throws RemoteException {
        Parcel parcelZzbg = zzbg(4, zza());
        int i10 = parcelZzbg.readInt();
        parcelZzbg.recycle();
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final Uri zze() throws RemoteException {
        Parcel parcelZzbg = zzbg(2, zza());
        Uri uri = (Uri) zzats.zza(parcelZzbg, Uri.CREATOR);
        parcelZzbg.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final IObjectWrapper zzf() throws RemoteException {
        return com.google.android.gms.ads.internal.client.a.a(zzbg(1, zza()));
    }
}
