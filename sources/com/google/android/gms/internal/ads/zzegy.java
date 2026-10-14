package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzegy implements zzeci {
    private final Context zza;
    private final Executor zzb;
    private final zzdmr zzc;

    public zzegy(Context context, Executor executor, zzdmr zzdmrVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdmrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zze(zzezz zzezzVar, zzezn zzeznVar, zzecf zzecfVar) {
        try {
            ((zzfbd) zzecfVar.zzb).zzk(zzezzVar.zza.zza.zzd, zzeznVar.zzw.toString());
        } catch (Exception e10) {
            zzbzr.zzk("Fail to load ad from adapter ".concat(String.valueOf(zzecfVar.zza)), e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeci
    public final /* bridge */ /* synthetic */ Object zza(zzezz zzezzVar, zzezn zzeznVar, final zzecf zzecfVar) throws zzefu, zzfan {
        zzdmn zzdmnVarZze = this.zzc.zze(new zzcrs(zzezzVar, zzeznVar, zzecfVar.zza), new zzdmo(new zzdew() { // from class: com.google.android.gms.internal.ads.zzegu
            @Override // com.google.android.gms.internal.ads.zzdew
            public final void zza(boolean z10, Context context, zzcvt zzcvtVar) throws zzdev {
                zzecf zzecfVar2 = zzecfVar;
                try {
                    ((zzfbd) zzecfVar2.zzb).zzv(z10);
                    ((zzfbd) zzecfVar2.zzb).zzA();
                } catch (zzfan e10) {
                    zzbzr.zzk("Cannot show rewarded video.", e10);
                    throw new zzdev(e10.getCause());
                }
            }
        }));
        zzdmnVarZze.zzd().zzm(new zzcnd((zzfbd) zzecfVar.zzb), this.zzb);
        zzcwn zzcwnVarZze = zzdmnVarZze.zze();
        zzcve zzcveVarZzb = zzdmnVarZze.zzb();
        ((zzedz) zzecfVar.zzc).zzc(new zzegx(this, zzdmnVarZze.zza(), zzcveVarZzb, zzcwnVarZze, zzdmnVarZze.zzg()));
        return zzdmnVarZze.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzeci
    public final void zzb(zzezz zzezzVar, zzezn zzeznVar, zzecf zzecfVar) throws zzfan {
        if (((zzfbd) zzecfVar.zzb).zzC()) {
            zze(zzezzVar, zzeznVar, zzecfVar);
            return;
        }
        ((zzedz) zzecfVar.zzc).zzd(new zzegw(this, zzezzVar, zzeznVar, zzecfVar));
        ((zzfbd) zzecfVar.zzb).zzh(this.zza, zzezzVar.zza.zza.zzd, null, (zzbvf) zzecfVar.zzc, zzeznVar.zzw.toString());
    }
}
