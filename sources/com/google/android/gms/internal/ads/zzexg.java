package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzexg implements zzgwe {
    private final zzgwr zza;
    private final zzgwr zzb;
    private final zzgwr zzc;

    public zzexg(zzgwr zzgwrVar, zzgwr zzgwrVar2, zzgwr zzgwrVar3) {
        this.zza = zzgwrVar;
        this.zzb = zzgwrVar2;
        this.zzc = zzgwrVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzexe zzb() {
        Context context = (Context) this.zza.zzb();
        zzfbq zzfbqVar = (zzfbq) this.zzb.zzb();
        zzfci zzfciVar = (zzfci) this.zzc.zzb();
        zzbyu zzbyuVarZzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzge)).booleanValue() ? com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh() : com.google.android.gms.ads.internal.zzt.zzo().zzh().zzi();
        boolean z10 = false;
        if (zzbyuVarZzh != null && zzbyuVarZzh.zzh()) {
            z10 = true;
        }
        if (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzgu)).intValue() > 0) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzgd)).booleanValue() || z10) {
                zzfch zzfchVarZza = zzfciVar.zza(zzfby.AppOpen, context, zzfbqVar, new zzewi(new zzewf()));
                zzewu zzewuVar = new zzewu(new zzewt());
                zzfbu zzfbuVar = zzfchVarZza.zza;
                zzfwn zzfwnVar = zzcae.zza;
                return new zzewk(zzewuVar, new zzewq(zzfbuVar, zzfwnVar), zzfchVarZza.zzb, zzfchVarZza.zza.zza().zzf, zzfwnVar);
            }
        }
        return new zzewt();
    }
}
