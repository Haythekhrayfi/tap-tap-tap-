package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
final class zzdrn extends zzbvt {
    public final /* synthetic */ zzdrp zza;

    public zzdrn(zzdrp zzdrpVar) {
        this.zza = zzdrpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final void zze(int i10) throws RemoteException {
        zzdrp zzdrpVar = this.zza;
        zzdrpVar.zzb.zzm(zzdrpVar.zza, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzdrp zzdrpVar = this.zza;
        zzdrpVar.zzb.zzm(zzdrpVar.zza, zzeVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final void zzg() throws RemoteException {
        zzdrp zzdrpVar = this.zza;
        zzdrpVar.zzb.zzp(zzdrpVar.zza);
    }
}
