package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzedh implements zzeci {
    private final Context zza;
    private final zzcpy zzb;
    private final Executor zzc;

    public zzedh(Context context, zzcpy zzcpyVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcpyVar;
        this.zzc = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzeci
    public final /* bridge */ /* synthetic */ Object zza(zzezz zzezzVar, final zzezn zzeznVar, zzecf zzecfVar) throws zzefu, zzfan {
        final View viewZza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzhs)).booleanValue() && zzeznVar.zzah) {
            zzbof zzbofVarZzc = ((zzfbd) zzecfVar.zzb).zzc();
            if (zzbofVarZzc == null) {
                zzbzr.zzg("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new zzfan(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                viewZza = (View) ObjectWrapper.unwrap(zzbofVarZzc.zze());
                boolean zZzf = zzbofVarZzc.zzf();
                if (viewZza == null) {
                    throw new zzfan(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                }
                if (zZzf) {
                    try {
                        viewZza = (View) zzfwc.zzm(zzfwc.zzh(null), new zzfvj() { // from class: com.google.android.gms.internal.ads.zzedg
                            @Override // com.google.android.gms.internal.ads.zzfvj
                            public final zzfwm zza(Object obj) {
                                return this.zza.zzc(viewZza, zzeznVar, obj);
                            }
                        }, zzcae.zze).get();
                    } catch (InterruptedException | ExecutionException e10) {
                        throw new zzfan(e10);
                    }
                }
            } catch (RemoteException e11) {
                throw new zzfan(e11);
            }
        } else {
            viewZza = ((zzfbd) zzecfVar.zzb).zza();
        }
        zzcpy zzcpyVar = this.zzb;
        zzcrs zzcrsVar = new zzcrs(zzezzVar, zzeznVar, zzecfVar.zza);
        final zzfbd zzfbdVar = (zzfbd) zzecfVar.zzb;
        zzcpc zzcpcVarZza = zzcpyVar.zza(zzcrsVar, new zzcpi(viewZza, null, new zzcrb() { // from class: com.google.android.gms.internal.ads.zzedf
            @Override // com.google.android.gms.internal.ads.zzcrb
            public final com.google.android.gms.ads.internal.client.zzdq zza() {
                return zzfbdVar.zzb();
            }
        }, (zzezo) zzeznVar.zzv.get(0)));
        zzcpcVarZza.zzg().zza(viewZza);
        zzcpcVarZza.zzd().zzm(new zzcnd((zzfbd) zzecfVar.zzb), this.zzc);
        ((zzedy) zzecfVar.zzc).zzc(zzcpcVarZza.zzj());
        return zzcpcVarZza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzeci
    public final void zzb(zzezz zzezzVar, zzezn zzeznVar, zzecf zzecfVar) throws zzfan {
        com.google.android.gms.ads.internal.client.zzq zzqVar;
        com.google.android.gms.ads.internal.client.zzq zzqVar2 = zzezzVar.zza.zza.zze;
        if (zzqVar2.zzn) {
            zzqVar = new com.google.android.gms.ads.internal.client.zzq(this.zza, com.google.android.gms.ads.zzb.zzd(zzqVar2.zze, zzqVar2.zzb));
        } else {
            zzqVar = (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzhs)).booleanValue() && zzeznVar.zzah) ? new com.google.android.gms.ads.internal.client.zzq(this.zza, com.google.android.gms.ads.zzb.zze(zzqVar2.zze, zzqVar2.zzb)) : zzfam.zza(this.zza, zzeznVar.zzv);
        }
        com.google.android.gms.ads.internal.client.zzq zzqVar3 = zzqVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzhs)).booleanValue() && zzeznVar.zzah) {
            ((zzfbd) zzecfVar.zzb).zzn(this.zza, zzqVar3, zzezzVar.zza.zza.zzd, zzeznVar.zzw.toString(), com.google.android.gms.ads.internal.util.zzbu.zzl(zzeznVar.zzt), (zzboc) zzecfVar.zzc);
        } else {
            ((zzfbd) zzecfVar.zzb).zzm(this.zza, zzqVar3, zzezzVar.zza.zza.zzd, zzeznVar.zzw.toString(), com.google.android.gms.ads.internal.util.zzbu.zzl(zzeznVar.zzt), (zzboc) zzecfVar.zzc);
        }
    }

    public final /* synthetic */ zzfwm zzc(View view, zzezn zzeznVar, Object obj) throws Exception {
        return zzfwc.zzh(zzcqp.zza(this.zza, view, zzeznVar));
    }
}
