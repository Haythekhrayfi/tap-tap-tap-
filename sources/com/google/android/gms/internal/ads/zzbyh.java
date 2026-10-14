package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbyh extends zzatr implements zzbyi {
    public zzbyh() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static zzbyi zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return iInterfaceQueryLocalInterface instanceof zzbyi ? (zzbyi) iInterfaceQueryLocalInterface : new zzbyg(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzatr
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzbyf zzbydVar = null;
        switch (i10) {
            case 1:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbym zzbymVar = (zzbym) zzats.zza(parcel, zzbym.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    zzbydVar = iInterfaceQueryLocalInterface instanceof zzbyf ? (zzbyf) iInterfaceQueryLocalInterface : new zzbyd(strongBinder);
                }
                zzats.zzc(parcel);
                zze(iObjectWrapperAsInterface, zzbymVar, zzbydVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzats.zzc(parcel);
                zzj(iObjectWrapperAsInterface2);
                parcel2.writeNoException();
                return true;
            case 3:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            case 4:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzats.zzc(parcel);
                parcel2.writeNoException();
                zzats.zzf(parcel2, null);
                return true;
            case 5:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbsi zzbsiVarZzb = zzbsh.zzb(parcel.readStrongBinder());
                zzats.zzc(parcel);
                zzl(arrayListCreateTypedArrayList, iObjectWrapperAsInterface3, zzbsiVarZzb);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbsi zzbsiVarZzb2 = zzbsh.zzb(parcel.readStrongBinder());
                zzats.zzc(parcel);
                zzk(arrayListCreateTypedArrayList2, iObjectWrapperAsInterface4, zzbsiVarZzb2);
                parcel2.writeNoException();
                return true;
            case 7:
                zzbsr zzbsrVar = (zzbsr) zzats.zza(parcel, zzbsr.CREATOR);
                zzats.zzc(parcel);
                zzf(zzbsrVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IObjectWrapper iObjectWrapperAsInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzats.zzc(parcel);
                zzi(iObjectWrapperAsInterface5);
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList arrayListCreateTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapperAsInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbsi zzbsiVarZzb3 = zzbsh.zzb(parcel.readStrongBinder());
                zzats.zzc(parcel);
                zzh(arrayListCreateTypedArrayList3, iObjectWrapperAsInterface6, zzbsiVarZzb3);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList arrayListCreateTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapperAsInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbsi zzbsiVarZzb4 = zzbsh.zzb(parcel.readStrongBinder());
                zzats.zzc(parcel);
                zzg(arrayListCreateTypedArrayList4, iObjectWrapperAsInterface7, zzbsiVarZzb4);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
