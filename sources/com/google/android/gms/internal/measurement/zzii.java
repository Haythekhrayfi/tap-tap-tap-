package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Objects;
import javax.annotation.CheckForNull;
import o0.c;

/* JADX INFO: loaded from: classes2.dex */
final class zzii implements Serializable, zzih {
    public final zzih zza;
    public volatile transient boolean zzb;

    @CheckForNull
    public transient Object zzc;

    public zzii(zzih zzihVar) {
        Objects.requireNonNull(zzihVar);
        this.zza = zzihVar;
    }

    public final String toString() {
        return c.a(defpackage.a.a("Suppliers.memoize("), this.zzb ? c.a(defpackage.a.a("<supplier that returned "), this.zzc, ">") : this.zza, ")");
    }

    @Override // com.google.android.gms.internal.measurement.zzih
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this) {
                if (!this.zzb) {
                    Object objZza = this.zza.zza();
                    this.zzc = objZza;
                    this.zzb = true;
                    return objZza;
                }
            }
        }
        return this.zzc;
    }
}
