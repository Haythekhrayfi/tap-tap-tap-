package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdex implements zzcwu, com.google.android.gms.ads.internal.overlay.zzo, zzcwa {
    public zzfgw zza;
    private final Context zzb;
    private final zzcez zzc;
    private final zzezn zzd;
    private final zzbzx zze;
    private final zzaxj zzf;

    public zzdex(Context context, zzcez zzcezVar, zzezn zzeznVar, zzbzx zzbzxVar, zzaxj zzaxjVar) {
        this.zzb = context;
        this.zzc = zzcezVar;
        this.zzd = zzeznVar;
        this.zze = zzbzxVar;
        this.zzf = zzaxjVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
        if (this.zza == null || this.zzc == null) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzeR)).booleanValue()) {
            return;
        }
        this.zzc.zzd("onSdkImpression", new q.a());
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbF() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(int i10) {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzcwa
    public final void zzl() {
        if (this.zza == null || this.zzc == null) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzeR)).booleanValue()) {
            this.zzc.zzd("onSdkImpression", new q.a());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwu
    public final void zzn() {
        zzecb zzecbVar;
        zzeca zzecaVar;
        zzaxj zzaxjVar = this.zzf;
        if ((zzaxjVar == zzaxj.REWARD_BASED_VIDEO_AD || zzaxjVar == zzaxj.INTERSTITIAL || zzaxjVar == zzaxj.APP_OPEN) && this.zzd.zzU && this.zzc != null && com.google.android.gms.ads.internal.zzt.zzA().zzj(this.zzb)) {
            zzbzx zzbzxVar = this.zze;
            String str = zzbzxVar.zzb + "." + zzbzxVar.zzc;
            String strZza = this.zzd.zzW.zza();
            if (this.zzd.zzW.zzb() == 1) {
                zzecaVar = zzeca.VIDEO;
                zzecbVar = zzecb.DEFINED_BY_JAVASCRIPT;
            } else {
                zzecbVar = this.zzd.zzZ == 2 ? zzecb.UNSPECIFIED : zzecb.BEGIN_TO_RENDER;
                zzecaVar = zzeca.HTML_DISPLAY;
            }
            zzfgw zzfgwVarZza = com.google.android.gms.ads.internal.zzt.zzA().zza(str, this.zzc.zzG(), "", "javascript", strZza, zzecbVar, zzecaVar, this.zzd.zzam);
            this.zza = zzfgwVarZza;
            if (zzfgwVarZza != null) {
                com.google.android.gms.ads.internal.zzt.zzA().zzh(this.zza, (View) this.zzc);
                this.zzc.zzap(this.zza);
                com.google.android.gms.ads.internal.zzt.zzA().zzi(this.zza);
                this.zzc.zzd("onSdkLoaded", new q.a());
            }
        }
    }
}
