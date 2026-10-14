package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzatq;
import com.google.android.gms.internal.ads.zzats;
import com.google.android.gms.internal.ads.zzbkf;
import com.google.android.gms.internal.ads.zzbkm;
import com.google.android.gms.internal.ads.zzbnw;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzcm extends zzatq implements zzco {
    public zzcm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final float zze() throws RemoteException {
        Parcel parcelZzbg = zzbg(7, zza());
        float f10 = parcelZzbg.readFloat();
        parcelZzbg.recycle();
        return f10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final String zzf() throws RemoteException {
        Parcel parcelZzbg = zzbg(9, zza());
        String string = parcelZzbg.readString();
        parcelZzbg.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final List zzg() throws RemoteException {
        Parcel parcelZzbg = zzbg(13, zza());
        ArrayList arrayListCreateTypedArrayList = parcelZzbg.createTypedArrayList(zzbkf.CREATOR);
        parcelZzbg.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzh(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzbh(10, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzi() throws RemoteException {
        zzbh(15, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzj(boolean z10) throws RemoteException {
        Parcel parcelZza = zza();
        int i10 = zzats.zza;
        parcelZza.writeInt(z10 ? 1 : 0);
        zzbh(17, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzk() throws RemoteException {
        zzbh(1, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzl(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(null);
        zzats.zzf(parcelZza, iObjectWrapper);
        zzbh(6, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzm(zzda zzdaVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, zzdaVar);
        zzbh(16, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzn(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        zzbh(5, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzo(zzbnw zzbnwVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, zzbnwVar);
        zzbh(11, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzp(boolean z10) throws RemoteException {
        Parcel parcelZza = zza();
        int i10 = zzats.zza;
        parcelZza.writeInt(z10 ? 1 : 0);
        zzbh(4, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzq(float f10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f10);
        zzbh(2, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzr(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzs(zzbkm zzbkmVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, zzbkmVar);
        zzbh(12, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzt(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzbh(18, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzu(zzff zzffVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzd(parcelZza, zzffVar);
        zzbh(14, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final boolean zzv() throws RemoteException {
        Parcel parcelZzbg = zzbg(8, zza());
        boolean zZzg = zzats.zzg(parcelZzbg);
        parcelZzbg.recycle();
        return zZzg;
    }
}
