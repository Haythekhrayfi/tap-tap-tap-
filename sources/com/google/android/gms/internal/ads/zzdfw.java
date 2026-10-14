package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzdfw implements zzbij {
    private final WeakReference zza;

    public /* synthetic */ zzdfw(zzdfx zzdfxVar, zzdfv zzdfvVar) {
        this.zza = new WeakReference(zzdfxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbij
    public final void zza(Object obj, Map map) {
        zzdfx zzdfxVar = (zzdfx) this.zza.get();
        if (zzdfxVar == null) {
            return;
        }
        zzdfxVar.zzg.zza();
    }
}
