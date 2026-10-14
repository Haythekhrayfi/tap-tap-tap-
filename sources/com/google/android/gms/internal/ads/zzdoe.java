package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdoe implements zzgwe {
    private final zzgwr zza;
    private final zzgwr zzb;
    private final zzgwr zzc;
    private final zzgwr zzd;
    private final zzgwr zze;

    public zzdoe(zzgwr zzgwrVar, zzgwr zzgwrVar2, zzgwr zzgwrVar3, zzgwr zzgwrVar4, zzgwr zzgwrVar5) {
        this.zza = zzgwrVar;
        this.zzb = zzgwrVar2;
        this.zzc = zzgwrVar3;
        this.zzd = zzgwrVar4;
        this.zze = zzgwrVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextZza = ((zzcha) this.zza).zza();
        final String strZzb = ((zzdup) this.zzb).zzb();
        zzbzx zzbzxVarZza = ((zzchm) this.zzc).zza();
        final zzaxj zzaxjVar = (zzaxj) this.zzd.zzb();
        final String str = (String) this.zze.zzb();
        zzawz zzawzVar = new zzawz(new zzaxf(contextZza));
        zzazy zzazyVarZza = zzazz.zza();
        zzazyVarZza.zza(zzbzxVarZza.zzb);
        zzazyVarZza.zzc(zzbzxVarZza.zzc);
        zzazyVarZza.zzb(true != zzbzxVarZza.zzd ? 2 : 0);
        final zzazz zzazzVar = (zzazz) zzazyVarZza.zzal();
        zzawzVar.zzb(new zzawy() { // from class: com.google.android.gms.internal.ads.zzdod
            @Override // com.google.android.gms.internal.ads.zzawy
            public final void zza(zzayo zzayoVar) {
                zzaxj zzaxjVar2 = zzaxjVar;
                String str2 = strZzb;
                zzazz zzazzVar2 = zzazzVar;
                String str3 = str;
                zzaxk zzaxkVar = (zzaxk) zzayoVar.zza().zzaB();
                zzaxkVar.zza(zzaxjVar2);
                zzayoVar.zze(zzaxkVar);
                zzayg zzaygVar = (zzayg) zzayoVar.zzb().zzaB();
                zzaygVar.zza(str2);
                zzaygVar.zzb(zzazzVar2);
                zzayoVar.zzg(zzaygVar);
                zzayoVar.zzh(str3);
            }
        });
        return zzawzVar;
    }
}
