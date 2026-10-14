package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgkp extends zzgpm implements zzgqx {
    private static final zzgkp zzb;
    private String zzd = "";
    private zzgoe zze = zzgoe.zzb;
    private int zzf;

    static {
        zzgkp zzgkpVar = new zzgkp();
        zzb = zzgkpVar;
        zzgpm.zzaU(zzgkp.class, zzgkpVar);
    }

    private zzgkp() {
    }

    public static zzgko zza() {
        return (zzgko) zzb.zzaA();
    }

    public static zzgkp zzd() {
        return zzb;
    }

    public static zzgkp zze(byte[] bArr, zzgoy zzgoyVar) throws zzgpy {
        return (zzgkp) zzgpm.zzaI(zzb, bArr, zzgoyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzgkp();
        }
        zzgkn zzgknVar = null;
        if (i11 == 4) {
            return new zzgko(zzgknVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzglq zzf() {
        zzglq zzglqVarZzb = zzglq.zzb(this.zzf);
        return zzglqVarZzb == null ? zzglq.UNRECOGNIZED : zzglqVarZzb;
    }

    public final zzgoe zzg() {
        return this.zze;
    }

    public final String zzh() {
        return this.zzd;
    }
}
