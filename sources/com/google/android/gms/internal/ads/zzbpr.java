package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbpr extends zzatq implements zzbpt {
    public zzbpr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final com.google.android.gms.ads.internal.client.zzdq zze() throws RemoteException {
        Parcel parcelZzbg = zzbg(5, zza());
        com.google.android.gms.ads.internal.client.zzdq zzdqVarZzb = com.google.android.gms.ads.internal.client.zzdp.zzb(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return zzdqVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final zzbqh zzf() throws RemoteException {
        Parcel parcelZzbg = zzbg(2, zza());
        zzbqh zzbqhVar = (zzbqh) zzats.zza(parcelZzbg, zzbqh.CREATOR);
        parcelZzbg.recycle();
        return zzbqhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final zzbqh zzg() throws RemoteException {
        Parcel parcelZzbg = zzbg(3, zza());
        zzbqh zzbqhVar = (zzbqh) zzats.zza(parcelZzbg, zzbqh.CREATOR);
        parcelZzbg.recycle();
        return zzbqhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final void zzh(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, com.google.android.gms.ads.internal.client.zzq zzqVar, zzbpw zzbpwVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        zzats.zzd(parcelZza, bundle);
        zzats.zzd(parcelZza, bundle2);
        zzats.zzd(parcelZza, zzqVar);
        zzats.zzf(parcelZza, zzbpwVar);
        zzbh(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final void zzi(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpe zzbpeVar, zzboc zzbocVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzats.zzd(parcelZza, zzlVar);
        zzats.zzf(parcelZza, iObjectWrapper);
        zzats.zzf(parcelZza, zzbpeVar);
        zzats.zzf(parcelZza, zzbocVar);
        zzbh(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final void zzj(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbph zzbphVar, zzboc zzbocVar, com.google.android.gms.ads.internal.client.zzq zzqVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzats.zzd(parcelZza, zzlVar);
        zzats.zzf(parcelZza, iObjectWrapper);
        zzats.zzf(parcelZza, zzbphVar);
        zzats.zzf(parcelZza, zzbocVar);
        zzats.zzd(parcelZza, zzqVar);
        zzbh(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final void zzk(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbph zzbphVar, zzboc zzbocVar, com.google.android.gms.ads.internal.client.zzq zzqVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzats.zzd(parcelZza, zzlVar);
        zzats.zzf(parcelZza, iObjectWrapper);
        zzats.zzf(parcelZza, zzbphVar);
        zzats.zzf(parcelZza, zzbocVar);
        zzats.zzd(parcelZza, zzqVar);
        zzbh(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final void zzl(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpk zzbpkVar, zzboc zzbocVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzats.zzd(parcelZza, zzlVar);
        zzats.zzf(parcelZza, iObjectWrapper);
        zzats.zzf(parcelZza, zzbpkVar);
        zzats.zzf(parcelZza, zzbocVar);
        zzbh(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final void zzm(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpn zzbpnVar, zzboc zzbocVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzats.zzd(parcelZza, zzlVar);
        zzats.zzf(parcelZza, iObjectWrapper);
        zzats.zzf(parcelZza, zzbpnVar);
        zzats.zzf(parcelZza, zzbocVar);
        zzbh(18, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final void zzn(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpn zzbpnVar, zzboc zzbocVar, zzbef zzbefVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzats.zzd(parcelZza, zzlVar);
        zzats.zzf(parcelZza, iObjectWrapper);
        zzats.zzf(parcelZza, zzbpnVar);
        zzats.zzf(parcelZza, zzbocVar);
        zzats.zzd(parcelZza, zzbefVar);
        zzbh(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final void zzo(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpq zzbpqVar, zzboc zzbocVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzats.zzd(parcelZza, zzlVar);
        zzats.zzf(parcelZza, iObjectWrapper);
        zzats.zzf(parcelZza, zzbpqVar);
        zzats.zzf(parcelZza, zzbocVar);
        zzbh(20, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final void zzp(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpq zzbpqVar, zzboc zzbocVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzats.zzd(parcelZza, zzlVar);
        zzats.zzf(parcelZza, iObjectWrapper);
        zzats.zzf(parcelZza, zzbpqVar);
        zzats.zzf(parcelZza, zzbocVar);
        zzbh(16, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final void zzq(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzbh(19, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final boolean zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, iObjectWrapper);
        Parcel parcelZzbg = zzbg(24, parcelZza);
        boolean zZzg = zzats.zzg(parcelZzbg);
        parcelZzbg.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final boolean zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, iObjectWrapper);
        Parcel parcelZzbg = zzbg(15, parcelZza);
        boolean zZzg = zzats.zzg(parcelZzbg);
        parcelZzbg.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final boolean zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, iObjectWrapper);
        Parcel parcelZzbg = zzbg(17, parcelZza);
        boolean zZzg = zzats.zzg(parcelZzbg);
        parcelZzbg.recycle();
        return zZzg;
    }
}
