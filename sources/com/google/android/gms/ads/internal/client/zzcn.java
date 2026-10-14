package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzatr;
import com.google.android.gms.internal.ads.zzats;
import com.google.android.gms.internal.ads.zzbkl;
import com.google.android.gms.internal.ads.zzbkm;
import com.google.android.gms.internal.ads.zzbnv;
import com.google.android.gms.internal.ads.zzbnw;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzcn extends zzatr implements zzco {
    public zzcn() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzatr
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzda zzcyVar;
        switch (i10) {
            case 1:
                zzk();
                break;
            case 2:
                float f10 = parcel.readFloat();
                zzats.zzc(parcel);
                zzq(f10);
                break;
            case 3:
                String string = parcel.readString();
                zzats.zzc(parcel);
                zzr(string);
                break;
            case 4:
                boolean zZzg = zzats.zzg(parcel);
                zzats.zzc(parcel);
                zzp(zZzg);
                break;
            case 5:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String string2 = parcel.readString();
                zzats.zzc(parcel);
                zzn(iObjectWrapperAsInterface, string2);
                break;
            case 6:
                String string3 = parcel.readString();
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzats.zzc(parcel);
                zzl(string3, iObjectWrapperAsInterface2);
                break;
            case 7:
                float fZze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(fZze);
                return true;
            case 8:
                boolean zZzv = zzv();
                parcel2.writeNoException();
                int i12 = zzats.zza;
                parcel2.writeInt(zZzv ? 1 : 0);
                return true;
            case 9:
                String strZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeString(strZzf);
                return true;
            case 10:
                String string4 = parcel.readString();
                zzats.zzc(parcel);
                zzh(string4);
                break;
            case 11:
                zzbnw zzbnwVarZzf = zzbnv.zzf(parcel.readStrongBinder());
                zzats.zzc(parcel);
                zzo(zzbnwVarZzf);
                break;
            case 12:
                zzbkm zzbkmVarZzc = zzbkl.zzc(parcel.readStrongBinder());
                zzats.zzc(parcel);
                zzs(zzbkmVarZzc);
                break;
            case 13:
                List listZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeTypedList(listZzg);
                return true;
            case 14:
                zzff zzffVar = (zzff) zzats.zza(parcel, zzff.CREATOR);
                zzats.zzc(parcel);
                zzu(zzffVar);
                break;
            case 15:
                zzi();
                break;
            case 16:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzcyVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    zzcyVar = iInterfaceQueryLocalInterface instanceof zzda ? (zzda) iInterfaceQueryLocalInterface : new zzcy(strongBinder);
                }
                zzats.zzc(parcel);
                zzm(zzcyVar);
                break;
            case 17:
                boolean zZzg2 = zzats.zzg(parcel);
                zzats.zzc(parcel);
                zzj(zZzg2);
                break;
            case 18:
                String string5 = parcel.readString();
                zzats.zzc(parcel);
                zzt(string5);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
