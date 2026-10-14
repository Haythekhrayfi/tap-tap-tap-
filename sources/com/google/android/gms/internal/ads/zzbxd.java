package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes2.dex */
final class zzbxd extends zzbxx {
    private final Clock zzb;
    private final zzbxd zzc = this;
    private final zzgwr zzd;
    private final zzgwr zze;
    private final zzgwr zzf;
    private final zzgwr zzg;
    private final zzgwr zzh;
    private final zzgwr zzi;
    private final zzgwr zzj;
    private final zzgwr zzk;

    public /* synthetic */ zzbxd(Context context, Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzbxw zzbxwVar, zzbxc zzbxcVar) {
        this.zzb = clock;
        zzgwe zzgweVarZza = zzgwf.zza(context);
        this.zzd = zzgweVarZza;
        zzgwe zzgweVarZza2 = zzgwf.zza(zzgVar);
        this.zze = zzgweVarZza2;
        zzgwe zzgweVarZza3 = zzgwf.zza(zzbxwVar);
        this.zzf = zzgweVarZza3;
        this.zzg = zzgwd.zzc(new zzbwv(zzgweVarZza, zzgweVarZza2, zzgweVarZza3));
        zzgwe zzgweVarZza4 = zzgwf.zza(clock);
        this.zzh = zzgweVarZza4;
        zzgwr zzgwrVarZzc = zzgwd.zzc(new zzbwx(zzgweVarZza4, zzgweVarZza2, zzgweVarZza3));
        this.zzi = zzgwrVarZzc;
        zzbwz zzbwzVar = new zzbwz(zzgweVarZza4, zzgwrVarZzc);
        this.zzj = zzbwzVar;
        this.zzk = zzgwd.zzc(new zzbyc(zzgweVarZza, zzbwzVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbxx
    public final zzbwu zza() {
        return (zzbwu) this.zzg.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbxx
    public final zzbwy zzb() {
        return new zzbwy(this.zzb, (zzbww) this.zzi.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzbxx
    public final zzbyb zzc() {
        return (zzbyb) this.zzk.zzb();
    }
}
