package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzatr;
import com.google.android.gms.internal.ads.zzats;
import com.google.android.gms.internal.ads.zzbjf;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbnv;
import com.google.android.gms.internal.ads.zzbnw;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzcd extends zzatr implements zzce {
    public zzcd() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.zzatr
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        IInterface iInterfaceZzd;
        switch (i10) {
            case 1:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar = (zzq) zzats.zza(parcel, zzq.CREATOR);
                String string = parcel.readString();
                zzbnw zzbnwVarZzf = zzbnv.zzf(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                zzats.zzc(parcel);
                iInterfaceZzd = zzd(iObjectWrapperAsInterface, zzqVar, string, zzbnwVarZzf, i12);
                break;
            case 2:
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar2 = (zzq) zzats.zza(parcel, zzq.CREATOR);
                String string2 = parcel.readString();
                zzbnw zzbnwVarZzf2 = zzbnv.zzf(parcel.readStrongBinder());
                int i13 = parcel.readInt();
                zzats.zzc(parcel);
                iInterfaceZzd = zze(iObjectWrapperAsInterface2, zzqVar2, string2, zzbnwVarZzf2, i13);
                break;
            case 3:
                IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String string3 = parcel.readString();
                zzbnw zzbnwVarZzf3 = zzbnv.zzf(parcel.readStrongBinder());
                int i14 = parcel.readInt();
                zzats.zzc(parcel);
                iInterfaceZzd = zzb(iObjectWrapperAsInterface3, string3, zzbnwVarZzf3, i14);
                break;
            case 4:
            case 7:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzats.zzc(parcel);
                parcel2.writeNoException();
                zzats.zzf(parcel2, null);
                return true;
            case 5:
                IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzats.zzc(parcel);
                iInterfaceZzd = zzi(iObjectWrapperAsInterface4, iObjectWrapperAsInterface5);
                break;
            case 6:
                IObjectWrapper iObjectWrapperAsInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbnw zzbnwVarZzf4 = zzbnv.zzf(parcel.readStrongBinder());
                int i15 = parcel.readInt();
                zzats.zzc(parcel);
                iInterfaceZzd = zzn(iObjectWrapperAsInterface6, zzbnwVarZzf4, i15);
                break;
            case 8:
                IObjectWrapper iObjectWrapperAsInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzats.zzc(parcel);
                iInterfaceZzd = zzm(iObjectWrapperAsInterface7);
                break;
            case 9:
                IObjectWrapper iObjectWrapperAsInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                int i16 = parcel.readInt();
                zzats.zzc(parcel);
                iInterfaceZzd = zzg(iObjectWrapperAsInterface8, i16);
                break;
            case 10:
                IObjectWrapper iObjectWrapperAsInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar3 = (zzq) zzats.zza(parcel, zzq.CREATOR);
                String string4 = parcel.readString();
                int i17 = parcel.readInt();
                zzats.zzc(parcel);
                iInterfaceZzd = zzf(iObjectWrapperAsInterface9, zzqVar3, string4, i17);
                break;
            case 11:
                IObjectWrapper iObjectWrapperAsInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzats.zzc(parcel);
                iInterfaceZzd = zzj(iObjectWrapperAsInterface10, iObjectWrapperAsInterface11, iObjectWrapperAsInterface12);
                break;
            case 12:
                IObjectWrapper iObjectWrapperAsInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String string5 = parcel.readString();
                zzbnw zzbnwVarZzf5 = zzbnv.zzf(parcel.readStrongBinder());
                int i18 = parcel.readInt();
                zzats.zzc(parcel);
                iInterfaceZzd = zzo(iObjectWrapperAsInterface13, string5, zzbnwVarZzf5, i18);
                break;
            case 13:
                IObjectWrapper iObjectWrapperAsInterface14 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar4 = (zzq) zzats.zza(parcel, zzq.CREATOR);
                String string6 = parcel.readString();
                zzbnw zzbnwVarZzf6 = zzbnv.zzf(parcel.readStrongBinder());
                int i19 = parcel.readInt();
                zzats.zzc(parcel);
                iInterfaceZzd = zzc(iObjectWrapperAsInterface14, zzqVar4, string6, zzbnwVarZzf6, i19);
                break;
            case 14:
                IObjectWrapper iObjectWrapperAsInterface15 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbnw zzbnwVarZzf7 = zzbnv.zzf(parcel.readStrongBinder());
                int i20 = parcel.readInt();
                zzats.zzc(parcel);
                iInterfaceZzd = zzp(iObjectWrapperAsInterface15, zzbnwVarZzf7, i20);
                break;
            case 15:
                IObjectWrapper iObjectWrapperAsInterface16 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbnw zzbnwVarZzf8 = zzbnv.zzf(parcel.readStrongBinder());
                int i21 = parcel.readInt();
                zzats.zzc(parcel);
                iInterfaceZzd = zzl(iObjectWrapperAsInterface16, zzbnwVarZzf8, i21);
                break;
            case 16:
                IObjectWrapper iObjectWrapperAsInterface17 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbnw zzbnwVarZzf9 = zzbnv.zzf(parcel.readStrongBinder());
                int i22 = parcel.readInt();
                zzbjg zzbjgVarZzc = zzbjf.zzc(parcel.readStrongBinder());
                zzats.zzc(parcel);
                iInterfaceZzd = zzk(iObjectWrapperAsInterface17, zzbnwVarZzf9, i22, zzbjgVarZzc);
                break;
            case 17:
                IObjectWrapper iObjectWrapperAsInterface18 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbnw zzbnwVarZzf10 = zzbnv.zzf(parcel.readStrongBinder());
                int i23 = parcel.readInt();
                zzats.zzc(parcel);
                iInterfaceZzd = zzh(iObjectWrapperAsInterface18, zzbnwVarZzf10, i23);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        zzats.zzf(parcel2, iInterfaceZzd);
        return true;
    }
}
