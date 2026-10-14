package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbfk extends zzatr implements zzbfl {
    public zzbfk() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static zzbfl zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return iInterfaceQueryLocalInterface instanceof zzbfl ? (zzbfl) iInterfaceQueryLocalInterface : new zzbfj(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzatr
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        String strZzj;
        IInterface iInterfaceZzg;
        boolean zZzq;
        int i12;
        boolean zZzs;
        switch (i10) {
            case 1:
                String string = parcel.readString();
                zzats.zzc(parcel);
                strZzj = zzj(string);
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 2:
                String string2 = parcel.readString();
                zzats.zzc(parcel);
                iInterfaceZzg = zzg(string2);
                parcel2.writeNoException();
                zzats.zzf(parcel2, iInterfaceZzg);
                return true;
            case 3:
                List<String> listZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeStringList(listZzk);
                return true;
            case 4:
                strZzj = zzi();
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 5:
                String string3 = parcel.readString();
                zzats.zzc(parcel);
                zzn(string3);
                parcel2.writeNoException();
                return true;
            case 6:
                zzo();
                parcel2.writeNoException();
                return true;
            case 7:
                iInterfaceZzg = zze();
                parcel2.writeNoException();
                zzats.zzf(parcel2, iInterfaceZzg);
                return true;
            case 8:
                zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                iInterfaceZzg = zzh();
                parcel2.writeNoException();
                zzats.zzf(parcel2, iInterfaceZzg);
                return true;
            case 10:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzats.zzc(parcel);
                zZzs = zzs(iObjectWrapperAsInterface);
                parcel2.writeNoException();
                i12 = zZzs;
                parcel2.writeInt(i12);
                return true;
            case 11:
                parcel2.writeNoException();
                iInterfaceZzg = null;
                zzats.zzf(parcel2, iInterfaceZzg);
                return true;
            case 12:
                zZzq = zzq();
                parcel2.writeNoException();
                int i13 = zzats.zza;
                i12 = zZzq;
                parcel2.writeInt(i12);
                return true;
            case 13:
                zZzq = zzt();
                parcel2.writeNoException();
                int i14 = zzats.zza;
                i12 = zZzq;
                parcel2.writeInt(i12);
                return true;
            case 14:
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzats.zzc(parcel);
                zzp(iObjectWrapperAsInterface2);
                parcel2.writeNoException();
                return true;
            case 15:
                zzm();
                parcel2.writeNoException();
                return true;
            case 16:
                iInterfaceZzg = zzf();
                parcel2.writeNoException();
                zzats.zzf(parcel2, iInterfaceZzg);
                return true;
            case 17:
                IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzats.zzc(parcel);
                zZzs = zzr(iObjectWrapperAsInterface3);
                parcel2.writeNoException();
                i12 = zZzs;
                parcel2.writeInt(i12);
                return true;
            default:
                return false;
        }
    }
}
