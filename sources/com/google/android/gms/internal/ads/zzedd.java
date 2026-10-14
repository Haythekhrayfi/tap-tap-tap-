package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzedd implements zzecc {
    private final zzcpy zza;
    private final Context zzb;
    private final zzdni zzc;
    private final zzfai zzd;
    private final Executor zze;
    private final zzfov zzf;

    public zzedd(zzcpy zzcpyVar, Context context, Executor executor, zzdni zzdniVar, zzfai zzfaiVar, zzfov zzfovVar) {
        this.zzb = context;
        this.zza = zzcpyVar;
        this.zze = executor;
        this.zzc = zzdniVar;
        this.zzd = zzfaiVar;
        this.zzf = zzfovVar;
    }

    @Override // com.google.android.gms.internal.ads.zzecc
    public final zzfwm zza(final zzezz zzezzVar, final zzezn zzeznVar) {
        return zzfwc.zzm(zzfwc.zzh(null), new zzfvj() { // from class: com.google.android.gms.internal.ads.zzecx
            @Override // com.google.android.gms.internal.ads.zzfvj
            public final zzfwm zza(Object obj) {
                return this.zza.zzc(zzezzVar, zzeznVar, obj);
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzecc
    public final boolean zzb(zzezz zzezzVar, zzezn zzeznVar) {
        zzezs zzezsVar = zzeznVar.zzt;
        return (zzezsVar == null || zzezsVar.zza == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ zzfwm zzc(zzezz zzezzVar, zzezn zzeznVar, Object obj) throws Exception {
        View zzdnlVar;
        com.google.android.gms.ads.internal.client.zzq zzqVarZza = zzfam.zza(this.zzb, zzeznVar.zzv);
        final zzcez zzcezVarZza = this.zzc.zza(zzqVarZza, zzeznVar, zzezzVar.zzb.zzb);
        zzcezVarZza.zzZ(zzeznVar.zzX);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzhs)).booleanValue() && zzeznVar.zzah) {
            zzdnlVar = zzcqp.zza(this.zzb, (View) zzcezVarZza, zzeznVar);
        } else {
            zzdnlVar = new zzdnl(this.zzb, (View) zzcezVarZza, (com.google.android.gms.ads.internal.util.zzas) this.zzf.apply(zzeznVar));
        }
        final zzcpc zzcpcVarZza = this.zza.zza(new zzcrs(zzezzVar, zzeznVar, null), new zzcpi(zzdnlVar, zzcezVarZza, new zzcrb() { // from class: com.google.android.gms.internal.ads.zzecy
            @Override // com.google.android.gms.internal.ads.zzcrb
            public final com.google.android.gms.ads.internal.client.zzdq zza() {
                return zzcezVarZza.zzq();
            }
        }, zzfam.zzb(zzqVarZza)));
        zzcpcVarZza.zzh().zzi(zzcezVarZza, false, null);
        zzcvy zzcvyVarZzc = zzcpcVarZza.zzc();
        zzcwa zzcwaVar = new zzcwa() { // from class: com.google.android.gms.internal.ads.zzecz
            @Override // com.google.android.gms.internal.ads.zzcwa
            public final void zzl() {
                zzcez zzcezVar = zzcezVarZza;
                if (zzcezVar.zzN() != null) {
                    zzcezVar.zzN().zzq();
                }
            }
        };
        zzfwn zzfwnVar = zzcae.zzf;
        zzcvyVarZzc.zzm(zzcwaVar, zzfwnVar);
        zzcpcVarZza.zzh();
        zzezs zzezsVar = zzeznVar.zzt;
        zzfwm zzfwmVarZzj = zzdnh.zzj(zzcezVarZza, zzezsVar.zzb, zzezsVar.zza);
        if (zzeznVar.zzN) {
            zzfwmVarZzj.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeda
                @Override // java.lang.Runnable
                public final void run() {
                    zzcezVarZza.zzae();
                }
            }, this.zze);
        }
        zzfwmVarZzj.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzedb
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd(zzcezVarZza);
            }
        }, this.zze);
        return zzfwc.zzl(zzfwmVarZzj, new zzfov() { // from class: com.google.android.gms.internal.ads.zzedc
            @Override // com.google.android.gms.internal.ads.zzfov
            public final Object apply(Object obj2) {
                return zzcpcVarZza.zza();
            }
        }, zzfwnVar);
    }

    public final /* synthetic */ void zzd(zzcez zzcezVar) {
        zzcezVar.zzY();
        zzcfv zzcfvVarZzq = zzcezVar.zzq();
        com.google.android.gms.ads.internal.client.zzfl zzflVar = this.zzd.zza;
        if (zzflVar == null || zzcfvVarZzq == null) {
            return;
        }
        zzcfvVarZzq.zzs(zzflVar);
    }
}
