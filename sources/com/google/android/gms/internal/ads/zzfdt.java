package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfdt {
    public final /* synthetic */ zzfed zza;
    private final Object zzb;
    private final List zzc;

    public /* synthetic */ zzfdt(zzfed zzfedVar, Object obj, List list, zzfds zzfdsVar) {
        this.zza = zzfedVar;
        this.zzb = obj;
        this.zzc = list;
    }

    public final zzfec zza(Callable callable) {
        zzfwb zzfwbVarZzb = zzfwc.zzb(this.zzc);
        zzfwm zzfwmVarZza = zzfwbVarZzb.zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzfdr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, zzcae.zzf);
        zzfed zzfedVar = this.zza;
        return new zzfec(zzfedVar, this.zzb, zzfwmVarZza, this.zzc, zzfwbVarZzb.zza(callable, zzfedVar.zzb));
    }
}
