package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbok extends zzatr implements zzbol {
    public zzbok() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    public static zzbol zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        return iInterfaceQueryLocalInterface instanceof zzbol ? (zzbol) iInterfaceQueryLocalInterface : new zzboj(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzatr
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        String strZzs;
        IInterface iInterfaceZzl;
        int iZzB;
        float fZzf;
        switch (i10) {
            case 2:
                strZzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            case 3:
                List listZzv = zzv();
                parcel2.writeNoException();
                parcel2.writeList(listZzv);
                return true;
            case 4:
                strZzs = zzq();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            case 5:
                iInterfaceZzl = zzl();
                parcel2.writeNoException();
                zzats.zzf(parcel2, iInterfaceZzl);
                return true;
            case 6:
                strZzs = zzr();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            case 7:
                strZzs = zzp();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            case 8:
                double dZze = zze();
                parcel2.writeNoException();
                parcel2.writeDouble(dZze);
                return true;
            case 9:
                strZzs = zzu();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            case 10:
                strZzs = zzt();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            case 11:
                iInterfaceZzl = zzj();
                parcel2.writeNoException();
                zzats.zzf(parcel2, iInterfaceZzl);
                return true;
            case 12:
                parcel2.writeNoException();
                iInterfaceZzl = null;
                zzats.zzf(parcel2, iInterfaceZzl);
                return true;
            case 13:
                iInterfaceZzl = zzm();
                parcel2.writeNoException();
                zzats.zzf(parcel2, iInterfaceZzl);
                return true;
            case 14:
                iInterfaceZzl = zzn();
                parcel2.writeNoException();
                zzats.zzf(parcel2, iInterfaceZzl);
                return true;
            case 15:
                iInterfaceZzl = zzo();
                parcel2.writeNoException();
                zzats.zzf(parcel2, iInterfaceZzl);
                return true;
            case 16:
                Bundle bundleZzi = zzi();
                parcel2.writeNoException();
                zzats.zze(parcel2, bundleZzi);
                return true;
            case 17:
                iZzB = zzB();
                parcel2.writeNoException();
                int i12 = zzats.zza;
                parcel2.writeInt(iZzB);
                return true;
            case 18:
                iZzB = zzA();
                parcel2.writeNoException();
                int i13 = zzats.zza;
                parcel2.writeInt(iZzB);
                return true;
            case 19:
                zzx();
                parcel2.writeNoException();
                return true;
            case 20:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzats.zzc(parcel);
                zzw(iObjectWrapperAsInterface);
                parcel2.writeNoException();
                return true;
            case 21:
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzats.zzc(parcel);
                zzy(iObjectWrapperAsInterface2, iObjectWrapperAsInterface3, iObjectWrapperAsInterface4);
                parcel2.writeNoException();
                return true;
            case 22:
                IObjectWrapper iObjectWrapperAsInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzats.zzc(parcel);
                zzz(iObjectWrapperAsInterface5);
                parcel2.writeNoException();
                return true;
            case 23:
                fZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzf);
                return true;
            case 24:
                fZzf = zzh();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzf);
                return true;
            case 25:
                fZzf = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzf);
                return true;
            default:
                return false;
        }
    }
}
