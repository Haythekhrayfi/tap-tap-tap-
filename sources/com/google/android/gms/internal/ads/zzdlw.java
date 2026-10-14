package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzdlw implements zzbij {
    public final /* synthetic */ zzdlx zza;
    private final WeakReference zzb;
    private final String zzc;
    private final zzbij zzd;

    public /* synthetic */ zzdlw(zzdlx zzdlxVar, WeakReference weakReference, String str, zzbij zzbijVar, zzdlv zzdlvVar) {
        this.zza = zzdlxVar;
        this.zzb = weakReference;
        this.zzc = str;
        this.zzd = zzbijVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbij
    public final void zza(Object obj, Map map) {
        Object obj2 = this.zzb.get();
        if (obj2 == null) {
            this.zza.zzk(this.zzc, this);
        } else {
            this.zzd.zza(obj2, map);
        }
    }
}
