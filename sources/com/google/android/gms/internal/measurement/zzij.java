package com.google.android.gms.internal.measurement;

import java.util.Objects;
import javax.annotation.CheckForNull;
import o0.c;

/* JADX INFO: loaded from: classes2.dex */
final class zzij implements zzih {

    @CheckForNull
    public volatile zzih zza;
    public volatile boolean zzb;

    @CheckForNull
    public Object zzc;

    public zzij(zzih zzihVar) {
        Objects.requireNonNull(zzihVar);
        this.zza = zzihVar;
    }

    public final String toString() {
        Object objA = this.zza;
        StringBuilder sbA = defpackage.a.a("Suppliers.memoize(");
        if (objA == null) {
            objA = c.a(defpackage.a.a("<supplier that returned "), this.zzc, ">");
        }
        return c.a(sbA, objA, ")");
    }

    @Override // com.google.android.gms.internal.measurement.zzih
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this) {
                if (!this.zzb) {
                    zzih zzihVar = this.zza;
                    Objects.requireNonNull(zzihVar);
                    Object objZza = zzihVar.zza();
                    this.zzc = objZza;
                    this.zzb = true;
                    this.zza = null;
                    return objZza;
                }
            }
        }
        return this.zzc;
    }
}
