package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcqq implements zzcwu, zzcwa {
    private final Context zza;
    private final zzcez zzb;
    private final zzezn zzc;
    private final zzbzx zzd;
    private zzfgw zze;
    private boolean zzf;

    public zzcqq(Context context, zzcez zzcezVar, zzezn zzeznVar, zzbzx zzbzxVar) {
        this.zza = context;
        this.zzb = zzcezVar;
        this.zzc = zzeznVar;
        this.zzd = zzbzxVar;
    }

    private final synchronized void zza() {
        zzeca zzecaVar;
        zzecb zzecbVar;
        if (this.zzc.zzU) {
            if (this.zzb == null) {
                return;
            }
            if (com.google.android.gms.ads.internal.zzt.zzA().zzj(this.zza)) {
                zzbzx zzbzxVar = this.zzd;
                String str = zzbzxVar.zzb + "." + zzbzxVar.zzc;
                String strZza = this.zzc.zzW.zza();
                if (this.zzc.zzW.zzb() == 1) {
                    zzecaVar = zzeca.VIDEO;
                    zzecbVar = zzecb.DEFINED_BY_JAVASCRIPT;
                } else {
                    zzecaVar = zzeca.HTML_DISPLAY;
                    zzecbVar = this.zzc.zzf == 1 ? zzecb.ONE_PIXEL : zzecb.BEGIN_TO_RENDER;
                }
                zzfgw zzfgwVarZza = com.google.android.gms.ads.internal.zzt.zzA().zza(str, this.zzb.zzG(), "", "javascript", strZza, zzecbVar, zzecaVar, this.zzc.zzam);
                this.zze = zzfgwVarZza;
                Object obj = this.zzb;
                if (zzfgwVarZza != null) {
                    com.google.android.gms.ads.internal.zzt.zzA().zzh(this.zze, (View) obj);
                    this.zzb.zzap(this.zze);
                    com.google.android.gms.ads.internal.zzt.zzA().zzi(this.zze);
                    this.zzf = true;
                    this.zzb.zzd("onSdkLoaded", new q.a());
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwa
    public final synchronized void zzl() {
        zzcez zzcezVar;
        if (!this.zzf) {
            zza();
        }
        if (!this.zzc.zzU || this.zze == null || (zzcezVar = this.zzb) == null) {
            return;
        }
        zzcezVar.zzd("onSdkImpression", new q.a());
    }

    @Override // com.google.android.gms.internal.ads.zzcwu
    public final synchronized void zzn() {
        if (this.zzf) {
            return;
        }
        zza();
    }
}
