package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgjr extends zzgpm implements zzgqx {
    private static final zzgjr zzb;
    private int zzd;
    private zzgoe zze = zzgoe.zzb;

    static {
        zzgjr zzgjrVar = new zzgjr();
        zzb = zzgjrVar;
        zzgpm.zzaU(zzgjr.class, zzgjrVar);
    }

    private zzgjr() {
    }

    public static zzgjq zzc() {
        return (zzgjq) zzb.zzaA();
    }

    public static zzgjr zze(zzgoe zzgoeVar, zzgoy zzgoyVar) throws zzgpy {
        return (zzgjr) zzgpm.zzaG(zzb, zzgoeVar, zzgoyVar);
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
            return zzgpm.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new zzgjr();
        }
        zzgjp zzgjpVar = null;
        if (i11 == 4) {
            return new zzgjq(zzgjpVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgoe zzf() {
        return this.zze;
    }
}
