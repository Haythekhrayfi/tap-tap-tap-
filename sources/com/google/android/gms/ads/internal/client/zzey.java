package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbkm;
import com.google.android.gms.internal.ads.zzbnw;
import com.google.android.gms.internal.ads.zzbzk;
import com.google.android.gms.internal.ads.zzbzr;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzey extends zzcn {
    private zzbkm zza;

    public final /* synthetic */ void zzb() {
        zzbkm zzbkmVar = this.zza;
        if (zzbkmVar != null) {
            try {
                zzbkmVar.zzb(Collections.emptyList());
            } catch (RemoteException e10) {
                zzbzr.zzk("Could not notify onComplete event.", e10);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final float zze() throws RemoteException {
        return 1.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final String zzf() {
        return "";
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final List zzg() throws RemoteException {
        return Collections.emptyList();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzh(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzi() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzj(boolean z10) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzk() throws RemoteException {
        zzbzr.zzg("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        zzbzk.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzex
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzb();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzl(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzm(zzda zzdaVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzn(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzo(zzbnw zzbnwVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzp(boolean z10) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzq(float f10) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzr(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzs(zzbkm zzbkmVar) throws RemoteException {
        this.zza = zzbkmVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzt(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzu(zzff zzffVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final boolean zzv() throws RemoteException {
        return false;
    }
}
