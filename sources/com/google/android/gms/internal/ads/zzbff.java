package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbff extends zzatr implements zzbfg {
    public zzbff() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    @Override // com.google.android.gms.internal.ads.zzatr
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        IInterface iInterfaceZzh;
        String strZzk;
        switch (i10) {
            case 2:
                iInterfaceZzh = zzh();
                parcel2.writeNoException();
                zzats.zzf(parcel2, iInterfaceZzh);
                return true;
            case 3:
                strZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeString(strZzk);
                return true;
            case 4:
                List listZzo = zzo();
                parcel2.writeNoException();
                parcel2.writeList(listZzo);
                return true;
            case 5:
                strZzk = zzi();
                parcel2.writeNoException();
                parcel2.writeString(strZzk);
                return true;
            case 6:
                iInterfaceZzh = zzf();
                parcel2.writeNoException();
                zzats.zzf(parcel2, iInterfaceZzh);
                return true;
            case 7:
                strZzk = zzj();
                parcel2.writeNoException();
                parcel2.writeString(strZzk);
                return true;
            case 8:
                double dZzb = zzb();
                parcel2.writeNoException();
                parcel2.writeDouble(dZzb);
                return true;
            case 9:
                strZzk = zzn();
                parcel2.writeNoException();
                parcel2.writeString(strZzk);
                return true;
            case 10:
                strZzk = zzm();
                parcel2.writeNoException();
                parcel2.writeString(strZzk);
                return true;
            case 11:
                Bundle bundleZzc = zzc();
                parcel2.writeNoException();
                zzats.zze(parcel2, bundleZzc);
                return true;
            case 12:
                zzp();
                parcel2.writeNoException();
                return true;
            case 13:
                iInterfaceZzh = zzd();
                parcel2.writeNoException();
                zzats.zzf(parcel2, iInterfaceZzh);
                return true;
            case 14:
                Bundle bundle = (Bundle) zzats.zza(parcel, Bundle.CREATOR);
                zzats.zzc(parcel);
                zzq(bundle);
                parcel2.writeNoException();
                return true;
            case 15:
                Bundle bundle2 = (Bundle) zzats.zza(parcel, Bundle.CREATOR);
                zzats.zzc(parcel);
                boolean zZzs = zzs(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zZzs ? 1 : 0);
                return true;
            case 16:
                Bundle bundle3 = (Bundle) zzats.zza(parcel, Bundle.CREATOR);
                zzats.zzc(parcel);
                zzr(bundle3);
                parcel2.writeNoException();
                return true;
            case 17:
                iInterfaceZzh = zze();
                parcel2.writeNoException();
                zzats.zzf(parcel2, iInterfaceZzh);
                return true;
            case 18:
                iInterfaceZzh = zzg();
                parcel2.writeNoException();
                zzats.zzf(parcel2, iInterfaceZzh);
                return true;
            case 19:
                strZzk = zzl();
                parcel2.writeNoException();
                parcel2.writeString(strZzk);
                return true;
            default:
                return false;
        }
    }
}
