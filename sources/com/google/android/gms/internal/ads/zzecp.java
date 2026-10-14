package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes2.dex */
final class zzecp implements zzdew {
    private final zzbzx zza;
    private final zzfwm zzb;
    private final zzezn zzc;
    private final zzcez zzd;
    private final zzfai zze;
    private final zzbil zzf;
    private final boolean zzg;
    private final zzebl zzh;

    public zzecp(zzbzx zzbzxVar, zzfwm zzfwmVar, zzezn zzeznVar, zzcez zzcezVar, zzfai zzfaiVar, boolean z10, zzbil zzbilVar, zzebl zzeblVar) {
        this.zza = zzbzxVar;
        this.zzb = zzfwmVar;
        this.zzc = zzeznVar;
        this.zzd = zzcezVar;
        this.zze = zzfaiVar;
        this.zzg = z10;
        this.zzf = zzbilVar;
        this.zzh = zzeblVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006e  */
    @Override // com.google.android.gms.internal.ads.zzdew
    public final void zza(boolean z10, Context context, zzcvt zzcvtVar) {
        zzcom zzcomVar = (zzcom) zzfwc.zzp(this.zzb);
        this.zzd.zzan(true);
        boolean zZze = this.zzg ? this.zzf.zze(true) : true;
        boolean z11 = this.zzg;
        com.google.android.gms.ads.internal.zzj zzjVar = new com.google.android.gms.ads.internal.zzj(zZze, true, z11 ? this.zzf.zzd() : false, z11 ? this.zzf.zza() : StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, -1, z10, this.zzc.zzP, false);
        if (zzcvtVar != null) {
            zzcvtVar.zzf();
        }
        com.google.android.gms.ads.internal.zzt.zzi();
        zzdel zzdelVarZzg = zzcomVar.zzg();
        zzcez zzcezVar = this.zzd;
        int i10 = this.zzc.zzR;
        if (i10 == -1) {
            com.google.android.gms.ads.internal.client.zzw zzwVar = this.zze.zzj;
            if (zzwVar == null) {
                zzbzr.zze("Error setting app open orientation; no targeting orientation available.");
                i10 = this.zzc.zzR;
            } else {
                int i11 = zzwVar.zza;
                if (i11 == 1) {
                    i10 = 7;
                } else if (i11 == 2) {
                    i10 = 6;
                } else {
                    zzbzr.zze("Error setting app open orientation; no targeting orientation available.");
                    i10 = this.zzc.zzR;
                }
            }
        }
        int i12 = i10;
        zzbzx zzbzxVar = this.zza;
        zzezn zzeznVar = this.zzc;
        String str = zzeznVar.zzC;
        zzezs zzezsVar = zzeznVar.zzt;
        com.google.android.gms.ads.internal.overlay.zzm.zza(context, new AdOverlayInfoParcel((com.google.android.gms.ads.internal.client.zza) null, zzdelVarZzg, (com.google.android.gms.ads.internal.overlay.zzz) null, zzcezVar, i12, zzbzxVar, str, zzjVar, zzezsVar.zzb, zzezsVar.zza, this.zze.zzf, zzcvtVar, zzeznVar.zzaj ? this.zzh : null), true);
    }
}
