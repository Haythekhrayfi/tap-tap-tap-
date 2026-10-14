package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzatr;
import com.google.android.gms.internal.ads.zzats;
import com.google.android.gms.internal.ads.zzavv;
import com.google.android.gms.internal.ads.zzavw;
import com.google.android.gms.internal.ads.zzbcj;
import com.google.android.gms.internal.ads.zzbck;
import com.google.android.gms.internal.ads.zzbsb;
import com.google.android.gms.internal.ads.zzbsc;
import com.google.android.gms.internal.ads.zzbse;
import com.google.android.gms.internal.ads.zzbsf;
import com.google.android.gms.internal.ads.zzbuz;
import com.google.android.gms.internal.ads.zzbva;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbt extends zzatr implements zzbu {
    public zzbt() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static zzbu zzac(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(iBinder);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzatr
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        IInterface iInterfaceZzn;
        Parcelable parcelableZzg;
        String strZzs;
        int i12;
        boolean zZzZ;
        zzbh zzbfVar = null;
        zzci zzcgVar = null;
        zzbk zzbiVar = null;
        zzdg zzdeVar = null;
        zzby zzbwVar = null;
        zzcf zzcfVar = null;
        zzbe zzbcVar = null;
        zzcb zzbzVar = null;
        switch (i10) {
            case 1:
                iInterfaceZzn = zzn();
                parcel2.writeNoException();
                zzats.zzf(parcel2, iInterfaceZzn);
                return true;
            case 2:
                zzx();
                parcel2.writeNoException();
                return true;
            case 3:
                zZzZ = zzZ();
                parcel2.writeNoException();
                int i13 = zzats.zza;
                i12 = zZzZ;
                parcel2.writeInt(i12);
                return true;
            case 4:
                zzl zzlVar = (zzl) zzats.zza(parcel, zzl.CREATOR);
                zzats.zzc(parcel);
                boolean zZzaa = zzaa(zzlVar);
                parcel2.writeNoException();
                i12 = zZzaa;
                parcel2.writeInt(i12);
                return true;
            case 5:
                zzz();
                parcel2.writeNoException();
                return true;
            case 6:
                zzB();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbfVar = iInterfaceQueryLocalInterface instanceof zzbh ? (zzbh) iInterfaceQueryLocalInterface : new zzbf(strongBinder);
                }
                zzats.zzc(parcel);
                zzD(zzbfVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    zzbzVar = iInterfaceQueryLocalInterface2 instanceof zzcb ? (zzcb) iInterfaceQueryLocalInterface2 : new zzbz(strongBinder2);
                }
                zzats.zzc(parcel);
                zzG(zzbzVar);
                parcel2.writeNoException();
                return true;
            case 9:
                zzX();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                zzA();
                parcel2.writeNoException();
                return true;
            case 12:
                parcelableZzg = zzg();
                parcel2.writeNoException();
                zzats.zze(parcel2, parcelableZzg);
                return true;
            case 13:
                zzq zzqVar = (zzq) zzats.zza(parcel, zzq.CREATOR);
                zzats.zzc(parcel);
                zzF(zzqVar);
                parcel2.writeNoException();
                return true;
            case 14:
                zzbsc zzbscVarZzb = zzbsb.zzb(parcel.readStrongBinder());
                zzats.zzc(parcel);
                zzM(zzbscVarZzb);
                parcel2.writeNoException();
                return true;
            case 15:
                zzbsf zzbsfVarZzb = zzbse.zzb(parcel.readStrongBinder());
                String string = parcel.readString();
                zzats.zzc(parcel);
                zzQ(zzbsfVarZzb, string);
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                strZzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            case 19:
                zzbck zzbckVarZzb = zzbcj.zzb(parcel.readStrongBinder());
                zzats.zzc(parcel);
                zzO(zzbckVarZzb);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    zzbcVar = iInterfaceQueryLocalInterface3 instanceof zzbe ? (zzbe) iInterfaceQueryLocalInterface3 : new zzbc(strongBinder3);
                }
                zzats.zzc(parcel);
                zzC(zzbcVar);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcfVar = iInterfaceQueryLocalInterface4 instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface4 : new zzcf(strongBinder4);
                }
                zzats.zzc(parcel);
                zzab(zzcfVar);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean zZzg = zzats.zzg(parcel);
                zzats.zzc(parcel);
                zzN(zZzg);
                parcel2.writeNoException();
                return true;
            case 23:
                zZzZ = zzY();
                parcel2.writeNoException();
                int i14 = zzats.zza;
                i12 = zZzZ;
                parcel2.writeInt(i12);
                return true;
            case 24:
                zzbva zzbvaVarZzb = zzbuz.zzb(parcel.readStrongBinder());
                zzats.zzc(parcel);
                zzS(zzbvaVarZzb);
                parcel2.writeNoException();
                return true;
            case 25:
                String string2 = parcel.readString();
                zzats.zzc(parcel);
                zzT(string2);
                parcel2.writeNoException();
                return true;
            case 26:
                iInterfaceZzn = zzl();
                parcel2.writeNoException();
                zzats.zzf(parcel2, iInterfaceZzn);
                return true;
            case 29:
                zzfl zzflVar = (zzfl) zzats.zza(parcel, zzfl.CREATOR);
                zzats.zzc(parcel);
                zzU(zzflVar);
                parcel2.writeNoException();
                return true;
            case 30:
                zzdu zzduVar = (zzdu) zzats.zza(parcel, zzdu.CREATOR);
                zzats.zzc(parcel);
                zzK(zzduVar);
                parcel2.writeNoException();
                return true;
            case 31:
                strZzs = zzr();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            case 32:
                iInterfaceZzn = zzj();
                parcel2.writeNoException();
                zzats.zzf(parcel2, iInterfaceZzn);
                return true;
            case 33:
                iInterfaceZzn = zzi();
                parcel2.writeNoException();
                zzats.zzf(parcel2, iInterfaceZzn);
                return true;
            case 34:
                boolean zZzg2 = zzats.zzg(parcel);
                zzats.zzc(parcel);
                zzL(zZzg2);
                parcel2.writeNoException();
                return true;
            case 35:
                strZzs = zzt();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            case 36:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    zzbwVar = iInterfaceQueryLocalInterface5 instanceof zzby ? (zzby) iInterfaceQueryLocalInterface5 : new zzbw(strongBinder5);
                }
                zzats.zzc(parcel);
                zzE(zzbwVar);
                parcel2.writeNoException();
                return true;
            case 37:
                parcelableZzg = zzd();
                parcel2.writeNoException();
                zzats.zze(parcel2, parcelableZzg);
                return true;
            case 38:
                String string3 = parcel.readString();
                zzats.zzc(parcel);
                zzR(string3);
                parcel2.writeNoException();
                return true;
            case 39:
                zzw zzwVar = (zzw) zzats.zza(parcel, zzw.CREATOR);
                zzats.zzc(parcel);
                zzI(zzwVar);
                parcel2.writeNoException();
                return true;
            case 40:
                zzavw zzavwVarZze = zzavv.zze(parcel.readStrongBinder());
                zzats.zzc(parcel);
                zzH(zzavwVarZze);
                parcel2.writeNoException();
                return true;
            case 41:
                iInterfaceZzn = zzk();
                parcel2.writeNoException();
                zzats.zzf(parcel2, iInterfaceZzn);
                return true;
            case 42:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    zzdeVar = iInterfaceQueryLocalInterface6 instanceof zzdg ? (zzdg) iInterfaceQueryLocalInterface6 : new zzde(strongBinder6);
                }
                zzats.zzc(parcel);
                zzP(zzdeVar);
                parcel2.writeNoException();
                return true;
            case 43:
                zzl zzlVar2 = (zzl) zzats.zza(parcel, zzl.CREATOR);
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    zzbiVar = iInterfaceQueryLocalInterface7 instanceof zzbk ? (zzbk) iInterfaceQueryLocalInterface7 : new zzbi(strongBinder7);
                }
                zzats.zzc(parcel);
                zzy(zzlVar2, zzbiVar);
                parcel2.writeNoException();
                return true;
            case 44:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzats.zzc(parcel);
                zzW(iObjectWrapperAsInterface);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    zzcgVar = iInterfaceQueryLocalInterface8 instanceof zzci ? (zzci) iInterfaceQueryLocalInterface8 : new zzcg(strongBinder8);
                }
                zzats.zzc(parcel);
                zzJ(zzcgVar);
                parcel2.writeNoException();
                return true;
        }
    }
}
