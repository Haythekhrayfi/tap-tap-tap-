package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbnx extends zzatq implements zzbnz {
    public zzbnx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final void zzA(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzboc zzbocVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, iObjectWrapper);
        zzats.zzd(parcelZza, zzlVar);
        parcelZza.writeString(str);
        zzats.zzf(parcelZza, zzbocVar);
        zzbh(28, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final void zzB(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final void zzC(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzboc zzbocVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, iObjectWrapper);
        zzats.zzd(parcelZza, zzlVar);
        parcelZza.writeString(str);
        zzats.zzf(parcelZza, zzbocVar);
        zzbh(32, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final void zzD(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, iObjectWrapper);
        zzbh(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final void zzE() throws RemoteException {
        zzbh(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final void zzF() throws RemoteException {
        zzbh(9, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final void zzG(boolean z10) throws RemoteException {
        Parcel parcelZza = zza();
        int i10 = zzats.zza;
        parcelZza.writeInt(z10 ? 1 : 0);
        zzbh(25, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final void zzH(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, iObjectWrapper);
        zzbh(39, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final void zzI() throws RemoteException {
        zzbh(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final void zzJ(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, iObjectWrapper);
        zzbh(37, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final void zzK(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, iObjectWrapper);
        zzbh(30, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final void zzL() throws RemoteException {
        zzbh(12, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final boolean zzM() throws RemoteException {
        Parcel parcelZzbg = zzbg(22, zza());
        boolean zZzg = zzats.zzg(parcelZzbg);
        parcelZzbg.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final boolean zzN() throws RemoteException {
        Parcel parcelZzbg = zzbg(13, zza());
        boolean zZzg = zzats.zzg(parcelZzbg);
        parcelZzbg.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final zzboh zzO() throws RemoteException {
        zzboh zzbohVar;
        Parcel parcelZzbg = zzbg(15, zza());
        IBinder strongBinder = parcelZzbg.readStrongBinder();
        if (strongBinder == null) {
            zzbohVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            zzbohVar = iInterfaceQueryLocalInterface instanceof zzboh ? (zzboh) iInterfaceQueryLocalInterface : new zzboh(strongBinder);
        }
        parcelZzbg.recycle();
        return zzbohVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final zzboi zzP() throws RemoteException {
        zzboi zzboiVar;
        Parcel parcelZzbg = zzbg(16, zza());
        IBinder strongBinder = parcelZzbg.readStrongBinder();
        if (strongBinder == null) {
            zzboiVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            zzboiVar = iInterfaceQueryLocalInterface instanceof zzboi ? (zzboi) iInterfaceQueryLocalInterface : new zzboi(strongBinder);
        }
        parcelZzbg.recycle();
        return zzboiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final Bundle zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final Bundle zzf() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final Bundle zzg() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final com.google.android.gms.ads.internal.client.zzdq zzh() throws RemoteException {
        Parcel parcelZzbg = zzbg(26, zza());
        com.google.android.gms.ads.internal.client.zzdq zzdqVarZzb = com.google.android.gms.ads.internal.client.zzdp.zzb(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return zzdqVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final zzbfl zzi() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final zzbof zzj() throws RemoteException {
        zzbof zzbodVar;
        Parcel parcelZzbg = zzbg(36, zza());
        IBinder strongBinder = parcelZzbg.readStrongBinder();
        if (strongBinder == null) {
            zzbodVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            zzbodVar = iInterfaceQueryLocalInterface instanceof zzbof ? (zzbof) iInterfaceQueryLocalInterface : new zzbod(strongBinder);
        }
        parcelZzbg.recycle();
        return zzbodVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final zzbol zzk() throws RemoteException {
        zzbol zzbojVar;
        Parcel parcelZzbg = zzbg(27, zza());
        IBinder strongBinder = parcelZzbg.readStrongBinder();
        if (strongBinder == null) {
            zzbojVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            zzbojVar = iInterfaceQueryLocalInterface instanceof zzbol ? (zzbol) iInterfaceQueryLocalInterface : new zzboj(strongBinder);
        }
        parcelZzbg.recycle();
        return zzbojVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final zzbqh zzl() throws RemoteException {
        Parcel parcelZzbg = zzbg(33, zza());
        zzbqh zzbqhVar = (zzbqh) zzats.zza(parcelZzbg, zzbqh.CREATOR);
        parcelZzbg.recycle();
        return zzbqhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final zzbqh zzm() throws RemoteException {
        Parcel parcelZzbg = zzbg(34, zza());
        zzbqh zzbqhVar = (zzbqh) zzats.zza(parcelZzbg, zzbqh.CREATOR);
        parcelZzbg.recycle();
        return zzbqhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final IObjectWrapper zzn() throws RemoteException {
        return com.google.android.gms.ads.internal.client.a.a(zzbg(2, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final void zzo() throws RemoteException {
        zzbh(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final void zzp(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbvf zzbvfVar, String str2) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, iObjectWrapper);
        zzats.zzd(parcelZza, zzlVar);
        parcelZza.writeString(null);
        zzats.zzf(parcelZza, zzbvfVar);
        parcelZza.writeString(str2);
        zzbh(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final void zzq(IObjectWrapper iObjectWrapper, zzbkj zzbkjVar, List list) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, iObjectWrapper);
        zzats.zzf(parcelZza, zzbkjVar);
        parcelZza.writeTypedList(list);
        zzbh(31, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final void zzr(IObjectWrapper iObjectWrapper, zzbvf zzbvfVar, List list) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, iObjectWrapper);
        zzats.zzf(parcelZza, zzbvfVar);
        parcelZza.writeStringList(list);
        zzbh(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final void zzs(com.google.android.gms.ads.internal.client.zzl zzlVar, String str) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzd(parcelZza, zzlVar);
        parcelZza.writeString(str);
        zzbh(11, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final void zzt(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzboc zzbocVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, iObjectWrapper);
        zzats.zzd(parcelZza, zzlVar);
        parcelZza.writeString(str);
        zzats.zzf(parcelZza, zzbocVar);
        zzbh(38, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final void zzu(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzboc zzbocVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final void zzv(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzboc zzbocVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, iObjectWrapper);
        zzats.zzd(parcelZza, zzqVar);
        zzats.zzd(parcelZza, zzlVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzats.zzf(parcelZza, zzbocVar);
        zzbh(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final void zzw(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzboc zzbocVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, iObjectWrapper);
        zzats.zzd(parcelZza, zzqVar);
        zzats.zzd(parcelZza, zzlVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzats.zzf(parcelZza, zzbocVar);
        zzbh(35, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final void zzx(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzboc zzbocVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final void zzy(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzboc zzbocVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, iObjectWrapper);
        zzats.zzd(parcelZza, zzlVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzats.zzf(parcelZza, zzbocVar);
        zzbh(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final void zzz(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzboc zzbocVar, zzbef zzbefVar, List list) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, iObjectWrapper);
        zzats.zzd(parcelZza, zzlVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzats.zzf(parcelZza, zzbocVar);
        zzats.zzd(parcelZza, zzbefVar);
        parcelZza.writeStringList(list);
        zzbh(14, parcelZza);
    }
}
