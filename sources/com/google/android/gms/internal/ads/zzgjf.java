package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgjf extends zzgpm implements zzgqx {
    private static final zzgjf zzb;
    private int zzd;
    private zzgoe zze = zzgoe.zzb;

    static {
        zzgjf zzgjfVar = new zzgjf();
        zzb = zzgjfVar;
        zzgpm.zzaU(zzgjf.class, zzgjfVar);
    }

    private zzgjf() {
    }

    public static zzgje zzc() {
        return (zzgje) zzb.zzaA();
    }

    public static zzgjf zze(zzgoe zzgoeVar, zzgoy zzgoyVar) throws zzgpy {
        return (zzgjf) zzgpm.zzaG(zzb, zzgoeVar, zzgoyVar);
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
            return zzgpm.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new zzgjf();
        }
        zzgjd zzgjdVar = null;
        if (i11 == 4) {
            return new zzgje(zzgjdVar);
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
