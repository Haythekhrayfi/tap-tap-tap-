package com.google.android.gms.internal.ads;

import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdmj implements zzbiy {
    private final zzcwn zza;
    private final zzbvg zzb;
    private final String zzc;
    private final String zzd;

    public zzdmj(zzcwn zzcwnVar, zzezn zzeznVar) {
        this.zza = zzcwnVar;
        this.zzb = zzeznVar.zzm;
        this.zzc = zzeznVar.zzk;
        this.zzd = zzeznVar.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzbiy
    @ParametersAreNonnullByDefault
    public final void zza(zzbvg zzbvgVar) {
        int i10;
        String str;
        zzbvg zzbvgVar2 = this.zzb;
        if (zzbvgVar2 != null) {
            zzbvgVar = zzbvgVar2;
        }
        if (zzbvgVar != null) {
            str = zzbvgVar.zza;
            i10 = zzbvgVar.zzb;
        } else {
            i10 = 1;
            str = "";
        }
        this.zza.zzd(new zzbur(str, i10), this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzbiy
    public final void zzb() {
        this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbiy
    public final void zzc() {
        this.zza.zzf();
    }
}
