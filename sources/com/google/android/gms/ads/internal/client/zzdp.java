package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzatr;
import com.google.android.gms.internal.ads.zzats;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzdp extends zzatr implements zzdq {
    public zzdp() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static zzdq zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return iInterfaceQueryLocalInterface instanceof zzdq ? (zzdq) iInterfaceQueryLocalInterface : new zzdo(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzatr
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        float fZzg;
        zzdt zzdrVar;
        int i12;
        boolean zZzq;
        switch (i10) {
            case 1:
                zzl();
                parcel2.writeNoException();
                return true;
            case 2:
                zzk();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZzg = zzats.zzg(parcel);
                zzats.zzc(parcel);
                zzj(zZzg);
                parcel2.writeNoException();
                return true;
            case 4:
                zZzq = zzq();
                parcel2.writeNoException();
                int i13 = zzats.zza;
                i12 = zZzq;
                parcel2.writeInt(i12);
                return true;
            case 5:
                int iZzh = zzh();
                parcel2.writeNoException();
                i12 = iZzh;
                parcel2.writeInt(i12);
                return true;
            case 6:
                fZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzg);
                return true;
            case 7:
                fZzg = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzg);
                return true;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzdrVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    zzdrVar = iInterfaceQueryLocalInterface instanceof zzdt ? (zzdt) iInterfaceQueryLocalInterface : new zzdr(strongBinder);
                }
                zzats.zzc(parcel);
                zzm(zzdrVar);
                parcel2.writeNoException();
                return true;
            case 9:
                fZzg = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzg);
                return true;
            case 10:
                zZzq = zzp();
                parcel2.writeNoException();
                int i14 = zzats.zza;
                i12 = zZzq;
                parcel2.writeInt(i12);
                return true;
            case 11:
                zzdt zzdtVarZzi = zzi();
                parcel2.writeNoException();
                zzats.zzf(parcel2, zzdtVarZzi);
                return true;
            case 12:
                zZzq = zzo();
                parcel2.writeNoException();
                int i15 = zzats.zza;
                i12 = zZzq;
                parcel2.writeInt(i12);
                return true;
            case 13:
                zzn();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
