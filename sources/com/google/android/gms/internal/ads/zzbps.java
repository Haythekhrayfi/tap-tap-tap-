package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbps extends zzatr implements zzbpt {
    public zzbps() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static zzbpt zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return iInterfaceQueryLocalInterface instanceof zzbpt ? (zzbpt) iInterfaceQueryLocalInterface : new zzbpr(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v77, types: [int] */
    /* JADX WARN: Type inference failed for: r0v81 */
    /* JADX WARN: Type inference failed for: r0v82 */
    /* JADX WARN: Type inference failed for: r0v83 */
    /* JADX WARN: Type inference failed for: r11v1, types: [com.google.android.gms.internal.ads.zzbpw] */
    /* JADX WARN: Type inference failed for: r11v4, types: [com.google.android.gms.internal.ads.zzbpq] */
    /* JADX WARN: Type inference failed for: r11v5, types: [com.google.android.gms.internal.ads.zzbpn] */
    /* JADX WARN: Type inference failed for: r11v6, types: [com.google.android.gms.internal.ads.zzbpq] */
    /* JADX WARN: Type inference failed for: r11v8, types: [com.google.android.gms.internal.ads.zzbpn] */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.google.android.gms.internal.ads.zzbps, com.google.android.gms.internal.ads.zzbpt] */
    /* JADX WARN: Type inference failed for: r17v0, types: [android.os.Parcel] */
    /* JADX WARN: Type inference failed for: r5v16, types: [com.google.android.gms.internal.ads.zzbph] */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.google.android.gms.internal.ads.zzbph] */
    /* JADX WARN: Type inference failed for: r7v14, types: [com.google.android.gms.internal.ads.zzbpe] */
    /* JADX WARN: Type inference failed for: r7v5, types: [com.google.android.gms.internal.ads.zzbpk] */
    @Override // com.google.android.gms.internal.ads.zzatr
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzbqh zzbqhVarZzf;
        ?? Zzs;
        Object zzbpuVar = null;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    zzbqhVarZzf = zzg();
                } else if (i10 != 5) {
                    if (i10 == 10) {
                        IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    } else if (i10 != 11) {
                        switch (i10) {
                            case 13:
                                String string = parcel.readString();
                                String string2 = parcel.readString();
                                com.google.android.gms.ads.internal.client.zzl zzlVar = (com.google.android.gms.ads.internal.client.zzl) zzats.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                IBinder strongBinder = parcel.readStrongBinder();
                                if (strongBinder != null) {
                                    Object objQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                                    zzbpuVar = objQueryLocalInterface instanceof zzbph ? (zzbph) objQueryLocalInterface : new zzbpf(strongBinder);
                                }
                                ?? r10 = zzbpuVar;
                                zzboc zzbocVarZzb = zzbob.zzb(parcel.readStrongBinder());
                                com.google.android.gms.ads.internal.client.zzq zzqVar = (com.google.android.gms.ads.internal.client.zzq) zzats.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
                                zzats.zzc(parcel);
                                zzj(string, string2, zzlVar, iObjectWrapperAsInterface, r10, zzbocVarZzb, zzqVar);
                                break;
                            case 14:
                                String string3 = parcel.readString();
                                String string4 = parcel.readString();
                                com.google.android.gms.ads.internal.client.zzl zzlVar2 = (com.google.android.gms.ads.internal.client.zzl) zzats.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                IBinder strongBinder2 = parcel.readStrongBinder();
                                if (strongBinder2 != null) {
                                    Object objQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                                    zzbpuVar = objQueryLocalInterface2 instanceof zzbpk ? (zzbpk) objQueryLocalInterface2 : new zzbpi(strongBinder2);
                                }
                                ?? r11 = zzbpuVar;
                                zzboc zzbocVarZzb2 = zzbob.zzb(parcel.readStrongBinder());
                                zzats.zzc(parcel);
                                zzl(string3, string4, zzlVar2, iObjectWrapperAsInterface2, r11, zzbocVarZzb2);
                                break;
                            case 15:
                                IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                zzats.zzc(parcel);
                                Zzs = zzs(iObjectWrapperAsInterface3);
                                parcel2.writeNoException();
                                parcel2.writeInt(Zzs);
                                break;
                            case 16:
                                String string5 = parcel.readString();
                                String string6 = parcel.readString();
                                com.google.android.gms.ads.internal.client.zzl zzlVar3 = (com.google.android.gms.ads.internal.client.zzl) zzats.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                                IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                IBinder strongBinder3 = parcel.readStrongBinder();
                                if (strongBinder3 != null) {
                                    Object objQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                                    zzbpuVar = objQueryLocalInterface3 instanceof zzbpq ? (zzbpq) objQueryLocalInterface3 : new zzbpo(strongBinder3);
                                }
                                ?? r12 = zzbpuVar;
                                zzboc zzbocVarZzb3 = zzbob.zzb(parcel.readStrongBinder());
                                zzats.zzc(parcel);
                                zzp(string5, string6, zzlVar3, iObjectWrapperAsInterface4, r12, zzbocVarZzb3);
                                break;
                            case 17:
                                IObjectWrapper iObjectWrapperAsInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                zzats.zzc(parcel);
                                Zzs = zzt(iObjectWrapperAsInterface5);
                                parcel2.writeNoException();
                                parcel2.writeInt(Zzs);
                                break;
                            case 18:
                                String string7 = parcel.readString();
                                String string8 = parcel.readString();
                                com.google.android.gms.ads.internal.client.zzl zzlVar4 = (com.google.android.gms.ads.internal.client.zzl) zzats.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                                IObjectWrapper iObjectWrapperAsInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                IBinder strongBinder4 = parcel.readStrongBinder();
                                if (strongBinder4 != null) {
                                    Object objQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                                    zzbpuVar = objQueryLocalInterface4 instanceof zzbpn ? (zzbpn) objQueryLocalInterface4 : new zzbpl(strongBinder4);
                                }
                                ?? r13 = zzbpuVar;
                                zzboc zzbocVarZzb4 = zzbob.zzb(parcel.readStrongBinder());
                                zzats.zzc(parcel);
                                zzm(string7, string8, zzlVar4, iObjectWrapperAsInterface6, r13, zzbocVarZzb4);
                                break;
                            case 19:
                                String string9 = parcel.readString();
                                zzats.zzc(parcel);
                                zzq(string9);
                                break;
                            case 20:
                                String string10 = parcel.readString();
                                String string11 = parcel.readString();
                                com.google.android.gms.ads.internal.client.zzl zzlVar5 = (com.google.android.gms.ads.internal.client.zzl) zzats.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                                IObjectWrapper iObjectWrapperAsInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                IBinder strongBinder5 = parcel.readStrongBinder();
                                if (strongBinder5 != null) {
                                    Object objQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                                    zzbpuVar = objQueryLocalInterface5 instanceof zzbpq ? (zzbpq) objQueryLocalInterface5 : new zzbpo(strongBinder5);
                                }
                                ?? r14 = zzbpuVar;
                                zzboc zzbocVarZzb5 = zzbob.zzb(parcel.readStrongBinder());
                                zzats.zzc(parcel);
                                zzo(string10, string11, zzlVar5, iObjectWrapperAsInterface7, r14, zzbocVarZzb5);
                                break;
                            case 21:
                                String string12 = parcel.readString();
                                String string13 = parcel.readString();
                                com.google.android.gms.ads.internal.client.zzl zzlVar6 = (com.google.android.gms.ads.internal.client.zzl) zzats.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                                IObjectWrapper iObjectWrapperAsInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                IBinder strongBinder6 = parcel.readStrongBinder();
                                if (strongBinder6 != null) {
                                    Object objQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                                    zzbpuVar = objQueryLocalInterface6 instanceof zzbph ? (zzbph) objQueryLocalInterface6 : new zzbpf(strongBinder6);
                                }
                                ?? r15 = zzbpuVar;
                                zzboc zzbocVarZzb6 = zzbob.zzb(parcel.readStrongBinder());
                                com.google.android.gms.ads.internal.client.zzq zzqVar2 = (com.google.android.gms.ads.internal.client.zzq) zzats.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
                                zzats.zzc(parcel);
                                zzk(string12, string13, zzlVar6, iObjectWrapperAsInterface8, r15, zzbocVarZzb6, zzqVar2);
                                break;
                            case 22:
                                String string14 = parcel.readString();
                                String string15 = parcel.readString();
                                com.google.android.gms.ads.internal.client.zzl zzlVar7 = (com.google.android.gms.ads.internal.client.zzl) zzats.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                                IObjectWrapper iObjectWrapperAsInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                IBinder strongBinder7 = parcel.readStrongBinder();
                                if (strongBinder7 != null) {
                                    Object objQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                                    zzbpuVar = objQueryLocalInterface7 instanceof zzbpn ? (zzbpn) objQueryLocalInterface7 : new zzbpl(strongBinder7);
                                }
                                ?? r16 = zzbpuVar;
                                zzboc zzbocVarZzb7 = zzbob.zzb(parcel.readStrongBinder());
                                zzbef zzbefVar = (zzbef) zzats.zza(parcel, zzbef.CREATOR);
                                zzats.zzc(parcel);
                                zzn(string14, string15, zzlVar7, iObjectWrapperAsInterface9, r16, zzbocVarZzb7, zzbefVar);
                                break;
                            case 23:
                                String string16 = parcel.readString();
                                String string17 = parcel.readString();
                                com.google.android.gms.ads.internal.client.zzl zzlVar8 = (com.google.android.gms.ads.internal.client.zzl) zzats.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                                IObjectWrapper iObjectWrapperAsInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                IBinder strongBinder8 = parcel.readStrongBinder();
                                if (strongBinder8 != null) {
                                    Object objQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                                    zzbpuVar = objQueryLocalInterface8 instanceof zzbpe ? (zzbpe) objQueryLocalInterface8 : new zzbpc(strongBinder8);
                                }
                                ?? r17 = zzbpuVar;
                                zzboc zzbocVarZzb8 = zzbob.zzb(parcel.readStrongBinder());
                                zzats.zzc(parcel);
                                zzi(string16, string17, zzlVar8, iObjectWrapperAsInterface10, r17, zzbocVarZzb8);
                                break;
                            case 24:
                                IObjectWrapper iObjectWrapperAsInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                zzats.zzc(parcel);
                                Zzs = zzr(iObjectWrapperAsInterface11);
                                parcel2.writeNoException();
                                parcel2.writeInt(Zzs);
                                break;
                            default:
                                return false;
                        }
                    } else {
                        parcel.createStringArray();
                    }
                    zzats.zzc(parcel);
                } else {
                    com.google.android.gms.ads.internal.client.zzdq zzdqVarZze = zze();
                    parcel2.writeNoException();
                    zzats.zzf(parcel2, zzdqVarZze);
                }
                return true;
            }
            zzbqhVarZzf = zzf();
            parcel2.writeNoException();
            zzats.zze(parcel2, zzbqhVarZzf);
            return true;
        }
        IObjectWrapper iObjectWrapperAsInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
        String string18 = parcel.readString();
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) zzats.zza(parcel, creator);
        Bundle bundle2 = (Bundle) zzats.zza(parcel, creator);
        com.google.android.gms.ads.internal.client.zzq zzqVar3 = (com.google.android.gms.ads.internal.client.zzq) zzats.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
        IBinder strongBinder9 = parcel.readStrongBinder();
        if (strongBinder9 != null) {
            Object objQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
            zzbpuVar = objQueryLocalInterface9 instanceof zzbpw ? (zzbpw) objQueryLocalInterface9 : new zzbpu(strongBinder9);
        }
        ?? r18 = zzbpuVar;
        zzats.zzc(parcel);
        zzh(iObjectWrapperAsInterface12, string18, bundle, bundle2, zzqVar3, r18);
        parcel2.writeNoException();
        return true;
    }
}
