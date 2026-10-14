package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
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
public interface zzbq extends IInterface {
    zzbn zze() throws RemoteException;

    void zzf(zzbfp zzbfpVar) throws RemoteException;

    void zzg(zzbfs zzbfsVar) throws RemoteException;

    void zzh(String str, zzbfy zzbfyVar, zzbfv zzbfvVar) throws RemoteException;

    void zzi(zzbla zzblaVar) throws RemoteException;

    void zzj(zzbgc zzbgcVar, zzq zzqVar) throws RemoteException;

    void zzk(zzbgf zzbgfVar) throws RemoteException;

    void zzl(zzbh zzbhVar) throws RemoteException;

    void zzm(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException;

    void zzn(zzbkr zzbkrVar) throws RemoteException;

    void zzo(zzbef zzbefVar) throws RemoteException;

    void zzp(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException;

    void zzq(zzcf zzcfVar) throws RemoteException;
}
