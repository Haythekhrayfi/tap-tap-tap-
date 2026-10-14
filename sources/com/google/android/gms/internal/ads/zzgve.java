package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgve extends zzgpm implements zzgqx {
    private static final zzgve zzb;
    private int zzd;
    private int zze;
    private int zzh;
    private String zzf = "";
    private zzgpr zzg = zzgpm.zzaJ();
    private zzgpv zzi = zzgpm.zzaN();
    private zzgoe zzj = zzgoe.zzb;

    static {
        zzgve zzgveVar = new zzgve();
        zzb = zzgveVar;
        zzgpm.zzaU(zzgve.class, zzgveVar);
    }

    private zzgve() {
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", zzgvc.class, "zzj"});
        }
        if (i11 == 3) {
            return new zzgve();
        }
        zzgtb zzgtbVar = null;
        if (i11 == 4) {
            return new zzgvd(zzgtbVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
