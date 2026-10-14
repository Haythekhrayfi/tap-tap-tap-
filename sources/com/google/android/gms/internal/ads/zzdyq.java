package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
final class zzdyq implements zzfvy {
    public final /* synthetic */ zzbtx zza;

    public zzdyq(zzdyr zzdyrVar, zzbtx zzbtxVar) {
        this.zza = zzbtxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvy
    public final void zza(Throwable th) {
        try {
            this.zza.zze(com.google.android.gms.ads.internal.util.zzaz.zzb(th));
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Ad service can't call client", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfvy
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zza.zzf((ParcelFileDescriptor) obj);
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Ad service can't call client", e10);
        }
    }
}
