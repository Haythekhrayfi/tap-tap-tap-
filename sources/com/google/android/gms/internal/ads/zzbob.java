package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbob extends zzatr implements zzboc {
    public zzbob() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static zzboc zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return iInterfaceQueryLocalInterface instanceof zzboc ? (zzboc) iInterfaceQueryLocalInterface : new zzboa(iBinder);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzatr
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                zze();
                parcel2.writeNoException();
                return true;
            case 2:
                zzf();
                parcel2.writeNoException();
                return true;
            case 3:
                int i12 = parcel.readInt();
                zzats.zzc(parcel);
                zzg(i12);
                parcel2.writeNoException();
                return true;
            case 4:
                zzn();
                parcel2.writeNoException();
                return true;
            case 5:
                zzp();
                parcel2.writeNoException();
                return true;
            case 6:
                zzo();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    if (iInterfaceQueryLocalInterface instanceof zzbog) {
                    }
                }
                zzats.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 8:
                zzm();
                parcel2.writeNoException();
                return true;
            case 9:
                String string = parcel.readString();
                String string2 = parcel.readString();
                zzats.zzc(parcel);
                zzq(string, string2);
                parcel2.writeNoException();
                return true;
            case 10:
                zzbfk.zzb(parcel.readStrongBinder());
                parcel.readString();
                zzats.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 11:
                zzv();
                parcel2.writeNoException();
                return true;
            case 12:
                parcel.readString();
                zzats.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 13:
                zzy();
                parcel2.writeNoException();
                return true;
            case 14:
                zzbvg zzbvgVar = (zzbvg) zzats.zza(parcel, zzbvg.CREATOR);
                zzats.zzc(parcel);
                zzs(zzbvgVar);
                parcel2.writeNoException();
                return true;
            case 15:
                zzw();
                parcel2.writeNoException();
                return true;
            case 16:
                zzbvk zzbvkVarZzb = zzbvj.zzb(parcel.readStrongBinder());
                zzats.zzc(parcel);
                zzt(zzbvkVarZzb);
                parcel2.writeNoException();
                return true;
            case 17:
                int i13 = parcel.readInt();
                zzats.zzc(parcel);
                zzj(i13);
                parcel2.writeNoException();
                return true;
            case 18:
                zzu();
                parcel2.writeNoException();
                return true;
            case 19:
                zzats.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 20:
                zzx();
                parcel2.writeNoException();
                return true;
            case 21:
                String string3 = parcel.readString();
                zzats.zzc(parcel);
                zzl(string3);
                parcel2.writeNoException();
                return true;
            case 22:
                int i14 = parcel.readInt();
                String string4 = parcel.readString();
                zzats.zzc(parcel);
                zzi(i14, string4);
                parcel2.writeNoException();
                return true;
            case 23:
                com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzats.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                zzats.zzc(parcel);
                zzh(zzeVar);
                parcel2.writeNoException();
                return true;
            case 24:
                com.google.android.gms.ads.internal.client.zze zzeVar2 = (com.google.android.gms.ads.internal.client.zze) zzats.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                zzats.zzc(parcel);
                zzk(zzeVar2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
