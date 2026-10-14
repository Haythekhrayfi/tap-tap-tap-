package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class zzdqh {
    public final Executor zzc;
    public final zzbzw zzd;
    private final zzfff zzf;
    public final String zza = (String) zzbcz.zzb.zze();
    public final Map zzb = new HashMap();
    public final boolean zze = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbQ)).booleanValue();
    private final boolean zzg = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbT)).booleanValue();
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzgO)).booleanValue();

    public zzdqh(Executor executor, zzbzw zzbzwVar, zzfff zzfffVar) {
        this.zzc = executor;
        this.zzd = zzbzwVar;
        this.zzf = zzfffVar;
    }

    private final void zza(Map map, boolean z10) {
        if (map.isEmpty()) {
            zzbzr.zze("Empty paramMap.");
            return;
        }
        final String strZza = this.zzf.zza(map);
        com.google.android.gms.ads.internal.util.zze.zza(strZza);
        boolean z11 = Boolean.parseBoolean((String) map.get("scar"));
        if (this.zze) {
            if (!z10 || this.zzg) {
                if (!z11 || this.zzh) {
                    this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdqg
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzdqh zzdqhVar = this.zza;
                            zzdqhVar.zzd.zza(strZza);
                        }
                    });
                }
            }
        }
    }

    public final String zzb(Map map) {
        return this.zzf.zza(map);
    }

    public final ConcurrentHashMap zzc() {
        return new ConcurrentHashMap(this.zzb);
    }

    public final void zzd(Map map) {
        zza(map, true);
    }

    public final void zze(Map map) {
        zza(map, false);
    }
}
