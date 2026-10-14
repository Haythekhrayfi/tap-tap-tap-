package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzghy extends zzgpm implements zzgqx {
    private static final zzghy zzb;
    private int zzd;
    private zzgoe zze = zzgoe.zzb;
    private zzgie zzf;

    static {
        zzghy zzghyVar = new zzghy();
        zzb = zzghyVar;
        zzgpm.zzaU(zzghy.class, zzghyVar);
    }

    private zzghy() {
    }

    public static zzghx zzc() {
        return (zzghx) zzb.zzaA();
    }

    public static zzghy zze(zzgoe zzgoeVar, zzgoy zzgoyVar) throws zzgpy {
        return (zzghy) zzgpm.zzaG(zzb, zzgoeVar, zzgoyVar);
    }

    public static /* synthetic */ void zzj(zzghy zzghyVar, zzgie zzgieVar) {
        Objects.requireNonNull(zzgieVar);
        zzghyVar.zzf = zzgieVar;
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
            return zzgpm.zzaR(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzghy();
        }
        zzghw zzghwVar = null;
        if (i11 == 4) {
            return new zzghx(zzghwVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgie zzf() {
        zzgie zzgieVar = this.zzf;
        return zzgieVar == null ? zzgie.zze() : zzgieVar;
    }

    public final zzgoe zzg() {
        return this.zze;
    }
}
