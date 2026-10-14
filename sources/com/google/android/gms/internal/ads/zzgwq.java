package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgwq implements zzgwr {
    private static final Object zza = new Object();
    private volatile zzgwr zzb;
    private volatile Object zzc = zza;

    private zzgwq(zzgwr zzgwrVar) {
        this.zzb = zzgwrVar;
    }

    public static zzgwr zza(zzgwr zzgwrVar) {
        return ((zzgwrVar instanceof zzgwq) || (zzgwrVar instanceof zzgwd)) ? zzgwrVar : new zzgwq(zzgwrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    public final Object zzb() {
        Object obj = this.zzc;
        if (obj != zza) {
            return obj;
        }
        zzgwr zzgwrVar = this.zzb;
        if (zzgwrVar == null) {
            return this.zzc;
        }
        Object objZzb = zzgwrVar.zzb();
        this.zzc = objZzb;
        this.zzb = null;
        return objZzb;
    }
}
