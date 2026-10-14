package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzecr implements zzeci {
    private final Context zza;
    private final zzcop zzb;
    private final Executor zzc;

    public zzecr(Context context, zzcop zzcopVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcopVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzeci
    public final /* bridge */ /* synthetic */ Object zza(zzezz zzezzVar, zzezn zzeznVar, final zzecf zzecfVar) throws zzefu, zzfan {
        zzcom zzcomVarZza = this.zzb.zza(new zzcrs(zzezzVar, zzeznVar, zzecfVar.zza), new zzddr(new zzdew() { // from class: com.google.android.gms.internal.ads.zzecq
            @Override // com.google.android.gms.internal.ads.zzdew
            public final void zza(boolean z10, Context context, zzcvt zzcvtVar) throws zzdev {
                zzecf zzecfVar2 = zzecfVar;
                try {
                    ((zzfbd) zzecfVar2.zzb).zzv(z10);
                    ((zzfbd) zzecfVar2.zzb).zzw(context);
                } catch (zzfan e10) {
                    throw new zzdev(e10.getCause());
                }
            }
        }, null), new zzcon(zzeznVar.zzab));
        zzcomVarZza.zzd().zzm(new zzcnd((zzfbd) zzecfVar.zzb), this.zzc);
        ((zzedy) zzecfVar.zzc).zzc(zzcomVarZza.zzj());
        return zzcomVarZza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzeci
    public final void zzb(zzezz zzezzVar, zzezn zzeznVar, zzecf zzecfVar) throws zzfan {
        ((zzfbd) zzecfVar.zzb).zzl(this.zza, zzezzVar.zza.zza.zzd, zzeznVar.zzw.toString(), (zzboc) zzecfVar.zzc);
    }
}
