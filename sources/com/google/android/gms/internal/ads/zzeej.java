package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeej implements zzeci {
    private final Context zza;
    private final zzdeo zzb;
    private final zzbzx zzc;
    private final Executor zzd;

    public zzeej(Context context, zzbzx zzbzxVar, zzdeo zzdeoVar, Executor executor) {
        this.zza = context;
        this.zzc = zzbzxVar;
        this.zzb = zzdeoVar;
        this.zzd = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzeci
    public final /* bridge */ /* synthetic */ Object zza(zzezz zzezzVar, zzezn zzeznVar, final zzecf zzecfVar) throws zzefu, zzfan {
        zzddo zzddoVarZze = this.zzb.zze(new zzcrs(zzezzVar, zzeznVar, zzecfVar.zza), new zzddr(new zzdew() { // from class: com.google.android.gms.internal.ads.zzeei
            @Override // com.google.android.gms.internal.ads.zzdew
            public final void zza(boolean z10, Context context, zzcvt zzcvtVar) throws zzdev {
                this.zza.zzc(zzecfVar, z10, context, zzcvtVar);
            }
        }, null));
        zzddoVarZze.zzd().zzm(new zzcnd((zzfbd) zzecfVar.zzb), this.zzd);
        ((zzedy) zzecfVar.zzc).zzc(zzddoVarZze.zzj());
        return zzddoVarZze.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzeci
    public final void zzb(zzezz zzezzVar, zzezn zzeznVar, zzecf zzecfVar) throws zzfan {
        ((zzfbd) zzecfVar.zzb).zzo(this.zza, zzezzVar.zza.zza.zzd, zzeznVar.zzw.toString(), com.google.android.gms.ads.internal.util.zzbu.zzl(zzeznVar.zzt), (zzboc) zzecfVar.zzc);
    }

    public final /* synthetic */ void zzc(zzecf zzecfVar, boolean z10, Context context, zzcvt zzcvtVar) throws zzdev {
        try {
            ((zzfbd) zzecfVar.zzb).zzv(z10);
            if (this.zzc.zzc < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzaE)).intValue()) {
                ((zzfbd) zzecfVar.zzb).zzx();
            } else {
                ((zzfbd) zzecfVar.zzb).zzy(context);
            }
        } catch (zzfan e10) {
            zzbzr.zzi("Cannot show interstitial.");
            throw new zzdev(e10.getCause());
        }
    }
}
