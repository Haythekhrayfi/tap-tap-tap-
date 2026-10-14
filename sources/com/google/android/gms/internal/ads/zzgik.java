package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgik extends zzgpm implements zzgqx {
    private static final zzgik zzb;
    private zzgiq zzd;
    private zzgkc zze;

    static {
        zzgik zzgikVar = new zzgik();
        zzb = zzgikVar;
        zzgpm.zzaU(zzgik.class, zzgikVar);
    }

    private zzgik() {
    }

    public static zzgij zza() {
        return (zzgij) zzb.zzaA();
    }

    public static zzgik zzd(zzgoe zzgoeVar, zzgoy zzgoyVar) throws zzgpy {
        return (zzgik) zzgpm.zzaG(zzb, zzgoeVar, zzgoyVar);
    }

    public static /* synthetic */ void zzg(zzgik zzgikVar, zzgiq zzgiqVar) {
        Objects.requireNonNull(zzgiqVar);
        zzgikVar.zzd = zzgiqVar;
    }

    public static /* synthetic */ void zzh(zzgik zzgikVar, zzgkc zzgkcVar) {
        Objects.requireNonNull(zzgkcVar);
        zzgikVar.zze = zzgkcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new zzgik();
        }
        zzgii zzgiiVar = null;
        if (i11 == 4) {
            return new zzgij(zzgiiVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgiq zze() {
        zzgiq zzgiqVar = this.zzd;
        return zzgiqVar == null ? zzgiq.zze() : zzgiqVar;
    }

    public final zzgkc zzf() {
        zzgkc zzgkcVar = this.zze;
        return zzgkcVar == null ? zzgkc.zzf() : zzgkcVar;
    }
}
