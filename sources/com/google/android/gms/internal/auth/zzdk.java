package com.google.android.gms.internal.auth;

import defpackage.a;
import java.io.Serializable;
import java.util.Objects;
import javax.annotation.CheckForNull;
import o0.c;

/* JADX INFO: loaded from: classes2.dex */
final class zzdk implements Serializable, zzdj {
    public final zzdj zza;
    public volatile transient boolean zzb;

    @CheckForNull
    public transient Object zzc;

    public zzdk(zzdj zzdjVar) {
        Objects.requireNonNull(zzdjVar);
        this.zza = zzdjVar;
    }

    public final String toString() {
        return c.a(a.a("Suppliers.memoize("), this.zzb ? c.a(a.a("<supplier that returned "), this.zzc, ">") : this.zza, ")");
    }

    @Override // com.google.android.gms.internal.auth.zzdj
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
