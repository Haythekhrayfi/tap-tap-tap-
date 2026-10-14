package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzatm extends zzgpm implements zzgqx {
    private static final zzatm zzb;
    private int zzd;
    private zzatp zze;
    private zzgoe zzf;
    private zzgoe zzg;

    static {
        zzatm zzatmVar = new zzatm();
        zzb = zzatmVar;
        zzgpm.zzaU(zzatm.class, zzatmVar);
    }

    private zzatm() {
        zzgoe zzgoeVar = zzgoe.zzb;
        this.zzf = zzgoeVar;
        this.zzg = zzgoeVar;
    }

    public static zzatm zzc(zzgoe zzgoeVar, zzgoy zzgoyVar) throws zzgpy {
        return (zzatm) zzgpm.zzaG(zzb, zzgoeVar, zzgoyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzatm();
        }
        zzatk zzatkVar = null;
        if (i11 == 4) {
            return new zzatl(zzatkVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzatp zzd() {
        zzatp zzatpVar = this.zze;
        return zzatpVar == null ? zzatp.zzg() : zzatpVar;
    }

    public final zzgoe zze() {
        return this.zzg;
    }

    public final zzgoe zzf() {
        return this.zzf;
    }
}
