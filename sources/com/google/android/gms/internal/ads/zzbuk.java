package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
final class zzbuk implements Callable {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ zzbum zzb;

    public zzbuk(zzbum zzbumVar, Context context) {
        this.zzb = zzbumVar;
        this.zza = context;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x003a  */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzbuj zzbujVarZza;
        zzbul zzbulVar = (zzbul) this.zzb.zza.get(this.zza);
        if (zzbulVar != null) {
            if (((Long) zzbcv.zza.zze()).longValue() + zzbulVar.zza < com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()) {
                zzbujVarZza = new zzbui(this.zza).zza();
            } else {
                zzbujVarZza = new zzbui(this.zza, zzbulVar.zzb).zza();
            }
        } else {
            zzbujVarZza = new zzbui(this.zza).zza();
        }
        zzbum zzbumVar = this.zzb;
        zzbumVar.zza.put(this.zza, new zzbul(zzbumVar, zzbujVarZza));
        return zzbujVarZza;
    }
}
