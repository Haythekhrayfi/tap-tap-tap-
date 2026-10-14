package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzatq;
import com.google.android.gms.internal.ads.zzats;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzbfa;
import com.google.android.gms.internal.ads.zzbfb;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbji;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzbnw;
import com.google.android.gms.internal.ads.zzbrl;
import com.google.android.gms.internal.ads.zzbrm;
import com.google.android.gms.internal.ads.zzbrs;
import com.google.android.gms.internal.ads.zzbrt;
import com.google.android.gms.internal.ads.zzbux;
import com.google.android.gms.internal.ads.zzbvm;
import com.google.android.gms.internal.ads.zzbvn;
import com.google.android.gms.internal.ads.zzbyh;
import com.google.android.gms.internal.ads.zzbyi;

/* JADX INFO: loaded from: classes.dex */
public final class zzcc extends zzatq implements zzce {
    public zzcc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbq zzb(IObjectWrapper iObjectWrapper, String str, zzbnw zzbnwVar, int i10) throws RemoteException {
        zzbq zzboVar;
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        zzats.zzf(parcelZza, zzbnwVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzbg = zzbg(3, parcelZza);
        IBinder strongBinder = parcelZzbg.readStrongBinder();
        if (strongBinder == null) {
            zzboVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            zzboVar = iInterfaceQueryLocalInterface instanceof zzbq ? (zzbq) iInterfaceQueryLocalInterface : new zzbo(strongBinder);
        }
        parcelZzbg.recycle();
        return zzboVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzc(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbnw zzbnwVar, int i10) throws RemoteException {
        zzbu zzbsVar;
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, iObjectWrapper);
        zzats.zzd(parcelZza, zzqVar);
        parcelZza.writeString(str);
        zzats.zzf(parcelZza, zzbnwVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzbg = zzbg(13, parcelZza);
        IBinder strongBinder = parcelZzbg.readStrongBinder();
        if (strongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(strongBinder);
        }
        parcelZzbg.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzd(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbnw zzbnwVar, int i10) throws RemoteException {
        zzbu zzbsVar;
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, iObjectWrapper);
        zzats.zzd(parcelZza, zzqVar);
        parcelZza.writeString(str);
        zzats.zzf(parcelZza, zzbnwVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzbg = zzbg(1, parcelZza);
        IBinder strongBinder = parcelZzbg.readStrongBinder();
        if (strongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(strongBinder);
        }
        parcelZzbg.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zze(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbnw zzbnwVar, int i10) throws RemoteException {
        zzbu zzbsVar;
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, iObjectWrapper);
        zzats.zzd(parcelZza, zzqVar);
        parcelZza.writeString(str);
        zzats.zzf(parcelZza, zzbnwVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzbg = zzbg(2, parcelZza);
        IBinder strongBinder = parcelZzbg.readStrongBinder();
        if (strongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(strongBinder);
        }
        parcelZzbg.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzf(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, int i10) throws RemoteException {
        zzbu zzbsVar;
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, iObjectWrapper);
        zzats.zzd(parcelZza, zzqVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzbg = zzbg(10, parcelZza);
        IBinder strongBinder = parcelZzbg.readStrongBinder();
        if (strongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(strongBinder);
        }
        parcelZzbg.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzco zzg(IObjectWrapper iObjectWrapper, int i10) throws RemoteException {
        zzco zzcmVar;
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzbg = zzbg(9, parcelZza);
        IBinder strongBinder = parcelZzbg.readStrongBinder();
        if (strongBinder == null) {
            zzcmVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            zzcmVar = iInterfaceQueryLocalInterface instanceof zzco ? (zzco) iInterfaceQueryLocalInterface : new zzcm(strongBinder);
        }
        parcelZzbg.recycle();
        return zzcmVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzdj zzh(IObjectWrapper iObjectWrapper, zzbnw zzbnwVar, int i10) throws RemoteException {
        zzdj zzdhVar;
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, iObjectWrapper);
        zzats.zzf(parcelZza, zzbnwVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzbg = zzbg(17, parcelZza);
        IBinder strongBinder = parcelZzbg.readStrongBinder();
        if (strongBinder == null) {
            zzdhVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            zzdhVar = iInterfaceQueryLocalInterface instanceof zzdj ? (zzdj) iInterfaceQueryLocalInterface : new zzdh(strongBinder);
        }
        parcelZzbg.recycle();
        return zzdhVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbev zzi(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, iObjectWrapper);
        zzats.zzf(parcelZza, iObjectWrapper2);
        Parcel parcelZzbg = zzbg(5, parcelZza);
        zzbev zzbevVarZzbx = zzbeu.zzbx(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return zzbevVarZzbx;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbfb zzj(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, iObjectWrapper);
        zzats.zzf(parcelZza, iObjectWrapper2);
        zzats.zzf(parcelZza, iObjectWrapper3);
        Parcel parcelZzbg = zzbg(11, parcelZza);
        zzbfb zzbfbVarZze = zzbfa.zze(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return zzbfbVarZze;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbjj zzk(IObjectWrapper iObjectWrapper, zzbnw zzbnwVar, int i10, zzbjg zzbjgVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, iObjectWrapper);
        zzats.zzf(parcelZza, zzbnwVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        zzats.zzf(parcelZza, zzbjgVar);
        Parcel parcelZzbg = zzbg(16, parcelZza);
        zzbjj zzbjjVarZzb = zzbji.zzb(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return zzbjjVarZzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbrm zzl(IObjectWrapper iObjectWrapper, zzbnw zzbnwVar, int i10) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, iObjectWrapper);
        zzats.zzf(parcelZza, zzbnwVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzbg = zzbg(15, parcelZza);
        zzbrm zzbrmVarZzb = zzbrl.zzb(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return zzbrmVarZzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbrt zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, iObjectWrapper);
        Parcel parcelZzbg = zzbg(8, parcelZza);
        zzbrt zzbrtVarZzH = zzbrs.zzH(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return zzbrtVarZzH;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbux zzn(IObjectWrapper iObjectWrapper, zzbnw zzbnwVar, int i10) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbvn zzo(IObjectWrapper iObjectWrapper, String str, zzbnw zzbnwVar, int i10) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        zzats.zzf(parcelZza, zzbnwVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzbg = zzbg(12, parcelZza);
        zzbvn zzbvnVarZzq = zzbvm.zzq(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return zzbvnVarZzq;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbyi zzp(IObjectWrapper iObjectWrapper, zzbnw zzbnwVar, int i10) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, iObjectWrapper);
        zzats.zzf(parcelZza, zzbnwVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzbg = zzbg(14, parcelZza);
        zzbyi zzbyiVarZzb = zzbyh.zzb(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return zzbyiVarZzb;
    }
}
