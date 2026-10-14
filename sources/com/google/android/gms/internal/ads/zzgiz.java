package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgiz extends zzgpm implements zzgqx {
    private static final zzgiz zzb;
    private zzgjc zzd;
    private int zze;

    static {
        zzgiz zzgizVar = new zzgiz();
        zzb = zzgizVar;
        zzgpm.zzaU(zzgiz.class, zzgizVar);
    }

    private zzgiz() {
    }

    public static zzgiy zzc() {
        return (zzgiy) zzb.zzaA();
    }

    public static zzgiz zze(zzgoe zzgoeVar, zzgoy zzgoyVar) throws zzgpy {
        return (zzgiz) zzgpm.zzaG(zzb, zzgoeVar, zzgoyVar);
    }

    public static /* synthetic */ void zzg(zzgiz zzgizVar, zzgjc zzgjcVar) {
        Objects.requireNonNull(zzgjcVar);
        zzgizVar.zzd = zzgjcVar;
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
            return zzgpm.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new zzgiz();
        }
        zzgix zzgixVar = null;
        if (i11 == 4) {
            return new zzgiy(zzgixVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgjc zzf() {
        zzgjc zzgjcVar = this.zzd;
        return zzgjcVar == null ? zzgjc.zze() : zzgjcVar;
    }
}
