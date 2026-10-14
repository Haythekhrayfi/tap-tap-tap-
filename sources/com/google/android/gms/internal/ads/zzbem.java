package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbem extends zzatq implements zzbeo {
    public zzbem(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.zzbeo
    public final float zze() throws RemoteException {
        Parcel parcelZzbg = zzbg(2, zza());
        float f10 = parcelZzbg.readFloat();
        parcelZzbg.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.zzbeo
    public final float zzf() throws RemoteException {
        Parcel parcelZzbg = zzbg(6, zza());
        float f10 = parcelZzbg.readFloat();
        parcelZzbg.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.zzbeo
    public final float zzg() throws RemoteException {
        Parcel parcelZzbg = zzbg(5, zza());
        float f10 = parcelZzbg.readFloat();
        parcelZzbg.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.zzbeo
    public final com.google.android.gms.ads.internal.client.zzdq zzh() throws RemoteException {
        Parcel parcelZzbg = zzbg(7, zza());
        com.google.android.gms.ads.internal.client.zzdq zzdqVarZzb = com.google.android.gms.ads.internal.client.zzdp.zzb(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return zzdqVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbeo
    public final IObjectWrapper zzi() throws RemoteException {
        return com.google.android.gms.ads.internal.client.a.a(zzbg(4, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbeo
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, iObjectWrapper);
        zzbh(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbeo
    public final boolean zzk() throws RemoteException {
        Parcel parcelZzbg = zzbg(10, zza());
        boolean zZzg = zzats.zzg(parcelZzbg);
        parcelZzbg.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbeo
    public final boolean zzl() throws RemoteException {
        Parcel parcelZzbg = zzbg(8, zza());
        boolean zZzg = zzats.zzg(parcelZzbg);
        parcelZzbg.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbeo
    public final void zzm(zzbfz zzbfzVar) throws RemoteException {
        throw null;
    }
}
