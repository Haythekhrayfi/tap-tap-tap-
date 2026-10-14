package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdvx implements zzdvz {
    private final Map zza;
    private final zzfwn zzb;
    private final zzcxz zzc;

    public zzdvx(Map map, zzfwn zzfwnVar, zzcxz zzcxzVar) {
        this.zza = map;
        this.zzb = zzfwnVar;
        this.zzc = zzcxzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdvz
    public final zzfwm zzb(final zzbue zzbueVar) {
        this.zzc.zzbA(zzbueVar);
        zzfwm zzfwmVarZzg = zzfwc.zzg(new zzdtx(3));
        for (String str : ((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzhM)).split(",")) {
            final zzgwr zzgwrVar = (zzgwr) this.zza.get(str.trim());
            if (zzgwrVar != null) {
                zzfwmVarZzg = zzfwc.zzf(zzfwmVarZzg, zzdtx.class, new zzfvj() { // from class: com.google.android.gms.internal.ads.zzdvv
                    @Override // com.google.android.gms.internal.ads.zzfvj
                    public final zzfwm zza(Object obj) {
                        zzgwr zzgwrVar2 = zzgwrVar;
                        return ((zzdvz) zzgwrVar2.zzb()).zzb(zzbueVar);
                    }
                }, this.zzb);
            }
        }
        zzfwc.zzq(zzfwmVarZzg, new zzdvw(this), zzcae.zzf);
        return zzfwmVarZzg;
    }
}
