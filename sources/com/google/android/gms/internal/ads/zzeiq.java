package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeiq extends com.google.android.gms.ads.internal.client.zzbm {
    private final zzejx zza;

    public zzeiq(Context context, zzcgu zzcguVar, zzfag zzfagVar, zzdhl zzdhlVar, com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        zzejz zzejzVar = new zzejz(zzdhlVar, zzcguVar.zzx());
        zzejzVar.zze(zzbhVar);
        this.zza = new zzejx(new zzekj(zzcguVar, context, zzejzVar, zzfagVar), zzfagVar.zzI());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized String zze() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized String zzf() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzg(com.google.android.gms.ads.internal.client.zzl zzlVar) throws RemoteException {
        this.zza.zzd(zzlVar, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized void zzh(com.google.android.gms.ads.internal.client.zzl zzlVar, int i10) throws RemoteException {
        this.zza.zzd(zzlVar, i10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized boolean zzi() throws RemoteException {
        return this.zza.zze();
    }
}
