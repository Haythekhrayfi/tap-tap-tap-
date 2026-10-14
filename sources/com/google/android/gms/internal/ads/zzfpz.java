package com.google.android.gms.internal.ads;

import androidx.activity.j;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
final class zzfpz implements zzfpx {
    private static final zzfpx zza = new zzfpx() { // from class: com.google.android.gms.internal.ads.zzfpy
        @Override // com.google.android.gms.internal.ads.zzfpx
        public final Object zza() {
            throw new IllegalStateException();
        }
    };
    private volatile zzfpx zzb;

    @CheckForNull
    private Object zzc;

    public zzfpz(zzfpx zzfpxVar) {
        this.zzb = zzfpxVar;
    }

    public final String toString() {
        Object objA = this.zzb;
        if (objA == zza) {
            objA = j.a("<supplier that returned ", String.valueOf(this.zzc), ">");
        }
        return j.a("Suppliers.memoize(", String.valueOf(objA), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzfpx
    public final Object zza() {
        zzfpx zzfpxVar = this.zzb;
        zzfpx zzfpxVar2 = zza;
        if (zzfpxVar != zzfpxVar2) {
            synchronized (this) {
                if (this.zzb != zzfpxVar2) {
                    Object objZza = this.zzb.zza();
                    this.zzc = objZza;
                    this.zzb = zzfpxVar2;
                    return objZza;
                }
            }
        }
        return this.zzc;
    }
}
