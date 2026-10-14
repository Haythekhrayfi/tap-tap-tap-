package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzdfd implements zzcrg {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final zzgwr zzd;
    private final zzdhl zze;

    public zzdfd(Map map, Map map2, Map map3, zzgwr zzgwrVar, zzdhl zzdhlVar) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = map3;
        this.zzd = zzgwrVar;
        this.zze = zzdhlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcrg
    public final zzecc zza(int i10, String str) {
        zzecc zzeccVarZza;
        zzecc zzeccVar = (zzecc) this.zza.get(str);
        if (zzeccVar != null) {
            return zzeccVar;
        }
        if (i10 == 1) {
            if (this.zze.zze() == null || (zzeccVarZza = ((zzcrg) this.zzd.zzb()).zza(i10, str)) == null) {
                return null;
            }
            return zzcrk.zza(zzeccVarZza);
        }
        if (i10 != 4) {
            return null;
        }
        zzeeq zzeeqVar = (zzeeq) this.zzc.get(str);
        if (zzeeqVar != null) {
            return new zzecd(zzeeqVar, new zzfov() { // from class: com.google.android.gms.internal.ads.zzcri
                @Override // com.google.android.gms.internal.ads.zzfov
                public final Object apply(Object obj) {
                    return new zzcrk((List) obj);
                }
            });
        }
        zzecc zzeccVar2 = (zzecc) this.zzb.get(str);
        if (zzeccVar2 == null) {
            return null;
        }
        return zzcrk.zza(zzeccVar2);
    }
}
