package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcns {
    private final String zza;
    private final zzbni zzb;
    private final Executor zzc;
    private zzcnx zzd;
    private final zzbij zze = new zzcnp(this);
    private final zzbij zzf = new zzcnr(this);

    public zzcns(String str, zzbni zzbniVar, Executor executor) {
        this.zza = str;
        this.zzb = zzbniVar;
        this.zzc = executor;
    }

    public static /* bridge */ /* synthetic */ boolean zzg(zzcns zzcnsVar, Map map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(zzcnsVar.zza);
    }

    public final void zzc(zzcnx zzcnxVar) {
        this.zzb.zzb("/updateActiveView", this.zze);
        this.zzb.zzb("/untrackActiveViewUnit", this.zzf);
        this.zzd = zzcnxVar;
    }

    public final void zzd(zzcez zzcezVar) {
        zzcezVar.zzad("/updateActiveView", this.zze);
        zzcezVar.zzad("/untrackActiveViewUnit", this.zzf);
    }

    public final void zze() {
        this.zzb.zzc("/updateActiveView", this.zze);
        this.zzb.zzc("/untrackActiveViewUnit", this.zzf);
    }

    public final void zzf(zzcez zzcezVar) {
        zzcezVar.zzau("/updateActiveView", this.zze);
        zzcezVar.zzau("/untrackActiveViewUnit", this.zzf);
    }
}
