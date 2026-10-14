package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgwd implements zzgwr, zzgvy {
    private static final Object zza = new Object();
    private volatile zzgwr zzb;
    private volatile Object zzc = zza;

    private zzgwd(zzgwr zzgwrVar) {
        this.zzb = zzgwrVar;
    }

    public static zzgvy zza(zzgwr zzgwrVar) {
        if (zzgwrVar instanceof zzgvy) {
            return (zzgvy) zzgwrVar;
        }
        Objects.requireNonNull(zzgwrVar);
        return new zzgwd(zzgwrVar);
    }

    public static zzgwr zzc(zzgwr zzgwrVar) {
        return zzgwrVar instanceof zzgwd ? zzgwrVar : new zzgwd(zzgwrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    public final Object zzb() {
        Object objZzb = this.zzc;
        Object obj = zza;
        if (objZzb == obj) {
            synchronized (this) {
                objZzb = this.zzc;
                if (objZzb == obj) {
                    objZzb = this.zzb.zzb();
                    Object obj2 = this.zzc;
                    if (obj2 != obj && obj2 != objZzb) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + objZzb + ". This is likely due to a circular dependency.");
                    }
                    this.zzc = objZzb;
                    this.zzb = null;
                }
            }
        }
        return objZzb;
    }
}
