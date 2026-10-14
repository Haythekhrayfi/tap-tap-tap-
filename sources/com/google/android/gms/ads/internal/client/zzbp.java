package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzatr;
import com.google.android.gms.internal.ads.zzats;
import com.google.android.gms.internal.ads.zzbef;
import com.google.android.gms.internal.ads.zzbfo;
import com.google.android.gms.internal.ads.zzbfp;
import com.google.android.gms.internal.ads.zzbfr;
import com.google.android.gms.internal.ads.zzbfs;
import com.google.android.gms.internal.ads.zzbfu;
import com.google.android.gms.internal.ads.zzbfv;
import com.google.android.gms.internal.ads.zzbfx;
import com.google.android.gms.internal.ads.zzbfy;
import com.google.android.gms.internal.ads.zzbgb;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbge;
import com.google.android.gms.internal.ads.zzbgf;
import com.google.android.gms.internal.ads.zzbkr;
import com.google.android.gms.internal.ads.zzbkz;
import com.google.android.gms.internal.ads.zzbla;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbp extends zzatr implements zzbq {
    public zzbp() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.zzatr
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzbh zzbfVar = null;
        zzcf zzcfVar = null;
        switch (i10) {
            case 1:
                zzbn zzbnVarZze = zze();
                parcel2.writeNoException();
                zzats.zzf(parcel2, zzbnVarZze);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbfVar = iInterfaceQueryLocalInterface instanceof zzbh ? (zzbh) iInterfaceQueryLocalInterface : new zzbf(strongBinder);
                }
                zzats.zzc(parcel);
                zzl(zzbfVar);
                break;
            case 3:
                zzbfp zzbfpVarZzb = zzbfo.zzb(parcel.readStrongBinder());
                zzats.zzc(parcel);
                zzf(zzbfpVarZzb);
                break;
            case 4:
                zzbfs zzbfsVarZzb = zzbfr.zzb(parcel.readStrongBinder());
                zzats.zzc(parcel);
                zzg(zzbfsVarZzb);
                break;
            case 5:
                String string = parcel.readString();
                zzbfy zzbfyVarZzb = zzbfx.zzb(parcel.readStrongBinder());
                zzbfv zzbfvVarZzb = zzbfu.zzb(parcel.readStrongBinder());
                zzats.zzc(parcel);
                zzh(string, zzbfyVarZzb, zzbfvVarZzb);
                break;
            case 6:
                zzbef zzbefVar = (zzbef) zzats.zza(parcel, zzbef.CREATOR);
                zzats.zzc(parcel);
                zzo(zzbefVar);
                break;
            case 7:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcfVar = iInterfaceQueryLocalInterface2 instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface2 : new zzcf(strongBinder2);
                }
                zzats.zzc(parcel);
                zzq(zzcfVar);
                break;
            case 8:
                zzbgc zzbgcVarZzb = zzbgb.zzb(parcel.readStrongBinder());
                zzq zzqVar = (zzq) zzats.zza(parcel, zzq.CREATOR);
                zzats.zzc(parcel);
                zzj(zzbgcVarZzb, zzqVar);
                break;
            case 9:
                PublisherAdViewOptions publisherAdViewOptions = (PublisherAdViewOptions) zzats.zza(parcel, PublisherAdViewOptions.CREATOR);
                zzats.zzc(parcel);
                zzp(publisherAdViewOptions);
                break;
            case 10:
                zzbgf zzbgfVarZzb = zzbge.zzb(parcel.readStrongBinder());
                zzats.zzc(parcel);
                zzk(zzbgfVarZzb);
                break;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                zzbkr zzbkrVar = (zzbkr) zzats.zza(parcel, zzbkr.CREATOR);
                zzats.zzc(parcel);
                zzn(zzbkrVar);
                break;
            case 14:
                zzbla zzblaVarZzb = zzbkz.zzb(parcel.readStrongBinder());
                zzats.zzc(parcel);
                zzi(zzblaVarZzb);
                break;
            case 15:
                AdManagerAdViewOptions adManagerAdViewOptions = (AdManagerAdViewOptions) zzats.zza(parcel, AdManagerAdViewOptions.CREATOR);
                zzats.zzc(parcel);
                zzm(adManagerAdViewOptions);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
