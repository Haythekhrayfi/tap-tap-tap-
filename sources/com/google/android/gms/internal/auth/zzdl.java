package com.google.android.gms.internal.auth;

import defpackage.a;
import java.util.Objects;
import javax.annotation.CheckForNull;
import o0.c;

/* JADX INFO: loaded from: classes2.dex */
final class zzdl implements zzdj {

    @CheckForNull
    public volatile zzdj zza;
    public volatile boolean zzb;

    @CheckForNull
    public Object zzc;

    public zzdl(zzdj zzdjVar) {
        Objects.requireNonNull(zzdjVar);
        this.zza = zzdjVar;
    }

    public final String toString() {
        Object objA = this.zza;
        StringBuilder sbA = a.a("Suppliers.memoize(");
        if (objA == null) {
            objA = c.a(a.a("<supplier that returned "), this.zzc, ">");
        }
        return c.a(sbA, objA, ")");
    }

    @Override // com.google.android.gms.internal.auth.zzdj
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this) {
                if (!this.zzb) {
                    zzdj zzdjVar = this.zza;
                    Objects.requireNonNull(zzdjVar);
                    Object objZza = zzdjVar.zza();
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
