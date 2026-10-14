package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbfh extends zzatr implements zzbfi {
    public zzbfh() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    @Override // com.google.android.gms.internal.ads.zzatr
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        IInterface iInterfaceZzg;
        String strZzk;
        switch (i10) {
            case 2:
                iInterfaceZzg = zzg();
                parcel2.writeNoException();
                zzats.zzf(parcel2, iInterfaceZzg);
                return true;
            case 3:
                strZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeString(strZzk);
                return true;
            case 4:
                List listZzm = zzm();
                parcel2.writeNoException();
                parcel2.writeList(listZzm);
                return true;
            case 5:
                strZzk = zzi();
                parcel2.writeNoException();
                parcel2.writeString(strZzk);
                return true;
            case 6:
                iInterfaceZzg = zze();
                parcel2.writeNoException();
                zzats.zzf(parcel2, iInterfaceZzg);
                return true;
            case 7:
                strZzk = zzj();
                parcel2.writeNoException();
                parcel2.writeString(strZzk);
                return true;
            case 8:
                strZzk = zzh();
                parcel2.writeNoException();
                parcel2.writeString(strZzk);
                return true;
            case 9:
                Bundle bundleZzb = zzb();
                parcel2.writeNoException();
                zzats.zze(parcel2, bundleZzb);
                return true;
            case 10:
                zzn();
                parcel2.writeNoException();
                return true;
            case 11:
                iInterfaceZzg = zzc();
                parcel2.writeNoException();
                zzats.zzf(parcel2, iInterfaceZzg);
                return true;
            case 12:
                Bundle bundle = (Bundle) zzats.zza(parcel, Bundle.CREATOR);
                zzats.zzc(parcel);
                zzo(bundle);
                parcel2.writeNoException();
                return true;
            case 13:
                Bundle bundle2 = (Bundle) zzats.zza(parcel, Bundle.CREATOR);
                zzats.zzc(parcel);
                boolean zZzq = zzq(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zZzq ? 1 : 0);
                return true;
            case 14:
                Bundle bundle3 = (Bundle) zzats.zza(parcel, Bundle.CREATOR);
                zzats.zzc(parcel);
                zzp(bundle3);
                parcel2.writeNoException();
                return true;
            case 15:
                iInterfaceZzg = zzd();
                parcel2.writeNoException();
                zzats.zzf(parcel2, iInterfaceZzg);
                return true;
            case 16:
                iInterfaceZzg = zzf();
                parcel2.writeNoException();
                zzats.zzf(parcel2, iInterfaceZzg);
                return true;
            case 17:
                strZzk = zzl();
                parcel2.writeNoException();
                parcel2.writeString(strZzk);
                return true;
            default:
                return false;
        }
    }
}
