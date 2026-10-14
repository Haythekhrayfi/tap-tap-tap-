package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzglo extends zzgpm implements zzgqx {
    private static final zzglo zzb;
    private String zzd = "";
    private zzgkp zze;

    static {
        zzglo zzgloVar = new zzglo();
        zzb = zzgloVar;
        zzgpm.zzaU(zzglo.class, zzgloVar);
    }

    private zzglo() {
    }

    public static zzglo zzd() {
        return zzb;
    }

    public static zzglo zze(zzgoe zzgoeVar, zzgoy zzgoyVar) throws zzgpy {
        return (zzglo) zzgpm.zzaG(zzb, zzgoeVar, zzgoyVar);
    }

    public final zzgkp zza() {
        zzgkp zzgkpVar = this.zze;
        return zzgkpVar == null ? zzgkp.zzd() : zzgkpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new zzglo();
        }
        zzglm zzglmVar = null;
        if (i11 == 4) {
            return new zzgln(zzglmVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final String zzf() {
        return this.zzd;
    }

    public final boolean zzg() {
        return this.zze != null;
    }
}
