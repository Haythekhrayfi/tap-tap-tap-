package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgkc extends zzgpm implements zzgqx {
    private static final zzgkc zzb;
    private zzgkf zzd;
    private int zze;
    private int zzf;

    static {
        zzgkc zzgkcVar = new zzgkc();
        zzb = zzgkcVar;
        zzgpm.zzaU(zzgkc.class, zzgkcVar);
    }

    private zzgkc() {
    }

    public static zzgkb zzd() {
        return (zzgkb) zzb.zzaA();
    }

    public static zzgkc zzf() {
        return zzb;
    }

    public static zzgkc zzg(zzgoe zzgoeVar, zzgoy zzgoyVar) throws zzgpy {
        return (zzgkc) zzgpm.zzaG(zzb, zzgoeVar, zzgoyVar);
    }

    public static /* synthetic */ void zzi(zzgkc zzgkcVar, zzgkf zzgkfVar) {
        Objects.requireNonNull(zzgkfVar);
        zzgkcVar.zzd = zzgkfVar;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzgkc();
        }
        zzgka zzgkaVar = null;
        if (i11 == 4) {
            return new zzgkb(zzgkaVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zzc() {
        return this.zzf;
    }

    public final zzgkf zzh() {
        zzgkf zzgkfVar = this.zzd;
        return zzgkfVar == null ? zzgkf.zze() : zzgkfVar;
    }
}
