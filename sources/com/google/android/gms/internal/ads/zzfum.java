package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzfum extends zzfuo {
    public zzfum(zzfwm zzfwmVar, Class cls, zzfvj zzfvjVar) {
        super(zzfwmVar, cls, zzfvjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfuo
    public final /* bridge */ /* synthetic */ Object zzf(Object obj, Throwable th) throws Exception {
        zzfvj zzfvjVar = (zzfvj) obj;
        zzfwm zzfwmVarZza = zzfvjVar.zza(th);
        zzfph.zzd(zzfwmVarZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzfvjVar);
        return zzfwmVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzfuo
    public final /* synthetic */ void zzg(Object obj) {
        zzt((zzfwm) obj);
    }
}
