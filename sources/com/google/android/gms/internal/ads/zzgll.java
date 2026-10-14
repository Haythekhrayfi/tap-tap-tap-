package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgll extends zzgpm implements zzgqx {
    private static final zzgll zzb;
    private int zzd;
    private zzglo zze;

    static {
        zzgll zzgllVar = new zzgll();
        zzb = zzgllVar;
        zzgpm.zzaU(zzgll.class, zzgllVar);
    }

    private zzgll() {
    }

    public static zzglk zzc() {
        return (zzglk) zzb.zzaA();
    }

    public static zzgll zze(zzgoe zzgoeVar, zzgoy zzgoyVar) throws zzgpy {
        return (zzgll) zzgpm.zzaG(zzb, zzgoeVar, zzgoyVar);
    }

    public static /* synthetic */ void zzh(zzgll zzgllVar, zzglo zzgloVar) {
        Objects.requireNonNull(zzgloVar);
        zzgllVar.zze = zzgloVar;
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
            return new zzgll();
        }
        zzglj zzgljVar = null;
        if (i11 == 4) {
            return new zzglk(zzgljVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzglo zzf() {
        zzglo zzgloVar = this.zze;
        return zzgloVar == null ? zzglo.zzd() : zzgloVar;
    }
}
