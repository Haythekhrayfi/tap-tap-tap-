package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzboj extends zzatq implements zzbol {
    public zzboj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final boolean zzA() throws RemoteException {
        Parcel parcelZzbg = zzbg(18, zza());
        boolean zZzg = zzats.zzg(parcelZzbg);
        parcelZzbg.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final boolean zzB() throws RemoteException {
        Parcel parcelZzbg = zzbg(17, zza());
        boolean zZzg = zzats.zzg(parcelZzbg);
        parcelZzbg.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final double zze() throws RemoteException {
        Parcel parcelZzbg = zzbg(8, zza());
        double d10 = parcelZzbg.readDouble();
        parcelZzbg.recycle();
        return d10;
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final float zzf() throws RemoteException {
        Parcel parcelZzbg = zzbg(23, zza());
        float f10 = parcelZzbg.readFloat();
        parcelZzbg.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final float zzg() throws RemoteException {
        Parcel parcelZzbg = zzbg(25, zza());
        float f10 = parcelZzbg.readFloat();
        parcelZzbg.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final float zzh() throws RemoteException {
        Parcel parcelZzbg = zzbg(24, zza());
        float f10 = parcelZzbg.readFloat();
        parcelZzbg.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final Bundle zzi() throws RemoteException {
        Parcel parcelZzbg = zzbg(16, zza());
        Bundle bundle = (Bundle) zzats.zza(parcelZzbg, Bundle.CREATOR);
        parcelZzbg.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final com.google.android.gms.ads.internal.client.zzdq zzj() throws RemoteException {
        Parcel parcelZzbg = zzbg(11, zza());
        com.google.android.gms.ads.internal.client.zzdq zzdqVarZzb = com.google.android.gms.ads.internal.client.zzdp.zzb(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return zzdqVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final zzbej zzk() throws RemoteException {
        Parcel parcelZzbg = zzbg(12, zza());
        zzbej zzbejVarZzj = zzbei.zzj(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return zzbejVarZzj;
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final zzber zzl() throws RemoteException {
        Parcel parcelZzbg = zzbg(5, zza());
        zzber zzberVarZzg = zzbeq.zzg(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return zzberVarZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final IObjectWrapper zzm() throws RemoteException {
        return com.google.android.gms.ads.internal.client.a.a(zzbg(13, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final IObjectWrapper zzn() throws RemoteException {
        return com.google.android.gms.ads.internal.client.a.a(zzbg(14, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final IObjectWrapper zzo() throws RemoteException {
        return com.google.android.gms.ads.internal.client.a.a(zzbg(15, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final String zzp() throws RemoteException {
        Parcel parcelZzbg = zzbg(7, zza());
        String string = parcelZzbg.readString();
        parcelZzbg.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final String zzq() throws RemoteException {
        Parcel parcelZzbg = zzbg(4, zza());
        String string = parcelZzbg.readString();
        parcelZzbg.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final String zzr() throws RemoteException {
        Parcel parcelZzbg = zzbg(6, zza());
        String string = parcelZzbg.readString();
        parcelZzbg.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final String zzs() throws RemoteException {
        Parcel parcelZzbg = zzbg(2, zza());
        String string = parcelZzbg.readString();
        parcelZzbg.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final String zzt() throws RemoteException {
        Parcel parcelZzbg = zzbg(10, zza());
        String string = parcelZzbg.readString();
        parcelZzbg.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final String zzu() throws RemoteException {
        Parcel parcelZzbg = zzbg(9, zza());
        String string = parcelZzbg.readString();
        parcelZzbg.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final List zzv() throws RemoteException {
        Parcel parcelZzbg = zzbg(3, zza());
        ArrayList arrayListZzb = zzats.zzb(parcelZzbg);
        parcelZzbg.recycle();
        return arrayListZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzw(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, iObjectWrapper);
        zzbh(20, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzx() throws RemoteException {
        zzbh(19, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzy(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, iObjectWrapper);
        zzats.zzf(parcelZza, iObjectWrapper2);
        zzats.zzf(parcelZza, iObjectWrapper3);
        zzbh(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzz(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, iObjectWrapper);
        zzbh(22, parcelZza);
    }
}
