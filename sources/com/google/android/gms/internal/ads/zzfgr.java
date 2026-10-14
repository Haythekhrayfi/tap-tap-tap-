package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfgr {
    private final Context zza;
    private final Executor zzb;
    private final zzbzw zzc;
    private final zzfgb zzd;

    public zzfgr(Context context, Executor executor, zzbzw zzbzwVar, zzfgb zzfgbVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzbzwVar;
        this.zzd = zzfgbVar;
    }

    public final /* synthetic */ void zza(String str) {
        this.zzc.zza(str);
    }

    public final /* synthetic */ void zzb(String str, zzffy zzffyVar) {
        zzffn zzffnVarZza = zzffm.zza(this.zza, 14);
        zzffnVarZza.zzh();
        zzffnVarZza.zzf(this.zzc.zza(str));
        if (zzffyVar == null) {
            this.zzd.zzb(zzffnVarZza.zzl());
        } else {
            zzffyVar.zza(zzffnVarZza);
            zzffyVar.zzg();
        }
    }

    public final void zzc(final String str, final zzffy zzffyVar) {
        if (zzfgb.zza() && ((Boolean) zzbcy.zzd.zze()).booleanValue()) {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgq
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzb(str, zzffyVar);
                }
            });
        } else {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgp
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zza(str);
                }
            });
        }
    }

    public final void zzd(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzc((String) it.next(), null);
        }
    }
}
