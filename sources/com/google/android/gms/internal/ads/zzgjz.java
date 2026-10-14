package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgjz extends zzgpm implements zzgqx {
    private static final zzgjz zzb;
    private int zzd;
    private zzgkf zze;
    private zzgoe zzf = zzgoe.zzb;

    static {
        zzgjz zzgjzVar = new zzgjz();
        zzb = zzgjzVar;
        zzgpm.zzaU(zzgjz.class, zzgjzVar);
    }

    private zzgjz() {
    }

    public static zzgjy zzc() {
        return (zzgjy) zzb.zzaA();
    }

    public static zzgjz zze() {
        return zzb;
    }

    public static zzgjz zzf(zzgoe zzgoeVar, zzgoy zzgoyVar) throws zzgpy {
        return (zzgjz) zzgpm.zzaG(zzb, zzgoeVar, zzgoyVar);
    }

    public static /* synthetic */ void zzj(zzgjz zzgjzVar, zzgkf zzgkfVar) {
        Objects.requireNonNull(zzgkfVar);
        zzgjzVar.zze = zzgkfVar;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzgjz();
        }
        zzgjx zzgjxVar = null;
        if (i11 == 4) {
            return new zzgjy(zzgjxVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgkf zzg() {
        zzgkf zzgkfVar = this.zze;
        return zzgkfVar == null ? zzgkf.zze() : zzgkfVar;
    }

    public final zzgoe zzh() {
        return this.zzf;
    }
}
