package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgin extends zzgpm implements zzgqx {
    private static final zzgin zzb;
    private int zzd;
    private zzgit zze;
    private zzgoe zzf = zzgoe.zzb;

    static {
        zzgin zzginVar = new zzgin();
        zzb = zzginVar;
        zzgpm.zzaU(zzgin.class, zzginVar);
    }

    private zzgin() {
    }

    public static zzgim zzc() {
        return (zzgim) zzb.zzaA();
    }

    public static zzgin zze() {
        return zzb;
    }

    public static zzgin zzf(zzgoe zzgoeVar, zzgoy zzgoyVar) throws zzgpy {
        return (zzgin) zzgpm.zzaG(zzb, zzgoeVar, zzgoyVar);
    }

    public static /* synthetic */ void zzj(zzgin zzginVar, zzgit zzgitVar) {
        Objects.requireNonNull(zzgitVar);
        zzginVar.zze = zzgitVar;
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
            return new zzgin();
        }
        zzgil zzgilVar = null;
        if (i11 == 4) {
            return new zzgim(zzgilVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgit zzg() {
        zzgit zzgitVar = this.zze;
        return zzgitVar == null ? zzgit.zze() : zzgitVar;
    }

    public final zzgoe zzh() {
        return this.zzf;
    }
}
