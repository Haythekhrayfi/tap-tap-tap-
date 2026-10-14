package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbgn extends zzatr implements zzbgo {
    public zzbgn() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzatr
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        String strZzq;
        List listZzu;
        IInterface iInterfaceZzk;
        zzbgl zzbgjVar;
        int i12;
        boolean zZzH;
        switch (i10) {
            case 2:
                strZzq = zzq();
                parcel2.writeNoException();
                parcel2.writeString(strZzq);
                return true;
            case 3:
                listZzu = zzu();
                parcel2.writeNoException();
                parcel2.writeList(listZzu);
                return true;
            case 4:
                strZzq = zzo();
                parcel2.writeNoException();
                parcel2.writeString(strZzq);
                return true;
            case 5:
                iInterfaceZzk = zzk();
                parcel2.writeNoException();
                zzats.zzf(parcel2, iInterfaceZzk);
                return true;
            case 6:
                strZzq = zzp();
                parcel2.writeNoException();
                parcel2.writeString(strZzq);
                return true;
            case 7:
                strZzq = zzn();
                parcel2.writeNoException();
                parcel2.writeString(strZzq);
                return true;
            case 8:
                double dZze = zze();
                parcel2.writeNoException();
                parcel2.writeDouble(dZze);
                return true;
            case 9:
                strZzq = zzt();
                parcel2.writeNoException();
                parcel2.writeString(strZzq);
                return true;
            case 10:
                strZzq = zzs();
                parcel2.writeNoException();
                parcel2.writeString(strZzq);
                return true;
            case 11:
                iInterfaceZzk = zzh();
                parcel2.writeNoException();
                zzats.zzf(parcel2, iInterfaceZzk);
                return true;
            case 12:
                strZzq = zzr();
                parcel2.writeNoException();
                parcel2.writeString(strZzq);
                return true;
            case 13:
                zzx();
                parcel2.writeNoException();
                return true;
            case 14:
                iInterfaceZzk = zzi();
                parcel2.writeNoException();
                zzats.zzf(parcel2, iInterfaceZzk);
                return true;
            case 15:
                Bundle bundle = (Bundle) zzats.zza(parcel, Bundle.CREATOR);
                zzats.zzc(parcel);
                zzz(bundle);
                parcel2.writeNoException();
                return true;
            case 16:
                Bundle bundle2 = (Bundle) zzats.zza(parcel, Bundle.CREATOR);
                zzats.zzc(parcel);
                boolean zZzI = zzI(bundle2);
                parcel2.writeNoException();
                i12 = zZzI;
                parcel2.writeInt(i12);
                return true;
            case 17:
                Bundle bundle3 = (Bundle) zzats.zza(parcel, Bundle.CREATOR);
                zzats.zzc(parcel);
                zzB(bundle3);
                parcel2.writeNoException();
                return true;
            case 18:
                iInterfaceZzk = zzm();
                parcel2.writeNoException();
                zzats.zzf(parcel2, iInterfaceZzk);
                return true;
            case 19:
                iInterfaceZzk = zzl();
                parcel2.writeNoException();
                zzats.zzf(parcel2, iInterfaceZzk);
                return true;
            case 20:
                Bundle bundleZzf = zzf();
                parcel2.writeNoException();
                zzats.zze(parcel2, bundleZzf);
                return true;
            case 21:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzbgjVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    zzbgjVar = iInterfaceQueryLocalInterface instanceof zzbgl ? (zzbgl) iInterfaceQueryLocalInterface : new zzbgj(strongBinder);
                }
                zzats.zzc(parcel);
                zzF(zzbgjVar);
                parcel2.writeNoException();
                return true;
            case 22:
                zzw();
                parcel2.writeNoException();
                return true;
            case 23:
                listZzu = zzv();
                parcel2.writeNoException();
                parcel2.writeList(listZzu);
                return true;
            case 24:
                zZzH = zzH();
                parcel2.writeNoException();
                int i13 = zzats.zza;
                i12 = zZzH;
                parcel2.writeInt(i12);
                return true;
            case 25:
                com.google.android.gms.ads.internal.client.zzcw zzcwVarZzb = com.google.android.gms.ads.internal.client.zzcv.zzb(parcel.readStrongBinder());
                zzats.zzc(parcel);
                zzy(zzcwVarZzb);
                parcel2.writeNoException();
                return true;
            case 26:
                com.google.android.gms.ads.internal.client.zzcs zzcsVarZzb = com.google.android.gms.ads.internal.client.zzcr.zzb(parcel.readStrongBinder());
                zzats.zzc(parcel);
                zzD(zzcsVarZzb);
                parcel2.writeNoException();
                return true;
            case 27:
                zzC();
                parcel2.writeNoException();
                return true;
            case 28:
                zzA();
                parcel2.writeNoException();
                return true;
            case 29:
                iInterfaceZzk = zzj();
                parcel2.writeNoException();
                zzats.zzf(parcel2, iInterfaceZzk);
                return true;
            case 30:
                zZzH = zzG();
                parcel2.writeNoException();
                int i14 = zzats.zza;
                i12 = zZzH;
                parcel2.writeInt(i12);
                return true;
            case 31:
                iInterfaceZzk = zzg();
                parcel2.writeNoException();
                zzats.zzf(parcel2, iInterfaceZzk);
                return true;
            case 32:
                com.google.android.gms.ads.internal.client.zzdg zzdgVarZzb = com.google.android.gms.ads.internal.client.zzdf.zzb(parcel.readStrongBinder());
                zzats.zzc(parcel);
                zzE(zzdgVarZzb);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
