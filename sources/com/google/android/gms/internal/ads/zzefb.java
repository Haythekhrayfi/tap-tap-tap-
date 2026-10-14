package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
final class zzefb extends zzbpm {
    public final /* synthetic */ zzefc zza;
    private final zzecf zzb;

    public /* synthetic */ zzefb(zzefc zzefcVar, zzecf zzecfVar, zzefa zzefaVar) {
        this.zza = zzefcVar;
        this.zzb = zzecfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpn
    public final void zze(String str) throws RemoteException {
        ((zzedy) this.zzb.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbpn
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzedy) this.zzb.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbpn
    public final void zzg(zzbol zzbolVar) throws RemoteException {
        this.zza.zzc = zzbolVar;
        ((zzedy) this.zzb.zzc).zzo();
    }
}
