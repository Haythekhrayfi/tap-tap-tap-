package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes2.dex */
final class zzeee implements zzdew {
    private final Context zza;
    private final zzbzx zzb;
    private final zzfwm zzc;
    private final zzezn zzd;
    private final zzcez zze;
    private final zzfai zzf;
    private final zzbil zzg;
    private final boolean zzh;
    private final zzebl zzi;

    public zzeee(Context context, zzbzx zzbzxVar, zzfwm zzfwmVar, zzezn zzeznVar, zzcez zzcezVar, zzfai zzfaiVar, boolean z10, zzbil zzbilVar, zzebl zzeblVar) {
        this.zza = context;
        this.zzb = zzbzxVar;
        this.zzc = zzfwmVar;
        this.zzd = zzeznVar;
        this.zze = zzcezVar;
        this.zzf = zzfaiVar;
        this.zzg = zzbilVar;
        this.zzh = z10;
        this.zzi = zzeblVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdew
    public final void zza(boolean z10, Context context, zzcvt zzcvtVar) {
        zzddo zzddoVar = (zzddo) zzfwc.zzp(this.zzc);
        this.zze.zzan(true);
        boolean zZze = this.zzh ? this.zzg.zze(false) : false;
        com.google.android.gms.ads.internal.zzt.zzp();
        boolean zZzE = com.google.android.gms.ads.internal.util.zzs.zzE(this.zza);
        boolean z11 = this.zzh;
        com.google.android.gms.ads.internal.zzj zzjVar = new com.google.android.gms.ads.internal.zzj(zZze, zZzE, z11 ? this.zzg.zzd() : false, z11 ? this.zzg.zza() : StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, -1, z10, this.zzd.zzP, false);
        if (zzcvtVar != null) {
            zzcvtVar.zzf();
        }
        com.google.android.gms.ads.internal.zzt.zzi();
        zzdel zzdelVarZzh = zzddoVar.zzh();
        zzcez zzcezVar = this.zze;
        zzezn zzeznVar = this.zzd;
        int i10 = zzeznVar.zzR;
        zzbzx zzbzxVar = this.zzb;
        String str = zzeznVar.zzC;
        zzezs zzezsVar = zzeznVar.zzt;
        com.google.android.gms.ads.internal.overlay.zzm.zza(context, new AdOverlayInfoParcel((com.google.android.gms.ads.internal.client.zza) null, zzdelVarZzh, (com.google.android.gms.ads.internal.overlay.zzz) null, zzcezVar, i10, zzbzxVar, str, zzjVar, zzezsVar.zzb, zzezsVar.zza, this.zzf.zzf, zzcvtVar, zzeznVar.zzaj ? this.zzi : null), true);
    }
}
