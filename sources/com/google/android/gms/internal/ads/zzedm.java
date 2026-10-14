package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
final class zzedm extends zzbpg {
    public final /* synthetic */ zzedn zza;
    private final zzecf zzb;

    public /* synthetic */ zzedm(zzedn zzednVar, zzecf zzecfVar, zzedl zzedlVar) {
        this.zza = zzednVar;
        this.zzb = zzecfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zze(String str) throws RemoteException {
        ((zzedy) this.zzb.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzedy) this.zzb.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        this.zza.zzc = (View) ObjectWrapper.unwrap(iObjectWrapper);
        ((zzedy) this.zzb.zzc).zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzh(zzbof zzbofVar) throws RemoteException {
        this.zza.zzd = zzbofVar;
        ((zzedy) this.zzb.zzc).zzo();
    }
}
