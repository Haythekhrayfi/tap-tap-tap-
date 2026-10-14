package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdlj implements zzbij {
    private final zzbfv zza;
    private final zzdlx zzb;
    private final zzgvy zzc;

    public zzdlj(zzdhl zzdhlVar, zzdha zzdhaVar, zzdlx zzdlxVar, zzgvy zzgvyVar) {
        this.zza = zzdhlVar.zzc(zzdhaVar.zzz());
        this.zzb = zzdlxVar;
        this.zzc = zzgvyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbij
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.zza.zze((zzbfl) this.zzc.zzb(), str);
        } catch (RemoteException e10) {
            zzbzr.zzk("Failed to call onCustomClick for asset " + str + ".", e10);
        }
    }

    public final void zzb() {
        if (this.zza == null) {
            return;
        }
        this.zzb.zzi("/nativeAdCustomClick", this);
    }
}
