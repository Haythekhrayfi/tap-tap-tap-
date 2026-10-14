package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgih extends zzgpm implements zzgqx {
    private static final zzgih zzb;
    private int zzd;
    private zzgin zze;
    private zzgjz zzf;

    static {
        zzgih zzgihVar = new zzgih();
        zzb = zzgihVar;
        zzgpm.zzaU(zzgih.class, zzgihVar);
    }

    private zzgih() {
    }

    public static zzgig zzc() {
        return (zzgig) zzb.zzaA();
    }

    public static zzgih zze(zzgoe zzgoeVar, zzgoy zzgoyVar) throws zzgpy {
        return (zzgih) zzgpm.zzaG(zzb, zzgoeVar, zzgoyVar);
    }

    public static /* synthetic */ void zzi(zzgih zzgihVar, zzgin zzginVar) {
        Objects.requireNonNull(zzginVar);
        zzgihVar.zze = zzginVar;
    }

    public static /* synthetic */ void zzj(zzgih zzgihVar, zzgjz zzgjzVar) {
        Objects.requireNonNull(zzgjzVar);
        zzgihVar.zzf = zzgjzVar;
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
            return zzgpm.zzaR(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzgih();
        }
        zzgif zzgifVar = null;
        if (i11 == 4) {
            return new zzgig(zzgifVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgin zzf() {
        zzgin zzginVar = this.zze;
        return zzginVar == null ? zzgin.zze() : zzginVar;
    }

    public final zzgjz zzg() {
        zzgjz zzgjzVar = this.zzf;
        return zzgjzVar == null ? zzgjz.zze() : zzgjzVar;
    }
}
