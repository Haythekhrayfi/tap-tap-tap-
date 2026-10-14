package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgib extends zzgpm implements zzgqx {
    private static final zzgib zzb;
    private int zzd;
    private zzgie zze;

    static {
        zzgib zzgibVar = new zzgib();
        zzb = zzgibVar;
        zzgpm.zzaU(zzgib.class, zzgibVar);
    }

    private zzgib() {
    }

    public static zzgia zzc() {
        return (zzgia) zzb.zzaA();
    }

    public static zzgib zze(zzgoe zzgoeVar, zzgoy zzgoyVar) throws zzgpy {
        return (zzgib) zzgpm.zzaG(zzb, zzgoeVar, zzgoyVar);
    }

    public static /* synthetic */ void zzh(zzgib zzgibVar, zzgie zzgieVar) {
        Objects.requireNonNull(zzgieVar);
        zzgibVar.zze = zzgieVar;
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
            return zzgpm.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new zzgib();
        }
        zzghz zzghzVar = null;
        if (i11 == 4) {
            return new zzgia(zzghzVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgie zzf() {
        zzgie zzgieVar = this.zze;
        return zzgieVar == null ? zzgie.zze() : zzgieVar;
    }
}
