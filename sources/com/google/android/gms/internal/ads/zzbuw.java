package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbuw extends zzatr implements zzbux {
    public zzbuw() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzatr
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        int iZzs;
        if (i10 == 1) {
            zzbvb zzbvbVar = (zzbvb) zzats.zza(parcel, zzbvb.CREATOR);
            zzats.zzc(parcel);
            zzg(zzbvbVar);
        } else if (i10 != 2) {
            zzbva zzbuyVar = null;
            zzbuv zzbuvVar = null;
            if (i10 == 3) {
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    zzbuyVar = iInterfaceQueryLocalInterface instanceof zzbva ? (zzbva) iInterfaceQueryLocalInterface : new zzbuy(strongBinder);
                }
                zzats.zzc(parcel);
                zzo(zzbuyVar);
            } else {
                if (i10 != 34) {
                    switch (i10) {
                        case 5:
                            iZzs = zzs();
                            break;
                        case 6:
                            zzh();
                            break;
                        case 7:
                            zzj();
                            break;
                        case 8:
                            zze();
                            break;
                        case 9:
                            IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                            zzats.zzc(parcel);
                            zzi(iObjectWrapperAsInterface);
                            break;
                        case 10:
                            IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                            zzats.zzc(parcel);
                            zzk(iObjectWrapperAsInterface2);
                            break;
                        case 11:
                            IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                            zzats.zzc(parcel);
                            zzf(iObjectWrapperAsInterface3);
                            break;
                        case 12:
                            String strZzd = zzd();
                            parcel2.writeNoException();
                            parcel2.writeString(strZzd);
                            return true;
                        case 13:
                            String string = parcel.readString();
                            zzats.zzc(parcel);
                            zzp(string);
                            break;
                        case 14:
                            com.google.android.gms.ads.internal.client.zzby zzbyVarZzb = com.google.android.gms.ads.internal.client.zzbx.zzb(parcel.readStrongBinder());
                            zzats.zzc(parcel);
                            zzl(zzbyVarZzb);
                            break;
                        case 15:
                            Bundle bundleZzb = zzb();
                            parcel2.writeNoException();
                            zzats.zze(parcel2, bundleZzb);
                            return true;
                        case 16:
                            IBinder strongBinder2 = parcel.readStrongBinder();
                            if (strongBinder2 != null) {
                                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                                zzbuvVar = iInterfaceQueryLocalInterface2 instanceof zzbuv ? (zzbuv) iInterfaceQueryLocalInterface2 : new zzbuv(strongBinder2);
                            }
                            zzats.zzc(parcel);
                            zzu(zzbuvVar);
                            break;
                        case 17:
                            parcel.readString();
                            zzats.zzc(parcel);
                            break;
                        case 18:
                            IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                            zzats.zzc(parcel);
                            zzr(iObjectWrapperAsInterface4);
                            break;
                        case 19:
                            String string2 = parcel.readString();
                            zzats.zzc(parcel);
                            zzm(string2);
                            break;
                        case 20:
                            iZzs = zzt();
                            break;
                        case 21:
                            com.google.android.gms.ads.internal.client.zzdn zzdnVarZzc = zzc();
                            parcel2.writeNoException();
                            zzats.zzf(parcel2, zzdnVarZzc);
                            return true;
                        default:
                            return false;
                    }
                    parcel2.writeNoException();
                    int i12 = zzats.zza;
                    parcel2.writeInt(iZzs);
                    return true;
                }
                boolean zZzg = zzats.zzg(parcel);
                zzats.zzc(parcel);
                zzn(zZzg);
            }
        } else {
            zzq();
        }
        parcel2.writeNoException();
        return true;
    }
}
