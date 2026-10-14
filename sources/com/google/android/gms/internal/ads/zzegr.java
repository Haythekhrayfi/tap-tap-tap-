package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes2.dex */
final class zzegr implements zzdew {
    private final Context zza;
    private final zzdni zzb;
    private final zzfai zzc;
    private final zzbzx zzd;
    private final zzezn zze;
    private final zzfwm zzf;
    private final zzcez zzg;
    private final zzbil zzh;
    private final boolean zzi;
    private final zzebl zzj;

    public zzegr(Context context, zzdni zzdniVar, zzfai zzfaiVar, zzbzx zzbzxVar, zzezn zzeznVar, zzfwm zzfwmVar, zzcez zzcezVar, zzbil zzbilVar, boolean z10, zzebl zzeblVar) {
        this.zza = context;
        this.zzb = zzdniVar;
        this.zzc = zzfaiVar;
        this.zzd = zzbzxVar;
        this.zze = zzeznVar;
        this.zzf = zzfwmVar;
        this.zzg = zzcezVar;
        this.zzh = zzbilVar;
        this.zzi = z10;
        this.zzj = zzeblVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzdew
    public final void zza(boolean z10, Context context, zzcvt zzcvtVar) {
        zzcez zzcezVar;
        zzdmn zzdmnVar = (zzdmn) zzfwc.zzp(this.zzf);
        try {
            zzezn zzeznVar = this.zze;
            if (this.zzg.zzaB()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzaJ)).booleanValue()) {
                    final zzcez zzcezVarZza = this.zzb.zza(this.zzc.zze, null, null);
                    zzbiz.zzb(zzcezVarZza, zzdmnVar.zzg());
                    final zzdnm zzdnmVar = new zzdnm();
                    zzdnmVar.zza(this.zza, (View) zzcezVarZza);
                    zzdmnVar.zzl().zzi(zzcezVarZza, true, this.zzi ? this.zzh : null);
                    zzcezVarZza.zzN().zzA(new zzcgk() { // from class: com.google.android.gms.internal.ads.zzegp
                        @Override // com.google.android.gms.internal.ads.zzcgk
                        public final void zza(boolean z11) {
                            zzdnm zzdnmVar2 = zzdnmVar;
                            zzcez zzcezVar2 = zzcezVarZza;
                            zzdnmVar2.zzb();
                            zzcezVar2.zzY();
                            zzcezVar2.zzN().zzq();
                        }
                    });
                    zzcezVarZza.zzN().zzG(new zzcgl() { // from class: com.google.android.gms.internal.ads.zzegq
                        @Override // com.google.android.gms.internal.ads.zzcgl
                        public final void zza() {
                            zzcezVarZza.zzX();
                        }
                    });
                    zzezs zzezsVar = zzeznVar.zzt;
                    zzcezVarZza.zzab(zzezsVar.zzb, zzezsVar.zza, null);
                    zzcezVar = zzcezVarZza;
                } else {
                    zzcezVar = this.zzg;
                }
            } else {
                zzcezVar = this.zzg;
            }
            zzcezVar.zzan(true);
            boolean zZze = this.zzi ? this.zzh.zze(false) : false;
            com.google.android.gms.ads.internal.zzt.zzp();
            boolean zZzE = com.google.android.gms.ads.internal.util.zzs.zzE(this.zza);
            boolean z11 = this.zzi;
            boolean zZzd = z11 ? this.zzh.zzd() : false;
            float fZza = z11 ? this.zzh.zza() : StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            zzezn zzeznVar2 = this.zze;
            com.google.android.gms.ads.internal.zzj zzjVar = new com.google.android.gms.ads.internal.zzj(zZze, zZzE, zZzd, fZza, -1, z10, zzeznVar2.zzP, zzeznVar2.zzQ);
            if (zzcvtVar != null) {
                zzcvtVar.zzf();
            }
            com.google.android.gms.ads.internal.zzt.zzi();
            zzdel zzdelVarZzh = zzdmnVar.zzh();
            zzezn zzeznVar3 = this.zze;
            int i10 = zzeznVar3.zzR;
            zzbzx zzbzxVar = this.zzd;
            String str = zzeznVar3.zzC;
            zzezs zzezsVar2 = zzeznVar3.zzt;
            com.google.android.gms.ads.internal.overlay.zzm.zza(context, new AdOverlayInfoParcel((com.google.android.gms.ads.internal.client.zza) null, zzdelVarZzh, (com.google.android.gms.ads.internal.overlay.zzz) null, zzcezVar, i10, zzbzxVar, str, zzjVar, zzezsVar2.zzb, zzezsVar2.zza, this.zzc.zzf, zzcvtVar, zzeznVar3.zzaj ? this.zzj : null), true);
        } catch (zzcfk e10) {
            zzbzr.zzh("", e10);
        }
    }
}
