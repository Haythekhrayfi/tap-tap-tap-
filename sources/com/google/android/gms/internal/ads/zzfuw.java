package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzfuw extends zzfuy {
    public zzfuw(zzfwm zzfwmVar, zzfvj zzfvjVar) {
        super(zzfwmVar, zzfvjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final /* bridge */ /* synthetic */ Object zzf(Object obj, Object obj2) throws Exception {
        zzfvj zzfvjVar = (zzfvj) obj;
        zzfwm zzfwmVarZza = zzfvjVar.zza(obj2);
        zzfph.zzd(zzfwmVarZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzfvjVar);
        return zzfwmVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final /* synthetic */ void zzg(Object obj) {
        zzt((zzfwm) obj);
    }
}
