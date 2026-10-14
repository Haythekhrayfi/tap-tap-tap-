package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgwc implements zzgwe {
    private zzgwr zza;

    public static void zza(zzgwr zzgwrVar, zzgwr zzgwrVar2) {
        zzgwc zzgwcVar = (zzgwc) zzgwrVar;
        if (zzgwcVar.zza != null) {
            throw new IllegalStateException();
        }
        zzgwcVar.zza = zzgwrVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    public final Object zzb() {
        zzgwr zzgwrVar = this.zza;
        if (zzgwrVar != null) {
            return zzgwrVar.zzb();
        }
        throw new IllegalStateException();
    }
}
