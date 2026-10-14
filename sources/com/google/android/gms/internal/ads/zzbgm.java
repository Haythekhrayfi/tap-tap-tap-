package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbgm extends zzatq implements zzbgo {
    public zzbgm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbgo
    public final void zzA() throws RemoteException {
        zzbh(28, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbgo
    public final void zzB(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzd(parcelZza, bundle);
        zzbh(17, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgo
    public final void zzC() throws RemoteException {
        zzbh(27, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbgo
    public final void zzD(com.google.android.gms.ads.internal.client.zzcs zzcsVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, zzcsVar);
        zzbh(26, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgo
    public final void zzE(com.google.android.gms.ads.internal.client.zzdg zzdgVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, zzdgVar);
        zzbh(32, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgo
    public final void zzF(zzbgl zzbglVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, zzbglVar);
        zzbh(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgo
    public final boolean zzG() throws RemoteException {
        Parcel parcelZzbg = zzbg(30, zza());
        boolean zZzg = zzats.zzg(parcelZzbg);
        parcelZzbg.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbgo
    public final boolean zzH() throws RemoteException {
        Parcel parcelZzbg = zzbg(24, zza());
        boolean zZzg = zzats.zzg(parcelZzbg);
        parcelZzbg.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbgo
    public final boolean zzI(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzd(parcelZza, bundle);
        Parcel parcelZzbg = zzbg(16, parcelZza);
        boolean zZzg = zzats.zzg(parcelZzbg);
        parcelZzbg.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbgo
    public final double zze() throws RemoteException {
        Parcel parcelZzbg = zzbg(8, zza());
        double d10 = parcelZzbg.readDouble();
        parcelZzbg.recycle();
        return d10;
    }

    @Override // com.google.android.gms.internal.ads.zzbgo
    public final Bundle zzf() throws RemoteException {
        Parcel parcelZzbg = zzbg(20, zza());
        Bundle bundle = (Bundle) zzats.zza(parcelZzbg, Bundle.CREATOR);
        parcelZzbg.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbgo
    public final com.google.android.gms.ads.internal.client.zzdn zzg() throws RemoteException {
        Parcel parcelZzbg = zzbg(31, zza());
        com.google.android.gms.ads.internal.client.zzdn zzdnVarZzb = com.google.android.gms.ads.internal.client.zzdm.zzb(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return zzdnVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbgo
    public final com.google.android.gms.ads.internal.client.zzdq zzh() throws RemoteException {
        Parcel parcelZzbg = zzbg(11, zza());
        com.google.android.gms.ads.internal.client.zzdq zzdqVarZzb = com.google.android.gms.ads.internal.client.zzdp.zzb(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return zzdqVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbgo
    public final zzbej zzi() throws RemoteException {
        zzbej zzbehVar;
        Parcel parcelZzbg = zzbg(14, zza());
        IBinder strongBinder = parcelZzbg.readStrongBinder();
        if (strongBinder == null) {
            zzbehVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            zzbehVar = iInterfaceQueryLocalInterface instanceof zzbej ? (zzbej) iInterfaceQueryLocalInterface : new zzbeh(strongBinder);
        }
        parcelZzbg.recycle();
        return zzbehVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgo
    public final zzbeo zzj() throws RemoteException {
        zzbeo zzbemVar;
        Parcel parcelZzbg = zzbg(29, zza());
        IBinder strongBinder = parcelZzbg.readStrongBinder();
        if (strongBinder == null) {
            zzbemVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            zzbemVar = iInterfaceQueryLocalInterface instanceof zzbeo ? (zzbeo) iInterfaceQueryLocalInterface : new zzbem(strongBinder);
        }
        parcelZzbg.recycle();
        return zzbemVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgo
    public final zzber zzk() throws RemoteException {
        zzber zzbepVar;
        Parcel parcelZzbg = zzbg(5, zza());
        IBinder strongBinder = parcelZzbg.readStrongBinder();
        if (strongBinder == null) {
            zzbepVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzbepVar = iInterfaceQueryLocalInterface instanceof zzber ? (zzber) iInterfaceQueryLocalInterface : new zzbep(strongBinder);
        }
        parcelZzbg.recycle();
        return zzbepVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgo
    public final IObjectWrapper zzl() throws RemoteException {
        return com.google.android.gms.ads.internal.client.a.a(zzbg(19, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbgo
    public final IObjectWrapper zzm() throws RemoteException {
        return com.google.android.gms.ads.internal.client.a.a(zzbg(18, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbgo
    public final String zzn() throws RemoteException {
        Parcel parcelZzbg = zzbg(7, zza());
        String string = parcelZzbg.readString();
        parcelZzbg.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbgo
    public final String zzo() throws RemoteException {
        Parcel parcelZzbg = zzbg(4, zza());
        String string = parcelZzbg.readString();
        parcelZzbg.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbgo
    public final String zzp() throws RemoteException {
        Parcel parcelZzbg = zzbg(6, zza());
        String string = parcelZzbg.readString();
        parcelZzbg.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbgo
    public final String zzq() throws RemoteException {
        Parcel parcelZzbg = zzbg(2, zza());
        String string = parcelZzbg.readString();
        parcelZzbg.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbgo
    public final String zzr() throws RemoteException {
        Parcel parcelZzbg = zzbg(12, zza());
        String string = parcelZzbg.readString();
        parcelZzbg.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbgo
    public final String zzs() throws RemoteException {
        Parcel parcelZzbg = zzbg(10, zza());
        String string = parcelZzbg.readString();
        parcelZzbg.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbgo
    public final String zzt() throws RemoteException {
        Parcel parcelZzbg = zzbg(9, zza());
        String string = parcelZzbg.readString();
        parcelZzbg.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbgo
    public final List zzu() throws RemoteException {
        Parcel parcelZzbg = zzbg(3, zza());
        ArrayList arrayListZzb = zzats.zzb(parcelZzbg);
        parcelZzbg.recycle();
        return arrayListZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbgo
    public final List zzv() throws RemoteException {
        Parcel parcelZzbg = zzbg(23, zza());
        ArrayList arrayListZzb = zzats.zzb(parcelZzbg);
        parcelZzbg.recycle();
        return arrayListZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbgo
    public final void zzw() throws RemoteException {
        zzbh(22, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbgo
    public final void zzx() throws RemoteException {
        zzbh(13, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbgo
    public final void zzy(com.google.android.gms.ads.internal.client.zzcw zzcwVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, zzcwVar);
        zzbh(25, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgo
    public final void zzz(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzd(parcelZza, bundle);
        zzbh(15, parcelZza);
    }
}
