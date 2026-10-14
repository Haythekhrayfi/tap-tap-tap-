package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzatq;
import com.google.android.gms.internal.ads.zzats;
import com.google.android.gms.internal.ads.zzbef;
import com.google.android.gms.internal.ads.zzbfp;
import com.google.android.gms.internal.ads.zzbfs;
import com.google.android.gms.internal.ads.zzbfv;
import com.google.android.gms.internal.ads.zzbfy;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbgf;
import com.google.android.gms.internal.ads.zzbkr;
import com.google.android.gms.internal.ads.zzbla;

/* JADX INFO: loaded from: classes.dex */
public final class zzbo extends zzatq implements zzbq {
    public zzbo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final zzbn zze() throws RemoteException {
        zzbn zzblVar;
        Parcel parcelZzbg = zzbg(1, zza());
        IBinder strongBinder = parcelZzbg.readStrongBinder();
        if (strongBinder == null) {
            zzblVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            zzblVar = iInterfaceQueryLocalInterface instanceof zzbn ? (zzbn) iInterfaceQueryLocalInterface : new zzbl(strongBinder);
        }
        parcelZzbg.recycle();
        return zzblVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzf(zzbfp zzbfpVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzg(zzbfs zzbfsVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzh(String str, zzbfy zzbfyVar, zzbfv zzbfvVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzats.zzf(parcelZza, zzbfyVar);
        zzats.zzf(parcelZza, zzbfvVar);
        zzbh(5, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzi(zzbla zzblaVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzj(zzbgc zzbgcVar, zzq zzqVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, zzbgcVar);
        zzats.zzd(parcelZza, zzqVar);
        zzbh(8, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzk(zzbgf zzbgfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, zzbgfVar);
        zzbh(10, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzl(zzbh zzbhVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, zzbhVar);
        zzbh(2, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzd(parcelZza, adManagerAdViewOptions);
        zzbh(15, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzn(zzbkr zzbkrVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzo(zzbef zzbefVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzats.zzd(parcelZza, zzbefVar);
        zzbh(6, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzq(zzcf zzcfVar) throws RemoteException {
        throw null;
    }
}
